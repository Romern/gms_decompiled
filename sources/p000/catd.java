package p000;

/* renamed from: catd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class catd {
    /* renamed from: a */
    public static int m127150a(byte b, byte[] bArr, byte[] bArr2) {
        if (!(bArr2 == null || !catg.m127168d(bArr2) || bArr == null)) {
            short s = (short) ((char) ((bArr[1] & 255) | (bArr[0] << 8)));
            if (s == 16657 || s == 16689 || s == 18308 || s == 29987) {
                return 4;
            }
        }
        if (b == 0) {
            return 1;
        }
        if (b == 1 || b == 9) {
            return 3;
        }
        return b != 32 ? 5 : 2;
    }

    /* renamed from: a */
    public static /* synthetic */ String m127151a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "TRANSIT" : "CASH_OR_CASH_BACK" : "REFUND" : "PURCHASE";
    }
}
