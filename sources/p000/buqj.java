package p000;

import android.os.MessageQueue;

/* renamed from: buqj */
final /* synthetic */ class buqj implements MessageQueue.IdleHandler {

    /* renamed from: a */
    private final buqm f154706a;

    /* renamed from: b */
    private final buqn f154707b;

    public buqj(buqm buqm, buqn buqn) {
        this.f154706a = buqm;
        this.f154707b = buqn;
    }

    public final boolean queueIdle() {
        buqm buqm = this.f154706a;
        buqn buqn = this.f154707b;
        if (buqm.f154713c.hasMessages(0)) {
            return true;
        }
        buqn.run();
        return false;
    }
}
