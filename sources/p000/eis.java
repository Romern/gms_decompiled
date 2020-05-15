package p000;

import java.util.Map;

/* renamed from: eis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eis extends eix {

    /* renamed from: a */
    private final String f15092a;

    /* renamed from: b */
    private final Integer f15093b;

    /* renamed from: c */
    private final eiv f15094c;

    /* renamed from: d */
    private final long f15095d;

    /* renamed from: e */
    private final long f15096e;

    /* renamed from: f */
    private final Map f15097f;

    public eis(String str, Integer num, eiv eiv, long j, long j2, Map map) {
        this.f15092a = str;
        this.f15093b = num;
        this.f15094c = eiv;
        this.f15095d = j;
        this.f15096e = j2;
        this.f15097f = map;
    }

    /* renamed from: a */
    public final String mo10162a() {
        return this.f15092a;
    }

    /* renamed from: b */
    public final Integer mo10163b() {
        return this.f15093b;
    }

    /* renamed from: c */
    public final eiv mo10164c() {
        return this.f15094c;
    }

    /* renamed from: d */
    public final long mo10165d() {
        return this.f15095d;
    }

    /* renamed from: e */
    public final long mo10166e() {
        return this.f15096e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eix) {
            eix eix = (eix) obj;
            return this.f15092a.equals(eix.mo10162a()) && ((num = this.f15093b) == null ? eix.mo10163b() == null : num.equals(eix.mo10163b())) && this.f15094c.equals(eix.mo10164c()) && this.f15095d == eix.mo10165d() && this.f15096e == eix.mo10166e() && this.f15097f.equals(eix.mo10168f());
        }
    }

    /* renamed from: f */
    public final Map mo10168f() {
        return this.f15097f;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f15092a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f15093b;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.f15094c.hashCode();
        long j = this.f15095d;
        long j2 = this.f15096e;
        return ((((((((hashCode ^ i) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f15097f.hashCode();
    }

    public final String toString() {
        String str = this.f15092a;
        String valueOf = String.valueOf(this.f15093b);
        String valueOf2 = String.valueOf(this.f15094c);
        long j = this.f15095d;
        long j2 = this.f15096e;
        String valueOf3 = String.valueOf(this.f15097f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 137 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("EventInternal{transportName=");
        sb.append(str);
        sb.append(", code=");
        sb.append(valueOf);
        sb.append(", encodedPayload=");
        sb.append(valueOf2);
        sb.append(", eventMillis=");
        sb.append(j);
        sb.append(", uptimeMillis=");
        sb.append(j2);
        sb.append(", autoMetadata=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
