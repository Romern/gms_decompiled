package p000;

/* renamed from: bkta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkta {

    /* renamed from: a */
    public static final blhp f125260a;

    static {
        blhn c = blhp.m107177c();
        c.mo66551a(bktb.f125261a);
        f125260a = c.mo66550a();
    }

    /* renamed from: a */
    public static final int m106585a(blhp blhp) {
        if (m106591b(blhp)) {
            return 24;
        }
        blho blho = blho.KIND_NOT_SET;
        int ordinal = blhp.f126558b.ordinal();
        if (ordinal == 1) {
            return bktb.m106592a(blhp.mo66553a());
        }
        if (ordinal == 2) {
            return blhp.mo66554b().length() + 24;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static final blhp m106590b(blgm blgm) {
        blhn c = blhp.m107177c();
        c.mo66551a(blgm);
        return c.mo66550a();
    }

    /* renamed from: b */
    public static final boolean m106591b(blhp blhp) {
        return blhp.f126558b == blho.JSON && blhp.mo66553a().f126445b == blgl.NULL_VALUE;
    }

    /* renamed from: a */
    public static final blhp m106586a(blgm blgm) {
        blhn c = blhp.m107177c();
        c.mo66551a(blgm);
        return c.mo66550a();
    }

    /* renamed from: a */
    public static final blhp m106587a(String str) {
        blhn c = blhp.m107177c();
        c.mo66552a(str);
        return c.mo66550a();
    }

    /* renamed from: a */
    public static final boolean m106588a(blhp blhp, blhp blhp2) {
        blho blho = blhp.f126558b;
        if (blho != blhp2.f126558b) {
            return false;
        }
        blho blho2 = blho.KIND_NOT_SET;
        int ordinal = blho.ordinal();
        if (ordinal == 1) {
            return bkwv.m106779a(blhp.mo66553a(), blhp2.mo66553a());
        }
        if (ordinal == 2) {
            return blhp.mo66554b().equals(blhp2.mo66554b());
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static boolean m106589a(String str, blhp blhp) {
        return blhp.f126558b == blho.REFERENCED_ID && blhp.mo66554b().equals(str);
    }
}
