package p000;

/* renamed from: zso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zso extends zsp {

    /* renamed from: a */
    private final int f55822a;

    /* renamed from: b */
    private final int f55823b;

    /* renamed from: c */
    private final int f55824c;

    /* renamed from: d */
    private final int f55825d;

    /* renamed from: e */
    private final int f55826e;

    /* renamed from: f */
    private final bnhe f55827f;

    public zso(int i, int i2, int i3, int i4, int i5, bnhe bnhe) {
        this.f55822a = i;
        this.f55823b = i2;
        this.f55824c = i3;
        this.f55825d = i4;
        this.f55826e = i5;
        if (bnhe != null) {
            this.f55827f = bnhe;
            return;
        }
        throw new NullPointerException("Null syncSources");
    }

    /* renamed from: a */
    public final int mo31442a() {
        return this.f55822a;
    }

    /* renamed from: b */
    public final int mo31443b() {
        return this.f55823b;
    }

    /* renamed from: c */
    public final int mo31444c() {
        return this.f55824c;
    }

    /* renamed from: d */
    public final int mo31445d() {
        return this.f55825d;
    }

    /* renamed from: e */
    public final int mo31446e() {
        return this.f55826e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zsp) {
            zsp zsp = (zsp) obj;
            return this.f55822a == zsp.mo31442a() && this.f55823b == zsp.mo31443b() && this.f55824c == zsp.mo31444c() && this.f55825d == zsp.mo31445d() && this.f55826e == zsp.mo31446e() && this.f55827f.equals(zsp.mo31448f());
        }
    }

    /* renamed from: f */
    public final bnhe mo31448f() {
        return this.f55827f;
    }

    public final int hashCode() {
        return ((((((((((this.f55822a ^ 1000003) * 1000003) ^ this.f55823b) * 1000003) ^ this.f55824c) * 1000003) ^ this.f55825d) * 1000003) ^ this.f55826e) * 1000003) ^ this.f55827f.hashCode();
    }
}
