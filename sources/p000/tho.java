package p000;

/* renamed from: tho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tho extends thy {

    /* renamed from: a */
    private final String f46038a;

    /* renamed from: b */
    private final bmxv f46039b;

    public tho(String str, bmxv bmxv) {
        this.f46038a = str;
        this.f46039b = bmxv;
    }

    /* renamed from: a */
    public final String mo26549a() {
        return this.f46038a;
    }

    /* renamed from: b */
    public final bmxv mo26550b() {
        return this.f46039b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof thy) {
            thy thy = (thy) obj;
            return this.f46038a.equals(thy.mo26549a()) && this.f46039b.equals(thy.mo26550b());
        }
    }

    public final int hashCode() {
        return ((this.f46038a.hashCode() ^ 1000003) * 1000003) ^ this.f46039b.hashCode();
    }

    public final String toString() {
        String str = this.f46038a;
        String valueOf = String.valueOf(this.f46039b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(valueOf).length());
        sb.append("TextEntryData{text=");
        sb.append(str);
        sb.append(", subtext=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
