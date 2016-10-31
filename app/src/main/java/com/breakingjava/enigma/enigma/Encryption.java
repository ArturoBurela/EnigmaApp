package com.breakingjava.enigma.enigma;

/**
 * Created by Horacio on 30/10/2016.
 */
import android.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encryption {
    private static final String ALGORITMO = "AES";
    private static final byte[] master_key = "Br34K1ng-J4va216".getBytes();

    public static String encriptar (String texto_encriptar) throws Exception
    {

        Key key = new SecretKeySpec(master_key, "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key );

        byte[] encrypted = cipher.doFinal(texto_encriptar.getBytes("UTF-8"));
        String texto_encriptado = Base64.encodeToString(encrypted, Base64.DEFAULT);

        return texto_encriptado;


    }

    public static String desencriptar(String texto_encriptado) throws Exception
    {

        Key key = new SecretKeySpec(master_key, ALGORITMO);

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);

        byte[] desencriptar_texto = Base64.decode(texto_encriptado.getBytes("UTF-8"), Base64.DEFAULT);
        byte[] desencriptado = cipher.doFinal(desencriptar_texto);

        return new String(desencriptado, "UTF-8");
    }
}