package p000;

/* renamed from: cawh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cawh {

    /* renamed from: a */
    public static final cipx f176236a = cipx.m150785a(":status");

    /* renamed from: b */
    public static final cipx f176237b = cipx.m150785a(":method");

    /* renamed from: c */
    public static final cipx f176238c = cipx.m150785a(":path");

    /* renamed from: d */
    public static final cipx f176239d = cipx.m150785a(":scheme");

    /* renamed from: e */
    public static final cipx f176240e = cipx.m150785a(":authority");

    /* renamed from: f */
    public static final cipx f176241f = cipx.m150785a(":host");

    /* renamed from: g */
    public static final cipx f176242g = cipx.m150785a(":version");

    /* renamed from: h */
    public final cipx f176243h;

    /* renamed from: i */
    public final cipx f176244i;

    /* renamed from: j */
    final int f176245j;

    public cawh(cipx cipx, cipx cipx2) {
        this.f176243h = cipx;
        this.f176244i = cipx2;
        this.f176245j = cipx.mo86345e() + 32 + cipx2.mo86345e();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cawh) {
            cawh cawh = (cawh) obj;
            return this.f176243h.equals(cawh.f176243h) && this.f176244i.equals(cawh.f176244i);
        }
    }

    public final int hashCode() {
        return ((this.f176243h.hashCode() + 527) * 31) + this.f176244i.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f176243h.mo86336a(), this.f176244i.mo86336a());
    }

    public cawh(cipx cipx, String str) {
        this(cipx, cipx.m150785a(str));
    }

    public cawh(String str, String str2) {
        this(cipx.m150785a(str), cipx.m150785a(str2));
    }
}
