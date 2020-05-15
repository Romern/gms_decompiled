package p000;

/* renamed from: audv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audv extends auei {

    /* renamed from: a */
    public final int f91436a;

    /* renamed from: b */
    private final String f91437b;

    /* renamed from: c */
    private final String f91438c;

    /* renamed from: d */
    private final boolean f91439d;

    /* renamed from: e */
    private final String f91440e;

    /* renamed from: f */
    private final int f91441f;

    /* renamed from: g */
    private final boolean f91442g;

    /* renamed from: h */
    private final boolean f91443h;

    /* renamed from: i */
    private final String f91444i;

    /* renamed from: j */
    private final String f91445j;

    /* renamed from: k */
    private final int f91446k;

    public audv(String str, int i, String str2, boolean z, String str3, int i2, boolean z2, boolean z3, String str4, String str5, int i3) {
        this.f91437b = str;
        this.f91436a = i;
        this.f91438c = str2;
        this.f91439d = z;
        this.f91440e = str3;
        this.f91441f = i2;
        this.f91442g = z2;
        this.f91443h = z3;
        this.f91444i = str4;
        this.f91445j = str5;
        this.f91446k = i3;
    }

    /* renamed from: a */
    public final String mo50453a() {
        return this.f91437b;
    }

    /* renamed from: b */
    public final int mo50454b() {
        return this.f91436a;
    }

    /* renamed from: c */
    public final String mo50455c() {
        return this.f91438c;
    }

    /* renamed from: d */
    public final boolean mo50456d() {
        return this.f91439d;
    }

    /* renamed from: e */
    public final String mo50457e() {
        return this.f91440e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auei) {
            auei auei = (auei) obj;
            return this.f91437b.equals(auei.mo50453a()) && this.f91436a == auei.mo50454b() && this.f91438c.equals(auei.mo50455c()) && this.f91439d == auei.mo50456d() && this.f91440e.equals(auei.mo50457e()) && this.f91441f == auei.mo50459f() && this.f91442g == auei.mo50460g() && this.f91443h == auei.mo50461h() && this.f91444i.equals(auei.mo50463i()) && this.f91445j.equals(auei.mo50464j()) && this.f91446k == auei.mo50465k();
        }
    }

    /* renamed from: f */
    public final int mo50459f() {
        return this.f91441f;
    }

    /* renamed from: g */
    public final boolean mo50460g() {
        return this.f91442g;
    }

    /* renamed from: h */
    public final boolean mo50461h() {
        return this.f91443h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (((((this.f91437b.hashCode() ^ 1000003) * 1000003) ^ this.f91436a) * 1000003) ^ this.f91438c.hashCode()) * 1000003;
        int i3 = 1237;
        if (!this.f91439d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = (((((hashCode ^ i) * 1000003) ^ this.f91440e.hashCode()) * 1000003) ^ this.f91441f) * 1000003;
        if (!this.f91442g) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = (hashCode2 ^ i2) * 1000003;
        if (this.f91443h) {
            i3 = 1231;
        }
        return ((((((i4 ^ i3) * 1000003) ^ this.f91444i.hashCode()) * 1000003) ^ this.f91445j.hashCode()) * 1000003) ^ this.f91446k;
    }

    /* renamed from: i */
    public final String mo50463i() {
        return this.f91444i;
    }

    /* renamed from: j */
    public final String mo50464j() {
        return this.f91445j;
    }

    /* renamed from: k */
    public final int mo50465k() {
        return this.f91446k;
    }

    public final String toString() {
        String str = this.f91437b;
        int i = this.f91436a;
        String str2 = this.f91438c;
        boolean z = this.f91439d;
        String str3 = this.f91440e;
        int i2 = this.f91441f;
        boolean z2 = this.f91442g;
        boolean z3 = this.f91443h;
        String str4 = this.f91444i;
        String str5 = this.f91445j;
        int i3 = this.f91446k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 253 + length2 + length3 + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("ScifiResult{detectedCarrierName=");
        sb.append(str);
        sb.append(", resultType=");
        sb.append(i);
        sb.append(", phoneNumOwner=");
        sb.append(str2);
        sb.append(", multiLine=");
        sb.append(z);
        sb.append(", userAgent=");
        sb.append(str3);
        sb.append(", lineType=");
        sb.append(i2);
        sb.append(", callForwarded=");
        sb.append(z2);
        sb.append(", callForwardNumIsSpam=");
        sb.append(z3);
        sb.append(", callForwardingCarrier=");
        sb.append(str4);
        sb.append(", callForwardingNum=");
        sb.append(str5);
        sb.append(", callForwardingLineType=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
