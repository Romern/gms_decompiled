package p000;

/* renamed from: bjjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjjs extends bjjp {
    public bjjs() {
        super(bwyj.f161464j);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo65309a(bxxc bxxc) {
        return ((bwyj) bxxc).f161467b;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ int mo65314c(bxxc bxxc, int i) {
        bwyj bwyj = (bwyj) bxxc;
        return i == 3 ? bwyj.f161469d : super.mo65314c(bwyj, i);
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ bxxc mo65315d(bxxc bxxc, int i) {
        bwyj bwyj = (bwyj) bxxc;
        if (i == 2) {
            bwya bwya = bwyj.f161468c;
            if (bwya == null) {
                return bwya.f161433d;
            }
            return bwya;
        } else if (i == 5) {
            bwya bwya2 = bwyj.f161470e;
            if (bwya2 == null) {
                return bwya.f161433d;
            }
            return bwya2;
        } else if (i != 7) {
            return super.mo65315d(bwyj, i);
        } else {
            bwya bwya3 = bwyj.f161471f;
            if (bwya3 == null) {
                return bwya.f161433d;
            }
            return bwya3;
        }
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo65316e(bxxc bxxc, int i) {
        bwyj bwyj = (bwyj) bxxc;
        if (i == 4) {
            bwye a = bwye.m122427a(bwyj.f161472g);
            if (a == null) {
                return bwye.FONT_STYLE_UNKNOWN;
            }
            return a;
        } else if (i == 6) {
            bwyi a2 = bwyi.m122435a(bwyj.f161473h);
            if (a2 == null) {
                return bwyi.FONT_WEIGHT_NORMAL;
            }
            return a2;
        } else if (i != 8) {
            return super.mo65316e(bwyj, i);
        } else {
            bwyg a3 = bwyg.m122431a(bwyj.f161474i);
            if (a3 == null) {
                return bwyg.FONT_TRANSFORMATION_UNKNOWN;
            }
            return a3;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo65310a(bxxc bxxc, int i) {
        bwyj bwyj = (bwyj) bxxc;
        switch (i) {
            case 1:
                return (bwyj.f161466a & 1) != 0;
            case 2:
                return (bwyj.f161466a & 2) != 0;
            case 3:
                return (bwyj.f161466a & 4) != 0;
            case 4:
                return (bwyj.f161466a & 32) != 0;
            case 5:
                return (bwyj.f161466a & 8) != 0;
            case 6:
                return (bwyj.f161466a & 64) != 0;
            case 7:
                return (bwyj.f161466a & 16) != 0;
            case 8:
                return (bwyj.f161466a & 128) != 0;
            default:
                return super.mo65310a(bwyj, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo65311a() {
        return new int[]{1, 2, 3, 4, 6, 7, 5, 8};
    }
}
