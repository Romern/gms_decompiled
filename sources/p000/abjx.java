package p000;

import android.content.Context;

/* renamed from: abjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abjx implements cayy {

    /* renamed from: a */
    private final cijl f57594a;

    /* renamed from: b */
    private final cijl f57595b;

    public abjx(cijl cijl, cijl cijl2) {
        this.f57594a = cijl;
        this.f57595b = cijl2;
    }

    /* renamed from: b */
    public final belh mo6445a() {
        bejq g = bejr.m95186g();
        befh a = befi.m94962a((Context) this.f57594a.mo6445a());
        a.mo60660a("growth");
        a.mo60663b("watchdog.pb");
        g.mo60762a(a.mo60657a());
        g.mo60764a(bsmk.f145036e);
        g.mo60763a(bejb.f111635a);
        belh a2 = ((beju) this.f57595b.mo6445a()).mo60765a(g.mo60761a());
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
