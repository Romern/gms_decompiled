package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.easyunlock.userpresence.PeriodicCheckChimeraReceiver;

/* renamed from: ivs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivs {

    /* renamed from: a */
    private static ivs f21885a;

    /* renamed from: b */
    private final Context f21886b;

    /* renamed from: c */
    private final skc f21887c;

    static {
        ivs.class.getSimpleName();
    }

    private ivs(Context context) {
        skc skc = new skc(context);
        this.f21886b = context;
        this.f21887c = skc;
    }

    /* renamed from: a */
    public static synchronized ivs m16223a(Context context) {
        ivs ivs;
        synchronized (ivs.class) {
            if (f21885a == null) {
                f21885a = new ivs(context.getApplicationContext());
            }
            ivs = f21885a;
        }
        return ivs;
    }

    /* renamed from: b */
    public final void mo13376b() {
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f21886b, 0, PeriodicCheckChimeraReceiver.m6560a(this.f21886b), 536870912);
        if (broadcast != null) {
            this.f21887c.mo25668a(broadcast);
        }
    }

    /* renamed from: a */
    public final void mo13375a() {
        this.f21887c.mo25671a("UserPresenceScheduler", 1, System.currentTimeMillis(), 60000, PendingIntent.getBroadcast(this.f21886b, 0, PeriodicCheckChimeraReceiver.m6560a(this.f21886b), 134217728), "com.google.android.gms");
    }
}
