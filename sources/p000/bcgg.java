package p000;

/* renamed from: bcgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgg extends bcgh {

    /* renamed from: a */
    private final bcfz f104109a;

    /* renamed from: b */
    public final int mo56762b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcht) {
            bcht bcht = (bcht) obj;
            return bcht.mo56762b() == 4 && this.f104109a.equals(bcht.mo56779f());
        }
    }

    /* renamed from: f */
    public final bcfz mo56779f() {
        return this.f104109a;
    }

    public final int hashCode() {
        return this.f104109a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104109a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("OneOfType{kickGroupUsers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgg(bcfz bcfz) {
        this.f104109a = bcfz;
    }
}
