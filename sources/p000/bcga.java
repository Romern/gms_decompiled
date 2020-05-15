package p000;

/* renamed from: bcga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcga extends bcgb {

    /* renamed from: a */
    private final bchk f104104a;

    /* renamed from: a */
    public final bchk mo56756a() {
        return this.f104104a;
    }

    /* renamed from: b */
    public final int mo56757b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bchg) {
            bchg bchg = (bchg) obj;
            return bchg.mo56757b() == 1 && this.f104104a.equals(bchg.mo56756a());
        }
    }

    public final int hashCode() {
        return this.f104104a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104104a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("OneOfType{deleteConversation=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcga(bchk bchk) {
        this.f104104a = bchk;
    }
}
