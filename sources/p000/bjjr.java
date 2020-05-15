package p000;

/* renamed from: bjjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjjr extends bjjp {
    public bjjr() {
        super(bwxd.f161328f);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo65310a(bxxc bxxc, int i) {
        bwxd bwxd = (bwxd) bxxc;
        if (i == 1) {
            return (bwxd.f161330a & 1) != 0;
        }
        if (i == 2) {
            return (bwxd.f161330a & 2) != 0;
        }
        if (i == 3) {
            return (bwxd.f161330a & 4) != 0;
        }
        if (i != 4) {
            return super.mo65310a(bwxd, i);
        }
        return (bwxd.f161330a & 8) != 0;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ float mo65312b(bxxc bxxc, int i) {
        bwxd bwxd = (bwxd) bxxc;
        if (i == 1) {
            return bwxd.f161331b;
        }
        if (i != 2) {
            return i != 3 ? super.mo65312b(bwxd, i) : bwxd.f161333d;
        }
        return bwxd.f161332c;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo65316e(bxxc bxxc, int i) {
        bwxd bwxd = (bwxd) bxxc;
        if (i != 4) {
            return super.mo65316e(bwxd, i);
        }
        bwwy a = bwwy.m122385a(bwxd.f161334e);
        return a == null ? bwwy.ALIGNMENT_UNKNOWN : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo65311a() {
        return new int[]{1, 2, 3, 4};
    }
}
