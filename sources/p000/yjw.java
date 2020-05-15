package p000;

/* renamed from: yjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjw {

    /* renamed from: a */
    private final boolean f53954a;

    /* renamed from: b */
    private final int f53955b;

    public yjw() {
        this.f53955b = 1;
        this.f53954a = false;
    }

    /* renamed from: a */
    public final Iterable mo30579a(Iterable iterable, Iterable iterable2, yhg yhg, yhx yhx) {
        return new ykj(new yjv(this, yhx, yhg), iterable, iterable2);
    }

    public yjw(int i) {
        this.f53955b = i;
        this.f53954a = true;
    }

    /* renamed from: a */
    public final Iterable mo30580a(Iterable iterable, Iterable iterable2, yhx yhx) {
        return mo30579a(iterable, iterable2, yfv.m44006d(), yhx);
    }

    /* renamed from: a */
    public final yhu mo30581a(yhu yhu, long j, long j2, yhx yhx) {
        int i = this.f53955b;
        boolean z = this.f53954a;
        if (j >= j2) {
            return null;
        }
        float a = yfp.m43956a(yhu, i);
        float a2 = ((float) (j2 - j)) / ((float) yhf.m44092a(yhu));
        yht a3 = yhx.mo30519a();
        yfm.m43953a(a3, j, j2);
        a3.mo30506a(yhu.mo30511d());
        if (z) {
            a *= a2;
        }
        yfp.m43962a(a3, a, i);
        return a3.mo30508c();
    }
}
