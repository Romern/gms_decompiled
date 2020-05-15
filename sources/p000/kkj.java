package p000;

/* renamed from: kkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kkj extends klk {

    /* renamed from: a */
    private final String f24335a;

    /* renamed from: b */
    private final kom f24336b;

    public kkj(String str, kom kom) {
        if (str != null) {
            this.f24335a = str;
            if (kom != null) {
                this.f24336b = kom;
                return;
            }
            throw new NullPointerException("Null viewNode");
        }
        throw new NullPointerException("Null postProcessorName");
    }

    /* renamed from: a */
    public final String mo14609a() {
        return this.f24335a;
    }

    /* renamed from: b */
    public final kom mo14610b() {
        return this.f24336b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klk) {
            klk klk = (klk) obj;
            return this.f24335a.equals(klk.mo14609a()) && this.f24336b.equals(klk.mo14610b());
        }
    }

    public final int hashCode() {
        return ((this.f24335a.hashCode() ^ 1000003) * 1000003) ^ this.f24336b.hashCode();
    }

    public final String toString() {
        String str = this.f24335a;
        String valueOf = String.valueOf(this.f24336b);
        StringBuilder sb = new StringBuilder(str.length() + 61 + String.valueOf(valueOf).length());
        sb.append("PostProcessorIgnoredFieldTrace{postProcessorName=");
        sb.append(str);
        sb.append(", viewNode=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
