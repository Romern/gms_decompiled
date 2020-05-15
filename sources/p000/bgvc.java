package p000;

import android.app.PendingIntent;
import java.util.concurrent.ScheduledFuture;

/* renamed from: bgvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f117622a;

    /* renamed from: b */
    final /* synthetic */ bgvf f117623b;

    public bgvc(bgvf bgvf, PendingIntent pendingIntent) {
        this.f117623b = bgvf;
        this.f117622a = pendingIntent;
    }

    public final void run() {
        bgvf bgvf = this.f117623b;
        PendingIntent pendingIntent = this.f117622a;
        ScheduledFuture scheduledFuture = bgvf.f117631b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            bgvf.f117631b = null;
        }
        bgvf.f117632c = 0;
        bgvf.f117633d.mo63265a().mo34301e(pendingIntent);
        pendingIntent.cancel();
    }
}
