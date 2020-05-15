package p000;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: dsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsx {

    /* renamed from: a */
    public static long f13969a = 0;

    /* renamed from: b */
    public static long f13970b = 0;

    /* renamed from: c */
    public static long f13971c = 0;

    /* renamed from: a */
    public static Cipher m9267a(int i, byte[] bArr) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(new byte[16]));
        return instance;
    }
}
