package p000;

/* renamed from: bljc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bljc {

    /* renamed from: d */
    private static final bljc f126663d = new bljc(3, null, true);

    /* renamed from: e */
    private static final bljc f126664e = new bljc(2, null, true);

    /* renamed from: a */
    public boolean f126665a;

    /* renamed from: b */
    public final int f126666b;

    /* renamed from: c */
    private final Object f126667c;

    public bljc(int i, Object obj, boolean z) {
        this.f126666b = i;
        this.f126667c = obj;
        this.f126665a = z;
    }

    /* renamed from: a */
    static bljc m107233a(int i) {
        return i + -1 != 1 ? f126663d : f126664e;
    }

    /* renamed from: b */
    public final boolean mo66589b() {
        this.f126665a = true;
        return this.f126666b == 1;
    }

    /* renamed from: a */
    public final Object mo66588a() {
        if (this.f126665a && this.f126666b == 1) {
            return this.f126667c;
        }
        throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
    }
}
