package p000;

/* renamed from: bjjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjjq extends bjjp {
    public bjjq() {
        super(bwxc.f161321f);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo65310a(bxxc bxxc, int i) {
        bwxc bwxc = (bwxc) bxxc;
        if (i == 1) {
            return (bwxc.f161323a & 1) != 0;
        }
        if (i == 2) {
            return (bwxc.f161323a & 2) != 0;
        }
        if (i == 3) {
            return (bwxc.f161323a & 4) != 0;
        }
        if (i != 4) {
            return super.mo65310a(bwxc, i);
        }
        return (bwxc.f161323a & 8) != 0;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bxxc mo65315d(bxxc bxxc, int i) {
        bwxc bwxc = (bwxc) bxxc;
        if (i == 1) {
            bwya bwya = bwxc.f161324b;
            if (bwya == null) {
                return bwya.f161433d;
            }
            return bwya;
        } else if (i == 2) {
            bwya bwya2 = bwxc.f161325c;
            if (bwya2 == null) {
                return bwya.f161433d;
            }
            return bwya2;
        } else if (i == 3) {
            bwya bwya3 = bwxc.f161326d;
            if (bwya3 == null) {
                return bwya.f161433d;
            }
            return bwya3;
        } else if (i != 4) {
            return super.mo65315d(bwxc, i);
        } else {
            bwya bwya4 = bwxc.f161327e;
            if (bwya4 == null) {
                return bwya.f161433d;
            }
            return bwya4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo65311a() {
        return new int[]{2, 1, 3, 4};
    }
}
