package p000;

/* renamed from: csr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class csr {

    /* renamed from: a */
    private final cst f11924a;

    /* renamed from: b */
    private final cta f11925b;

    /* renamed from: c */
    private byte[] f11926c;

    public csr(cst cst) {
        this.f11924a = cst;
        this.f11925b = null;
    }

    /* renamed from: a */
    public static csr m7475a(cta cta) {
        return new csr(cta);
    }

    public csr(cta cta) {
        this.f11924a = css.SUCCESS;
        this.f11925b = cta;
    }

    /* renamed from: a */
    public final byte[] mo8228a() {
        byte[] bArr;
        if (this.f11926c == null) {
            cta cta = this.f11925b;
            if (cta != null) {
                bArr = czm.m8022b(cta.mo8253d(), this.f11924a.mo8227a());
            } else {
                bArr = this.f11924a.mo8227a();
            }
            this.f11926c = bArr;
        }
        return czm.m8028e(this.f11926c);
    }
}
