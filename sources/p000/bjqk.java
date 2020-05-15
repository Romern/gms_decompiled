package p000;

/* renamed from: bjqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqk extends bjjm {

    /* renamed from: m */
    private bwyt f123140m;

    public bjqk(bjgv bjgv) {
        super(bjgv, bjqj.class);
    }

    /* renamed from: E */
    private final void m104347E() {
        if (((bjql) ((bjhy) ((bjqj) ((bjjm) this).f122830n)).f122754m).f123141d != this.f123140m.f161524a) {
            mo65191v();
        } else if (this.f122681f.size() == 0) {
            bxwc bxwc = this.f123140m.f161525b;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bjgv bjgv = this.f122676a;
                mo65160a(bjgv.f122694c.mo65206a(bjgv, (bwxl) bxwc.get(i)));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo65302G() {
        m104347E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65162a(bwxl bwxl, bwxl bwxl2) {
        super.mo65162a(bwxl, bwxl2);
        bxvj bxvj = bwyt.f161522d;
        bwxl2.mo74135a(bxvj);
        Object b = bwxl2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123140m = (bwyt) b;
        m104347E();
    }
}
