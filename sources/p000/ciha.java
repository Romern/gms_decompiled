package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ciha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciha {

    /* renamed from: a */
    private final Class f190286a;

    /* renamed from: b */
    private final String f190287b;

    /* renamed from: c */
    private final Class[] f190288c;

    public ciha(Class cls, String str, Class... clsArr) {
        this.f190286a = cls;
        this.f190287b = str;
        this.f190288c = clsArr;
    }

    /* renamed from: a */
    private final Method m150290a(Class cls) {
        Class cls2;
        Method a = m150291a(cls, this.f190287b, this.f190288c);
        if (a == null || (cls2 = this.f190286a) == null || cls2.isAssignableFrom(a.getReturnType())) {
            return a;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo86103b(Object obj, Object... objArr) {
        try {
            Method a = m150290a((Class) obj.getClass());
            if (a != null) {
                try {
                    a.invoke(obj, objArr);
                } catch (IllegalAccessException e) {
                }
            }
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: a */
    private static Method m150291a(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m150291a(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException e) {
            }
            return method;
        } catch (NoSuchMethodException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public final Object mo86101a(Object obj, Object... objArr) {
        Method a;
        try {
            a = m150290a((Class) obj.getClass());
            if (a != null) {
                return a.invoke(obj, objArr);
            }
            String str = this.f190287b;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 33 + String.valueOf(valueOf).length());
            sb.append("Method ");
            sb.append(str);
            sb.append(" not supported for object ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        } catch (IllegalAccessException e) {
            String valueOf2 = String.valueOf(a);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            sb2.append("Unexpectedly could not call: ");
            sb2.append(valueOf2);
            AssertionError assertionError = new AssertionError(sb2.toString());
            assertionError.initCause(e);
            throw assertionError;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    /* renamed from: a */
    public final boolean mo86102a(Object obj) {
        return m150290a(obj.getClass()) != null;
    }
}
