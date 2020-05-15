package p000;

/* renamed from: bjls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjls extends bjjm {

    /* renamed from: m */
    private bwnr f122946m;

    public bjls(bjgv bjgv) {
        super(bjgv, bjlp.class);
    }

    /* renamed from: E */
    private final void m103872E() {
        bwxl bwxl;
        mo65191v();
        if (((bjlq) ((bjhy) ((bjlp) ((bjjm) this).f122830n)).f122754m).f122942d != 2) {
            bwxl = this.f122946m.f160389c;
            if (bwxl == null) {
                bwxl = bwxl.f161383i;
            }
        } else {
            bwxl = this.f122946m.f160388b;
            if (bwxl == null) {
                bwxl = bwxl.f161383i;
            }
        }
        bjgv bjgv = this.f122676a;
        mo65160a(bjgv.f122694c.mo65206a(bjgv, bwxl));
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m103872E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwnr.f160385e;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122946m = (bwnr) b;
        m103872E();
    }
}
