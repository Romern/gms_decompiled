package p000;

/* renamed from: bmwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwq extends bmwm {

    /* renamed from: a */
    private final char f131147a;

    public bmwq(char c) {
        this.f131147a = c;
    }

    /* renamed from: a */
    public final bmwx mo66832a() {
        return bmwx.m108501b(this.f131147a);
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return c != this.f131147a;
    }

    /* renamed from: b */
    public final bmwx mo66834b(bmwx bmwx) {
        return bmwx.mo66828a(this.f131147a) ? bmwi.f131138a : this;
    }

    public final String toString() {
        String d = bmwx.m108503d(this.f131147a);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 21);
        sb.append("CharMatcher.isNot('");
        sb.append(d);
        sb.append("')");
        return sb.toString();
    }

    /* renamed from: a */
    public final bmwx mo66833a(bmwx bmwx) {
        return bmwx.mo66828a(this.f131147a) ? super.mo66833a(bmwx) : bmwx;
    }
}
