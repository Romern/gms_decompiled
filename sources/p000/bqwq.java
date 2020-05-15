package p000;

/* renamed from: bqwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqwq extends bqxp {

    /* renamed from: a */
    private final int f141754a;

    /* renamed from: b */
    private final int f141755b;

    /* renamed from: c */
    private final int f141756c;

    /* renamed from: d */
    private final bqxr f141757d;

    public bqwq(int i, int i2, int i3, bqxr bqxr) {
        this.f141754a = i;
        this.f141755b = i2;
        this.f141756c = i3;
        if (bqxr != null) {
            this.f141757d = bqxr;
            return;
        }
        throw new NullPointerException("Null parent");
    }

    /* renamed from: a */
    public final int mo69377a() {
        return this.f141754a;
    }

    /* renamed from: b */
    public final int mo69378b() {
        return this.f141755b;
    }

    /* renamed from: c */
    public final int mo69379c() {
        return this.f141756c;
    }

    /* renamed from: d */
    public final bqxr mo69380d() {
        return this.f141757d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqxp) {
            bqxp bqxp = (bqxp) obj;
            return this.f141754a == bqxp.mo69377a() && this.f141755b == bqxp.mo69378b() && this.f141756c == bqxp.mo69379c() && this.f141757d.equals(bqxp.mo69380d());
        }
    }

    public final int hashCode() {
        return ((((((this.f141754a ^ 1000003) * 1000003) ^ this.f141755b) * 1000003) ^ this.f141756c) * 1000003) ^ this.f141757d.hashCode();
    }
}
