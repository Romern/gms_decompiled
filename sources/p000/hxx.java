package p000;

/* renamed from: hxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hxx extends hyi {

    /* renamed from: a */
    private final String f20531a;

    /* renamed from: b */
    private final long f20532b;

    public hxx(String str, long j) {
        if (str != null) {
            this.f20531a = str;
            this.f20532b = j;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo12794a() {
        return this.f20531a;
    }

    /* renamed from: b */
    public final long mo12795b() {
        return this.f20532b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hyi) {
            hyi hyi = (hyi) obj;
            return this.f20531a.equals(hyi.mo12794a()) && this.f20532b == hyi.mo12795b();
        }
    }

    public final int hashCode() {
        int hashCode = this.f20531a.hashCode();
        long j = this.f20532b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.f20531a;
        long j = this.f20532b;
        StringBuilder sb = new StringBuilder(str.length() + 68);
        sb.append("NotifiedRequest{packageName=");
        sb.append(str);
        sb.append(", requestTimestamp=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
