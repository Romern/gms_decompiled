package p000;

/* renamed from: bcgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcgu extends bchm {

    /* renamed from: a */
    private final bngx f104126a;

    public bcgu(bngx bngx) {
        this.f104126a = bngx;
    }

    /* renamed from: a */
    public final bngx mo56830a() {
        return this.f104126a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bchm) {
            return bnkn.m109669a(this.f104126a, ((bchm) obj).mo56830a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f104126a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104126a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("GroupInfo{contactIds=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
