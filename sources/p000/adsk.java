package p000;

/* renamed from: adsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adsk extends adsr {

    /* renamed from: a */
    private final int f62624a;

    /* renamed from: b */
    private final String f62625b;

    /* renamed from: c */
    private final String f62626c;

    /* renamed from: d */
    private final Integer f62627d;

    /* renamed from: e */
    private final Integer f62628e;

    /* renamed from: f */
    private final long f62629f;

    /* renamed from: g */
    private final String f62630g;

    /* renamed from: h */
    private final String f62631h;

    /* renamed from: i */
    private final String f62632i;

    /* renamed from: j */
    private final int f62633j;

    /* renamed from: k */
    private final String f62634k;

    /* renamed from: l */
    private final String f62635l;

    /* renamed from: m */
    private final boolean f62636m;

    public adsk(int i, String str, String str2, Integer num, Integer num2, long j, String str3, String str4, String str5, int i2, String str6, String str7, boolean z) {
        this.f62624a = i;
        this.f62625b = str;
        this.f62626c = str2;
        this.f62627d = num;
        this.f62628e = num2;
        this.f62629f = j;
        this.f62630g = str3;
        this.f62631h = str4;
        this.f62632i = str5;
        this.f62633j = i2;
        this.f62634k = str6;
        this.f62635l = str7;
        this.f62636m = z;
    }

    /* renamed from: a */
    public final int mo33760a() {
        return this.f62624a;
    }

    /* renamed from: b */
    public final String mo33761b() {
        return this.f62625b;
    }

    /* renamed from: c */
    public final String mo33762c() {
        return this.f62626c;
    }

    /* renamed from: d */
    public final Integer mo33763d() {
        return this.f62627d;
    }

    /* renamed from: e */
    public final Integer mo33764e() {
        return this.f62628e;
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
        if (!(obj instanceof adsr)) {
            return false;
        }
        adsr adsr = (adsr) obj;
        return this.f62624a == adsr.mo33760a() && this.f62625b.equals(adsr.mo33761b()) && this.f62626c.equals(adsr.mo33762c()) && ((num = this.f62627d) == null ? adsr.mo33763d() == null : num.equals(adsr.mo33763d())) && ((num2 = this.f62628e) == null ? adsr.mo33764e() == null : num2.equals(adsr.mo33764e())) && this.f62629f == adsr.mo33766f() && ((str = this.f62630g) == null ? adsr.mo33767g() == null : str.equals(adsr.mo33767g())) && ((str2 = this.f62631h) == null ? adsr.mo33768h() == null : str2.equals(adsr.mo33768h())) && ((str3 = this.f62632i) == null ? adsr.mo33770i() == null : str3.equals(adsr.mo33770i())) && this.f62633j == adsr.mo33771j() && this.f62634k.equals(adsr.mo33772k()) && ((str4 = this.f62635l) == null ? adsr.mo33773l() == null : str4.equals(adsr.mo33773l())) && this.f62636m == adsr.mo33774m();
    }

    /* renamed from: f */
    public final long mo33766f() {
        return this.f62629f;
    }

    /* renamed from: g */
    public final String mo33767g() {
        return this.f62630g;
    }

    /* renamed from: h */
    public final String mo33768h() {
        return this.f62631h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = (((((this.f62624a ^ 1000003) * 1000003) ^ this.f62625b.hashCode()) * 1000003) ^ this.f62626c.hashCode()) * 1000003;
        Integer num = this.f62627d;
        int i6 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode ^ i) * 1000003;
        Integer num2 = this.f62628e;
        if (num2 != null) {
            i2 = num2.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f62629f;
        int i8 = (((i7 ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str = this.f62630g;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 ^ i3) * 1000003;
        String str2 = this.f62631h;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 ^ i4) * 1000003;
        String str3 = this.f62632i;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int hashCode2 = (((((i10 ^ i5) * 1000003) ^ this.f62633j) * 1000003) ^ this.f62634k.hashCode()) * 1000003;
        String str4 = this.f62635l;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return ((hashCode2 ^ i6) * 1000003) ^ (!this.f62636m ? 1237 : 1231);
    }

    /* renamed from: i */
    public final String mo33770i() {
        return this.f62632i;
    }

    /* renamed from: j */
    public final int mo33771j() {
        return this.f62633j;
    }

    /* renamed from: k */
    public final String mo33772k() {
        return this.f62634k;
    }

    /* renamed from: l */
    public final String mo33773l() {
        return this.f62635l;
    }

    /* renamed from: m */
    public final boolean mo33774m() {
        return this.f62636m;
    }

    public final String toString() {
        int i = this.f62624a;
        String str = this.f62625b;
        String str2 = this.f62626c;
        String valueOf = String.valueOf(this.f62627d);
        String valueOf2 = String.valueOf(this.f62628e);
        long j = this.f62629f;
        String str3 = this.f62630g;
        String str4 = this.f62631h;
        String str5 = this.f62632i;
        int i2 = this.f62633j;
        String str6 = this.f62634k;
        String str7 = this.f62635l;
        boolean z = this.f62636m;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        int length7 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 183 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str6).length() + String.valueOf(str7).length());
        sb.append("Message{id=");
        sb.append(i);
        sb.append(", messageType=");
        sb.append(str);
        sb.append(", uri=");
        sb.append(str2);
        sb.append(", messageBox=");
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
