package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bjyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjyu {
    /* renamed from: a */
    public static int m104928a(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        for (int i = 0; i < length; i++) {
            if (bjzb.m104957a(objArr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static long[] m104931b(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }

    /* renamed from: c */
    public static List m104932c(List list) {
        int i;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i);
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m104929a(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int[] m104930a(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }
}
