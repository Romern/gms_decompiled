package p000;

/* renamed from: bmwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwo extends bmwm {

    /* renamed from: a */
    private final char f131144a;

    public bmwo(char c) {
        this.f131144a = c;
    }

    /* renamed from: a */
    public final bmwx mo66832a() {
        return bmwx.m108502c(this.f131144a);
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return c == this.f131144a;
    }

    /* renamed from: b */
    public final bmwx mo66834b(bmwx bmwx) {
        return !bmwx.mo66828a(this.f131144a) ? super.mo66834b(bmwx) : bmwx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [char, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: e */
    public final String mo66838e(CharSequence charSequence) {
        return charSequence.toString().replace(this.f131144a, '.');
    }

    public final String toString() {
        String d = bmwx.m108503d(this.f131144a);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(d);
        sb.append("')");
        return sb.toString();
    }

    /* renamed from: a */
    public final bmwx mo66833a(bmwx bmwx) {
        return !bmwx.mo66828a(this.f131144a) ? bmwu.f131151a : this;
    }
}
