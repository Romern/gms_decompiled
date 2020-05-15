package p000;

/* renamed from: kkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kkk extends kll {

    /* renamed from: a */
    private final String f24337a;

    /* renamed from: b */
    private final kom f24338b;

    /* renamed from: c */
    private final bnic f24339c;

    /* renamed from: d */
    private final bnic f24340d;

    public kkk(String str, kom kom, bnic bnic, bnic bnic2) {
        if (str != null) {
            this.f24337a = str;
            if (kom != null) {
                this.f24338b = kom;
                if (bnic != null) {
                    this.f24339c = bnic;
                    if (bnic2 != null) {
                        this.f24340d = bnic2;
                        return;
                    }
                    throw new NullPointerException("Null newTypes");
                }
                throw new NullPointerException("Null originalTypes");
            }
            throw new NullPointerException("Null viewNode");
        }
        throw new NullPointerException("Null postProcessorName");
    }

    /* renamed from: a */
    public final String mo14614a() {
        return this.f24337a;
    }

    /* renamed from: b */
    public final kom mo14615b() {
        return this.f24338b;
    }

    /* renamed from: c */
    public final bnic mo14616c() {
        return this.f24339c;
    }

    /* renamed from: d */
    public final bnic mo14617d() {
        return this.f24340d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kll) {
            kll kll = (kll) obj;
            return this.f24337a.equals(kll.mo14614a()) && this.f24338b.equals(kll.mo14615b()) && this.f24339c.equals(kll.mo14616c()) && this.f24340d.equals(kll.mo14617d());
        }
    }

    public final int hashCode() {
        return ((((((this.f24337a.hashCode() ^ 1000003) * 1000003) ^ this.f24338b.hashCode()) * 1000003) ^ this.f24339c.hashCode()) * 1000003) ^ this.f24340d.hashCode();
    }

    public final String toString() {
        String str = this.f24337a;
        String valueOf = String.valueOf(this.f24338b);
        String valueOf2 = String.valueOf(this.f24339c);
        String valueOf3 = String.valueOf(this.f24340d);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PostProcessorModifiedTypesTrace{postProcessorName=");
        sb.append(str);
        sb.append(", viewNode=");
        sb.append(valueOf);
        sb.append(", originalTypes=");
        sb.append(valueOf2);
        sb.append(", newTypes=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
