package p000;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: aajg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aajg {

    /* renamed from: a */
    public static boolean f28258a = false;

    /* renamed from: b */
    public static Method f28259b;

    /* renamed from: c */
    public static Object f28260c;

    /* renamed from: d */
    public static Method f28261d;

    /* renamed from: e */
    private static Object f28262e;

    /* renamed from: f */
    private static int f28263f = 0;

    /* renamed from: g */
    private static Class f28264g;

    /* renamed from: h */
    private static Method f28265h;

    /* renamed from: i */
    private static Constructor f28266i;

    /* renamed from: j */
    private static boolean f28267j = false;

    /* renamed from: k */
    private static PackageManager f28268k;

    /* renamed from: l */
    private static ActivityManager f28269l;

    /* renamed from: m */
    private static Method f28270m;

    /* renamed from: n */
    private static Method f28271n;

    /* renamed from: o */
    private static Method f28272o;

    /* renamed from: p */
    private static Class f28273p;

    /* renamed from: q */
    private static Field f28274q;

    /* renamed from: r */
    private static Method f28275r;

    /* renamed from: s */
    private static Method f28276s;

    /* renamed from: t */
    private static PowerManager f28277t;

    /* renamed from: u */
    private static Method f28278u;

    /* renamed from: a */
    public static int m21331a(int i) {
        if (m21339a() && f28258a) {
            try {
                Integer num = (Integer) f28265h.invoke(f28262e, Integer.valueOf(i));
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error getting user ID from serial: ");
                } else {
                    "Error getting user ID from serial: ".concat(valueOf);
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int m21340b(int i) {
        if (m21339a() && f28258a) {
            try {
                Integer num = (Integer) f28271n.invoke(f28262e, Integer.valueOf(i));
                return num != null ? num.intValue() : i;
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error getting user serial from id: ");
                } else {
                    "Error getting user serial from id: ".concat(valueOf);
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public static Object m21342c(int i) {
        if (!m21339a() || !f28258a) {
            return null;
        }
        int a = m21331a(i);
        try {
            return f28266i.newInstance(Integer.valueOf(a));
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: d */
    public static int m21344d() {
        m21339a();
        return f28263f;
    }

    /* renamed from: e */
    public static boolean m21346e() {
        Boolean bool;
        m21339a();
        int i = Build.VERSION.SDK_INT;
        try {
            if (f28278u == null || (bool = (Boolean) f28278u.invoke(f28277t, new Object[0])) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m21345d(int i) {
        if (m21339a() && f28258a) {
            int a = m21331a(i);
            if (a < 0) {
                return false;
            }
            try {
                Boolean bool = (Boolean) f28270m.invoke(f28269l, Integer.valueOf(a));
                if (bool != null) {
                    return bool.booleanValue();
                }
                return true;
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error getting user running: ");
                } else {
                    "Error getting user running: ".concat(valueOf);
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m21343c() {
        return m21344d() == 0;
    }

    /* renamed from: a */
    public static int m21332a(Context context, aamh aamh) {
        m21339a();
        int i = Build.VERSION.SDK_INT;
        sdo.m34970a(true);
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService(UsageStatsManager.class);
        if (cecz.m136074v()) {
            try {
                Integer num = (Integer) f28276s.invoke(usageStatsManager, aamh.f28457a);
                if (num != null) {
                    return num.intValue();
                }
                String valueOf = String.valueOf(aamh);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                sb.append("Failed to get app standby bucket for: ");
                sb.append(valueOf);
                sb.append(". Received null");
                sb.toString();
                return -1;
            } catch (IllegalAccessException | InvocationTargetException e) {
                String valueOf2 = String.valueOf(aamh);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
                sb2.append("Failed to get app standby bucket for: ");
                sb2.append(valueOf2);
                Log.e("GCM", sb2.toString());
                return -1;
            }
        } else {
            try {
                return usageStatsManager.getAppStandbyBucket(aamh.f28457a);
            } catch (IllegalArgumentException | SecurityException e2) {
                String valueOf3 = String.valueOf(aamh);
                String valueOf4 = String.valueOf(e2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 39 + String.valueOf(valueOf4).length());
                sb3.append("Failed to get app standby bucket for: ");
                sb3.append(valueOf3);
                sb3.append(" ");
                sb3.append(valueOf4);
                Log.e("GCM", sb3.toString());
                return -1;
            }
        }
    }

    /* renamed from: b */
    public static List m21341b() {
        if (m21339a() && f28258a) {
            try {
                List list = (List) f28272o.invoke(f28262e, new Object[0]);
                return list == null ? bngx.m109376e() : list;
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error getting user ID from serial: ");
                } else {
                    "Error getting user ID from serial: ".concat(valueOf);
                }
            }
        }
        return bngx.m109376e();
    }

    /* renamed from: e */
    public static boolean m21347e(int i) {
        m21339a();
        Method method = f28275r;
        if (method == null) {
            return false;
        }
        try {
            Boolean bool = (Boolean) method.invoke(ConnectivityManager.class, Integer.valueOf(i));
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception e) {
            f28275r = null;
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Broken ConnectivityManager.isNetworkTypeMobile: ");
            } else {
                "Broken ConnectivityManager.isNetworkTypeMobile: ".concat(valueOf);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static int m21333a(Object obj) {
        if (!m21339a() || !f28258a) {
            return 0;
        }
        try {
            return f28274q.getInt(obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Error getting field serialNumber: ");
                return 0;
            }
            "Error getting field serialNumber: ".concat(valueOf);
            return 0;
        }
    }

    /* renamed from: a */
    public static List m21334a(Intent intent, int i, int i2) {
        if (!m21339a() || !f28258a) {
            return bngx.m109376e();
        }
        int a = m21331a(i);
        if (a < 0) {
            return bngx.m109376e();
        }
        int i3 = Build.VERSION.SDK_INT;
        return f28268k.queryBroadcastReceiversAsUser(intent, i2, UserHandle.of(a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087 A[Catch:{ Exception -> 0x0127 }] */
    /* renamed from: a */
    public static synchronized void m21335a(Context context) {
        Integer num;
        synchronized (aajg.class) {
            if (!f28267j) {
                f28262e = context.getSystemService("user");
                f28269l = (ActivityManager) context.getSystemService("activity");
                f28268k = context.getPackageManager();
                f28260c = context.getSystemService("usagestats");
                f28277t = (PowerManager) context.getSystemService("power");
                if (f28262e != null) {
                    Class<?> cls = f28262e.getClass();
                    try {
                        f28264g = UserHandle.class;
                        f28266i = UserHandle.class.getConstructor(Integer.TYPE);
                        Object invoke = cls.getMethod("supportsMultipleUsers", new Class[0]).invoke(f28262e, new Object[0]);
                        if (invoke instanceof Boolean) {
                            if (((Boolean) invoke).booleanValue()) {
                                f28258a = true;
                                num = (Integer) cls.getMethod("getUserHandle", new Class[0]).invoke(f28262e, new Object[0]);
                                if (num != null) {
                                    int intValue = num.intValue();
                                    f28265h = cls.getMethod("getUserHandle", Integer.TYPE);
                                    Method method = cls.getMethod("getUserSerialNumber", Integer.TYPE);
                                    f28271n = method;
                                    Integer num2 = (Integer) method.invoke(f28262e, Integer.valueOf(intValue));
                                    if (num2 != null) {
                                        f28263f = num2.intValue();
                                        f28259b = ActivityManager.class.getMethod("getCurrentUser", new Class[0]);
                                        f28270m = ActivityManager.class.getMethod("isUserRunning", Integer.TYPE);
                                        PackageManager.class.getMethod("queryBroadcastReceivers", Intent.class, Integer.TYPE, Integer.TYPE);
                                        f28272o = cls.getMethod("getUsers", new Class[0]);
                                        Class<?> cls2 = Class.forName("android.content.pm.UserInfo");
                                        f28273p = cls2;
                                        f28274q = cls2.getField("serialNumber");
                                        int i = f28263f;
                                        StringBuilder sb = new StringBuilder(54);
                                        sb.append("COMPAT: Multi user ser=");
                                        sb.append(i);
                                        sb.append(" current=");
                                        sb.append(intValue);
                                        sb.toString();
                                    }
                                }
                            }
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        f28258a = true;
                        num = (Integer) cls.getMethod("getUserHandle", new Class[0]).invoke(f28262e, new Object[0]);
                        if (num != null) {
                        }
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e.getMessage());
                        if (valueOf.length() == 0) {
                            new String("COMPAT: Multiuser init error: ");
                        } else {
                            "COMPAT: Multiuser init error: ".concat(valueOf);
                        }
                    }
                }
                if (f28260c != null) {
                    try {
                        f28261d = f28260c.getClass().getMethod("whitelistAppTemporarily", String.class, Long.TYPE, f28264g);
                    } catch (NoSuchMethodException e2) {
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    try {
                        f28276s = f28260c.getClass().getMethod("getAppStandbyBucket", String.class);
                    } catch (NoSuchMethodException e3) {
                        Log.w("GCM", "compat: getAppStandbyBucket not found");
                    }
                }
                try {
                    f28275r = ConnectivityManager.class.getMethod("isNetworkTypeMobile", Integer.TYPE);
                } catch (Exception e4) {
                }
                int i4 = Build.VERSION.SDK_INT;
                try {
                    f28278u = PowerManager.class.getMethod("isLightDeviceIdleMode", new Class[0]);
                } catch (Exception e5) {
                }
                f28267j = true;
                if (f28263f != 0) {
                    Intent intent = new Intent();
                    intent.setClassName(context, "com.google.android.gms.gcm.nts.SchedulerInternalReceiver");
                    intent.putExtra("user_serial", f28263f);
                    intent.putExtra("OP_CODE", 4);
                    m21336a(context, 0, intent, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, null);
                }
            }
        }
        return;
    }

    /* renamed from: a */
    public static void m21336a(Context context, int i, Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler) {
        if (!m21339a() || !f28258a) {
            context.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, 0, null, null);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Object c = m21342c(i);
        sdo.m34959a(c);
        context.sendOrderedBroadcastAsUser(intent, (UserHandle) c, str, broadcastReceiver, null, 0, null, null);
    }

    /* renamed from: a */
    public static void m21337a(Context context, Intent intent) {
        if (!m21339a() || !f28258a) {
            context.sendBroadcast(intent);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Object c = m21342c(0);
        sdo.m34959a(c);
        context.sendBroadcastAsUser(intent, (UserHandle) c);
    }

    /* renamed from: a */
    public static void m21338a(skc skc, String str, long j, PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        skc.mo25679b(str, 2, j, pendingIntent);
    }

    /* renamed from: a */
    public static boolean m21339a() {
        if (!f28267j) {
            Log.e("GCM", "Compat called without init");
        }
        return f28267j;
    }
}
