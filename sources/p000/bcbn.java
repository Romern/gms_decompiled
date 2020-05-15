package p000;

/* renamed from: bcbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcbn extends bcbo {

    /* renamed from: a */
    private final Object f103936a;

    /* renamed from: b */
    public final int mo56678b() {
        return 2;
    }

    /* renamed from: c */
    public final Object mo56682c() {
        return this.f103936a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcbz) {
            bcbz bcbz = (bcbz) obj;
            return bcbz.mo56678b() == 2 && this.f103936a.equals(bcbz.mo56682c());
        }
    }

    public final int hashCode() {
        return this.f103936a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f103936a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Either{result=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcbn(Object obj) {
        this.f103936a = obj;
    }
}
