package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bnuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnuz {

    /* renamed from: a */
    public final Object f132211a;

    /* renamed from: b */
    public final Method f132212b;

    /* renamed from: c */
    private final Method f132213c;

    private bnuz(Object obj, Method method, Method method2) {
        this.f132211a = obj;
        this.f132213c = method;
        this.f132212b = method2;
    }

    /* renamed from: a */
    public static bnuz m110476a() {
        try {
            Object invoke = Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            Method method = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            Method method2 = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceDepth", Throwable.class);
            StackTraceElement stackTraceElement = (StackTraceElement) method.invoke(invoke, new Throwable(), 0);
            ((Integer) method2.invoke(invoke, new Throwable())).intValue();
            return new bnuz(invoke, method, method2);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public final StackTraceElement mo68506a(Throwable th, int i) {
        try {
            return (StackTraceElement) this.f132213c.invoke(this.f132211a, th, Integer.valueOf(i));
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
}
