package p000;

/* renamed from: bhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhv extends bhw {

    /* renamed from: a */
    public String f3252a;

    public bhv() {
    }

    /* renamed from: a */
    public final String mo3133a() {
        String str = this.f3252a;
        this.f3252a = "";
        return str;
    }

    public final String toString() {
        String str = this.f3253b;
        String str2 = this.f3252a;
        String str3 = this.f3257f;
        String str4 = this.f3258g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 3 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        return sb.toString();
    }

    public bhv(String str) {
        String[] split = str.split("-");
        if (split.length == 4) {
            this.f3253b = split[0];
            this.f3257f = split[2];
            this.f3258g = split[3];
            return;
        }
        throw new bfq(bha.INVALID_DATA);
    }
}
