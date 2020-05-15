package p000;

import java.util.concurrent.Callable;

/* renamed from: bbwl */
final /* synthetic */ class bbwl implements Callable {

    /* renamed from: a */
    private final bbwm f103591a;

    /* renamed from: b */
    private final Boolean f103592b;

    /* renamed from: c */
    private final bqgg f103593c;

    /* renamed from: d */
    private final bqgg f103594d;

    public bbwl(bbwm bbwm, Boolean bool, bqgg bqgg, bqgg bqgg2) {
        this.f103591a = bbwm;
        this.f103592b = bool;
        this.f103593c = bqgg;
        this.f103594d = bqgg2;
    }

    public final Object call() {
        bbwm bbwm = this.f103591a;
        Boolean bool = this.f103592b;
        bqgg bqgg = this.f103593c;
        bqgg bqgg2 = this.f103594d;
        if (!bool.booleanValue() || !((Boolean) bbqt.m88417a(bbwm.f103595a.f103603a).f103085G.mo58455c()).booleanValue()) {
            return null;
        }
        bbwm.f103595a.mo56471a(((Long) bqgg.get()).longValue());
        bbwq bbwq = bbwm.f103595a;
        bbwq.f103616n.postDelayed(bbwq.f103626x, ((Long) bqgg2.get()).longValue());
        return null;
    }
}
