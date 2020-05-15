package p000;

import android.app.Application;

/* renamed from: bdhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdhi {

    /* renamed from: a */
    private final bdfk f105649a;

    public bdhi(Application application, bdfk bdfk) {
        cazf.m127594a(application);
        bdfk.f105474a = application;
        bdfk.mo58006a(new bdhf(application));
        bdfk.mo58005a(bdic.m90842i().mo58064a());
        bmzi bmzi = bdhg.f105647a;
        cazf.m127594a(bmzi);
        bdfk.f105478e = bmzi;
        bdiw bdiw = new bdiw();
        cazf.m127594a(bdiw);
        bdfk.f105479f = bdiw;
        this.f105649a = bdfk;
    }

    /* renamed from: a */
    public final bdgr mo58036a() {
        bdfk bdfk = this.f105649a;
        cazf.m127595a(bdfk.f105474a, Application.class);
        cazf.m127595a(bdfk.f105475b, bmzi.class);
        cazf.m127595a(bdfk.f105476c, bmzi.class);
        cazf.m127595a(bdfk.f105477d, bdic.class);
        cazf.m127595a(bdfk.f105478e, bmzi.class);
        cazf.m127595a(bdfk.f105479f, bdin.class);
        return new bdfl(bdfk.f105474a, bdfk.f105475b, bdfk.f105476c, bdfk.f105477d, bdfk.f105478e, bdfk.f105479f);
    }

    /* renamed from: a */
    public final void mo58037a(bdic bdic) {
        this.f105649a.mo58005a(bdic);
    }

    /* renamed from: a */
    public final void mo58038a(bmzi bmzi) {
        this.f105649a.mo58006a(bmzi);
    }

    /* renamed from: a */
    public final void mo58039a(cijl cijl) {
        bdfk bdfk = this.f105649a;
        cijl.getClass();
        bdhh bdhh = new bdhh(cijl);
        cazf.m127594a(bdhh);
        bdfk.f105475b = bdhh;
    }
}
