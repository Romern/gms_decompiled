package p000;

/* renamed from: anas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anas extends anbb {

    /* renamed from: a */
    public final String f76506a;

    /* renamed from: b */
    public final long f76507b;

    /* renamed from: c */
    public final long f76508c;

    /* renamed from: d */
    public final int f76509d;

    /* renamed from: e */
    public final boolean f76510e;

    /* renamed from: f */
    public final int f76511f;

    /* renamed from: g */
    private final int f76512g;

    public anas(String str, long j, long j2, int i, int i2, int i3, boolean z) {
        this.f76506a = str;
        this.f76507b = j;
        this.f76508c = j2;
        this.f76509d = i;
        this.f76511f = i2;
        this.f76512g = i3;
        this.f76510e = z;
    }

    /* renamed from: a */
    public final String mo41610a() {
        return this.f76506a;
    }

    /* renamed from: b */
    public final long mo41611b() {
        return this.f76507b;
    }

    /* renamed from: c */
    public final long mo41612c() {
        return this.f76508c;
    }

    /* renamed from: d */
    public final int mo41613d() {
        return this.f76509d;
    }

    /* renamed from: e */
    public final int mo41614e() {
        return this.f76512g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anbb) {
            anbb anbb = (anbb) obj;
            if (this.f76506a.equals(anbb.mo41610a()) && this.f76507b == anbb.mo41611b() && this.f76508c == anbb.mo41612c() && this.f76509d == anbb.mo41613d()) {
                int i = this.f76511f;
                int g = anbb.mo41617g();
                if (i != 0) {
                    return i == g && this.f76512g == anbb.mo41614e() && this.f76510e == anbb.mo41616f();
                }
                throw null;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo41616f() {
        return this.f76510e;
    }

    /* renamed from: g */
    public final int mo41617g() {
        return this.f76511f;
    }

    public final int hashCode() {
        int hashCode = this.f76506a.hashCode();
        long j = this.f76507b;
        long j2 = this.f76508c;
        int i = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f76509d) * 1000003;
        int i2 = this.f76511f;
        if (i2 != 0) {
            return ((((i ^ i2) * 1000003) ^ this.f76512g) * 1000003) ^ (!this.f76510e ? 1237 : 1231);
        }
        throw null;
    }

    public final String toString() {
        String str = this.f76506a;
        long j = this.f76507b;
        long j2 = this.f76508c;
        int i = this.f76509d;
        int i2 = this.f76511f;
        String valueOf = String.valueOf(i2 != 0 ? Integer.toString(i2 - 1) : "null");
        int i3 = this.f76512g;
        boolean z = this.f76510e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 190 + String.valueOf(valueOf).length());
        sb.append("SyncStatsEvent{name=");
        sb.append(str);
        sb.append(", startTimeMicroSec=");
        sb.append(j);
        sb.append(", timeDurationMicroSec=");
        sb.append(j2);
        sb.append(", subEventCount=");
        sb.append(i);
        sb.append(", networkType=");
        sb.append(valueOf);
        sb.append(", payloadSize=");
        sb.append(i3);
        sb.append(", networkEvent=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
