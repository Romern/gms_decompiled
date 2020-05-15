package p000;

/* renamed from: bjju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjju extends bjjp {
    public bjju() {
        super(bwxg.f161345e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo65310a(bxxc bxxc, int i) {
        bwxg bwxg = (bwxg) bxxc;
        if (i == 1) {
            return (bwxg.f161347a & 1) != 0;
        }
        if (i == 2) {
            return (bwxg.f161347a & 2) != 0;
        }
        if (i != 3) {
            return super.mo65310a(bwxg, i);
        }
        return (bwxg.f161347a & 4) != 0;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bxxc mo65315d(bxxc bxxc, int i) {
        bwxg bwxg = (bwxg) bxxc;
        if (i == 1) {
            bwxf bwxf = bwxg.f161348b;
            if (bwxf == null) {
                return bwxf.f161340d;
            }
            return bwxf;
        } else if (i == 2) {
            bwxf bwxf2 = bwxg.f161349c;
            if (bwxf2 == null) {
                return bwxf.f161340d;
            }
            return bwxf2;
        } else if (i != 3) {
            return super.mo65315d(bwxg, i);
        } else {
            bwwz bwwz = bwxg.f161350d;
            if (bwwz == null) {
                return bwwz.f161308d;
            }
            return bwwz;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo65311a() {
        return new int[]{1, 2, 3};
    }
}
