package p000;

import android.os.Handler;

/* renamed from: aguq */
final /* synthetic */ class aguq implements Runnable {

    /* renamed from: a */
    private final aucb f66597a;

    /* renamed from: b */
    private final String f66598b;

    /* renamed from: c */
    private final agvd f66599c;

    /* renamed from: d */
    private final Handler f66600d;

    public aguq(aucb aucb, String str, agvd agvd, Handler handler) {
        this.f66597a = aucb;
        this.f66598b = str;
        this.f66599c = agvd;
        this.f66600d = handler;
    }

    public final void run() {
        agve.m55164a(this.f66597a, this.f66598b, this.f66599c, this.f66600d);
    }
}
