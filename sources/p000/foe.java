package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;

/* renamed from: foe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class foe {

    /* renamed from: c */
    private static Boolean f17003c;

    /* renamed from: a */
    public final Handler f17004a = new adzt();

    /* renamed from: b */
    public final Context f17005b;

    public foe(Context context) {
        sdo.m34959a(context);
        this.f17005b = context;
    }

    /* renamed from: a */
    public static boolean m12065a(Context context) {
        sdo.m34959a(context);
        Boolean bool = f17003c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        f17003c = Boolean.valueOf(z);
        return z;
    }

    /* renamed from: b */
    public final void mo11058b() {
        fkm.m11883a(this.f17005b).mo10957a().mo10933d("Device AnalyticsService is shutting down");
    }

    /* renamed from: a */
    public final void mo11056a() {
        fkm.m11883a(this.f17005b).mo10957a().mo10933d("Device AnalyticsService is starting up");
    }

    /* renamed from: a */
    public final void mo11057a(Runnable runnable) {
        fkm.m11883a(this.f17005b).mo10959c().mo10920a((fln) new foc(this, runnable));
    }
}
