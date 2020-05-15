package p000;

/* renamed from: chzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chzs implements chxv {

    /* renamed from: a */
    final chuv f189620a;

    /* renamed from: b */
    private final chxt f189621b;

    public chzs(chuv chuv, chxt chxt) {
        bmxy.m108589a(!chuv.mo85689a(), "error must not be OK");
        this.f189620a = chuv;
        this.f189621b = chxt;
    }

    /* renamed from: a */
    public final chxs mo85744a(chtv chtv, chtr chtr, chqo chqo) {
        return new chzr(this.f189620a, this.f189621b);
    }

    /* renamed from: b */
    public final chse mo85595b() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
