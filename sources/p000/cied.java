package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cied */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cied implements cibr {

    /* renamed from: a */
    public static final RuntimeException f189944a;

    /* renamed from: b */
    private static final Logger f189945b = Logger.getLogger(cied.class.getName());

    /* renamed from: c */
    private static final Constructor f189946c;

    /* renamed from: d */
    private static final Method f189947d;

    /* renamed from: e */
    private final Object f189948e;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[ADDED_TO_REGION] */
    static {
        Constructor<?> constructor;
        Method method;
        Method method2;
        RuntimeException runtimeException = null;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            int i = 0;
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", new Class[0]);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    }
                    i++;
                }
                th = null;
            } catch (Throwable th) {
                th = th;
                method2 = method;
                f189945b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
                method = method2;
                if (th == null) {
                }
                f189946c = null;
                f189947d = null;
                runtimeException = new RuntimeException(th);
                f189944a = runtimeException;
            }
        } catch (Throwable th2) {
            th = th2;
            method2 = null;
            f189945b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
            method = method2;
            if (th == null) {
                f189946c = constructor;
                f189947d = method;
                f189944a = runtimeException;
            }
            f189946c = null;
            f189947d = null;
            runtimeException = new RuntimeException(th);
            f189944a = runtimeException;
        }
        if (th == null && constructor != null) {
            f189946c = constructor;
            f189947d = method;
        } else {
            f189946c = null;
            f189947d = null;
            runtimeException = new RuntimeException(th);
        }
        f189944a = runtimeException;
    }

    public cied() {
        RuntimeException runtimeException = f189944a;
        if (runtimeException == null) {
            try {
                this.f189948e = f189946c.newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            throw runtimeException;
        }
    }

    /* renamed from: a */
    public final void mo85783a() {
        try {
            f189947d.invoke(this.f189948e, 1L);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
