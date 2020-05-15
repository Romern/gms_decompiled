package p000;

import android.os.Handler;

/* renamed from: bgcl */
public final /* synthetic */ class bgcl implements Runnable {

    /* renamed from: a */
    private final bgcz f116052a;

    /* renamed from: b */
    private final Long f116053b;

    /* renamed from: c */
    private final bugl f116054c;

    /* renamed from: d */
    private final Handler f116055d;

    /* renamed from: e */
    private final boolean f116056e;

    public bgcl(bgcz bgcz, Long l, bugl bugl, Handler handler, boolean z) {
        this.f116052a = bgcz;
        this.f116053b = l;
        this.f116054c = bugl;
        this.f116055d = handler;
        this.f116056e = z;
    }

    public final void run() {
        bgcz bgcz = this.f116052a;
        Long l = this.f116053b;
        bugl bugl = this.f116054c;
        Handler handler = this.f116055d;
        boolean z = this.f116056e;
        bgcy bgcy = new bgcy(l.longValue(), bugl, handler);
        bgcz.f116085a.mo67268a(l, bgcy);
        bgcz.f116086b.put(bugl, bgcy);
        Object[] objArr = {"Manager:", l};
        if (bgcz.m98590c() && !bgcz.f116088d) {
            handler.post(new bgcm(bugl));
        } else if (!z) {
            handler.post(new bgco(bugl));
        } else {
            handler.post(new bgcn(bugl));
        }
    }
}
