package p000;

/* renamed from: bbxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbxz extends bbyk {

    /* renamed from: a */
    private final bmxv f103735a;

    /* renamed from: b */
    private final int f103736b;

    public bbxz(int i, bmxv bmxv) {
        this.f103736b = i;
        this.f103735a = bmxv;
    }

    /* renamed from: a */
    public final bmxv mo56512a() {
        return this.f103735a;
    }

    /* renamed from: b */
    public final int mo56513b() {
        return this.f103736b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbyk)) {
            return false;
        }
        bbyk bbyk = (bbyk) obj;
        int i = this.f103736b;
        int b = bbyk.mo56513b();
        if (i != 0) {
            return i == b && this.f103735a.equals(bbyk.mo56512a());
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f103736b;
        if (i != 0) {
            return ((i ^ 1000003) * 1000003) ^ this.f103735a.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.f103736b;
        String str = i != 1 ? i != 2 ? "null" : "SUCCESS" : "UNSUPPORTED";
        String valueOf = String.valueOf(this.f103735a);
        StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(valueOf).length());
        sb.append("GetProfileResult{status=");
        sb.append(str);
        sb.append(", profileInfo=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
