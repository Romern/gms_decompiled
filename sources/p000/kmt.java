package p000;

/* renamed from: kmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kmt extends knm {

    /* renamed from: a */
    private final boolean f24486a;

    /* renamed from: b */
    private final bngx f24487b;

    public kmt(boolean z, bngx bngx) {
        this.f24486a = z;
        if (bngx != null) {
            this.f24487b = bngx;
            return;
        }
        throw new NullPointerException("Null getWindowPredictions");
    }

    /* renamed from: a */
    public final boolean mo14708a() {
        return this.f24486a;
    }

    /* renamed from: b */
    public final bngx mo14709b() {
        return this.f24487b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof knm) {
            knm knm = (knm) obj;
            return this.f24486a == knm.mo14708a() && bnkn.m109669a(this.f24487b, knm.mo14709b());
        }
    }

    public final int hashCode() {
        return (((!this.f24486a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f24487b.hashCode();
    }

    public final String toString() {
        boolean z = this.f24486a;
        String valueOf = String.valueOf(this.f24487b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
        sb.append("WindowPredictionsResult{hasPrediction=");
        sb.append(z);
        sb.append(", getWindowPredictions=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
