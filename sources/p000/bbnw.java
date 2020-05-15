package p000;

/* renamed from: bbnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbnw extends bboa {

    /* renamed from: a */
    private final bbny f102989a;

    /* renamed from: b */
    private final bboc f102990b;

    public bbnw(bbny bbny, bboc bboc) {
        this.f102989a = bbny;
        this.f102990b = bboc;
    }

    /* renamed from: a */
    public final bbny mo56251a() {
        return this.f102989a;
    }

    /* renamed from: b */
    public final bboc mo56252b() {
        return this.f102990b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bboa) {
            bboa bboa = (bboa) obj;
            return this.f102989a.equals(bboa.mo56251a()) && this.f102990b.equals(bboa.mo56252b());
        }
    }

    public final int hashCode() {
        return ((this.f102989a.hashCode() ^ 1000003) * 1000003) ^ this.f102990b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f102989a);
        String valueOf2 = String.valueOf(this.f102990b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86 + String.valueOf(valueOf2).length());
        sb.append("PdsMobstoreSyncMetadataManagerFactory{mobstoreHelper=");
        sb.append(valueOf);
        sb.append(", pdsSyncMetadataManagerFactory=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
