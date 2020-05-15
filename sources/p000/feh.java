package p000;

/* renamed from: feh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class feh {

    /* renamed from: a */
    public static final C0034at f16377a = m11545a(bmvz.f131120a);

    /* renamed from: b */
    public static final C0034at f16378b = m11545a(bmvz.f131120a);

    /* renamed from: c */
    public final fcg f16379c;

    /* renamed from: d */
    public final C0034at f16380d = new C0034at();

    /* renamed from: e */
    public final C0034at f16381e = new C0034at();

    /* renamed from: f */
    private final fdp f16382f;

    public feh(fcg fcg, fdp fdp) {
        this.f16379c = fcg;
        this.f16382f = fdp;
        mo10747a();
    }

    /* renamed from: a */
    private static final C0034at m11545a(Object obj) {
        C0034at atVar = new C0034at();
        atVar.mo2450b(obj);
        return atVar;
    }

    /* renamed from: b */
    public final C0034at mo10750b() {
        return C0052bk.m3245b(this.f16380d, new feb(this));
    }

    /* renamed from: a */
    public final void mo10747a() {
        this.f16381e.mo2450b(bmvz.f131120a);
        this.f16380d.mo2450b(bmvz.f131120a);
    }

    /* renamed from: a */
    public final void mo10748a(bsxn bsxn, bsxn bsxn2, int i) {
        if (bsxn2 != null) {
            fdp fdp = this.f16382f;
            int i2 = i - 1;
            int i3 = 5;
            if (i2 == 0) {
                i3 = 6;
            } else if (i2 == 1) {
                i3 = 2;
            } else if (i2 == 2) {
                i3 = 3;
            } else if (i2 == 3) {
                i3 = 4;
            } else if (i2 != 4) {
                i3 = i2 != 5 ? 12 : 8;
            }
            fdp.mo10743a(bsxn, bsxn2, i3);
            this.f16379c.mo10680a(bsxn2);
            this.f16381e.mo2450b(bmvz.f131120a);
            this.f16380d.mo2450b(bmxv.m108566b(new fee(bsxn2, i)));
        }
    }

    /* renamed from: a */
    public final void mo10749a(feg feg) {
        this.f16381e.mo2450b(bmxv.m108566b(feg));
        this.f16380d.mo2450b(bmvz.f131120a);
    }
}
