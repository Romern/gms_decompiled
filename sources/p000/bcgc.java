package p000;

/* renamed from: bcgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgc extends bcgh {

    /* renamed from: a */
    private final bcfz f104105a;

    /* renamed from: a */
    public final bcfz mo56761a() {
        return this.f104105a;
    }

    /* renamed from: b */
    public final int mo56762b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcht) {
            bcht bcht = (bcht) obj;
            return bcht.mo56762b() == 3 && this.f104105a.equals(bcht.mo56761a());
        }
    }

    public final int hashCode() {
        return this.f104105a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104105a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("OneOfType{addGroupUsers=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgc(bcfz bcfz) {
        this.f104105a = bcfz;
    }
}
