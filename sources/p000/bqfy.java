package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bqfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqfy {

    /* renamed from: a */
    private static final bnny f140613a = bnnt.f131877a.mo68159a(new bqfu()).mo67377a();

    /* renamed from: a */
    static bqfv m112765a() {
        return bqfw.INSTANCE;
    }

    /* renamed from: a */
    private static Exception m112766a(Class cls, Throwable th) {
        for (Constructor constructor : f140613a.mo67378a(Arrays.asList(cls.getConstructors()))) {
            Exception exc = (Exception) m112767a(constructor, th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("No appropriate constructor for exception of type ");
        sb.append(valueOf);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    /* renamed from: a */
    private static Object m112767a(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m112768a(Future future, Class cls) {
        bqfx.f140612b.mo69218a(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m112766a(cls, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new bqfc((Error) cause);
            } else if (cause instanceof RuntimeException) {
                throw new bqhh(cause);
            } else {
                throw m112766a(cls, cause);
            }
        }
    }

    /* renamed from: a */
    static void m112769a(Class cls) {
        boolean z = true;
        bmxy.m108596a(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        try {
            m112766a(cls, new Exception());
        } catch (Exception e) {
            z = false;
        }
        bmxy.m108596a(z, "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }
}
