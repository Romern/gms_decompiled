package p000;

/* renamed from: bjjt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjjt extends bjjp {
    public bjjt() {
        super(bwxe.f161335d);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo65310a(bxxc bxxc, int i) {
        bwxe bwxe = (bwxe) bxxc;
        if (i == 1) {
            return (bwxe.f161337a & 1) != 0;
        }
        if (i != 2) {
            return super.mo65310a(bwxe, i);
        }
        return (bwxe.f161337a & 2) != 0;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ int mo65314c(bxxc bxxc, int i) {
        bwxe bwxe = (bwxe) bxxc;
        if (i != 1) {
            return i != 2 ? super.mo65314c(bwxe, i) : bwxe.f161339c;
        }
        return bwxe.f161338b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo65311a() {
        return new int[]{1, 2};
    }
}
