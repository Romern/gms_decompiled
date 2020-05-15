package p000;

/* renamed from: abip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abip extends abjc {

    /* renamed from: a */
    private final boolean f57545a;

    /* renamed from: b */
    private final bngx f57546b;

    public abip(boolean z, bngx bngx) {
        this.f57545a = z;
        if (bngx != null) {
            this.f57546b = bngx;
            return;
        }
        throw new NullPointerException("Null failures");
    }

    /* renamed from: a */
    public final boolean mo32132a() {
        return this.f57545a;
    }

    /* renamed from: b */
    public final bngx mo32133b() {
        return this.f57546b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abjc) {
            abjc abjc = (abjc) obj;
            return this.f57545a == abjc.mo32132a() && bnkn.m109669a(this.f57546b, abjc.mo32133b());
        }
    }

    public final int hashCode() {
        return (((!this.f57545a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f57546b.hashCode();
    }

    public final String toString() {
        boolean z = this.f57545a;
        String valueOf = String.valueOf(this.f57546b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("EvaluationResult{result=");
        sb.append(z);
        sb.append(", failures=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
