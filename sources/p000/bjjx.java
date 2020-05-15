package p000;

/* renamed from: bjjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjjx extends bjjp {
    public bjjx() {
        super(bwxk.f161378d);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo65310a(bxxc bxxc, int i) {
        bwxk bwxk = (bwxk) bxxc;
        if (i == 1) {
            return (bwxk.f161380a & 1) != 0;
        }
        if (i != 2) {
            return super.mo65310a(bwxk, i);
        }
        return (bwxk.f161380a & 2) != 0;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bxxc mo65315d(bxxc bxxc, int i) {
        bwxk bwxk = (bwxk) bxxc;
        if (i == 1) {
            bwya bwya = bwxk.f161381b;
            if (bwya == null) {
                return bwya.f161433d;
            }
            return bwya;
        } else if (i != 2) {
            return super.mo65315d(bwxk, i);
        } else {
            bwya bwya2 = bwxk.f161382c;
            if (bwya2 == null) {
                return bwya.f161433d;
            }
            return bwya2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo65311a() {
        return new int[]{1, 2};
    }
}
