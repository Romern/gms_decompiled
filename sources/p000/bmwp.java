package p000;

/* renamed from: bmwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwp extends bmwm {

    /* renamed from: a */
    private final char f131145a;

    /* renamed from: b */
    private final char f131146b;

    public bmwp(char c, char c2) {
        this.f131145a = c;
        this.f131146b = c2;
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return c == this.f131145a || c == this.f131146b;
    }

    public final String toString() {
        String d = bmwx.m108503d(this.f131145a);
        String d2 = bmwx.m108503d(this.f131146b);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21 + String.valueOf(d2).length());
        sb.append("CharMatcher.anyOf(\"");
        sb.append(d);
        sb.append(d2);
        sb.append("\")");
        return sb.toString();
    }
}
