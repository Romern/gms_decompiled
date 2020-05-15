package p000;

/* renamed from: bcod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bcod extends bcud {

    /* renamed from: a */
    public final bngx f104607a;

    /* renamed from: b */
    private final int f104608b;

    /* renamed from: c */
    private final int f104609c;

    public bcod(int i, int i2, bngx bngx) {
        this.f104608b = i;
        this.f104609c = i2;
        if (bngx != null) {
            this.f104607a = bngx;
            return;
        }
        throw new NullPointerException("Null textStyles");
    }

    /* renamed from: a */
    public final int mo57045a() {
        return this.f104608b;
    }

    /* renamed from: b */
    public final int mo57046b() {
        return this.f104609c;
    }

    /* renamed from: c */
    public final bngx mo57047c() {
        return this.f104607a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcud) {
            bcud bcud = (bcud) obj;
            return this.f104608b == bcud.mo57045a() && this.f104609c == bcud.mo57046b() && bnkn.m109669a(this.f104607a, bcud.mo57047c());
        }
    }

    public final int hashCode() {
        return ((((this.f104608b ^ 1000003) * 1000003) ^ this.f104609c) * 1000003) ^ this.f104607a.hashCode();
    }

    public final String toString() {
        int i = this.f104608b;
        int i2 = this.f104609c;
        String valueOf = String.valueOf(this.f104607a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
        sb.append("FormattedTextSpan{startIndex=");
        sb.append(i);
        sb.append(", endIndex=");
        sb.append(i2);
        sb.append(", textStyles=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
