package p000;

import android.content.Context;

/* renamed from: yyt */
final /* synthetic */ class yyt implements yzl {

    /* renamed from: a */
    private final yzp f54831a;

    public yyt(yzp yzp) {
        this.f54831a = yzp;
    }

    /* renamed from: a */
    public final Object mo30865a(String str) {
        yzp yzp = this.f54831a;
        yzp.m45080m("Can't init Apiary in main thread");
        Context context = yzp.f54857c;
        zre c = yzp.mo30877c(str);
        if ("none".equals(str)) {
            return null;
        }
        yvq.m44915h(context);
        return new yrz(c, context, str);
    }
}
