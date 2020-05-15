package p000;

import java.lang.reflect.InvocationTargetException;

/* renamed from: bnux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnux {

    /* renamed from: a */
    private static final bnuz f132210a = bnuz.m110476a();

    /* renamed from: a */
    public static StackTraceElement m110472a(Class cls, Throwable th, int i) {
        StackTraceElement[] stackTraceElementArr;
        bnuy.m110474a(cls, "target");
        bnuy.m110474a(th, "throwable");
        if (i >= 0) {
            if (f132210a == null) {
                stackTraceElementArr = th.getStackTrace();
            } else {
                stackTraceElementArr = null;
            }
            boolean z = false;
            while (true) {
                try {
                    StackTraceElement a = f132210a != null ? f132210a.mo68506a(th, i) : stackTraceElementArr[i];
                    if (cls.getName().equals(a.getClassName())) {
                        z = true;
                    } else if (z) {
                        return a;
                    }
                    i++;
                } catch (Exception e) {
                    return null;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(42);
            sb.append("skip count cannot be negative: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public static StackTraceElement[] m110473b(Class cls, Throwable th, int i) {
        int i2;
        StackTraceElement[] stackTraceElementArr;
        bnuy.m110474a(cls, "target");
        bnuy.m110474a(th, "throwable");
        if (i <= 0 && i != -1) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("invalid maximum depth: 0");
            throw new IllegalArgumentException(sb.toString());
        }
        bnuz bnuz = f132210a;
        if (bnuz == null) {
            stackTraceElementArr = th.getStackTrace();
            i2 = stackTraceElementArr.length;
        } else {
            try {
                i2 = ((Integer) bnuz.f132212b.invoke(bnuz.f132211a, th)).intValue();
                stackTraceElementArr = null;
            } catch (InvocationTargetException e) {
                if (e.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e.getCause());
                } else if (e.getCause() instanceof Error) {
                    throw ((Error) e.getCause());
                } else {
                    throw new RuntimeException(e.getCause());
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            bnuz bnuz2 = f132210a;
            StackTraceElement a = bnuz2 != null ? bnuz2.mo68506a(th, i3) : stackTraceElementArr[i3];
            if (cls.getName().equals(a.getClassName())) {
                z = true;
            } else if (z) {
                int i4 = i2 - i3;
                if (i <= 0 || i >= i4) {
                    i = i4;
                }
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
                stackTraceElementArr2[0] = a;
                for (int i5 = 1; i5 < i; i5++) {
                    bnuz bnuz3 = f132210a;
                    stackTraceElementArr2[i5] = bnuz3 != null ? bnuz3.mo68506a(th, i3 + i5) : stackTraceElementArr[i3 + i5];
                }
                return stackTraceElementArr2;
            }
        }
        return new StackTraceElement[0];
    }
}
