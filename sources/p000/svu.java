package p000;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: svu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svu {

    /* renamed from: a */
    public static final Uri f45249a = Uri.parse("content://com.google.android.gsf.gservices/main");

    /* renamed from: b */
    public static final Uri f45250b = Uri.parse("content://com.google.android.gsf.gservices/main_diff");

    /* renamed from: c */
    public static Boolean f45251c;

    /* renamed from: d */
    public static Boolean f45252d;

    /* renamed from: e */
    public static final Executor f45253e = new svt();

    /* renamed from: f */
    private static Boolean f45254f;

    /* renamed from: g */
    private static final svu f45255g = m36486a();

    static {
        Uri.parse("content://com.google.android.gsf.gservices/override");
    }

    /* renamed from: a */
    public static svu m36486a() {
        svu svu = f45255g;
        if (svu != null) {
            return svu;
        }
        int i = Build.VERSION.SDK_INT;
        return new swd();
    }

    /* renamed from: b */
    public static void m36489b() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public void mo26185a(Intent intent) {
    }

    /* renamed from: a */
    public boolean mo26187a(Object obj) {
        return false;
    }

    /* renamed from: b */
    public boolean mo26188b(Object obj) {
        return false;
    }

    /* renamed from: c */
    public int mo26189c() {
        return 0;
    }

    /* renamed from: c */
    public int mo26190c(Context context) {
        return 0;
    }

    /* renamed from: d */
    public String mo26191d(Context context) {
        return null;
    }

    /* renamed from: d */
    public boolean mo26192d() {
        return false;
    }

    /* renamed from: e */
    public int mo26193e() {
        return 0;
    }

    /* renamed from: e */
    public String mo26194e(Context context) {
        return null;
    }

    /* renamed from: f */
    public Object mo26195f(Context context) {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      aymn.a(android.content.ContentResolver, java.lang.String, int):int
      aymn.a(android.content.ContentResolver, java.lang.String, long):long
      aymn.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      aymn.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      aymn.a(java.lang.Object, java.lang.String, java.lang.String):void
      aymn.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* renamed from: b */
    public static void m36490b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        PackageManager packageManager = context.getPackageManager();
        synchronized (svu.class) {
            boolean z = true;
            boolean a = aymn.m84269a(contentResolver, "checkin_disable_gsf", true);
            if (!aymn.m84269a(context.getContentResolver(), "checkin_enable_gms", true) || !aymn.m84269a(context.getContentResolver(), "update_enable_gms", true)) {
                z = false;
            } else {
                int i = Build.VERSION.SDK_INT;
            }
            if (f45252d != null) {
                if (f45252d.equals(Boolean.valueOf(a)) && f45251c != null && f45251c.equals(Boolean.valueOf(z))) {
                    return;
                }
            }
            f45252d = Boolean.valueOf(a);
            f45251c = Boolean.valueOf(z);
            try {
                packageManager.getPackageInfo("com.google.android.gsf", 4);
                new svs(packageManager).start();
            } catch (PackageManager.NameNotFoundException e) {
                Log.i("CheckinCompat", "GoogleServicesFramework does not exist, no need to disable");
            }
        }
    }

    /* renamed from: a */
    public static void m36487a(PackageManager packageManager, String str, String str2, boolean z) {
        try {
            packageManager.setComponentEnabledSetting(new ComponentName(str, str2.length() == 0 ? new String(str) : str.concat(str2)), !z ? 1 : 2, 1);
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("CheckinCompat", 4)) {
                String str3 = !z ? "enable" : "disable";
                StringBuilder sb = new StringBuilder(str2.length() + 15 + str3.length());
                sb.append("No service ");
                sb.append(str2);
                sb.append(" to ");
                sb.append(str3);
                Log.i("CheckinCompat", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static boolean m36488a(Context context) {
        boolean z;
        if (!cdci.f180455a.mo6606a().mo77248k()) {
            return false;
        }
        synchronized (svu.class) {
            if (f45254f != null) {
                if (!f45254f.equals(f45252d)) {
                }
            }
            if (f45252d == null || f45252d.booleanValue()) {
                Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    ActivityManager.RunningServiceInfo next = it.next();
                    if (next != null && next.service != null && "com.google.android.gsf".equals(next.service.getPackageName()) && ".checkin.CheckinService".equals(next.service.getShortClassName())) {
                        Log.i("CheckinCompat", "GSF Checkin still active");
                        z = false;
                        break;
                    }
                }
                synchronized (svu.class) {
                    f45254f = Boolean.valueOf(z);
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public int mo26184a(TelephonyManager telephonyManager) {
        try {
            return ((Integer) telephonyManager.getClass().getMethod("getCurrentPhoneType", new Class[0]).invoke(telephonyManager, new Object[0])).intValue();
        } catch (Exception e) {
            return telephonyManager.getPhoneType();
        }
    }

    /* renamed from: a */
    public void mo26186a(AsyncTask asyncTask, Executor executor, Object... objArr) {
        asyncTask.execute(objArr);
    }
}
