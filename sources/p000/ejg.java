package p000;

/* renamed from: ejg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ejg extends ejl {

    /* renamed from: a */
    private final long f15135a;

    /* renamed from: b */
    private final int f15136b;

    public ejg(int i, long j) {
        this.f15136b = i;
        this.f15135a = j;
    }

    /* renamed from: a */
    public final long mo10198a() {
        return this.f15135a;
    }

    /* renamed from: b */
    public final int mo10199b() {
        return this.f15136b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejl) {
            ejl ejl = (ejl) obj;
            return this.f15136b == ejl.mo10199b() && this.f15135a == ejl.mo10198a();
        }
    }

    public final int hashCode() {
        int i = this.f15136b;
        long j = this.f15135a;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.f15136b;
        String str = i != 1 ? i != 2 ? "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK";
        long j = this.f15135a;
        StringBuilder sb = new StringBuilder(str.length() + 68);
        sb.append("BackendResponse{status=");
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
