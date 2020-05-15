package p000;

import java.security.SecureRandom;

/* renamed from: bqwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwf {

    /* renamed from: a */
    private static final ThreadLocal f141710a = new bqwe();

    /* renamed from: a */
    public static byte[] m113516a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f141710a.get()).nextBytes(bArr);
        return bArr;
    }
}
