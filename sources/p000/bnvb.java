package p000;

import java.io.PrintStream;

/* renamed from: bnvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvb {
    private bnvb() {
    }

    /* renamed from: a */
    public static Object m110482a(String str, Class cls) {
        String str2;
        bnuy.m110474a(str, "property name");
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException e) {
            m110483a("cannot read property name %s: %s", str, e);
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        int indexOf = str2.indexOf(35);
        if (indexOf <= 0 || indexOf == str2.length() - 1) {
            m110483a("invalid getter (expected <class>#<method>): %s\n", str2);
            return null;
        }
        String substring = str2.substring(0, indexOf);
        String substring2 = str2.substring(indexOf + 1);
        try {
            return cls.cast(Class.forName(substring).getMethod(substring2, new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException e2) {
            return null;
        } catch (ClassCastException e3) {
            m110483a("cannot cast result of calling '%s#%s' to '%s': %s\n", substring, substring2, cls.getName(), e3);
            return null;
        } catch (Exception e4) {
            m110483a("cannot call expected no-argument static method '%s#%s': %s\n", substring, substring2, e4);
            return null;
        }
    }

    /* renamed from: a */
    private static void m110483a(String str, Object... objArr) {
        PrintStream printStream = System.err;
        String valueOf = String.valueOf(bnvb.class);
        String format = String.format(str, objArr);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(format).length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(format);
        printStream.println(sb.toString());
    }
}
