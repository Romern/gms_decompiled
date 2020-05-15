package p000;

/* renamed from: bcef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcef extends bcej {

    /* renamed from: a */
    public final bcen f104027a;

    /* renamed from: b */
    private final String f104028b;

    public bcef(String str, bcen bcen) {
        this.f104028b = str;
        this.f104027a = bcen;
    }

    /* renamed from: a */
    public final String mo56719a() {
        return this.f104028b;
    }

    /* renamed from: b */
    public final bcen mo56720b() {
        return this.f104027a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcej) {
            bcej bcej = (bcej) obj;
            return this.f104028b.equals(bcej.mo56719a()) && this.f104027a.equals(bcej.mo56720b());
        }
    }

    public final int hashCode() {
        return ((this.f104028b.hashCode() ^ 1000003) * 1000003) ^ this.f104027a.hashCode();
    }

    public final String toString() {
        String str = this.f104028b;
        String valueOf = String.valueOf(this.f104027a);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47 + String.valueOf(valueOf).length());
        sb.append("LighterJobParameters{tag=");
        sb.append(str);
        sb.append(", lighterRetryPolicy=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
