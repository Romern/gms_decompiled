package p000;

import java.util.concurrent.Callable;

/* renamed from: bbxc */
final /* synthetic */ class bbxc implements Callable {

    /* renamed from: a */
    private final bbxm f103650a;

    /* renamed from: b */
    private final bmxv f103651b;

    public bbxc(bbxm bbxm, bmxv bmxv) {
        this.f103650a = bbxm;
        this.f103651b = bmxv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbxm.a(bcoh, boolean):bqgg
     arg types: [bcoh, int]
     candidates:
      bbxm.a(bcoh, bcoz):void
      bbxm.a(bcoh, boolean):bqgg */
    public final Object call() {
        return (bcoz) this.f103650a.mo56272a((bcoh) this.f103651b.mo66814b(), false).get();
    }
}
