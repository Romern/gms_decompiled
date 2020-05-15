package p000;

/* renamed from: yen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yen extends yel {

    /* renamed from: a */
    private Integer f53704a = null;

    public yen(int i) {
        super(i);
    }

    /* renamed from: a */
    public final caaw mo30398a(long j) {
        Integer num = this.f53704a;
        if (num != null) {
            return yyp.m45047a(num.intValue());
        }
        return caaw.f172379i;
    }

    /* renamed from: b */
    public final double mo30399b(cadn cadn) {
        caaw a = mo30397a(cadn);
        if (!yyp.m45052c(a) || (a.f172381a & 1) == 0) {
            return 1.0d;
        }
        Integer num = this.f53704a;
        if (num == null) {
            this.f53704a = Integer.valueOf(a.f172382b);
            return 1.0d;
        } else if (num.equals(Integer.valueOf(a.f172382b))) {
            return 1.0d;
        } else {
            this.f53704a = 0;
            return 1.0d;
        }
    }
}
