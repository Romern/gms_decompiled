package p000;

/* renamed from: bcgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgf extends bcgh {

    /* renamed from: a */
    private final bchj f104108a;

    /* renamed from: b */
    public final int mo56762b() {
        return 5;
    }

    /* renamed from: e */
    public final bchj mo56774e() {
        return this.f104108a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcht) {
            bcht bcht = (bcht) obj;
            return bcht.mo56762b() == 5 && this.f104108a.equals(bcht.mo56774e());
        }
    }

    public final int hashCode() {
        return this.f104108a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104108a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("OneOfType{createGroup=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgf(bchj bchj) {
        this.f104108a = bchj;
    }
}
