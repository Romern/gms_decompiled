package p000;

/* renamed from: ambj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ambj implements amex {

    /* renamed from: a */
    public final String f74635a;

    /* renamed from: c */
    private final String f74636c;

    /* renamed from: d */
    private final double f74637d;

    /* renamed from: e */
    private final double f74638e;

    /* renamed from: f */
    private final double f74639f;

    /* renamed from: g */
    private final double f74640g;

    /* renamed from: h */
    private final double f74641h;

    /* renamed from: i */
    private final String f74642i;

    /* renamed from: j */
    private final String f74643j;

    /* renamed from: k */
    private final String f74644k;

    /* renamed from: l */
    private final String f74645l;

    /* renamed from: m */
    private final String f74646m;

    public ambj(String str, String str2) {
        this(str, str2, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, null, null);
    }

    /* renamed from: a */
    public final String mo41104a() {
        return this.f74635a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ambj) {
            return sdg.m34949a(this.f74635a, ((ambj) obj).f74635a);
        }
        return false;
    }

    public final String toString() {
        String str = this.f74635a;
        String str2 = "null";
        if (str == null) {
            str = str2;
        }
        String str3 = this.f74636c;
        if (str3 != null) {
            str2 = str3;
        }
        double d = this.f74637d;
        String str4 = this.f74642i;
        double d2 = this.f74638e;
        String str5 = this.f74643j;
        double d3 = this.f74639f;
        String str6 = this.f74644k;
        double d4 = this.f74640g;
        String str7 = this.f74645l;
        double d5 = this.f74641h;
        String str8 = this.f74646m;
        int length = str.length();
        int length2 = str2.length();
        int length3 = String.valueOf(str4).length();
        int length4 = String.valueOf(str5).length();
        int length5 = String.valueOf(str6).length();
        StringBuilder sb = new StringBuilder(length + 172 + length2 + length3 + length4 + length5 + String.valueOf(str7).length() + String.valueOf(str8).length());
        sb.append("EmailAddress:[Value=");
        sb.append(str);
        sb.append(" Type=");
        sb.append(str2);
        sb.append(" a1=");
        sb.append(d);
        sb.append(",");
        sb.append(str4);
        sb.append(" a2=");
        sb.append(d2);
        sb.append(",");
        sb.append(str5);
        sb.append(" a3=");
        sb.append(d3);
        sb.append(",");
        sb.append(str6);
        sb.append(" a4=");
        sb.append(d4);
        sb.append(",");
        sb.append(str7);
        sb.append(" a5=");
        sb.append(d5);
        sb.append(",");
        sb.append(str8);
        sb.append("]");
        return sb.toString();
    }

    public ambj(String str, String str2, double d, double d2, double d3, double d4, double d5, String str3, String str4, String str5, String str6, String str7) {
        this.f74636c = str;
        this.f74635a = str2;
        this.f74637d = d;
        this.f74638e = d2;
        this.f74639f = d3;
        this.f74640g = d4;
        this.f74641h = d5;
        this.f74642i = str3;
        this.f74643j = str4;
        this.f74644k = str5;
        this.f74645l = str6;
        this.f74646m = str7;
    }
}
