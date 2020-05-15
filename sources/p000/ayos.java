package p000;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;

/* renamed from: ayos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayos {

    /* renamed from: c */
    public static final /* synthetic */ int f98128c = 0;

    /* renamed from: d */
    private static final String[] f98129d = {"GmsCore_OpenSSL", "AndroidOpenSSL", "SC", "BC"};

    /* renamed from: e */
    private static final ECGenParameterSpec f98130e = new ECGenParameterSpec("secp256r1");

    /* renamed from: a */
    public final ECPublicKey f98131a;

    /* renamed from: b */
    public final ECPrivateKey f98132b;

    public ayos(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        this.f98131a = eCPublicKey;
        this.f98132b = eCPrivateKey;
    }

    /* renamed from: a */
    public static Object m84393a(ayor ayor) {
        String[] strArr = f98129d;
        int i = 0;
        while (i < strArr.length) {
            try {
                return ayor.mo54170a(strArr[i]);
            } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
                i++;
            }
        }
        throw new NoSuchProviderException();
    }

    /* renamed from: a */
    public static KeyPair m84394a() {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) m84393a(ayoo.f98125a);
        keyPairGenerator.initialize(f98130e);
        return keyPairGenerator.generateKeyPair();
    }

    /* renamed from: a */
    public static byte[] m84395a(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        if (length > 32) {
            int i2 = length - 32;
            while (i < i2) {
                if (bArr[i] == 0) {
                    i++;
                } else {
                    String arrays = Arrays.toString(bArr);
                    StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 40);
                    sb.append("More than 32 non-zero bytes in ");
                    sb.append(arrays);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return Arrays.copyOfRange(bArr, i2, bArr.length);
        }
        return bqce.m112562a(new byte[(32 - length)], bArr);
    }
}
