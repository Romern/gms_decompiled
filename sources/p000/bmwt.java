package p000;

/* renamed from: bmwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmwt extends bmwx {

    /* renamed from: a */
    final bmwx f131150a;

    public bmwt(bmwx bmwx) {
        bmxy.m108581a(bmwx);
        this.f131150a = bmwx;
    }

    /* renamed from: a */
    public final bmwx mo66832a() {
        return this.f131150a;
    }

    /* renamed from: b */
    public final boolean mo66835b(CharSequence charSequence) {
        return this.f131150a.mo66836c(charSequence);
    }

    /* renamed from: c */
    public final boolean mo66836c(CharSequence charSequence) {
        return this.f131150a.mo66835b(charSequence);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131150a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
        sb.append(valueOf);
        sb.append(".negate()");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo66828a(char c) {
        return !this.f131150a.mo66828a(c);
    }
}
