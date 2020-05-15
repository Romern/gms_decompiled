package p000;

/* renamed from: fap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fap extends avt {

    /* renamed from: a */
    final /* synthetic */ fas f16167a;

    public fap(fas fas) {
        this.f16167a = fas;
    }

    /* renamed from: a */
    public final void mo1834a(int i) {
        int i2;
        fas fas = this.f16167a;
        if (i == fas.f16174e.mo71230c()) {
            i2 = 2;
        } else {
            i2 = 6;
        }
        if (!fas.f16176g && i >= 0 && i < fas.f16175f.size()) {
            bsxn c = ((fes) fas.f16175f.get(i)).mo10711c();
            feu feu = fas.f16170a;
            feu.f16417b.mo10748a(fas.f16172c, c, i2);
        }
    }

    /* renamed from: a */
    public final void mo1835a(int i, float f) {
        int i2;
        fas fas = this.f16167a;
        if (!fas.f16176g && i >= 0 && i < fas.f16175f.size()) {
            bsxn c = ((fes) fas.f16175f.get(i)).mo10711c();
            if (!sdg.m34949a(c, fas.f16172c)) {
                fas.f16170a.mo10767a(c);
            }
            if (f != 0.0f && (i2 = i + 1) < fas.f16175f.size()) {
                bsxn c2 = ((fes) fas.f16175f.get(i2)).mo10711c();
                if (!sdg.m34949a(c2, fas.f16172c)) {
                    fas.f16170a.mo10767a(c2);
                }
            }
        }
    }
}
