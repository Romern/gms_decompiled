package p000;

/* renamed from: chuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chuw extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* renamed from: a */
    public final chuv f189236a;

    /* renamed from: b */
    private final boolean f189237b = true;

    public final synchronized Throwable fillInStackTrace() {
        if (!this.f189237b) {
            return this;
        }
        return super.fillInStackTrace();
    }

    public chuw(chuv chuv) {
        super(chuv.m149609a(chuv), chuv.f189235u);
        this.f189236a = chuv;
        fillInStackTrace();
    }
}
