package p000;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.chimera.Activity;
import java.lang.reflect.Method;

/* renamed from: ilp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilp {

    /* renamed from: a */
    public static final Method f21299a = m15661a(Activity.class, "getActionBar");

    /* renamed from: b */
    public static final Method f21300b = m15661a(ViewConfiguration.class, "hasPermanentMenuKey");

    /* renamed from: c */
    public static final Method f21301c = m15662a(MenuItem.class, "setShowAsAction", Integer.TYPE);

    /* renamed from: d */
    public static final Method f21302d = m15663a("android.app.ActionBar", "setDisplayShowHomeEnabled", Boolean.TYPE);

    /* renamed from: e */
    public static final Method f21303e = m15663a("android.app.ActionBar", "setDisplayShowTitleEnabled", Boolean.TYPE);

    /* renamed from: f */
    private static final Class f21304f;

    /* renamed from: g */
    private static final Class f21305g;

    static {
        m15663a("android.app.ActionBar", "setTitle", CharSequence.class);
        Class a = m15660a("android.net.TrafficStats");
        f21304f = a;
        m15662a(a, "setThreadStatsTag", Integer.TYPE);
        m15661a(f21304f, "clearThreadStatsTag");
        m15662a(View.class, "setSystemUiVisibility", Integer.TYPE);
        Class a2 = m15660a("android.util.EventLog");
        f21305g = a2;
        Class cls = Integer.TYPE;
        if (a2 != null) {
            try {
                a2.getMethod("writeEvent", cls, String.class);
            } catch (NoSuchMethodException e) {
                Log.i("GLSUser", "Method not found writeEvent");
            }
        }
    }

    /* renamed from: a */
    private static Class m15660a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            Log.i("GLSUser", str.length() == 0 ? new String("Class not found ") : "Class not found ".concat(str));
            return null;
        }
    }

    /* renamed from: a */
    private static Method m15661a(Class cls, String str) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.i("GLSUser", str.length() == 0 ? new String("Method not found ") : "Method not found ".concat(str));
            return null;
        }
    }

    /* renamed from: a */
    private static Method m15662a(Class cls, String str, Class cls2) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, cls2);
        } catch (NoSuchMethodException e) {
            Log.i("GLSUser", str.length() == 0 ? new String("Method not found ") : "Method not found ".concat(str));
            return null;
        }
    }

    /* renamed from: a */
    private static Method m15663a(String str, String str2, Class cls) {
        try {
            Class<?> cls2 = Class.forName(str);
            if (cls == null) {
                return cls2.getMethod(str2, new Class[0]);
            }
            return cls2.getMethod(str2, cls);
        } catch (ClassNotFoundException e) {
            Log.i("GLSUser", str.length() == 0 ? new String("Class not found ") : "Class not found ".concat(str));
            return null;
        } catch (NoSuchMethodException e2) {
            Log.i("GLSUser", str2.length() == 0 ? new String("Method not found ") : "Method not found ".concat(str2));
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m15664a() {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            return "wifi-only".equals(declaredMethod.invoke(null, "ro.carrier"));
        } catch (Exception e) {
            return false;
        }
    }
}
