package p000;

/* renamed from: agyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyp extends agzc {

    /* renamed from: a */
    private final String f66873a;

    /* renamed from: b */
    private final String f66874b;

    /* renamed from: c */
    private final long f66875c;

    /* renamed from: d */
    private final boolean f66876d;

    /* renamed from: e */
    private final bygb f66877e;

    /* renamed from: f */
    private final Long f66878f;

    /* renamed from: g */
    private final String f66879g;

    public agyp(String str, String str2, long j, boolean z, bygb bygb, Long l, String str3) {
        if (str != null) {
            this.f66873a = str;
            if (str2 != null) {
                this.f66874b = str2;
                this.f66875c = j;
                this.f66876d = z;
                this.f66877e = bygb;
                this.f66878f = l;
                this.f66879g = str3;
                return;
            }
            throw new NullPointerException("Null mccMnc");
        }
        throw new NullPointerException("Null iccid");
    }

    /* renamed from: a */
    public final String mo36193a() {
        return this.f66873a;
    }

    /* renamed from: b */
    public final String mo36194b() {
        return this.f66874b;
    }

    /* renamed from: c */
    public final long mo36195c() {
        return this.f66875c;
    }

    /* renamed from: d */
    public final boolean mo36196d() {
        return this.f66876d;
    }

    /* renamed from: e */
    public final bygb mo36197e() {
        return this.f66877e;
    }

    public final boolean equals(Object obj) {
        bygb bygb;
        Long l;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agzc)) {
            return false;
        }
        agzc agzc = (agzc) obj;
        return this.f66873a.equals(agzc.mo36193a()) && this.f66874b.equals(agzc.mo36194b()) && this.f66875c == agzc.mo36195c() && this.f66876d == agzc.mo36196d() && ((bygb = this.f66877e) == null ? agzc.mo36197e() == null : bygb.equals(agzc.mo36197e())) && ((l = this.f66878f) == null ? agzc.mo36199f() == null : l.equals(agzc.mo36199f())) && ((str = this.f66879g) == null ? agzc.mo36200g() == null : str.equals(agzc.mo36200g()));
    }

    /* renamed from: f */
    public final Long mo36199f() {
        return this.f66878f;
    }

    /* renamed from: g */
    public final String mo36200g() {
        return this.f66879g;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = this.f66873a.hashCode();
        int hashCode2 = this.f66874b.hashCode();
        long j = this.f66875c;
        int i4 = (((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        if (!this.f66876d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i5 = (i4 ^ i) * 1000003;
        bygb bygb = this.f66877e;
        int i6 = 0;
        if (bygb != null) {
            i2 = bygb.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i5 ^ i2) * 1000003;
        Long l = this.f66878f;
        if (l != null) {
            i3 = l.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str = this.f66879g;
        if (str != null) {
            i6 = str.hashCode();
        }
        return i8 ^ i6;
    }

    public final String toString() {
        String str = this.f66873a;
        String str2 = this.f66874b;
        long j = this.f66875c;
        boolean z = this.f66876d;
        String valueOf = String.valueOf(this.f66877e);
        String valueOf2 = String.valueOf(this.f66878f);
        String str3 = this.f66879g;
        int length = str.length();
        int length2 = str2.length();
        int length3 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 129 + length2 + length3 + String.valueOf(valueOf2).length() + String.valueOf(str3).length());
        sb.append("SimCardData{iccid=");
        sb.append(str);
        sb.append(", mccMnc=");
        sb.append(str2);
        sb.append(", simId=");
        sb.append(j);
        sb.append(", isDefaultDataSim=");
        sb.append(z);
        sb.append(", consentStatus=");
        sb.append(valueOf);
        sb.append(", consentTimestamp=");
        sb.append(valueOf2);
        sb.append(", carrierName=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
