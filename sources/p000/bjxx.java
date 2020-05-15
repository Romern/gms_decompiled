package p000;

import android.os.Build;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxx {

    /* renamed from: a */
    private static final Charset f123614a = Charset.forName("UTF-8");

    /* renamed from: b */
    private static final Charset f123615b = Charset.forName("US-ASCII");

    /* renamed from: a */
    public static bjxy m104869a() {
        try {
            KeyPair b = bqvm.m113486b(1);
            ECPublicKey eCPublicKey = (ECPublicKey) b.getPublic();
            return new bjxy(((ECPrivateKey) b.getPrivate()).getS().toByteArray(), m104872a(bqvm.m113484a(eCPublicKey.getParams().getCurve(), 1, eCPublicKey.getW())));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Error generating ephemeral key pair.", e);
        }
    }

    /* renamed from: b */
    private static byte[] m104876b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No security provider initialized for SHA-256 encoding", e);
        }
    }

    /* renamed from: c */
    private static String m104877c(byte[] bArr) {
        return boan.f132471e.mo68783a().mo68794a(bArr);
    }

    /* renamed from: a */
    public static bjyb m104870a(String str, String str2, byte[] bArr) {
        try {
            byte[] a = bqvm.m113483a(bqvm.m113477a(1, bArr), bqvm.m113487b(1, m104875a(str)));
            byte[] a2 = bqcn.m112583a(1);
            byte[] a3 = bqcn.m112583a(0);
            byte[] a4 = bqcn.m112583a(0);
            byte[] a5 = m104875a(str2);
            byte[] b = m104876b(bqce.m112562a(a2, a, a3, a4, bqcn.m112583a(a5.length), a5, bqcn.m112583a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            System.arraycopy(b, 0, bArr2, 0, 16);
            System.arraycopy(b, 16, bArr3, 0, 16);
            return new bjyb(bArr2, m104872a(bArr3));
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("Error computing shared keys.", e);
        }
    }

    /* renamed from: a */
    public static String m104871a(String str, String str2, bjyc bjyc) {
        bjyb a = m104870a(str, str2, bjyc.mo51885m());
        bjyc.mo51876c(a.f123619a);
        return a.f123620b;
    }

    /* renamed from: a */
    static String m104872a(byte[] bArr) {
        return boan.f132470d.mo68794a(bArr);
    }

    /* renamed from: a */
    public static String m104873a(byte[] bArr, String str, String str2, bjyc bjyc) {
        return m104874a(bArr, str, str2, bjyc.mo51886n());
    }

    /* renamed from: a */
    public static String m104874a(byte[] bArr, String str, String str2, byte[] bArr2) {
        boolean z;
        if (bArr2 != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "AES encryption key is null.");
        int length = bArr2.length;
        if (length == 16) {
            int length2 = bArr.length;
            if (length2 <= 2147483619) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("alg", "dir");
                    jSONObject.put("kid", str);
                    jSONObject.put("enc", "A128GCM");
                    String c = m104877c(jSONObject.toString().getBytes(f123614a));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    byte[] a = m104875a(str2);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(a);
                    try {
                        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                        instance.init(1, secretKeySpec, ivParameterSpec);
                        int i = Build.VERSION.SDK_INT;
                        instance.updateAAD(c.getBytes(f123615b));
                        byte[] doFinal = instance.doFinal(bArr);
                        int length3 = doFinal.length;
                        if (length3 == length2 + 16) {
                            int i2 = length3 - 16;
                            return String.format(Locale.US, "%s..%s.%s.%s", c, m104877c(a), m104877c(Arrays.copyOf(doFinal, i2)), m104877c(Arrays.copyOfRange(doFinal, i2, length3)));
                        }
                        throw new IllegalStateException(String.format("Encryption failed: GCM tag must be %s bytes, but got %s bytes", 16, Integer.valueOf(length3 - length2)));
                    } catch (GeneralSecurityException e) {
                        throw new IllegalStateException("Error performing A128GCM encryption.", e);
                    }
                } catch (JSONException e2) {
                    throw new IllegalStateException("Error creating JWE protected header.", e2);
                }
            } else {
                throw new IllegalArgumentException("Plain text is too long.");
            }
        } else {
            throw new IllegalArgumentException(String.format("Invalid key size %d; only 128-bit AES keys are supported", Integer.valueOf(length * 8)));
        }
    }

    /* renamed from: a */
    public static byte[] m104875a(String str) {
        return boan.f132470d.mo68796b(str);
    }
}
