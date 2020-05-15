package p000;

import java.util.List;

/* renamed from: brxx */
final /* synthetic */ class brxx implements Runnable {

    /* renamed from: a */
    private final bryb f143614a;

    public brxx(bryb bryb) {
        this.f143614a = bryb;
    }

    public final void run() {
        bryb bryb = this.f143614a;
        brxc brxc = new brxc(bryb.f143629g);
        for (List list : bnkn.m109666a((List) bryb.f143623a.subList(0, bryb.f143626d))) {
            bryb.f143626d--;
            for (brxe brxe : bnkn.m109666a(list)) {
                if (bryb.f143625c.contains(brxe)) {
                    try {
                        int i = brxe.mo70014a(brxc).f143655b;
                    } catch (Throwable th) {
                        bryb.f143630h = chuv.m149608a(th);
                        bryb.f143631i = new chtr();
                        bryb.mo70079d();
                        return;
                    }
                }
            }
            if (bryb.mo70076a()) {
                return;
            }
        }
        bryb.f189187j.mo25569a(bryb.f143629g);
        bryb.f143627e = true;
        bryb.mo70077b();
    }
}
