package p000;

/* renamed from: cut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cut {

    /* renamed from: a */
    private final cuv f12075a;

    /* renamed from: b */
    private final cvc f12076b;

    /* renamed from: c */
    private byte[] f12077c;

    public cut(cuv cuv) {
        this.f12075a = cuv;
        this.f12076b = null;
    }

    /* renamed from: a */
    public static cut m7621a(cvc cvc) {
        if (cvc != null) {
            return new cut(cvc);
        }
        return null;
    }

    public cut(cuv cuv, cvc cvc) {
        this.f12075a = cuv;
        this.f12076b = cvc;
    }

    /* renamed from: a */
    public static cut m7622a(cvc cvc, cuv cuv) {
        if (cvc != null) {
            return new cut(cuv, cvc);
        }
        return null;
    }

    public cut(cvc cvc) {
        this.f12075a = cuu.SUCCESS;
        this.f12076b = cvc;
    }

    /* renamed from: a */
    public final byte[] mo8314a() {
        byte[] bArr;
        if (this.f12077c == null) {
            cvc cvc = this.f12076b;
            if (cvc != null) {
                bArr = cvz.m7723b(cvc.mo8331d(), this.f12075a.mo8312a());
            } else {
                bArr = this.f12075a.mo8312a();
            }
            this.f12077c = bArr;
        }
        return cvz.m7735j(this.f12077c);
    }
}
