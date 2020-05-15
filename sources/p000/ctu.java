package p000;

/* renamed from: ctu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ctu extends RuntimeException {

    /* renamed from: a */
    public final cst f12041a;

    public ctu(cst cst) {
        this.f12041a = cst;
    }

    public ctu(String str, cst cst) {
        super(str);
        this.f12041a = cst;
    }

    public ctu(Throwable th) {
        super(th);
        this.f12041a = css.UNKNOWN_ERROR_RESPONSE;
    }

    public ctu(Throwable th, cst cst) {
        super(th);
        this.f12041a = cst;
    }
}
