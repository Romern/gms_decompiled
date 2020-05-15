package p000;

/* renamed from: buka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buka {

    /* renamed from: a */
    public final String f154061a;

    /* renamed from: b */
    public final long f154062b;

    /* renamed from: c */
    public final long f154063c;

    /* renamed from: d */
    public final long f154064d;

    /* renamed from: e */
    public final long f154065e;

    public buka(String str, long j, long j2, long j3, long j4) {
        this.f154061a = str;
        this.f154062b = j;
        this.f154063c = j2;
        this.f154064d = j3;
        this.f154065e = j4;
    }

    /* renamed from: a */
    public static String m119698a(long j, long j2) {
        if (j == 0 || j2 == 0) {
            return null;
        }
        return String.format("0x%016x:0x%016x", Long.valueOf(j), Long.valueOf(j2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof buka) {
            buka buka = (buka) obj;
            return this.f154061a.equals(buka.f154061a) && this.f154062b == buka.f154062b && this.f154063c == buka.f154063c && this.f154064d == buka.f154064d && this.f154065e == buka.f154065e;
        }
    }

    public final int hashCode() {
        int hashCode = this.f154061a.hashCode();
        long j = this.f154062b;
        long j2 = this.f154063c;
        long j3 = this.f154064d;
        long j4 = this.f154065e;
        return (((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        String str = this.f154061a;
        String a = mo72753a();
        String a2 = m119698a(this.f154064d, this.f154065e);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 41 + String.valueOf(a).length() + String.valueOf(a2).length());
        sb.append("[label: ");
        sb.append(str);
        sb.append(", levelFeatureId: ");
        sb.append(a);
        sb.append(", buildingId: ");
        sb.append(a2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo72753a() {
        return m119698a(this.f154062b, this.f154063c);
    }
}
