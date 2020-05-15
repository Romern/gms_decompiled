package p000;

/* renamed from: kjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjh extends kjj {

    /* renamed from: a */
    private final kom f24243a;

    /* renamed from: b */
    private final lbc f24244b;

    /* renamed from: c */
    private final int f24245c;

    public kjh(kom kom, lbc lbc, int i) {
        if (kom != null) {
            this.f24243a = kom;
            if (lbc != null) {
                this.f24244b = lbc;
                this.f24245c = i;
                return;
            }
            throw new NullPointerException("Null detectionMethod");
        }
        throw new NullPointerException("Null viewNode");
    }

    /* renamed from: a */
    public final kom mo14510a() {
        return this.f24243a;
    }

    /* renamed from: b */
    public final lbc mo14511b() {
        return this.f24244b;
    }

    /* renamed from: c */
    public final int mo14512c() {
        return this.f24245c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjj) {
            kjj kjj = (kjj) obj;
            return this.f24243a.equals(kjj.mo14510a()) && this.f24244b.equals(kjj.mo14511b()) && this.f24245c == kjj.mo14512c();
        }
    }

    public final int hashCode() {
        return ((((this.f24243a.hashCode() ^ 1000003) * 1000003) ^ this.f24244b.hashCode()) * 1000003) ^ this.f24245c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24243a);
        String valueOf2 = String.valueOf(this.f24244b);
        int i = this.f24245c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
        sb.append("DetectedButton{viewNode=");
        sb.append(valueOf);
        sb.append(", detectionMethod=");
        sb.append(valueOf2);
        sb.append(", metricsId=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
