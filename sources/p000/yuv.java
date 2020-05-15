package p000;

/* renamed from: yuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yuv implements yuw {

    /* renamed from: b */
    private final bmzi f54657b;

    /* renamed from: c */
    private final yuu f54658c;

    /* renamed from: d */
    private Object f54659d;

    /* renamed from: e */
    private Object f54660e;

    public yuv(bmzi bmzi, yuu yuu) {
        this.f54657b = bmzi;
        this.f54658c = yuu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r3.f54660e == null) goto L_0x0014;
     */
    /* renamed from: a */
    public final synchronized Object mo30787a() {
        Object a = this.f54657b.mo6606a();
        if (!a.equals(this.f54659d)) {
        }
        this.f54660e = this.f54658c.mo30727a(a, this.f54660e);
        this.f54659d = a;
        return this.f54660e;
    }
}
