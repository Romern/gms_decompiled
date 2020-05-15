package p000;

/* renamed from: ahtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahtl extends ahwe {

    /* renamed from: a */
    private final cakq f68005a;

    /* renamed from: b */
    private final boolean f68006b;

    public ahtl(cakq cakq, boolean z) {
        this.f68005a = cakq;
        this.f68006b = z;
    }

    /* renamed from: a */
    public final cakq mo37138a() {
        return this.f68005a;
    }

    /* renamed from: b */
    public final boolean mo37139b() {
        return this.f68006b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahwe) {
            ahwe ahwe = (ahwe) obj;
            return this.f68005a.equals(ahwe.mo37138a()) && this.f68006b == ahwe.mo37139b();
        }
    }

    public final int hashCode() {
        return ((this.f68005a.hashCode() ^ 1000003) * 1000003) ^ (!this.f68006b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f68005a);
        boolean z = this.f68006b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Result{response=");
        sb.append(valueOf);
        sb.append(", isRetriable=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
