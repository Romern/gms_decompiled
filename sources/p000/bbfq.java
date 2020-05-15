package p000;

/* renamed from: bbfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbfq extends bbfu {

    /* renamed from: a */
    public final boolean f102561a;

    /* renamed from: b */
    public final int f102562b;

    public bbfq(boolean z, int i) {
        this.f102561a = z;
        this.f102562b = i;
    }

    /* renamed from: a */
    public final boolean mo56102a() {
        return this.f102561a;
    }

    /* renamed from: b */
    public final int mo56103b() {
        return this.f102562b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbfu) {
            bbfu bbfu = (bbfu) obj;
            return this.f102561a == bbfu.mo56102a() && (this.f102562b == 0 ? bbfu.mo56103b() == 0 : bbfu.mo56103b() == 1);
        }
    }

    public final int hashCode() {
        return (((!this.f102561a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (this.f102562b != 0 ? bbjj.m88092b(1) : 0);
    }

    public final String toString() {
        boolean z = this.f102561a;
        String a = bbjj.m88091a(this.f102562b);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 55);
        sb.append("LookupParams{forceRefreshCache=");
        sb.append(z);
        sb.append(", syncContextType=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
