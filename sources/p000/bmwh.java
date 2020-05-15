package p000;

/* renamed from: bmwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwh extends bmwx {

    /* renamed from: a */
    final bmwx f131136a;

    /* renamed from: b */
    final bmwx f131137b;

    public bmwh(bmwx bmwx, bmwx bmwx2) {
        bmxy.m108581a(bmwx);
        this.f131136a = bmwx;
        bmxy.m108581a(bmwx2);
        this.f131137b = bmwx2;
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return this.f131136a.mo66828a(c) && this.f131137b.mo66828a(c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131136a);
        String valueOf2 = String.valueOf(this.f131137b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(valueOf2).length());
        sb.append("CharMatcher.and(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
