package p000;

/* renamed from: bcgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgj extends bcgn {

    /* renamed from: a */
    private final bctr f104111a;

    /* renamed from: b */
    public final int mo56783b() {
        return 1;
    }

    /* renamed from: c */
    public final bctr mo56787c() {
        return this.f104111a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bchz) {
            bchz bchz = (bchz) obj;
            return bchz.mo56783b() == 1 && this.f104111a.equals(bchz.mo56787c());
        }
    }

    public final int hashCode() {
        return this.f104111a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104111a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("OneOfType{message=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgj(bctr bctr) {
        this.f104111a = bctr;
    }
}
