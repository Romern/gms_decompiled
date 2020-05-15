package p000;

/* renamed from: cvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cvl extends RuntimeException {

    /* renamed from: a */
    public final cuv f12198a;

    /* renamed from: b */
    public final cxc f12199b;

    public cvl(cuv cuv) {
        this.f12198a = cuv;
        this.f12199b = cuv.mo8313b();
    }

    public cvl(String str, cuv cuv) {
        super(str);
        this.f12198a = cuv;
        this.f12199b = ((cuu) cuv).f12094p;
    }

    public cvl(Throwable th) {
        super(th);
        cuu cuu = cuu.UNKNOWN_ERROR_RESPONSE;
        this.f12198a = cuu;
        this.f12199b = cuu.mo8313b();
    }

    public cvl(Throwable th, cuv cuv) {
        super(th);
        this.f12198a = cuv;
        this.f12199b = ((cuu) cuv).f12094p;
    }
}
