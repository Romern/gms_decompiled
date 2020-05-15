package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: stx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stx {

    /* renamed from: a */
    public static final Method f45148a;

    /* renamed from: b */
    private static final int f45149b = Process.myUid();

    /* renamed from: c */
    private static final Method f45150c;

    /* renamed from: d */
    private static final Method f45151d;

    /* renamed from: e */
    private static final Method f45152e;

    /* renamed from: f */
    private static final Method f45153f;

    /* renamed from: g */
    private static final Method f45154g;

    /* renamed from: h */
    private static final Method f45155h;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception e) {
            method = null;
        }
        f45150c = method;
        int i = Build.VERSION.SDK_INT;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception e2) {
            method2 = null;
        }
        f45151d = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception e3) {
            method3 = null;
        }
        f45152e = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception e4) {
            method4 = null;
        }
        f45148a = method4;
        int i2 = Build.VERSION.SDK_INT;
        try {
            method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception e5) {
            method5 = null;
        }
        f45153f = method5;
        int i3 = Build.VERSION.SDK_INT;
        try {
            method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
        } catch (Exception e6) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e6);
            method6 = null;
        }
        f45154g = method6;
        int i4 = Build.VERSION.SDK_INT;
        try {
            method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception e7) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e7);
        }
        f45155h = method7;
    }

    /* renamed from: a */
    public static int m36333a(WorkSource workSource) {
        Method method = f45152e;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static List m36340b(WorkSource workSource) {
        int i;
        if (workSource != null) {
            i = m36333a(workSource);
        } else {
            i = 0;
        }
        if (i == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            String a = m36337a(workSource, i2);
            if (!stm.m36302d(a)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static WorkSource m36334a(int i, String str) {
        WorkSource workSource = new WorkSource();
        m36338a(workSource, i, str);
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m36335a(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        if ("com.google.android.gms".equals(str)) {
            return m36334a(Process.myUid(), str);
        }
        try {
            ApplicationInfo a = svr.m36484b(context).mo26172a(str, 0);
            if (a != null) {
                return m36334a(a.uid, str);
            }
            Log.e("WorkSourceUtil", str.length() == 0 ? new String("Could not get applicationInfo from package: ") : "Could not get applicationInfo from package: ".concat(str));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("WorkSourceUtil", str.length() == 0 ? new String("Could not find package: ") : "Could not find package: ".concat(str));
            return null;
        }
    }

    /* renamed from: a */
    public static WorkSource m36336a(Context context, String str, String str2) {
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int i = -1;
        if ("com.google.android.gms".equals(str)) {
            i = f45149b;
        } else {
            try {
                ApplicationInfo a = svr.m36484b(context).mo26172a(str, 0);
                if (a == null) {
                    Log.e("WorkSourceUtil", str.length() == 0 ? new String("Could not get applicationInfo from package: ") : "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i = a.uid;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("WorkSourceUtil", str.length() == 0 ? new String("Could not find package: ") : "Could not find package: ".concat(str));
            }
        }
        if (i < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method = f45154g;
        if (method == null || f45155h == null) {
            m36338a(workSource, i, str);
        } else {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                if (i != f45149b) {
                    f45155h.invoke(invoke, Integer.valueOf(i), str);
                }
                f45155h.invoke(invoke, Integer.valueOf(f45149b), str2);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e2);
            }
        }
        return workSource;
    }

    /* renamed from: a */
    public static String m36337a(WorkSource workSource, int i) {
        Method method = f45153f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i));
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m36338a(WorkSource workSource, int i, String str) {
        if (f45151d == null) {
            Method method = f45150c;
            if (method != null) {
                try {
                    method.invoke(workSource, Integer.valueOf(i));
                } catch (Exception e) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                }
            }
        } else {
            if (str == null) {
                str = "";
            }
            try {
                f45151d.invoke(workSource, Integer.valueOf(i), str);
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m36339a(Context context) {
        if (context == null || context.getPackageManager() == null || svr.m36484b(context).mo26171a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
