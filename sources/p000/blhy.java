package p000;

import java.util.concurrent.Future;

/* renamed from: blhy */
final /* synthetic */ class blhy implements Runnable {

    /* renamed from: a */
    private final blie f126591a;

    /* renamed from: b */
    private final bqgy f126592b;

    /* renamed from: c */
    private final blic f126593c;

    public blhy(blie blie, bqgy bqgy, blic blic) {
        this.f126591a = blie;
        this.f126592b = bqgy;
        this.f126593c = blic;
    }

    public final void run() {
        blie blie = this.f126591a;
        bqgy bqgy = this.f126592b;
        blic blic = this.f126593c;
        try {
            blie.f126606d.mo69138b(bqga.m112780a((Future) bqgy));
            blic.mo69137b((bqgg) blie.f126606d);
        } catch (Throwable th) {
            blic.mo69137b((bqgg) bqgy);
        }
    }
}
