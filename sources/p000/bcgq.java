package p000;

/* renamed from: bcgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgq extends bche {

    /* renamed from: a */
    private final bmxv f104118a;

    /* renamed from: b */
    private final boolean f104119b;

    /* renamed from: c */
    private final bmxv f104120c;

    public bcgq(bmxv bmxv, boolean z, bmxv bmxv2) {
        this.f104118a = bmxv;
        this.f104119b = z;
        this.f104120c = bmxv2;
    }

    /* renamed from: a */
    public final bmxv mo56810a() {
        return this.f104118a;
    }

    /* renamed from: b */
    public final boolean mo56811b() {
        return this.f104119b;
    }

    /* renamed from: c */
    public final bmxv mo56812c() {
        return this.f104120c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bche) {
            bche bche = (bche) obj;
            return this.f104118a.equals(bche.mo56810a()) && this.f104119b == bche.mo56811b() && this.f104120c.equals(bche.mo56812c());
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f104118a.hashCode() ^ 1000003) * 1000003;
        if (!this.f104119b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f104120c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104118a);
        boolean z = this.f104119b;
        String valueOf2 = String.valueOf(this.f104120c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
        sb.append("ChangeGroupProfile{conversationId=");
        sb.append(valueOf);
        sb.append(", syncBlockStatus=");
        sb.append(z);
        sb.append(", profileInfo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
