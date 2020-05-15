package p000;

/* renamed from: bcrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrg extends bcos {

    /* renamed from: a */
    private final bmxv f104699a;

    /* renamed from: b */
    private final bmxv f104700b;

    public bcrg(bmxv bmxv, bmxv bmxv2) {
        this.f104699a = bmxv;
        this.f104700b = bmxv2;
    }

    /* renamed from: a */
    public final bmxv mo57107a() {
        return this.f104699a;
    }

    /* renamed from: b */
    public final bmxv mo57108b() {
        return this.f104700b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcos) {
            bcos bcos = (bcos) obj;
            return this.f104699a.equals(bcos.mo57107a()) && this.f104700b.equals(bcos.mo57108b());
        }
    }

    public final int hashCode() {
        return ((this.f104699a.hashCode() ^ 1000003) * 1000003) ^ this.f104700b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104699a);
        String valueOf2 = String.valueOf(this.f104700b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 69 + String.valueOf(valueOf2).length());
        sb.append("OverlayActionPayload{reactionOverlayHeader=");
        sb.append(valueOf);
        sb.append(", stackedReactionWebView=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
