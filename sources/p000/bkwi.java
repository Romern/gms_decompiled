package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bkwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkwi extends bkwp {

    /* renamed from: a */
    public boolean f125343a;

    /* renamed from: b */
    private final blgo f125344b;

    /* renamed from: c */
    private int f125345c;

    /* renamed from: d */
    private List f125346d;

    /* renamed from: e */
    private final int f125347e;

    public bkwi(blgo blgo) {
        this.f125344b = blgo;
        List a = blgo.mo66501a();
        this.f125346d = a;
        this.f125347e = a.size();
        mo66392e();
    }

    /* renamed from: a */
    public final blgo mo66387a() {
        if (!this.f125343a) {
            return this.f125344b;
        }
        blgn b = blgo.m107143b();
        blgo blgo = this.f125344b;
        b.f126449c = blgo.f126452c;
        b.f126448b = blgo.f126451b;
        b.mo66499a(this.f125346d);
        return b.mo66500b();
    }

    /* renamed from: b */
    public final blhg mo66389b() {
        int i = this.f125345c;
        if (i < this.f125347e) {
            return (blhg) this.f125346d.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo66390c() {
        mo66388a(bksz.m106563a());
    }

    /* renamed from: d */
    public final void mo66391d() {
        this.f125345c++;
    }

    /* renamed from: e */
    public final void mo66392e() {
        this.f125345c = 0;
    }

    /* renamed from: a */
    public final void mo66388a(blhg blhg) {
        if (!this.f125343a) {
            this.f125346d = new ArrayList(this.f125346d);
            this.f125343a = true;
        }
        this.f125346d.set(this.f125345c, blhg);
    }
}
