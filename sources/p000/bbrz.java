package p000;

import java.util.concurrent.Callable;

/* renamed from: bbrz */
final /* synthetic */ class bbrz implements Callable {

    /* renamed from: a */
    private final bbsc f103263a;

    /* renamed from: b */
    private final bcoh f103264b;

    /* renamed from: c */
    private final bcsj f103265c;

    public bbrz(bbsc bbsc, bcoh bcoh, bcsj bcsj) {
        this.f103263a = bbsc;
        this.f103264b = bcoh;
        this.f103265c = bcsj;
    }

    public final Object call() {
        bbsc bbsc = this.f103263a;
        bcoh bcoh = this.f103264b;
        bcsj bcsj = this.f103265c;
        bbsc.mo56393a(bcoh, bcsj);
        return bcsj;
    }
}
