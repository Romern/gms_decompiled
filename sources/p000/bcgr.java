package p000;

/* renamed from: bcgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgr extends bchh {

    /* renamed from: a */
    private final bchg f104121a;

    public bcgr(bchg bchg) {
        this.f104121a = bchg;
    }

    /* renamed from: a */
    public final bchg mo56816a() {
        return this.f104121a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bchh) {
            return this.f104121a.equals(((bchh) obj).mo56816a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f104121a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104121a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("CloudUpdate{oneOfType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
