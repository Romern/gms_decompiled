package p000;

/* renamed from: chux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chux extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* renamed from: a */
    public final chuv f189238a;

    /* renamed from: b */
    public final chtr f189239b;

    /* renamed from: c */
    private final boolean f189240c;

    public chux(chuv chuv) {
        this(chuv, null);
    }

    public final synchronized Throwable fillInStackTrace() {
        if (!this.f189240c) {
            return this;
        }
        return super.fillInStackTrace();
    }

    public chux(chuv chuv, chtr chtr) {
        super(chuv.m149609a(chuv), chuv.f189235u);
        this.f189238a = chuv;
        this.f189239b = chtr;
        this.f189240c = true;
        fillInStackTrace();
    }
}
