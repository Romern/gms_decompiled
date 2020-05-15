package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: acye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acye {
    /* renamed from: b */
    private static KeyPair m49988b(Context context) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            try {
                instance.load(null);
                try {
                    if (instance.containsAlias("identity_accountWrapKey")) {
                        try {
                            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) instance.getEntry("identity_accountWrapKey", null);
                            return new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
                        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e) {
                            try {
                                instance.deleteEntry("identity_accountWrapKey");
                            } catch (KeyStoreException e2) {
                                return null;
                            }
                        }
                    }
                    acyc acyc = new acyc(context, "identity_accountWrapKey");
                    try {
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
                        gregorianCalendar2.add(1, 100);
                        KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(acyc.f61072a).setAlias(acyc.f61073b);
                        String str = acyc.f61073b;
                        KeyPairGeneratorSpec build = alias.setSubject(new X500Principal(str.length() == 0 ? new String("CN=") : "CN=".concat(str))).setSerialNumber(BigInteger.ONE).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
                        KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        instance2.initialize(build);
                        return instance2.generateKeyPair();
                    } catch (InvalidAlgorithmParameterException e3) {
                        return null;
                    } catch (NoSuchAlgorithmException e4) {
                        return null;
                    } catch (NoSuchProviderException e5) {
                        return null;
                    }
                } catch (KeyStoreException e6) {
                    return null;
                }
            } catch (IOException e7) {
                return null;
            } catch (NoSuchAlgorithmException e8) {
                return null;
            } catch (CertificateException e9) {
                return null;
            }
        } catch (KeyStoreException e10) {
            return null;
        }
    }

    /* renamed from: c */
    private static acyd m49989c(Context context) {
        int i = Build.VERSION.SDK_INT;
        KeyPair b = m49988b(context);
        if (b != null) {
            try {
                return new acyd(Cipher.getInstance("RSA/ECB/PKCS1Padding"), b);
            } catch (NoSuchAlgorithmException e) {
            } catch (NoSuchPaddingException e2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static acxx m49986a(Context context) {
        SecretKey secretKey;
        SecretKey secretKey2;
        SharedPreferences sharedPreferences = context.getSharedPreferences("identity_accountDataSharedPrefs", 0);
        acyd c = m49989c(context);
        acxy acxy = c != null ? new acxy(sharedPreferences, c, "AES") : null;
        if (acxy != null) {
            SecureRandom secureRandom = new SecureRandom();
            if (acxy.f61066b == null) {
                acxy.f61066b = acxy.mo33227a("messageKey");
            }
            SecretKey secretKey3 = acxy.f61066b;
            if (secretKey3 == null) {
                SecretKey a = m49987a(secureRandom);
                sdo.m34966a(a, "Message key must not be null.");
                acxy.f61066b = a;
                acxy.mo33228a("messageKey", a);
                secretKey = a;
            } else {
                secretKey = secretKey3;
            }
            if (acxy.f61065a == null) {
                acxy.f61065a = acxy.mo33227a("macKey");
            }
            SecretKey secretKey4 = acxy.f61065a;
            if (secretKey4 == null) {
                SecretKey a2 = m49987a(secureRandom);
                sdo.m34966a(a2, "MAC key must not be null.");
                acxy.f61065a = a2;
                acxy.mo33228a("macKey", a2);
                secretKey2 = a2;
            } else {
                secretKey2 = secretKey4;
            }
            try {
                try {
                    return new acxx(new acya(Cipher.getInstance("AES/CBC/PKCS5Padding")), secretKey, new acyb(Mac.getInstance("HmacSHA512")), secretKey2, secureRandom);
                } catch (NoSuchAlgorithmException e) {
                    return null;
                }
            } catch (NoSuchAlgorithmException e2) {
            } catch (NoSuchPaddingException e3) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static SecretKey m49987a(SecureRandom secureRandom) {
        byte[] bArr = new byte[32];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
