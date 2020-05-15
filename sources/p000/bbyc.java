package p000;

/* renamed from: bbyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbyc extends bbyq {

    /* renamed from: a */
    private final bmxv f103742a;

    /* renamed from: b */
    private final bmxv f103743b;

    /* renamed from: c */
    private final bmxv f103744c;

    /* renamed from: d */
    private final int f103745d;

    public bbyc(int i, bmxv bmxv, bmxv bmxv2, bmxv bmxv3) {
        this.f103745d = i;
        this.f103742a = bmxv;
        this.f103743b = bmxv2;
        this.f103744c = bmxv3;
    }

    /* renamed from: a */
    public final bmxv mo56528a() {
        return this.f103742a;
    }

    /* renamed from: b */
    public final bmxv mo56529b() {
        return this.f103743b;
    }

    /* renamed from: c */
    public final bmxv mo56530c() {
        return this.f103744c;
    }

    /* renamed from: d */
    public final int mo56531d() {
        return this.f103745d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbyq)) {
            return false;
        }
        bbyq bbyq = (bbyq) obj;
        int i = this.f103745d;
        int d = bbyq.mo56531d();
        if (i != 0) {
            return i == d && this.f103742a.equals(bbyq.mo56528a()) && this.f103743b.equals(bbyq.mo56529b()) && this.f103744c.equals(bbyq.mo56530c());
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f103745d;
        if (i != 0) {
            return ((((((i ^ 1000003) * 1000003) ^ this.f103742a.hashCode()) * 1000003) ^ this.f103743b.hashCode()) * 1000003) ^ this.f103744c.hashCode();
        }
        throw null;
    }

    public final String toString() {
        int i = this.f103745d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RETRY" : "FAILURE" : "SUCCESS" : "UNKNOWN";
        String valueOf = String.valueOf(this.f103742a);
        String valueOf2 = String.valueOf(this.f103743b);
        String valueOf3 = String.valueOf(this.f103744c);
        StringBuilder sb = new StringBuilder(str.length() + 77 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RegisterRefreshResult{status=");
        sb.append(str);
        sb.append(", accountContext=");
        sb.append(valueOf);
        sb.append(", authToken=");
        sb.append(valueOf2);
        sb.append(", serverTimestamp=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
