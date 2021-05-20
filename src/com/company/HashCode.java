package com.company;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCode {
    //region BESCHREIBUNG
    //  Mit HashCode.setSecurePassword("Password") returniert Hash value
    //endregion
    public static String setSecurePassword(String pw) throws NoSuchAlgorithmException {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(pw.getBytes("utf-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append("0");
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

}
