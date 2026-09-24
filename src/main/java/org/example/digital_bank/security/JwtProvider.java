package org.example.digital_bank.security;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;
import java.util.stream.DoubleStream;


@Component
public class JwtProvider {
@Value("${app.jwt-secret}")
    private String jwtsecret;
@Value("${app.jwt-expiration-milliseconds}")
private Long exptime;
//create jwt tiken
public String generateToken(Authentication authentication){
    String username=authentication.getName();
    Date currdate=new Date();
    Date expdate=new Date(currdate.getTime()+exptime);

    return Jwts.builder()
            .subject(username)
            .issuedAt(currdate)
            .expiration(expdate)
            .signWith(Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtsecret)))
            .compact();



}


    //do validation
public  Boolean validatetoken(String token){
    Jwts.parser().verifyWith((SecretKey) key()).build().parse(token);
    return true;
}

    //create key
    private Key key() {
     Decoders.BASE64.decode(jwtsecret);
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtsecret));
    }
//getusernameform token
    public String getusernamefromtoken(String token){
//key(): This is your private helper method that fetches your secret stamp from application.properties.
//
//(SecretKey): Java is very strict about data types. key
// () returns a general "Key" object, but the JWT
// library's .verifyWith(...) method specifically says
// : "I only accept a Secret HMAC Key to check this stamp."
return Jwts.parser()
        .verifyWith((SecretKey) key())
        .build()
        .parseSignedClaims(token)
        .getPayload().getSubject();
    }
}
