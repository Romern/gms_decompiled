package p000;

/* renamed from: bmwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwv extends bmwx {

    /* renamed from: a */
    final bmwx f131152a;

    /* renamed from: b */
    final bmwx f131153b;

    public bmwv(bmwx bmwx, bmwx bmwx2) {
        bmxy.m108581a(bmwx);
        this.f131152a = bmwx;
        bmxy.m108581a(bmwx2);
        this.f131153b = bmwx2;
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return this.f131152a.mo66828a(c) || this.f131153b.mo66828a(c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131152a);
        String valueOf2 = String.valueOf(this.f131153b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
        sb.append("CharMatcher.or(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
