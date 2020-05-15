package p000;

/* renamed from: bcgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgs extends bchj {

    /* renamed from: a */
    private final bcsp f104122a;

    /* renamed from: b */
    private final bmxv f104123b;

    public bcgs(bcsp bcsp, bmxv bmxv) {
        this.f104122a = bcsp;
        this.f104123b = bmxv;
    }

    /* renamed from: a */
    public final bcsp mo56820a() {
        return this.f104122a;
    }

    /* renamed from: b */
    public final bmxv mo56821b() {
        return this.f104123b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bchj) {
            bchj bchj = (bchj) obj;
            return this.f104122a.equals(bchj.mo56820a()) && this.f104123b.equals(bchj.mo56821b());
        }
    }

    public final int hashCode() {
        return ((this.f104122a.hashCode() ^ 1000003) * 1000003) ^ this.f104123b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104122a);
        String valueOf2 = String.valueOf(this.f104123b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("CreateGroup{conversation=");
        sb.append(valueOf);
        sb.append(", groupInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
