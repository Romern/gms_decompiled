package p000;

/* renamed from: aclt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aclt extends acnx {

    /* renamed from: a */
    private final int f60116a;

    /* renamed from: b */
    private final String f60117b;

    /* renamed from: c */
    private final String f60118c;

    /* renamed from: d */
    private final Integer f60119d;

    /* renamed from: e */
    private final Integer f60120e;

    /* renamed from: f */
    private final long f60121f;

    /* renamed from: g */
    private final String f60122g;

    /* renamed from: h */
    private final String f60123h;

    /* renamed from: i */
    private final String f60124i;

    /* renamed from: j */
    private final int f60125j;

    /* renamed from: k */
    private final String f60126k;

    /* renamed from: l */
    private final String f60127l;

    /* renamed from: m */
    private final boolean f60128m;

    public aclt(int i, String str, String str2, Integer num, Integer num2, long j, String str3, String str4, String str5, int i2, String str6, String str7, boolean z) {
        this.f60116a = i;
        this.f60117b = str;
        this.f60118c = str2;
        this.f60119d = num;
        this.f60120e = num2;
        this.f60121f = j;
        this.f60122g = str3;
        this.f60123h = str4;
        this.f60124i = str5;
        this.f60125j = i2;
        this.f60126k = str6;
        this.f60127l = str7;
        this.f60128m = z;
    }

    /* renamed from: a */
    public final int mo32853a() {
        return this.f60116a;
    }

    /* renamed from: b */
    public final String mo32854b() {
        return this.f60117b;
    }

    /* renamed from: c */
    public final String mo32855c() {
        return this.f60118c;
    }

    /* renamed from: d */
    public final Integer mo32856d() {
        return this.f60119d;
    }

    /* renamed from: e */
    public final Integer mo32857e() {
        return this.f60120e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof acnx)) {
            return false;
        }
        acnx acnx = (acnx) obj;
        return this.f60116a == acnx.mo32853a() && this.f60117b.equals(acnx.mo32854b()) && this.f60118c.equals(acnx.mo32855c()) && ((num = this.f60119d) == null ? acnx.mo32856d() == null : num.equals(acnx.mo32856d())) && ((num2 = this.f60120e) == null ? acnx.mo32857e() == null : num2.equals(acnx.mo32857e())) && this.f60121f == acnx.mo32859f() && ((str = this.f60122g) == null ? acnx.mo32860g() == null : str.equals(acnx.mo32860g())) && ((str2 = this.f60123h) == null ? acnx.mo32861h() == null : str2.equals(acnx.mo32861h())) && ((str3 = this.f60124i) == null ? acnx.mo32863i() == null : str3.equals(acnx.mo32863i())) && this.f60125j == acnx.mo32864j() && this.f60126k.equals(acnx.mo32865k()) && ((str4 = this.f60127l) == null ? acnx.mo32866l() == null : str4.equals(acnx.mo32866l())) && this.f60128m == acnx.mo32867m();
    }

    /* renamed from: f */
    public final long mo32859f() {
        return this.f60121f;
    }

    /* renamed from: g */
    public final String mo32860g() {
        return this.f60122g;
    }

    /* renamed from: h */
    public final String mo32861h() {
        return this.f60123h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = (((((this.f60116a ^ 1000003) * 1000003) ^ this.f60117b.hashCode()) * 1000003) ^ this.f60118c.hashCode()) * 1000003;
        Integer num = this.f60119d;
        int i6 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode ^ i) * 1000003;
        Integer num2 = this.f60120e;
        if (num2 != null) {
            i2 = num2.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f60121f;
        int i8 = (((i7 ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str = this.f60122g;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 ^ i3) * 1000003;
        String str2 = this.f60123h;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 ^ i4) * 1000003;
        String str3 = this.f60124i;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode2 = (((((i10 ^ i5) * 1000003) ^ this.f60125j) * 1000003) ^ this.f60126k.hashCode()) * 1000003;
        String str4 = this.f60127l;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return ((hashCode2 ^ i6) * 1000003) ^ (!this.f60128m ? 1237 : 1231);
    }

    /* renamed from: i */
    public final String mo32863i() {
        return this.f60124i;
    }

    /* renamed from: j */
    public final int mo32864j() {
        return this.f60125j;
    }

    /* renamed from: k */
    public final String mo32865k() {
        return this.f60126k;
    }

    /* renamed from: l */
    public final String mo32866l() {
        return this.f60127l;
    }

    /* renamed from: m */
    public final boolean mo32867m() {
        return this.f60128m;
    }

    public final String toString() {
        int i = this.f60116a;
        String str = this.f60117b;
        String str2 = this.f60118c;
        String valueOf = String.valueOf(this.f60119d);
        String valueOf2 = String.valueOf(this.f60120e);
        long j = this.f60121f;
        String str3 = this.f60122g;
        String str4 = this.f60123h;
        String str5 = this.f60124i;
        int i2 = this.f60125j;
        String str6 = this.f60126k;
        String str7 = this.f60127l;
        boolean z = this.f60128m;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        int length7 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 177 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append("Message{id=");
        sb.append(i);
        sb.append(", messageType=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(valueOf);
        sb.append(", threadId=");
        sb.append(valueOf2);
        sb.append(", dateMillis=");
        sb.append(j);
        sb.append(", address=");
        sb.append(str3);
        sb.append(", subject=");
        sb.append(str4);
        sb.append(", body=");
        sb.append(str5);
        sb.append(", score=");
        sb.append(i2);
        sb.append(", contentType=");
        sb.append(str6);
        sb.append(", mediaUri=");
        sb.append(str7);
        sb.append(", read=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
