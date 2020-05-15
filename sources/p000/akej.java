package p000;

import java.util.Collection;

/* renamed from: akej */
final /* synthetic */ class akej implements Runnable {

    /* renamed from: a */
    private final akgy f71738a;

    /* renamed from: b */
    private final bqgy f71739b;

    public akej(akgy akgy, bqgy bqgy) {
        this.f71738a = akgy;
        this.f71739b = bqgy;
    }

    public final void run() {
        akgy akgy = this.f71738a;
        bqgy bqgy = this.f71739b;
        if (akgy.f71941h != null) {
            bqgy.mo69138b(bngx.m109368a((Collection) akgy.f71936c.keySet()));
        } else {
            bqgy.mo69138b(bngx.m109376e());
        }
    }
}
