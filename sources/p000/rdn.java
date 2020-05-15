package p000;

import java.util.Arrays;

/* renamed from: rdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rdn {

    /* renamed from: a */
    public final String f42749a;

    /* renamed from: b */
    public final long f42750b;

    /* renamed from: c */
    public final long f42751c;

    /* renamed from: d */
    public final long f42752d;

    public rdn(String str, long j, long j2, long j3) {
        this.f42749a = str;
        this.f42750b = j;
        this.f42751c = j2;
        this.f42752d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rdn) {
            rdn rdn = (rdn) obj;
            return this.f42749a.equals(rdn.f42749a) && this.f42750b == rdn.f42750b && this.f42751c == rdn.f42751c && this.f42752d == rdn.f42752d;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42749a, Long.valueOf(this.f42750b), Long.valueOf(this.f42751c), Long.valueOf(this.f42752d)});
    }

    public final String toString() {
        String str = this.f42749a;
        long j = this.f42750b;
        long j2 = this.f42751c;
        long j3 = this.f42752d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 102);
        sb.append("(log source:");
        sb.append(str);
        sb.append(" creation:");
        sb.append(j);
        sb.append(" deletion:");
        sb.append(j2);
        sb.append(" current:");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
