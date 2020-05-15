package p000;

/* renamed from: bmwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwn extends bmwm {

    /* renamed from: a */
    private final char f131142a;

    /* renamed from: b */
    private final char f131143b;

    public bmwn(char c, char c2) {
        bmxy.m108588a(c2 >= c);
        this.f131142a = c;
        this.f131143b = c2;
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return this.f131142a <= c && c <= this.f131143b;
    }

    public final String toString() {
        String d = bmwx.m108503d(this.f131142a);
        String d2 = bmwx.m108503d(this.f131143b);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 27 + String.valueOf(d2).length());
        sb.append("CharMatcher.inRange('");
        sb.append(d);
        sb.append("', '");
        sb.append(d2);
        sb.append("')");
        return sb.toString();
    }
}
