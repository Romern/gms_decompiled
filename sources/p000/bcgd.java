package p000;

/* renamed from: bcgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgd extends bcgh {

    /* renamed from: a */
    private final bchc f104106a;

    /* renamed from: b */
    public final int mo56762b() {
        return 2;
    }

    /* renamed from: c */
    public final bchc mo56766c() {
        return this.f104106a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcht) {
            bcht bcht = (bcht) obj;
            return bcht.mo56762b() == 2 && this.f104106a.equals(bcht.mo56766c());
        }
    }

    public final int hashCode() {
        return this.f104106a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104106a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("OneOfType{blockUnblockUsers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgd(bchc bchc) {
        this.f104106a = bchc;
    }
}
