package p000;

/* renamed from: cxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cxn {
    /* renamed from: a */
    public static byte[] m7838a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return bArr;
        }
        String a = cvz.m7704a(bArr);
        while (a.endsWith("00000000")) {
            a = a.substring(0, a.length() - 8);
        }
        return cvz.m7720b(a);
    }
}
