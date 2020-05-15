package p000;

import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.view.Display;
import java.util.concurrent.Executor;

/* renamed from: aabj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aabj extends ContextWrapper {

    /* renamed from: a */
    private final Context f27884a;

    public aabj(Context context) {
        super(context);
        this.f27884a = context;
    }

    /* renamed from: a */
    public static Context m21054a(Context context) {
        return cdoz.f181455a.mo6606a().mo78108a() ? new aabj(context) : context;
    }

    /* renamed from: b */
    private final Context m21057b(Context context) {
        if (context != getBaseContext()) {
            return cdoz.f181455a.mo6606a().mo78109b() ? new aabj(context) : context;
        }
        return this;
    }

    public final boolean bindService(Intent intent, int i, Executor executor, ServiceConnection serviceConnection) {
        if (!cdoz.m134480b()) {
            return this.f27884a.bindService(intent, i, executor, serviceConnection);
        }
        bljb a = blkh.m107282a(aabb.m21044a(aabb.m21043a(intent), intent, "OutgoingBinding"), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            boolean bindService = this.f27884a.bindService(intent, i, executor, serviceConnection);
            if (a != null) {
                a.close();
            }
            return bindService;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final Context createConfigurationContext(Configuration configuration) {
        return m21057b(this.f27884a.createConfigurationContext(configuration));
    }

    public final Context createDisplayContext(Display display) {
        return m21057b(this.f27884a.createDisplayContext(display));
    }

    public final Context createPackageContext(String str, int i) {
        return m21057b(this.f27884a.createPackageContext(str, i));
    }

    public final Context getApplicationContext() {
        return m21057b(this.f27884a.getApplicationContext());
    }

    public final void registerComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().registerComponentCallbacks(componentCallbacks);
    }

    public final void sendBroadcast(Intent intent) {
        String a = aabb.m21043a(intent);
        bljb a2 = blkh.m107282a(aabb.m21044a(a, intent, "SendBroadcast"), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            if (m21056a(a)) {
                this.f27884a.sendBroadcast(m21055a(intent));
            } else {
                this.f27884a.sendBroadcast(intent);
            }
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void sendOrderedBroadcast(Intent intent, String str) {
        String a = aabb.m21043a(intent);
        bljb a2 = blkh.m107282a(aabb.m21044a(a, intent, "SendOrderedBroadcast"), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            if (m21056a(a)) {
                this.f27884a.sendOrderedBroadcast(m21055a(intent), str);
            } else {
                this.f27884a.sendOrderedBroadcast(intent, str);
            }
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final ComponentName startForegroundService(Intent intent) {
        String a = aabb.m21043a(intent);
        bljb a2 = blkh.m107282a(aabb.m21044a(a, intent, "StartForegroundService"), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            if (m21056a(a)) {
                ComponentName startForegroundService = this.f27884a.startForegroundService(m21055a(intent));
                if (a2 != null) {
                    a2.close();
                }
                return startForegroundService;
            }
            ComponentName startForegroundService2 = this.f27884a.startForegroundService(intent);
            if (a2 != null) {
                a2.close();
            }
            return startForegroundService2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final ComponentName startService(Intent intent) {
        String a = aabb.m21043a(intent);
        bljb a2 = blkh.m107282a(aabb.m21044a(a, intent, "StartService"), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            if (m21056a(a)) {
                ComponentName startService = this.f27884a.startService(m21055a(intent));
                if (a2 != null) {
                    a2.close();
                }
                return startService;
            }
            ComponentName startService2 = this.f27884a.startService(intent);
            if (a2 != null) {
                a2.close();
            }
            return startService2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public final void unregisterComponentCallbacks(ComponentCallbacks componentCallbacks) {
        super.getApplicationContext().unregisterComponentCallbacks(componentCallbacks);
    }

    public final boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        if (!cdoz.m134480b()) {
            return this.f27884a.bindService(intent, serviceConnection, i);
        }
        bljb a = blkh.m107282a(aabb.m21044a(aabb.m21043a(intent), intent, "OutgoingBinding"), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            boolean bindService = this.f27884a.bindService(intent, serviceConnection, i);
            if (a != null) {
                a.close();
            }
            return bindService;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    static Intent m21055a(Intent intent) {
        String str;
        Intent intent2 = new Intent(intent);
        zzq b = aach.m21087b();
        if (b == null || (b.f56324a & 4) == 0) {
            str = "unknown";
        } else {
            zzr zzr = b.f56327d;
            if (zzr == null) {
                zzr = zzr.f56329d;
            }
            str = zzr.f56332b;
        }
        intent2.putExtra("gms_trace_module_LOGGED", str);
        return intent2;
    }

    public final void sendBroadcast(Intent intent, String str) {
        String a = aabb.m21043a(intent);
        bljb a2 = blkh.m107282a(aabb.m21044a(a, intent, "SendBroadcast"), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            if (m21056a(a)) {
                this.f27884a.sendBroadcast(m21055a(intent), str);
            } else {
                this.f27884a.sendBroadcast(intent, str);
            }
            if (a2 != null) {
                a2.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private static boolean m21056a(String str) {
        if (!cdoz.m134482d()) {
            return false;
        }
        if (str.equals("Internal") || (cdoz.f181455a.mo6606a().mo78119l() && str.equals("Implicit"))) {
            return true;
        }
        return false;
    }
}
