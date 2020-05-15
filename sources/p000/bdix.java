package p000;

/* renamed from: bdix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdix {

    /* renamed from: a */
    public final String f105712a;

    /* renamed from: b */
    public final int f105713b;

    /* renamed from: c */
    final /* synthetic */ bdiy f105714c;

    public bdix(bdiy bdiy) {
        this.f105714c = bdiy;
        this.f105712a = "";
        this.f105713b = 0;
    }

    public bdix(bdiy bdiy, bdix bdix, String str) {
        this.f105714c = bdiy;
        if (bdix.f105713b != 0) {
            String str2 = bdix.f105712a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append('/');
            sb.append(str);
            str = sb.toString();
        }
        this.f105712a = str;
        this.f105713b = bdix.f105713b + 1;
    }
}
