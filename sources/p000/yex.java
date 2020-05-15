package p000;

/* renamed from: yex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class yex extends yel {

    /* renamed from: a */
    private boolean f53713a = false;

    /* renamed from: b */
    private int f53714b;

    public yex(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public double mo30402a(int i) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo30403a(int i, int i2);

    /* renamed from: b */
    public final double mo30399b(cadn cadn) {
        caaw a = mo30397a(cadn);
        if (!yyp.m45052c(a) || (a.f172381a & 1) == 0) {
            return 0.0d;
        }
        if (this.f53713a) {
            this.f53714b = mo30403a(this.f53714b, a.f172382b);
        } else {
            this.f53714b = a.f172382b;
            this.f53713a = true;
        }
        return mo30402a(a.f172382b);
    }

    /* renamed from: a */
    public final caaw mo30398a(long j) {
        if (this.f53713a) {
            return yyp.m45047a(this.f53714b);
        }
        return caaw.f172379i;
    }
}
