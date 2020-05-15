package p000;

import android.accounts.Account;

/* renamed from: afsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afsm implements cayy {

    /* renamed from: a */
    private final cijl f64670a;

    /* renamed from: b */
    private final cijl f64671b;

    /* renamed from: c */
    private final cijl f64672c;

    /* renamed from: d */
    private final cijl f64673d;

    public afsm(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        this.f64670a = cijl;
        this.f64671b = cijl2;
        this.f64672c = cijl3;
        this.f64673d = cijl4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bmzi b = ((afvm) this.f64671b).mo6445a();
        bejq g = bejr.m95186g();
        g.mo60763a(bejy.m95202a((beja) this.f64672c.mo6445a()));
        g.mo60764a(bbjt.f102784d);
        befh befh = (befh) b.mo6606a();
        befh.mo60658a((Account) ((cayz) this.f64670a).f176439a);
        befh.mo60663b("profilesync/public/profile_info.pb");
        g.mo60762a(befh.mo60657a());
        bbja bbja = new bbja(((beju) this.f64673d.mo6445a()).mo60765a(g.mo60761a()));
        cazf.m127593a(bbja, "Cannot return null from a non-@Nullable @Provides method");
        return bbja;
    }
}
