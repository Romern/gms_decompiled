package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: plm */
final /* synthetic */ class plm implements Runnable {

    /* renamed from: a */
    private final plr f39598a;

    public plm(plr plr) {
        this.f39598a = plr;
    }

    public final void run() {
        plr plr = this.f39598a;
        if (plr.f39607b.isEnabled()) {
            plr.mo23385b();
            if (plr.f39645j) {
                plr.f39608c = plr.f39642g.schedule(new pln(plr), plr.f39609d, TimeUnit.MILLISECONDS);
            }
        }
    }
}
