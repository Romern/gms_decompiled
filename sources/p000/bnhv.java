package p000;

import java.util.Set;

/* renamed from: bnhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnhv extends bngl {

    /* renamed from: a */
    bnnx f131647a;

    /* renamed from: b */
    boolean f131648b;

    public bnhv() {
        this(4);
    }

    /* renamed from: a */
    public final bnhy mo67740a() {
        bnnx bnnx = this.f131647a;
        if (bnnx.f131884c == 0) {
            return bnom.f131919a;
        }
        this.f131648b = true;
        return new bnom(bnnx);
    }

    /* renamed from: b */
    public final void mo67742b(Iterable iterable) {
        if (iterable instanceof bnnn) {
            bnnn bnnn = (bnnn) iterable;
            bnnx bnnx = bnnn instanceof bnom ? ((bnom) bnnn).f131920b : bnnn instanceof bndh ? ((bndh) bnnn).f131485a : null;
            if (bnnx == null) {
                Set e = bnnn.mo67324e();
                bnnx bnnx2 = this.f131647a;
                bnnx2.mo68154d(Math.max(bnnx2.f131884c, e.size()));
                for (bnno bnno : bnnn.mo67324e()) {
                    mo67741a(bnno.f131866a, bnno.mo68118a());
                }
                return;
            }
            bnnx bnnx3 = this.f131647a;
            bnnx3.mo68154d(Math.max(bnnx3.f131884c, bnnx.f131884c));
            for (int a = bnnx.mo68146a(); a >= 0; a = bnnx.mo68147a(a)) {
                mo67741a(bnnx.mo68152b(a), bnnx.mo68153c(a));
            }
            return;
        }
        super.mo67626a(iterable);
    }

    public bnhv(int i) {
        this.f131648b = false;
        this.f131647a = new bnnx(i);
    }

    /* renamed from: a */
    public final void mo67741a(Object obj, int i) {
        if (i != 0) {
            if (this.f131648b) {
                this.f131647a = new bnnx(this.f131647a);
            }
            this.f131648b = false;
            bmxy.m108581a(obj);
            bnnx bnnx = this.f131647a;
            bnnx.mo68150a(obj, i + bnnx.mo68151b(obj));
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo67629b(Object obj) {
        mo67741a(obj, 1);
    }
}
