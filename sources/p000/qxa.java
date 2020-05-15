package p000;

import java.util.Comparator;

/* renamed from: qxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qxa implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return bArr.length - bArr2.length;
    }
}
