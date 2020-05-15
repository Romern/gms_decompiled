package p000;

/* renamed from: bkvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkvm {

    /* renamed from: a */
    public final bkvo f125332a;

    public bkvm(bkvo bkvo) {
        bkww.m106781a(bkvo, "metadata");
        this.f125332a = bkvo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bkvm) {
            return this.f125332a.equals(((bkvm) obj).f125332a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f125332a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f125332a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("SessionJoinEvent [metadata=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
