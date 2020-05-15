package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: sqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqc {
    /* renamed from: a */
    public static int m35953a(Object[] objArr, Object obj) {
        int length = objArr != null ? objArr.length : 0;
        for (int i = 0; i < length; i++) {
            if (sdg.m34949a(objArr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m35963b(Object[] objArr, Object obj) {
        return m35953a(objArr, obj) >= 0;
    }

    /* renamed from: c */
    public static Object[] m35965c(Object[] objArr, Object obj) {
        Object[] objArr2;
        if (objArr == null && obj == null) {
            throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
        }
        if (objArr != null) {
            objArr2 = Arrays.copyOf(objArr, objArr.length + 1);
        } else {
            objArr2 = (Object[]) Array.newInstance(obj.getClass(), 1);
        }
        objArr2[objArr2.length - 1] = obj;
        return objArr2;
    }

    /* renamed from: a */
    public static ArrayList m35954a() {
        return new ArrayList();
    }

    /* renamed from: b */
    public static long[] m35964b(Collection collection) {
        int i = 0;
        if (collection.size() == 0) {
            return new long[0];
        }
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: a */
    public static ArrayList m35955a(Object[] objArr) {
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (Object obj : objArr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m35956a(StringBuilder sb, Object[] objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(objArr[i].toString());
        }
    }

    /* renamed from: a */
    public static boolean m35957a(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m35958a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 == str) {
                return true;
            }
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m35959a(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (byte[] bArr2 : bArr) {
            i += bArr2.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr[0], i);
        int length = bArr[0].length;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte[] bArr3 = bArr[i2];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }

    /* renamed from: a */
    public static int[] m35960a(Collection collection) {
        int i = 0;
        if (collection == null || collection.size() == 0) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: a */
    public static long[] m35961a(Long[] lArr) {
        if (lArr == null) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i = 0; i < lArr.length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    /* renamed from: a */
    public static Object[] m35962a(Object[]... objArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += objArr[i2].length;
        }
        Object[] copyOf = Arrays.copyOf(objArr[0], i);
        int length = objArr[0].length;
        for (char c = 1; c < 2; c = 2) {
            Object[] objArr2 = objArr[1];
            int length2 = objArr2.length;
            System.arraycopy(objArr2, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }
}
