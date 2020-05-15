package p000;

import java.util.Comparator;

/* renamed from: bqcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
enum bqcu implements Comparator {
    INSTANCE;

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int a = bqcw.m112607a(bArr[i], bArr2[i]);
            if (a != 0) {
                return a;
            }
        }
        return bArr.length - bArr2.length;
    }

    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
