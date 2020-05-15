package p000;

/* renamed from: lhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lhg extends lhh {

    /* renamed from: a */
    private final bmxv f26103a;

    /* renamed from: b */
    private final bmxv f26104b;

    public lhg(bmxv bmxv, bmxv bmxv2) {
        if (bmxv != null) {
            this.f26103a = bmxv;
            if (bmxv2 != null) {
                this.f26104b = bmxv2;
                return;
            }
            throw new NullPointerException("Null neuralNetworkUri");
        }
        throw new NullPointerException("Null configUri");
    }

    /* renamed from: a */
    public final bmxv mo15075a() {
        return this.f26103a;
    }

    /* renamed from: b */
    public final bmxv mo15076b() {
        return this.f26104b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lhh) {
            lhh lhh = (lhh) obj;
            return this.f26103a.equals(lhh.mo15075a()) && this.f26104b.equals(lhh.mo15076b());
        }
    }

    public final int hashCode() {
        return ((this.f26103a.hashCode() ^ 1000003) * 1000003) ^ this.f26104b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26103a);
        String valueOf2 = String.valueOf(this.f26104b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
        sb.append("MlModelFiles{configUri=");
        sb.append(valueOf);
        sb.append(", neuralNetworkUri=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
