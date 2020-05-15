package p000;

import android.app.PendingIntent;

/* renamed from: zkw */
final /* synthetic */ class zkw implements Runnable {

    /* renamed from: a */
    private final skc f55337a;

    /* renamed from: b */
    private final PendingIntent f55338b;

    public zkw(skc skc, PendingIntent pendingIntent) {
        this.f55337a = skc;
        this.f55338b = pendingIntent;
    }

    public final void run() {
        this.f55337a.mo25668a(this.f55338b);
    }
}
