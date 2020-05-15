package p000;

/* renamed from: yem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yem extends yel {

    /* renamed from: a */
    private boolean f53702a = false;

    /* renamed from: b */
    private Integer f53703b = null;

    public yem(int i) {
        super(i);
    }

    /* renamed from: a */
    public final caaw mo30398a(long j) {
        Integer num = this.f53703b;
        if (num != null) {
            return yyp.m45047a(num.intValue());
        }
        return caaw.f172379i;
    }

    /* renamed from: b */
    public final double mo30399b(cadn cadn) {
        Integer num;
        caaw a = mo30397a(cadn);
        if (yyp.m45052c(a)) {
            num = Integer.valueOf(a.f172382b);
        } else {
            num = null;
        }
        if (!this.f53702a) {
            this.f53703b = num;
            this.f53702a = true;
            return 1.0d;
        }
        Integer num2 = this.f53703b;
        if (num2 == null || num2.equals(num)) {
            return 1.0d;
        }
        this.f53703b = null;
        return 1.0d;
    }
}
