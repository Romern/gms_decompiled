package p000;

/* renamed from: bcgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgm extends bcgn {

    /* renamed from: a */
    private final bcic f104114a;

    /* renamed from: b */
    public final int mo56783b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bchz) {
            bchz bchz = (bchz) obj;
            return bchz.mo56783b() == 4 && this.f104114a.equals(bchz.mo56800f());
        }
    }

    /* renamed from: f */
    public final bcic mo56800f() {
        return this.f104114a;
    }

    public final int hashCode() {
        return this.f104114a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104114a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("OneOfType{typingIndicator=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgm(bcic bcic) {
        this.f104114a = bcic;
    }
}
