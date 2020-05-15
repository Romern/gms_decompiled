package p000;

import java.util.List;

/* renamed from: amxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxk {

    /* renamed from: a */
    public final amwt f76292a;

    /* renamed from: b */
    public final amvt f76293b;

    /* renamed from: c */
    public final anaz f76294c;

    /* renamed from: d */
    public final amye f76295d;

    /* renamed from: e */
    public final amvm f76296e;

    /* renamed from: f */
    private final amyo f76297f;

    /* renamed from: g */
    private final bmxv f76298g;

    public amxk(amyo amyo, amwt amwt, amvt amvt, anaz anaz, bmxv bmxv, amye amye, amvm amvm) {
        this.f76297f = amyo;
        this.f76292a = amwt;
        this.f76293b = amvt;
        this.f76294c = anaz;
        this.f76298g = bmxv;
        this.f76295d = amye;
        this.f76296e = amvm;
        amig.m62939a();
    }

    /* renamed from: a */
    public final void mo41545a(amws amws) {
        if (!amws.f76220a.isEmpty()) {
            mo41546a(amws.f76220a);
            return;
        }
        ((anbh) this.f76294c).f76541a.stats.numIoExceptions++;
        this.f76294c.mo41632a(amjf.CONTACT, ammz.INSERT, "BULK_INSERT_PARTIAL_FAILURE", (Exception) null);
        this.f76294c.mo41636a(ammz.INSERT, amjf.CONTACT, false, 2, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41546a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            anad anad = (anad) list.get(i);
            this.f76297f.mo41566a((amvp) anad.f76463a, (amvp) anad.f76464b);
            this.f76293b.mo41449a();
        }
        this.f76293b.mo41451b();
        if (this.f76298g.mo66813a() && ((Boolean) amgd.f74880a.mo41191a()).booleanValue()) {
            ((amxh) this.f76298g.mo66814b()).mo41524e(list.size());
        }
    }
}
