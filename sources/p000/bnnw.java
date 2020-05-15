package p000;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: bnnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnnw {
    /* renamed from: a */
    public static void m109883a(Iterable iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            objArr[i] = obj;
            i++;
        }
    }

    /* renamed from: a */
    static void m109884a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("at index ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    static void m109885a(Object... objArr) {
        m109886a(objArr, objArr.length);
    }

    /* renamed from: a */
    static void m109886a(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m109884a(objArr[i2], i2);
        }
    }

    /* renamed from: a */
    public static Object[] m109887a(Class cls, int i) {
        return (Object[]) Array.newInstance(cls, i);
    }

    /* renamed from: a */
    public static Object[] m109888a(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    /* renamed from: a */
    public static Object[] m109889a(Object[] objArr, Object[] objArr2, Class cls) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] a = m109887a(cls, length + length2);
        System.arraycopy(objArr, 0, a, 0, length);
        System.arraycopy(objArr2, 0, a, length, length2);
        return a;
    }
}
