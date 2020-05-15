package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: caqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqx {
    /* renamed from: a */
    public static byte[] m126999a(byte[] bArr) {
        byte[] b = m127000b(bArr);
        if (b == null) {
            return null;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(b, b.length - 16, bArr2, 0, 16);
        return bArr2;
    }

    /* renamed from: b */
    public static byte[] m127000b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
