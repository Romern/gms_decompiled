package p000;

import android.text.TextUtils;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/* renamed from: aqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqq {
    /* renamed from: a */
    public static SliceItem m1868a(Slice slice, String str, String str2) {
        if (slice != null) {
            return m1873a(m1874a(slice), new aqm(str, str2));
        }
        return null;
    }

    /* renamed from: b */
    public static SliceItem m1879b(Slice slice, String str, String str2) {
        return m1870a(slice, str, new String[]{str2}, new String[]{null});
    }

    /* renamed from: c */
    static boolean m1884c(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.f1658c);
    }

    /* renamed from: a */
    public static SliceItem m1869a(Slice slice, String str, String str2, String[] strArr) {
        SliceItem[] sliceItemArr = slice.f1653d;
        for (SliceItem sliceItem : sliceItemArr) {
            if (m1882b(sliceItem, str) && m1884c(sliceItem, str2) && m1883b(sliceItem, strArr) && !m1878a(sliceItem, (String[]) null)) {
                return sliceItem;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static SliceItem m1880b(SliceItem sliceItem, String str, String str2) {
        return m1881b(sliceItem, str, new String[]{str2}, new String[]{null});
    }

    /* renamed from: a */
    public static SliceItem m1870a(Slice slice, String str, String[] strArr, String[] strArr2) {
        if (slice != null) {
            return m1873a(m1874a(slice), new aql(str, strArr, strArr2));
        }
        return null;
    }

    /* renamed from: b */
    public static SliceItem m1881b(SliceItem sliceItem, String str, String[] strArr, String[] strArr2) {
        if (sliceItem != null) {
            return m1873a(m1875a(sliceItem), new aqo(str, strArr, strArr2));
        }
        return null;
    }

    /* renamed from: a */
    public static SliceItem m1871a(SliceItem sliceItem, String str) {
        return m1881b(sliceItem, str, null, null);
    }

    /* renamed from: b */
    static boolean m1882b(SliceItem sliceItem, String str) {
        return str == null || str.equals(sliceItem.f1657b);
    }

    /* renamed from: a */
    public static SliceItem m1872a(SliceItem sliceItem, String str, String str2) {
        if (sliceItem != null) {
            return m1873a(m1875a(sliceItem), new aqn(str, str2));
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m1883b(SliceItem sliceItem, String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && !sliceItem.mo2049a(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private static SliceItem m1873a(Deque deque, aqp aqp) {
        while (!deque.isEmpty()) {
            SliceItem sliceItem = (SliceItem) deque.poll();
            if (aqp.mo2302a(sliceItem)) {
                return sliceItem;
            }
            if ("slice".equals(sliceItem.f1657b) || "action".equals(sliceItem.f1657b)) {
                Collections.addAll(deque, sliceItem.mo2056f().f1653d);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Deque m1874a(Slice slice) {
        ArrayDeque arrayDeque = new ArrayDeque();
        Collections.addAll(arrayDeque, slice.f1653d);
        return arrayDeque;
    }

    /* renamed from: a */
    private static Deque m1875a(SliceItem sliceItem) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(sliceItem);
        return arrayDeque;
    }

    /* renamed from: a */
    public static List m1876a(SliceItem sliceItem, String str, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        m1877a(m1875a(sliceItem), new aqk(str, strArr, strArr2), arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static void m1877a(Deque deque, aqp aqp, List list) {
        while (!deque.isEmpty()) {
            SliceItem sliceItem = (SliceItem) deque.poll();
            if (aqp.mo2302a(sliceItem)) {
                list.add(sliceItem);
            }
            if ("slice".equals(sliceItem.f1657b) || "action".equals(sliceItem.f1657b)) {
                Collections.addAll(deque, sliceItem.mo2056f().f1653d);
            }
        }
    }

    /* renamed from: a */
    public static boolean m1878a(SliceItem sliceItem, String... strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (sliceItem.mo2049a(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
