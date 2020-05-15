package p000;

/* renamed from: bacy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bacy {
    /* renamed from: a */
    public static boolean m86614a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
