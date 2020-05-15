package p000;

/* renamed from: bbyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbyd extends bbys {

    /* renamed from: a */
    private final int f103746a;

    /* renamed from: b */
    private final bmxv f103747b;

    /* renamed from: c */
    private final bmxv f103748c;

    public bbyd(int i, bmxv bmxv, bmxv bmxv2) {
        this.f103746a = i;
        this.f103747b = bmxv;
        this.f103748c = bmxv2;
    }

    /* renamed from: a */
    public final int mo56535a() {
        return this.f103746a;
    }

    /* renamed from: b */
    public final bmxv mo56536b() {
        return this.f103747b;
    }

    /* renamed from: c */
    public final bmxv mo56537c() {
        return this.f103748c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbys) {
            bbys bbys = (bbys) obj;
            return this.f103746a == bbys.mo56535a() && this.f103747b.equals(bbys.mo56536b()) && this.f103748c.equals(bbys.mo56537c());
        }
    }

    public final int hashCode() {
        return ((((this.f103746a ^ 1000003) * 1000003) ^ this.f103747b.hashCode()) * 1000003) ^ this.f103748c.hashCode();
    }

    public final String toString() {
        int i = this.f103746a;
        String valueOf = String.valueOf(this.f103747b);
        String valueOf2 = String.valueOf(this.f103748c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74 + String.valueOf(valueOf2).length());
        sb.append("RegistrationResult{status=");
        sb.append(i);
        sb.append(", unsavedAccountContext=");
        sb.append(valueOf);
        sb.append(", authToken=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
