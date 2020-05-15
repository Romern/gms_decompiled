package p000;

/* renamed from: kkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kkl extends klv {

    /* renamed from: a */
    private final lbc f24341a;

    /* renamed from: b */
    private final kom f24342b;

    /* renamed from: c */
    private final bnic f24343c;

    public kkl(lbc lbc, kom kom, bnic bnic) {
        if (lbc != null) {
            this.f24341a = lbc;
            if (kom != null) {
                this.f24342b = kom;
                if (bnic != null) {
                    this.f24343c = bnic;
                    return;
                }
                throw new NullPointerException("Null dataTypes");
            }
            throw new NullPointerException("Null viewNode");
        }
        throw new NullPointerException("Null detectionMethod");
    }

    /* renamed from: a */
    public final lbc mo14621a() {
        return this.f24341a;
    }

    /* renamed from: b */
    public final kom mo14622b() {
        return this.f24342b;
    }

    /* renamed from: c */
    public final bnic mo14623c() {
        return this.f24343c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klv) {
            klv klv = (klv) obj;
            return this.f24341a.equals(klv.mo14621a()) && this.f24342b.equals(klv.mo14622b()) && this.f24343c.equals(klv.mo14623c());
        }
    }

    public final int hashCode() {
        return ((((this.f24341a.hashCode() ^ 1000003) * 1000003) ^ this.f24342b.hashCode()) * 1000003) ^ this.f24343c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24341a);
        String valueOf2 = String.valueOf(this.f24342b);
        String valueOf3 = String.valueOf(this.f24343c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 66 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ProcessorLabeledNodeTrace{detectionMethod=");
        sb.append(valueOf);
        sb.append(", viewNode=");
        sb.append(valueOf2);
        sb.append(", dataTypes=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
