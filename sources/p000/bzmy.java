package p000;

/* renamed from: bzmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzmy f170678d;

    /* renamed from: f */
    private static volatile bxxk f170679f;

    /* renamed from: a */
    public int f170680a;

    /* renamed from: b */
    public int f170681b;

    /* renamed from: c */
    public bzmm f170682c;

    /* renamed from: e */
    private int f170683e;

    static {
        bzmy bzmy = new bzmy();
        f170678d = bzmy;
        GeneratedMessageLite.m124024a(bzmy.class, bzmy);
    }

    private bzmy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170678d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဌ\u0002\u0003ဉ\u0003", new Object[]{"e", "a", bzlo.f170557a, "b", bzmi.f170620a, "c"});
        } else if (i2 == 3) {
            return new bzmy();
        } else {
            if (i2 == 4) {
                return new bxvd(f170678d);
            }
            if (i2 == 5) {
                return f170678d;
            }
            bxxk bxxk = f170679f;
            if (bxxk == null) {
                synchronized (bzmy.class) {
                    bxxk = f170679f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170678d);
                        f170679f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
