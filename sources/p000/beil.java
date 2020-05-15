package p000;

/* renamed from: beil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beil extends bejy {

    /* renamed from: a */
    private final bejx f111589a;

    public beil(bejx bejx) {
        if (bejx != null) {
            this.f111589a = bejx;
            return;
        }
        throw new NullPointerException("Null service");
    }

    /* renamed from: a */
    public final bejx mo60736a() {
        return this.f111589a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bejy) {
            return this.f111589a.equals(((bejy) obj).mo60736a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f111589a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111589a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("SignallingConfig{service=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
