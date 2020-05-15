package p000;

/* renamed from: bcyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcyu extends bczs {

    /* renamed from: a */
    private final String f105151a;

    /* renamed from: b */
    private final bczq f105152b;

    public bcyu(String str, bczq bczq) {
        this.f105151a = str;
        this.f105152b = bczq;
    }

    /* renamed from: a */
    public final String mo57743a() {
        return this.f105151a;
    }

    /* renamed from: b */
    public final bczq mo57744b() {
        return this.f105152b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bczs) {
            bczs bczs = (bczs) obj;
            return this.f105151a.equals(bczs.mo57743a()) && this.f105152b.equals(bczs.mo57744b());
        }
    }

    public final int hashCode() {
        return ((this.f105151a.hashCode() ^ 1000003) * 1000003) ^ this.f105152b.hashCode();
    }

    public final String toString() {
        String str = this.f105151a;
        String valueOf = String.valueOf(this.f105152b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(valueOf).length());
        sb.append("StandaloneCard{jsonSource=");
        sb.append(str);
        sb.append(", stackCard=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
