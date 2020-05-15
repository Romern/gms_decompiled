package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: cak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cak {
    static {
        cak.class.getSimpleName();
    }

    /* renamed from: a */
    private static byte[] m3834a(String str, byte[] bArr) {
        long nanoTime = System.nanoTime();
        try {
            byte[] digest = MessageDigest.getInstance(str).digest(bArr);
            cbd.m3885b("digest", nanoTime);
            return digest;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            cbd.m3885b("digest", nanoTime);
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m3836b(byte[] bArr) {
        byte[] a = m3834a("SHA-256", bArr);
        Object[] objArr = {a, bArr};
        int i = cbd.f6383a;
        return a;
    }

    /* renamed from: a */
    public static byte[] m3835a(byte[] bArr) {
        byte[] a = m3834a("SHA-1", bArr);
        Object[] objArr = {a, bArr};
        int i = cbd.f6383a;
        return a;
    }
}
