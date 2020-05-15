package p000;

/* renamed from: ekv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ekv extends ekz {

    /* renamed from: a */
    private final long f15224a;

    /* renamed from: b */
    private final ejb f15225b;

    /* renamed from: c */
    private final eix f15226c;

    public ekv(long j, ejb ejb, eix eix) {
        this.f15224a = j;
        if (ejb != null) {
            this.f15225b = ejb;
            this.f15226c = eix;
            return;
        }
        throw new NullPointerException("Null transportContext");
    }

    /* renamed from: a */
    public final long mo10249a() {
        return this.f15224a;
    }

    /* renamed from: b */
    public final ejb mo10250b() {
        return this.f15225b;
    }

    /* renamed from: c */
    public final eix mo10251c() {
        return this.f15226c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekz) {
            ekz ekz = (ekz) obj;
            return this.f15224a == ekz.mo10249a() && this.f15225b.equals(ekz.mo10250b()) && this.f15226c.equals(ekz.mo10251c());
        }
    }

    public final int hashCode() {
        long j = this.f15224a;
        return this.f15226c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f15225b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f15224a;
        String valueOf = String.valueOf(this.f15225b);
        String valueOf2 = String.valueOf(this.f15226c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
        sb.append("PersistedEvent{id=");
        sb.append(j);
        sb.append(", transportContext=");
        sb.append(valueOf);
        sb.append(", event=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
