package p000;

/* renamed from: kms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kms extends knl {

    /* renamed from: a */
    private final lbc f24482a;

    /* renamed from: b */
    private final boolean f24483b;

    /* renamed from: c */
    private final boolean f24484c;

    /* renamed from: d */
    private final boolean f24485d;

    public kms(lbc lbc, boolean z, boolean z2, boolean z3) {
        if (lbc != null) {
            this.f24482a = lbc;
            this.f24483b = z;
            this.f24484c = z2;
            this.f24485d = z3;
            return;
        }
        throw new NullPointerException("Null getDetectionMethod");
    }

    /* renamed from: a */
    public final lbc mo14701a() {
        return this.f24482a;
    }

    /* renamed from: b */
    public final boolean mo14702b() {
        return this.f24483b;
    }

    /* renamed from: c */
    public final boolean mo14703c() {
        return this.f24484c;
    }

    /* renamed from: d */
    public final boolean mo14704d() {
        return this.f24485d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof knl) {
            knl knl = (knl) obj;
            return this.f24482a.equals(knl.mo14701a()) && this.f24483b == knl.mo14702b() && this.f24484c == knl.mo14703c() && this.f24485d == knl.mo14704d();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f24482a.hashCode() ^ 1000003) * 1000003) ^ (!this.f24483b ? 1237 : 1231)) * 1000003) ^ (!this.f24484c ? 1237 : 1231)) * 1000003;
        if (this.f24485d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24482a);
        boolean z = this.f24483b;
        boolean z2 = this.f24484c;
        boolean z3 = this.f24485d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 138);
        sb.append("PredictionProcessorTrace{getDetectionMethod=");
        sb.append(valueOf);
        sb.append(", hasInputFingerprints=");
        sb.append(z);
        sb.append(", hasPredictionDataForApp=");
        sb.append(z2);
        sb.append(", hasPredictionDataForWindow=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
