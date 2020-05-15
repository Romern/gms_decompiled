package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: cavd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavd {

    /* renamed from: a */
    private final Class f176118a;

    /* renamed from: b */
    private final String f176119b;

    /* renamed from: c */
    private final Class[] f176120c;

    public cavd(Class cls, String str, Class... clsArr) {
        this.f176118a = cls;
        this.f176119b = str;
        this.f176120c = clsArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if ((r4.getModifiers() & 1) != 0) goto L_0x0016;
     */
    /* renamed from: a */
    private final Method m127285a(Class cls) {
        Class cls2;
        try {
            Method method = cls.getMethod(this.f176119b, this.f176120c);
            try {
                method = null;
                if (method != null || (cls2 = this.f176118a) == null || cls2.isAssignableFrom(method.getReturnType())) {
                    return method;
                }
                return null;
                if (method != null) {
                }
                return method;
            } catch (NoSuchMethodException e) {
            }
        } catch (NoSuchMethodException e2) {
        }
    }

    /* renamed from: b */
    public final void mo74953b(Object obj, Object... objArr) {
        try {
            Method a = m127285a((Class) obj.getClass());
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
    public final Object mo74951a(Object obj, Object... objArr) {
        Method a;
        try {
            a = m127285a((Class) obj.getClass());
            if (a != null) {
                return a.invoke(obj, objArr);
            }
            String str = this.f176119b;
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
    public final boolean mo74952a(Object obj) {
        return m127285a(obj.getClass()) != null;
    }
}
