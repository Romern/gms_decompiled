package p000;

/* renamed from: bcny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcny extends bcoa {

    /* renamed from: a */
    private final bmxv f104598a;

    /* renamed from: b */
    private final bmxv f104599b;

    public bcny(bmxv bmxv, bmxv bmxv2) {
        this.f104598a = bmxv;
        this.f104599b = bmxv2;
    }

    /* renamed from: a */
    public final bmxv mo57029a() {
        return this.f104598a;
    }

    /* renamed from: b */
    public final bmxv mo57030b() {
        return this.f104599b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcoa) {
            bcoa bcoa = (bcoa) obj;
            return this.f104598a.equals(bcoa.mo57029a()) && this.f104599b.equals(bcoa.mo57030b());
        }
    }

    public final int hashCode() {
        return ((this.f104598a.hashCode() ^ 1000003) * 1000003) ^ this.f104599b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104598a);
        String valueOf2 = String.valueOf(this.f104599b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 70 + String.valueOf(valueOf2).length());
        sb.append("LighterMessageTypeDetail{intendedRenderingType=");
        sb.append(valueOf);
        sb.append(", actualRenderingType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
