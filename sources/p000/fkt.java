package p000;

/* renamed from: fkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fkt extends fkj {

    /* renamed from: a */
    public final fks f16815a = new fks(this);

    /* renamed from: b */
    public fno f16816b;

    /* renamed from: c */
    private final flk f16817c;

    /* renamed from: e */
    private final fof f16818e;

    protected fkt(fkm fkm) {
        super(fkm);
        this.f16818e = new fof(fkm.f16787c);
        this.f16817c = new fkp(this, fkm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
    }

    /* renamed from: c */
    public final void mo10971c() {
        this.f16818e.mo11059a();
        flk flk = this.f16817c;
        mo10943h();
        flk.mo11008a(((Long) fni.f16917C.mo11021a()).longValue());
    }

    /* renamed from: v */
    public final void mo10973v() {
        fkh k = mo10946k();
        k.mo10954t();
        fje.m11804a();
        flb flb = k.f16778a;
        fje.m11804a();
        flb.mo10954t();
        flb.mo10933d("Service disconnected");
    }

    /* renamed from: b */
    public final boolean mo10970b() {
        fje.m11804a();
        mo10954t();
        return this.f16816b != null;
    }

    /* renamed from: d */
    public final void mo10972d() {
        fje.m11804a();
        mo10954t();
        try {
            skh.m35531a().mo25689a(mo10939f(), this.f16815a);
        } catch (IllegalArgumentException | IllegalStateException e) {
        }
        if (this.f16816b != null) {
            this.f16816b = null;
            mo10973v();
        }
    }
}
