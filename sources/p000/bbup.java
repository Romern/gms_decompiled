package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: bbup */
final /* synthetic */ class bbup implements Runnable {

    /* renamed from: a */
    private final bbwq f103447a;

    /* renamed from: b */
    private final bctr f103448b;

    /* renamed from: c */
    private final boolean f103449c;

    /* renamed from: d */
    private final bcoh f103450d;

    /* renamed from: e */
    private final bqgy f103451e;

    public bbup(bbwq bbwq, bctr bctr, boolean z, bcoh bcoh, bqgy bqgy) {
        this.f103447a = bbwq;
        this.f103448b = bctr;
        this.f103449c = z;
        this.f103450d = bcoh;
        this.f103451e = bqgy;
    }

    public final void run() {
        long j;
        bbwq bbwq = this.f103447a;
        bctr bctr = this.f103448b;
        boolean z = this.f103449c;
        bcoh bcoh = this.f103450d;
        bqgy bqgy = this.f103451e;
        bcte n = bctr.mo57374n();
        n.mo57506a(!z ? bctk.f104863f : bctk.f104869l);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bbon.m88284a();
        long currentTimeMillis = System.currentTimeMillis();
        if (!z) {
            j = ((Long) bbqt.m88417a(bbwq.f103603a).f103181w.mo58455c()).longValue();
        } else {
            j = 0;
        }
        n.mo57512a(Long.valueOf(timeUnit.toMicros(currentTimeMillis + j)));
        bctr a = n.mo57502a();
        bbwq.mo56473c(bcoh).mo56643b(a);
        bqgy.mo69138b(a);
    }
}
