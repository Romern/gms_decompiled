package p000;

/* renamed from: baxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baxb extends baxf {

    /* renamed from: c */
    private final boolean f102014c;

    /* renamed from: d */
    private final bnic f102015d;

    public baxb(boolean z, bnic bnic) {
        this.f102014c = z;
        this.f102015d = bnic;
    }

    /* renamed from: a */
    public final boolean mo56002a() {
        return this.f102014c;
    }

    /* renamed from: b */
    public final bnic mo56003b() {
        return this.f102015d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baxf) {
            baxf baxf = (baxf) obj;
            return this.f102014c == baxf.mo56002a() && this.f102015d.equals(baxf.mo56003b());
        }
    }

    public final int hashCode() {
        return (((!this.f102014c ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f102015d.hashCode();
    }

    public final String toString() {
        boolean z = this.f102014c;
        String valueOf = String.valueOf(this.f102015d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73);
        sb.append("DownloadConstraints{requireUnmeteredNetwork=");
        sb.append(z);
        sb.append(", requiredNetworkTypes=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
