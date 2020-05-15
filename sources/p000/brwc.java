package p000;

import java.net.URI;

/* renamed from: brwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brwc extends brww {

    /* renamed from: a */
    public final URI f143504a;

    /* renamed from: b */
    public final long f143505b;

    /* renamed from: c */
    public final Integer f143506c;

    /* renamed from: d */
    public final Integer f143507d;

    public brwc(URI uri, long j, Integer num, Integer num2) {
        this.f143504a = uri;
        this.f143505b = j;
        this.f143506c = num;
        this.f143507d = num2;
    }

    /* renamed from: a */
    public final URI mo70039a() {
        return this.f143504a;
    }

    /* renamed from: b */
    public final long mo70040b() {
        return this.f143505b;
    }

    /* renamed from: c */
    public final Integer mo70041c() {
        return this.f143506c;
    }

    /* renamed from: d */
    public final Integer mo70042d() {
        return this.f143507d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brww)) {
            return false;
        }
        brww brww = (brww) obj;
        return this.f143504a.equals(brww.mo70039a()) && this.f143505b == brww.mo70040b() && ((num = this.f143506c) == null ? brww.mo70041c() == null : num.equals(brww.mo70041c())) && ((num2 = this.f143507d) == null ? brww.mo70042d() == null : num2.equals(brww.mo70042d()));
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f143504a.hashCode();
        long j = this.f143505b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Integer num = this.f143506c;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 ^ i) * 1000003;
        Integer num2 = this.f143507d;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f143504a);
        long j = this.f143505b;
        String valueOf2 = String.valueOf(this.f143506c);
        String valueOf3 = String.valueOf(this.f143507d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 106 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChannelRuntimeConfig{uri=");
        sb.append(valueOf);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(j);
        sb.append(", trafficStatsUid=");
        sb.append(valueOf2);
        sb.append(", trafficStatsTag=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
