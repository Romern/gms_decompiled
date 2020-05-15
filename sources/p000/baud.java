package p000;

/* renamed from: baud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baud extends bauu {

    /* renamed from: a */
    public final boolean f101756a;

    /* renamed from: b */
    public final boolean f101757b;

    /* renamed from: c */
    public final bmxv f101758c;

    /* renamed from: d */
    public final bmxv f101759d;

    public baud(boolean z, boolean z2, bmxv bmxv, bmxv bmxv2) {
        this.f101756a = z;
        this.f101757b = z2;
        this.f101758c = bmxv;
        this.f101759d = bmxv2;
    }

    /* renamed from: a */
    public final boolean mo55974a() {
        return this.f101756a;
    }

    /* renamed from: b */
    public final boolean mo55975b() {
        return this.f101757b;
    }

    /* renamed from: c */
    public final bmxv mo55976c() {
        return this.f101758c;
    }

    /* renamed from: d */
    public final bmxv mo55977d() {
        return this.f101759d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bauu) {
            bauu bauu = (bauu) obj;
            return this.f101756a == bauu.mo55974a() && this.f101757b == bauu.mo55975b() && this.f101758c.equals(bauu.mo55976c()) && this.f101759d.equals(bauu.mo55977d());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((!this.f101756a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (this.f101757b) {
            i = 1231;
        }
        return ((((i2 ^ i) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.f101756a;
        boolean z2 = this.f101757b;
        String valueOf = String.valueOf(this.f101758c);
        String valueOf2 = String.valueOf(this.f101759d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 120 + String.valueOf(valueOf2).length());
        sb.append("GetFileGroupsByFilterRequest{includeAllGroups=");
        sb.append(z);
        sb.append(", groupWithNoAccountOnly=");
        sb.append(z2);
        sb.append(", groupNameOptional=");
        sb.append(valueOf);
        sb.append(", accountOptional=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
