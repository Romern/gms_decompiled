package p000;

/* renamed from: cihp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cihp {

    /* renamed from: a */
    public static final cipx f190343a = cipx.m150785a(":status");

    /* renamed from: b */
    public static final cipx f190344b = cipx.m150785a(":method");

    /* renamed from: c */
    public static final cipx f190345c = cipx.m150785a(":path");

    /* renamed from: d */
    public static final cipx f190346d = cipx.m150785a(":scheme");

    /* renamed from: e */
    public static final cipx f190347e = cipx.m150785a(":authority");

    /* renamed from: f */
    public final cipx f190348f;

    /* renamed from: g */
    public final cipx f190349g;

    /* renamed from: h */
    final int f190350h;

    static {
        cipx.m150785a(":host");
        cipx.m150785a(":version");
    }

    public cihp(cipx cipx, cipx cipx2) {
        this.f190348f = cipx;
        this.f190349g = cipx2;
        this.f190350h = cipx.mo86345e() + 32 + cipx2.mo86345e();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cihp) {
            cihp cihp = (cihp) obj;
            return this.f190348f.equals(cihp.f190348f) && this.f190349g.equals(cihp.f190349g);
        }
    }

    public final int hashCode() {
        return ((this.f190348f.hashCode() + 527) * 31) + this.f190349g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f190348f.mo86336a(), this.f190349g.mo86336a());
    }

    public cihp(cipx cipx, String str) {
        this(cipx, cipx.m150785a(str));
    }

    public cihp(String str, String str2) {
        this(cipx.m150785a(str), cipx.m150785a(str2));
    }
}
