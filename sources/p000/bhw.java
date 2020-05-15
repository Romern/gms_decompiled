package p000;

/* renamed from: bhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhw extends bia {

    /* renamed from: b */
    public String f3253b;

    /* renamed from: c */
    public String f3254c;

    /* renamed from: d */
    public String f3255d;

    /* renamed from: e */
    public String f3256e;

    /* renamed from: f */
    public String f3257f;

    /* renamed from: g */
    public String f3258g;

    public bhw() {
    }

    /* renamed from: b */
    public final String mo3135b() {
        String str = this.f3254c;
        this.f3254c = "";
        return str;
    }

    /* renamed from: c */
    public final String mo3136c() {
        String str = this.f3255d;
        this.f3255d = "";
        return str;
    }

    public String toString() {
        String str = this.f3253b;
        String str2 = this.f3254c;
        String str3 = this.f3255d;
        String str4 = this.f3256e;
        String str5 = this.f3257f;
        String str6 = this.f3258g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 5 + length2 + length3 + length4 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        sb.append("-");
        sb.append(str5);
        sb.append("-");
        sb.append(str6);
        return sb.toString();
    }

    public bhw(String str) {
        String[] split = str.split("-");
        if (split.length == 6) {
            this.f3253b = split[0];
            this.f3256e = split[3];
            this.f3257f = split[4];
            this.f3258g = split[5];
            return;
        }
        throw new bfq(bha.INVALID_DATA);
    }
}
