package p000;

/* renamed from: bcge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcge extends bcgh {

    /* renamed from: a */
    private final bche f104107a;

    /* renamed from: b */
    public final int mo56762b() {
        return 1;
    }

    /* renamed from: d */
    public final bche mo56770d() {
        return this.f104107a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcht) {
            bcht bcht = (bcht) obj;
            return bcht.mo56762b() == 1 && this.f104107a.equals(bcht.mo56770d());
        }
    }

    public final int hashCode() {
        return this.f104107a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104107a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("OneOfType{changeGroupProfile=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcge(bche bche) {
        this.f104107a = bche;
    }
}
