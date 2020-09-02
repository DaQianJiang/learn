package com.example.learn.utils;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//用于token生成
public class TokenUtils {
    //设置过期时间
    private static final long EXPIRE_DATE=30*60*100000;
    //token秘钥
    private static final String TOKEN_SECRET = "ZCfasfhuaUUHufguGuwu2020BQWE";

    public static String token(String username,String password){
        String token = "";
        try{
            //过期时间
            Date date = new Date(System.currentTimeMillis()+EXPIRE_DATE);
            //密钥以及加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            //设置头信息
            Map<String,Object> header = new HashMap<>();
            header.put("typ" ,"jwt"); //token的类型
            header.put("alg","HS256");//token的加密算法
            //携带username和password信息，生成签名
            token = JWT.create().withHeader(header)
                    .withClaim("username",username)
                    .withClaim("password",password).withExpiresAt(date)
                    .sign(algorithm);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return token;
    }

    public static boolean verify(String token){
        //验证token
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

//    public static void main(String[] args) {
//        String name = "lili";
//        String password = "123456";
//        //生成token
//        String token = token(name,password);
//        System.out.printf("token is:%s",token);
//
//        boolean b = verify("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJwYXNzd29yZCI6IjEyMzQ1NiIsImV4cCI6MTU5NjU0MDgwMiwidXNlcm5hbWUiOiJsaWxpIn0.sg0ZPkww9hBviC9vaxSL-57Pzg49N1zGtkFn9IRqOf4");
//        System.out.println(b);
//   }


}