package p000;

/* renamed from: bcgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcgz extends bcia {

    /* renamed from: a */
    public final bcuu f104149a;

    /* renamed from: b */
    public final boolean f104150b;

    /* renamed from: c */
    public final bchz f104151c;

    public bcgz(bcuu bcuu, boolean z, bchz bchz) {
        this.f104149a = bcuu;
        this.f104150b = z;
        this.f104151c = bchz;
    }

    /* renamed from: a */
    public final bcuu mo56868a() {
        return this.f104149a;
    }

    /* renamed from: b */
    public final boolean mo56869b() {
        return this.f104150b;
    }

    /* renamed from: c */
    public final bchz mo56870c() {
        return this.f104151c;
    }

    /* renamed from: d */
    public final bchx mo56871d() {
        return new bchx(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bcia)) {
            return false;
        }
        bcia bcia = (bcia) obj;
        bcuu bcuu = this.f104149a;
        if (bcuu == null ? bcia.mo56868a() == null : bcuu.equals(bcia.mo56868a())) {
            return this.f104150b == bcia.mo56869b() && this.f104151c.equals(bcia.mo56870c());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        bcuu bcuu = this.f104149a;
        if (bcuu != null) {
            i = bcuu.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i ^ 1000003) * 1000003;
        if (!this.f104150b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ this.f104151c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104149a);
        boolean z = this.f104150b;
        String valueOf2 = String.valueOf(this.f104151c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67 + String.valueOf(valueOf2).length());
        sb.append("TachyonMessage{suggestionList=");
        sb.append(valueOf);
        sb.append(", skipNotification=");
        sb.append(z);
        sb.append(", oneOfType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
