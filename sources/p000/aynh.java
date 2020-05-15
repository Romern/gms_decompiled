package p000;

/* renamed from: aynh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aynh extends aypm {

    /* renamed from: a */
    private final bxtx f98007a;

    /* renamed from: b */
    private final bxtx f98008b;

    public aynh(bxtx bxtx, bxtx bxtx2) {
        if (bxtx != null) {
            this.f98007a = bxtx;
            if (bxtx2 != null) {
                this.f98008b = bxtx2;
                return;
            }
            throw new NullPointerException("Null sha256AccountKeyPublicAddress");
        }
        throw new NullPointerException("Null accountKey");
    }

    /* renamed from: a */
    public final bxtx mo54088a() {
        return this.f98007a;
    }

    /* renamed from: b */
    public final bxtx mo54089b() {
        return this.f98008b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aypm) {
            aypm aypm = (aypm) obj;
            return this.f98007a.equals(aypm.mo54088a()) && this.f98008b.equals(aypm.mo54089b());
        }
    }

    public final int hashCode() {
        return ((this.f98007a.hashCode() ^ 1000003) * 1000003) ^ this.f98008b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f98007a);
        String valueOf2 = String.valueOf(this.f98008b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64 + String.valueOf(valueOf2).length());
        sb.append("FastPairHistoryItem{accountKey=");
        sb.append(valueOf);
        sb.append(", sha256AccountKeyPublicAddress=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
