package p000;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bmzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmzo {

    /* renamed from: a */
    private static final Object f131274a;

    static {
        Object a = m108684a();
        f131274a = a;
        if (a != null) {
            m108685a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (f131274a != null) {
            m108689b();
        }
    }

    /* renamed from: a */
    private static Object m108684a() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: b */
    public static Throwable m108688b(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            if (cause != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
                th = cause;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause);
            }
        }
    }

    /* renamed from: c */
    public static List m108691c(Throwable th) {
        bmxy.m108581a(th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
        }
    }

    /* renamed from: d */
    public static String m108692d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        bqye.m113760a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    private static Method m108685a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m108689b() {
        try {
            Method a = m108685a("getStackTraceDepth", Throwable.class);
            if (a != null) {
                a.invoke(m108684a(), new Throwable());
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException e) {
        }
    }

    /* renamed from: a */
    public static void m108686a(Throwable th) {
        bmxy.m108581a(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: b */
    public static void m108690b(Throwable th, Class cls) {
        if (th != null) {
            m108687a(th, cls);
        }
        if (th != null) {
            m108686a(th);
        }
    }

    /* renamed from: a */
    public static void m108687a(Throwable th, Class cls) {
        bmxy.m108581a(th);
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
