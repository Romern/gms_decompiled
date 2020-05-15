package p000;

/* renamed from: tii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tii extends tin {

    /* renamed from: a */
    private final Integer f46071a;

    /* renamed from: b */
    private final Integer f46072b;

    public tii(Integer num, Integer num2) {
        this.f46071a = num;
        this.f46072b = num2;
    }

    /* renamed from: a */
    public final Integer mo26560a() {
        return this.f46071a;
    }

    /* renamed from: b */
    public final Integer mo26561b() {
        return this.f46072b;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tin) {
            tin tin = (tin) obj;
            return this.f46071a.equals(tin.mo26560a()) && ((num = this.f46072b) == null ? tin.mo26561b() == null : num.equals(tin.mo26561b()));
        }
    }

    public final int hashCode() {
        int hashCode = (this.f46071a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f46072b;
        return hashCode ^ (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46071a);
        String valueOf2 = String.valueOf(this.f46072b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
        sb.append("VeNode{nodeId=");
        sb.append(valueOf);
        sb.append(", index=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
