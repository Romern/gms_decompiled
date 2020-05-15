package p000;

/* renamed from: bjqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqy extends bjqx {

    /* renamed from: d */
    public long f123154d = -1;

    /* renamed from: a */
    public final void mo65463a(long j) {
        if (this.f123154d != j) {
            this.f123154d = j;
            mo65244a((bjgf) null);
        }
    }

    /* renamed from: e */
    public final boolean mo65464e() {
        return this.f123154d != -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo65245a(bxxc bxxc) {
        bxab bxab = (bxab) bxxc;
        this.f123154d = bxab.f161672a.size() != 0 ? bxab.f161672a.mo74160a(0) : -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bxxc mo65248b() {
        bxvd da = bxab.f161669b.mo74144da();
        if (mo65464e()) {
            long j = this.f123154d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxab bxab = (bxab) da.f164949b;
            bxab.mo73547a();
            bxab.f161672a.mo74161a(j);
        }
        return (bxab) da.mo74062i();
    }

    /* renamed from: a */
    public final boolean mo65460a(Long l) {
        return l.longValue() == this.f123154d;
    }
}
