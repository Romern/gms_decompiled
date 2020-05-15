package p000;

/* renamed from: batb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class batb extends batf {

    /* renamed from: a */
    public final basa f101693a;

    public batb(basa basa) {
        this.f101693a = basa;
    }

    /* renamed from: a */
    public final basa mo55946a() {
        return this.f101693a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof batf)) {
            return false;
        }
        batf batf = (batf) obj;
        basa basa = this.f101693a;
        return basa != null ? basa.equals(batf.mo55946a()) : batf.mo55946a() == null;
    }

    public final int hashCode() {
        basa basa = this.f101693a;
        return (basa != null ? basa.hashCode() : 0) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f101693a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("MdhBroadcastListenerParams{latestFootprintFilter=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
