package p000;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: bjvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvo {

    /* renamed from: a */
    public final String f123395a;

    public bjvo(Context context, String str) {
        this.f123395a = m104724a(Settings.Secure.getString(context.getContentResolver(), "android_id"), str);
    }

    /* renamed from: a */
    static String m104724a(String str, String str2) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str2.getBytes("UTF-8"));
            instance.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public static final SecretKey m104725a() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            return instance.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static final byte[] m104726a(Certificate certificate, SecretKey secretKey) {
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            try {
                instance.init(1, certificate.getPublicKey());
                try {
                    byte[] doFinal = instance.doFinal(secretKey.getEncoded());
                    int i = 0;
                    while (true) {
                        int length = doFinal.length;
                        if (i >= (length >> 1)) {
                            return doFinal;
                        }
                        int i2 = (length - 1) - i;
                        byte b = doFinal[i];
                        doFinal[i] = doFinal[i2];
                        doFinal[i2] = b;
                        i++;
                    }
                } catch (IllegalBlockSizeException e) {
                    throw new RuntimeException(e);
                } catch (BadPaddingException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (InvalidKeyException e3) {
                throw new CertificateException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        } catch (NoSuchPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* renamed from: a */
    public static final byte[] m104727a(SecretKey secretKey, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            try {
                instance.init(1, secretKey, new IvParameterSpec(new byte[16]));
                try {
                    return instance.doFinal(bArr);
                } catch (IllegalBlockSizeException e) {
                    throw new RuntimeException(e);
                } catch (BadPaddingException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (InvalidKeyException e3) {
                throw new RuntimeException(e3);
            } catch (InvalidAlgorithmParameterException e4) {
                throw new RuntimeException(e4);
            }
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchPaddingException e6) {
            throw new RuntimeException(e6);
        }
    }
}
