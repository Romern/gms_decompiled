package p000;

import java.lang.reflect.InvocationTargetException;

/* renamed from: gu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1033gu {

    /* renamed from: a */
    private static final C1245ok f19020a = new C1245ok();

    /* renamed from: a */
    static boolean m13902a(ClassLoader classLoader, String str) {
        try {
            return C1018gh.class.isAssignableFrom(m13904d(classLoader, str));
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static Class m13903b(ClassLoader classLoader, String str) {
        try {
            return m13904d(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: d */
    private static Class m13904d(ClassLoader classLoader, String str) {
        Class cls = (Class) f19020a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f19020a.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public C1018gh mo12222c(ClassLoader classLoader, String str) {
        try {
            return (C1018gh) m13903b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }
}
