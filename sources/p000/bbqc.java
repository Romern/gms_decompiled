package p000;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: bbqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbqc {
    /* renamed from: a */
    public static ByteString m88385a(String str, KeyPair keyPair) {
        byte[] a = bbou.m88298a(str);
        try {
            PrivateKey privateKey = keyPair.getPrivate();
            Signature instance = Signature.getInstance("SHA256withECDSA");
            instance.initSign(privateKey);
            instance.update(a);
            return ByteString.m123261a(instance.sign());
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append(valueOf);
            sb.append(" failed to signBytes");
            bbos.m88294d("CryptoUtils", sb.toString());
            return null;
        }
    }
}
