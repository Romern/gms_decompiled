package p000;

/* renamed from: aeee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeee implements bmzi {

    /* renamed from: a */
    private final bmzi f63264a;

    /* renamed from: b */
    private final Object f63265b = new Object();

    /* renamed from: c */
    private bylh f63266c = null;

    /* renamed from: d */
    private aeef f63267d = null;

    public aeee(bmzi bmzi) {
        this.f63264a = bmzi;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (p000.bmxi.m108538a(r3.f63266c, r0) == false) goto L_0x0018;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        aeef aeef;
        bylh bylh = (bylh) this.f63264a.mo6606a();
        synchronized (this.f63265b) {
            if (this.f63267d == null) {
            }
            this.f63266c = bylh;
            this.f63267d = new aeef(bylh);
            aeef = this.f63267d;
        }
        return aeef;
    }
}
