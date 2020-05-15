package p000;

import java.util.Collection;

/* renamed from: bqcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcc {
    /* renamed from: a */
    public static int m112556a(boolean z, boolean z2) {
        if (z != z2) {
            return !z ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m112557a(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean[] m112558a(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            bmxy.m108581a(obj);
            zArr[i] = ((Boolean) obj).booleanValue();
        }
        return zArr;
    }
}
