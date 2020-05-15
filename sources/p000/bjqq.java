package p000;

/* renamed from: bjqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqq extends bjqx {

    /* renamed from: d */
    C1225nr f123145d = new C1225nr();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        this.f123145d.clear();
        this.f123145d.addAll(((bxab) bxxc).f161672a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bxab.f161669b.mo74144da();
        C1225nr nrVar = this.f123145d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxab bxab = (bxab) da.f164949b;
        bxab.mo73547a();
        bxsy.m123078a(nrVar, bxab.f161672a);
        return (bxab) da.mo74062i();
    }

    /* renamed from: a */
    public final boolean mo65460a(Long l) {
        return this.f123145d.contains(l);
    }
}
