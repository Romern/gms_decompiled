package p000;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;

/* renamed from: rqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rqr {

    /* renamed from: a */
    public static final Lock f43525a = new ReentrantLock();

    /* renamed from: b */
    public static final sek f43526b = new sek("GLSUser", "BindingKeyManager");

    /* renamed from: c */
    public static volatile rqr f43527c;

    /* renamed from: d */
    public static volatile iml f43528d;

    /* renamed from: a */
    public static final KeyPair m34272a(String str) {
        ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
        KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
        instance.initialize(eCGenParameterSpec, new SecureRandom());
        KeyPair generateKeyPair = instance.generateKeyPair();
        m34273a(generateKeyPair, str);
        return generateKeyPair;
    }

    /* renamed from: a */
    private static final void m34273a(KeyPair keyPair, String str) {
        boolean z;
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        boolean a = f43528d.mo13141a(str.concat("_privateKey"), sqd.m35968b(privateKey.getEncoded()), f43528d.mo13139a(str.concat("_privateKey")));
        String b = sqd.m35968b(publicKey.getEncoded());
        String a2 = f43528d.mo13139a(str.concat("_publicKey"));
        if (!a || !f43528d.mo13141a(str.concat("_publicKey"), b, a2)) {
            z = false;
        } else {
            z = true;
        }
        f43526b.mo25409a("Successfully pubKey? %s [ %s ]", Boolean.valueOf(z), b);
        if (z) {
            f43528d.mo13140a();
            return;
        }
        throw new IllegalStateException("Failure to set Channel ID keys in store!");
    }

    /* renamed from: a */
    public final KeyPair mo25033a() {
        KeyPair a;
        iml iml;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) instance.getEntry("rsa.channel.wrapper", null);
            if (privateKeyEntry != null) {
                PrivateKey privateKey = privateKeyEntry.getPrivateKey();
                instance.deleteEntry("rsa.channel.wrapper");
                String a2 = f43528d.mo13139a("wrapped_private_channel_key_b64");
                String a3 = f43528d.mo13139a("public_channel_key_b64");
                if (a2 != null) {
                    if (a3 != null) {
                        byte[] a4 = sqd.m35966a(a2);
                        KeyFactory instance2 = KeyFactory.getInstance("EC");
                        PublicKey generatePublic = instance2.generatePublic(new X509EncodedKeySpec(sqd.m35966a(a3)));
                        Cipher instance3 = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
                        instance3.init(2, privateKey);
                        KeyPair keyPair = new KeyPair(generatePublic, instance2.generatePrivate(new PKCS8EncodedKeySpec(instance3.doFinal(a4))));
                        m34273a(keyPair, "channel_binding_manager");
                        f43526b.mo25409a("Successfully transitioned wrapped keys.", new Object[0]);
                        f43528d.mo13143b("wrapped_private_channel_key_b64");
                        f43528d.mo13143b("public_channel_key_b64");
                        f43528d.mo13143b("wrapped_private_channel_key_format_b64");
                        f43528d.mo13143b("public_channel_key_format_b64");
                        f43528d.mo13140a();
                        return keyPair;
                    }
                }
                a = m34272a("channel_binding_manager");
                iml = f43528d;
                iml.mo13143b("wrapped_private_channel_key_b64");
                f43528d.mo13143b("public_channel_key_b64");
                f43528d.mo13143b("wrapped_private_channel_key_format_b64");
                f43528d.mo13143b("public_channel_key_format_b64");
                f43528d.mo13140a();
                return a;
            }
            a = m34272a("channel_binding_manager");
            iml = f43528d;
            iml.mo13143b("wrapped_private_channel_key_b64");
            f43528d.mo13143b("public_channel_key_b64");
            f43528d.mo13143b("wrapped_private_channel_key_format_b64");
            f43528d.mo13143b("public_channel_key_format_b64");
            f43528d.mo13140a();
            return a;
        } catch (KeyStoreException e) {
            f43526b.mo25416d("Unable to get instance of AndroidKeyStore", new Object[0]);
            a = m34272a("channel_binding_manager");
            iml = f43528d;
        } catch (NoSuchProviderException e2) {
            f43526b.mo25416d("BOUNCYCASTLE provider unavailable. Creating new keys.", new Object[0]);
            a = m34272a("channel_binding_manager");
            iml = f43528d;
        } catch (Exception e3) {
            f43526b.mo25409a("We have a borked keystore. Deleting old keys/creating new keys.", new Object[0]);
            a = m34272a("channel_binding_manager");
            iml = f43528d;
        } catch (Throwable th) {
            f43528d.mo13143b("wrapped_private_channel_key_b64");
            f43528d.mo13143b("public_channel_key_b64");
            f43528d.mo13143b("wrapped_private_channel_key_format_b64");
            f43528d.mo13143b("public_channel_key_format_b64");
            f43528d.mo13140a();
            throw th;
        }
    }
}
