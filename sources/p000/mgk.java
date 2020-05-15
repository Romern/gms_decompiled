package p000;

import android.app.Notification;

/* renamed from: mgk */
final /* synthetic */ class mgk implements Runnable {

    /* renamed from: a */
    private final mgq f33644a;

    public mgk(mgq mgq) {
        this.f33644a = mgq;
    }

    public final void run() {
        mgq mgq = this.f33644a;
        if (mgq.f33655d == 3) {
            mgp mgp = mgq.f33653b;
            Notification a = mgq.f33654c.mo19995a();
            mgp.mo19997a();
            mgp.f33650a.mo25441a(1, a);
            mgq.f33655d = 2;
        }
    }
}
