package p000;

import android.app.PendingIntent;

/* renamed from: aqyg */
final /* synthetic */ class aqyg implements Runnable {

    /* renamed from: a */
    private final aqyl f87083a;

    /* renamed from: b */
    private final PendingIntent f87084b;

    public aqyg(aqyl aqyl, PendingIntent pendingIntent) {
        this.f87083a = aqyl;
        this.f87084b = pendingIntent;
    }

    public final void run() {
        aqyl aqyl = this.f87083a;
        aqyl.f87095a.mo48266a(this.f87084b);
    }
}
