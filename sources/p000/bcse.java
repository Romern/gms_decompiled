package p000;

/* renamed from: bcse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcse extends bcuu {

    /* renamed from: b */
    private final String f104780b;

    /* renamed from: c */
    private final String f104781c;

    /* renamed from: d */
    private final bngx f104782d;

    /* renamed from: e */
    private final int f104783e;

    /* renamed from: f */
    private final String f104784f;

    public bcse(String str, String str2, bngx bngx, int i, String str3) {
        this.f104780b = str;
        this.f104781c = str2;
        this.f104782d = bngx;
        this.f104783e = i;
        this.f104784f = str3;
    }

    /* renamed from: a */
    public final String mo57416a() {
        return this.f104780b;
    }

    /* renamed from: b */
    public final String mo57417b() {
        return this.f104781c;
    }

    /* renamed from: c */
    public final bngx mo57418c() {
        return this.f104782d;
    }

    /* renamed from: d */
    public final int mo57419d() {
        return this.f104783e;
    }

    /* renamed from: e */
    public final String mo57420e() {
        return this.f104784f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcuu) {
            bcuu bcuu = (bcuu) obj;
            return this.f104780b.equals(bcuu.mo57416a()) && this.f104781c.equals(bcuu.mo57417b()) && bnkn.m109669a(this.f104782d, bcuu.mo57418c()) && this.f104783e == bcuu.mo57419d() && this.f104784f.equals(bcuu.mo57420e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f104780b.hashCode() ^ 1000003) * 1000003) ^ this.f104781c.hashCode()) * 1000003) ^ this.f104782d.hashCode()) * 1000003) ^ this.f104783e) * 1000003) ^ this.f104784f.hashCode();
    }

    public final String toString() {
        String str = this.f104780b;
        String str2 = this.f104781c;
        String valueOf = String.valueOf(this.f104782d);
        int i = this.f104783e;
        String str3 = this.f104784f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 81 + length2 + String.valueOf(valueOf).length() + String.valueOf(str3).length());
        sb.append("SuggestionList{id=");
        sb.append(str);
        sb.append(", messageId=");
        sb.append(str2);
        sb.append(", suggestions=");
        sb.append(valueOf);
        sb.append(", renderStyle=");
        sb.append(i);
        sb.append(", hintText=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
