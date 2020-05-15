package p000;

/* renamed from: kji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kji extends kjl {

    /* renamed from: a */
    private final kom f24246a;

    /* renamed from: b */
    private final bnic f24247b;

    /* renamed from: c */
    private final lbc f24248c;

    /* renamed from: d */
    private final int f24249d;

    /* renamed from: e */
    private final bnhe f24250e;

    public kji(kom kom, bnic bnic, lbc lbc, int i, bnhe bnhe) {
        this.f24246a = kom;
        if (bnic != null) {
            this.f24247b = bnic;
            if (lbc != null) {
                this.f24248c = lbc;
                this.f24249d = i;
                if (bnhe != null) {
                    this.f24250e = bnhe;
                    return;
                }
                throw new NullPointerException("Null fingerprintsMap");
            }
            throw new NullPointerException("Null detectionMethod");
        }
        throw new NullPointerException("Null types");
    }

    /* renamed from: a */
    public final kom mo14516a() {
        return this.f24246a;
    }

    /* renamed from: b */
    public final bnic mo14517b() {
        return this.f24247b;
    }

    /* renamed from: c */
    public final lbc mo14518c() {
        return this.f24248c;
    }

    /* renamed from: d */
    public final int mo14519d() {
        return this.f24249d;
    }

    /* renamed from: e */
    public final bnhe mo14520e() {
        return this.f24250e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjl) {
            kjl kjl = (kjl) obj;
            return this.f24246a.equals(kjl.mo14516a()) && this.f24247b.equals(kjl.mo14517b()) && this.f24248c.equals(kjl.mo14518c()) && this.f24249d == kjl.mo14519d() && this.f24250e.equals(kjl.mo14520e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f24246a.hashCode() ^ 1000003) * 1000003) ^ this.f24247b.hashCode()) * 1000003) ^ this.f24248c.hashCode()) * 1000003) ^ this.f24249d) * 1000003) ^ this.f24250e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24246a);
        String valueOf2 = String.valueOf(this.f24247b);
        String valueOf3 = String.valueOf(this.f24248c);
        int i = this.f24249d;
        String valueOf4 = String.valueOf(this.f24250e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 91 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("DetectedField{viewNode=");
        sb.append(valueOf);
        sb.append(", types=");
        sb.append(valueOf2);
        sb.append(", detectionMethod=");
        sb.append(valueOf3);
        sb.append(", metricsId=");
        sb.append(i);
        sb.append(", fingerprintsMap=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
