package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.UserHandle;
import android.provider.Settings;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.SettingInjectorService;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* renamed from: aeri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeri {

    /* renamed from: a */
    private static Method f63663a;

    /* renamed from: b */
    private static aeri f63664b;

    /* renamed from: c */
    private final Context f63665c;

    /* renamed from: d */
    private aequ f63666d;

    /* renamed from: e */
    private aero f63667e;

    /* renamed from: f */
    private aerf f63668f;

    private aeri(Context context) {
        this.f63665c = context;
    }

    /* renamed from: a */
    private final synchronized aequ m52429a() {
        if (this.f63666d == null) {
            if (ssw.m36269a()) {
                this.f63666d = new aeqy(this.f63665c);
            } else {
                this.f63666d = new aeqw(this.f63665c);
            }
        }
        return this.f63666d;
    }

    /* renamed from: a */
    static boolean m52433a(int i) {
        return i == 2 || i == 3;
    }

    /* renamed from: b */
    private final synchronized aero m52436b() {
        if (this.f63667e == null) {
            if (ssw.m36269a()) {
                this.f63667e = new aers(this.f63665c, this);
            } else {
                this.f63667e = new aerq(this.f63665c, this);
            }
        }
        return this.f63667e;
    }

    /* renamed from: c */
    public static int m52438c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return m52437b(context) ? 3 : 0;
    }

    /* renamed from: d */
    public static boolean m52440d(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), "wifi_scan_always_enabled", 0) == 1;
    }

    /* renamed from: e */
    public static synchronized aeri m52441e(Context context) {
        aeri aeri;
        synchronized (aeri.class) {
            if (f63664b == null) {
                f63664b = new aeri(context.getApplicationContext());
            }
            aeri = f63664b;
        }
        return aeri;
    }

    /* renamed from: c */
    private final synchronized aerf m52439c() {
        if (this.f63668f == null) {
            this.f63668f = new aerf(this.f63665c, aerb.f63655a);
        }
        return this.f63668f;
    }

    /* renamed from: a */
    public static void m52430a(Context context, int i, aerk aerk) {
        boolean z;
        sdo.m34959a(aerk);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = Build.VERSION.SDK_INT;
        m52431a(context, z, aerk);
    }

    /* renamed from: b */
    public static boolean m52437b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((LocationManager) context.getSystemService(LocationManager.class)).isLocationEnabled();
    }

    /* renamed from: a */
    public static void m52431a(Context context, boolean z, aerk aerk) {
        Method method;
        sdo.m34959a(aerk);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (cevw.f183465a.mo6606a().useReflectedSystemApis()) {
            if (f63663a == null) {
                try {
                    method = LocationManager.class.getDeclaredMethod("setLocationEnabledForUser", Boolean.TYPE, UserHandle.class);
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.e("LocationSettings", "unable to reflect setLocationEnabledForUser", e);
                    method = null;
                }
                f63663a = method;
            }
            Method method2 = f63663a;
            if (method2 != null) {
                try {
                    method2.invoke(context.getSystemService(LocationManager.class), Boolean.valueOf(z), Process.myUserHandle());
                    return;
                } catch (IllegalAccessException e2) {
                    Log.e("LocationSettings", "unable to access setLocationEnabledForUser", e2);
                } catch (InvocationTargetException e3) {
                    Log.e("LocationSettings", "unable to invoke setLocationEnabledForUser", e3);
                }
            }
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (z) {
                i2 = 3;
            }
            Settings.Secure.putInt(contentResolver, "location_mode", i2);
        } catch (SecurityException e4) {
            Log.e("LocationSettings", "Google Play services lost WRITE_SECURE_SETTINGS permission!", e4);
        }
    }

    /* renamed from: a */
    public static void m52432a(Context context, boolean z, aerk aerk, int i, int... iArr) {
        sdo.m34959a(aerk);
        aymk.m84259b(context.getContentResolver(), "network_location_opt_in", z ? 1 : 0);
        int i2 = Build.VERSION.SDK_INT;
        context.sendBroadcast(new Intent(SettingInjectorService.ACTION_INJECTED_SETTING_CHANGED));
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.location.settings.AriLoggingIntentOperation", "com.google.android.location.settings.LOG_NLP_CONSENT");
        if (startIntent != null) {
            int i3 = i - 1;
            if (i != 0) {
                startIntent.putExtra("source", i3);
                startIntent.putExtra("consent", z);
                startIntent.putExtra("textResources", iArr);
                context.startService(startIntent);
                return;
            }
            throw null;
        }
        Log.w("LocationSettings", "unable to ari log nlp consent", new IllegalStateException());
    }

    /* renamed from: a */
    public static boolean m52434a(Context context) {
        return aymk.m84257a(context.getContentResolver(), "network_location_opt_in", 0) == 1;
    }

    /* renamed from: a */
    public static boolean m52435a(Context context, String str) {
        if ("network".equals(str)) {
            return m52434a(context) && m52433a(m52438c(context));
        }
        if ("fused".equals(str)) {
            return m52438c(context) != 0;
        }
        return ((LocationManager) context.getSystemService("location")).isProviderEnabled(str);
    }

    /* renamed from: a */
    public final void mo34478a(aerc aerc) {
        aequ aequ;
        synchronized (this) {
            aequ = this.f63666d;
        }
        if (aequ != null) {
            synchronized (aequ.f63646b) {
                if (aequ.f63646b.remove(aerc) != null && aequ.f63646b.isEmpty()) {
                    aequ.mo34469b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34479a(aerc aerc, Looper looper) {
        mo34480a(aerc, new sty(looper));
    }

    /* renamed from: a */
    public final void mo34480a(aerc aerc, Executor executor) {
        aequ a = m52429a();
        synchronized (a.f63646b) {
            if (a.f63646b.put(aerc, executor) == null && a.f63646b.f26809h == 1) {
                a.mo34467a();
                a.f63647c = m52438c(a.f63645a);
            }
        }
    }

    /* renamed from: a */
    public final void mo34481a(aerd aerd) {
        aero aero;
        synchronized (this) {
            aero = this.f63667e;
        }
        if (aero != null) {
            synchronized (aero.f63684c) {
                if (aero.f63684c.remove(aerd) != null && aero.f63684c.isEmpty()) {
                    aero.f63683b.mo34478a(aero.f63685d);
                    aero.f63683b.mo34484a(aero.f63686e);
                    aero.mo34494b();
                    aero.f63687f.clear();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34482a(aerd aerd, Looper looper) {
        mo34483a(aerd, new sty(looper));
    }

    /* renamed from: a */
    public final void mo34483a(aerd aerd, Executor executor) {
        aero b = m52436b();
        synchronized (b.f63684c) {
            if (b.f63684c.isEmpty()) {
                b.f63683b.mo34479a(b.f63685d, Looper.getMainLooper());
                b.f63683b.mo34485a(b.f63686e, Looper.getMainLooper());
                b.f63687f.clear();
                b.mo34492a();
                b.f63688g = m52433a(m52438c(b.f63682a));
                b.f63689h = m52434a(b.f63682a);
                b.mo34496c();
                if (m52438c(b.f63682a) != 0) {
                    b.mo34495b("passive", true);
                    b.mo34495b("fused", true);
                }
            }
            b.f63684c.put(aerd, executor);
        }
    }

    /* renamed from: a */
    public final void mo34484a(aerh aerh) {
        aerf aerf;
        synchronized (this) {
            aerf = this.f63668f;
        }
        if (aerf != null) {
            aerf.mo34475a(aerh);
        }
    }

    /* renamed from: a */
    public final void mo34485a(aerh aerh, Looper looper) {
        mo34486a(aerh, new sty(looper));
    }

    /* renamed from: a */
    public final synchronized void mo34486a(aerh aerh, Executor executor) {
        m52439c().mo34476a(Uri.withAppendedPath(aymk.f97976b, "network_location_opt_in"), aerh, executor);
    }

    @Deprecated
    /* renamed from: a */
    public final boolean mo34487a(String str) {
        return m52435a(this.f63665c, str);
    }
}
