package p000;

import android.content.Context;

/* renamed from: abjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abjw implements cayy {

    /* renamed from: a */
    private final cijl f57592a;

    /* renamed from: b */
    private final cijl f57593b;

    public abjw(cijl cijl, cijl cijl2) {
        this.f57592a = cijl;
        this.f57593b = cijl2;
    }

    /* renamed from: b */
    public final belh mo6445a() {
        bejq g = bejr.m95186g();
        befh a = befi.m94962a((Context) this.f57592a.mo6445a());
        a.mo60660a("growth");
        a.mo60663b("notification_intent.pb");
        g.mo60762a(a.mo60657a());
        g.mo60764a(bsmi.f145031c);
        g.mo60763a(bejb.f111635a);
        belh a2 = ((beju) this.f57593b.mo6445a()).mo60765a(g.mo60761a());
        cazf.m127593a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
