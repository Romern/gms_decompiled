package p000;

/* renamed from: bcbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcbm extends bcbo {

    /* renamed from: a */
    private final bcns f103935a;

    /* renamed from: a */
    public final bcns mo56677a() {
        return this.f103935a;
    }

    /* renamed from: b */
    public final int mo56678b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcbz) {
            bcbz bcbz = (bcbz) obj;
            return bcbz.mo56678b() == 1 && this.f103935a.equals(bcbz.mo56677a());
        }
    }

    public final int hashCode() {
        return this.f103935a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103935a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Either{error=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcbm(bcns bcns) {
        this.f103935a = bcns;
    }
}
