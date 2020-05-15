package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bqcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcl {
    /* renamed from: a */
    public static int m112572a(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static List m112573a(float... fArr) {
        int length = fArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new bqck(fArr, 0, length);
    }

    /* renamed from: a */
    public static float[] m112574a(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            bmxy.m108581a(obj);
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }
}
