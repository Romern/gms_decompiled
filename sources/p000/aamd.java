package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: aamd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamd {

    /* renamed from: a */
    private final Context f28444a;

    /* renamed from: b */
    private final skc f28445b;

    /* renamed from: c */
    private PendingIntent f28446c;

    public aamd(Context context) {
        skc skc = new skc(context);
        this.f28444a = context;
        this.f28445b = skc;
    }

    /* renamed from: a */
    public final synchronized void mo17008a() {
        if (this.f28446c == null) {
            this.f28446c = PendingIntent.getBroadcast(this.f28444a, 0, new Intent().setClassName("com.google.android.gms", "com.google.android.gms.gcm.ServiceAutoStarter"), 134217728);
        }
        this.f28445b.mo25673a("GcmServiceRestart", 3, SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(cecz.f182285a.mo6606a().mo78823ao()), this.f28446c);
    }

    /* renamed from: b */
    public final synchronized void mo17009b() {
        PendingIntent pendingIntent = this.f28446c;
        if (pendingIntent != null) {
            this.f28445b.mo25668a(pendingIntent);
            this.f28446c.cancel();
            this.f28446c = null;
        }
    }
}
