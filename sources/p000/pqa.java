package p000;

import android.content.Context;

/* renamed from: pqa */
final /* synthetic */ class pqa implements Runnable {

    /* renamed from: a */
    private final pqb f40050a;

    public pqa(pqb pqb) {
        this.f40050a = pqb;
    }

    public final void run() {
        pqb pqb = this.f40050a;
        Context context = pqb.f40051a;
        if (ppz.f40045d == null) {
            synchronized (ppz.f40046e) {
                if (ppz.f40045d == null) {
                    ppz.f40045d = new ppz(context);
                }
            }
        }
        pqb.f40053c = new ppp(pqb.f40052b);
        new ppa(pqb.f40051a, pqb, pqb.f40053c);
    }
}
