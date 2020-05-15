package p000;

/* renamed from: bkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkq extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bkq f5016g;

    /* renamed from: h */
    private static volatile bxxk f5017h;

    /* renamed from: a */
    public int f5018a;

    /* renamed from: b */
    public int f5019b;

    /* renamed from: c */
    public int f5020c;

    /* renamed from: d */
    public int f5021d;

    /* renamed from: e */
    public boolean f5022e;

    /* renamed from: f */
    public boolean f5023f;

    static {
        bkq bkq = new bkq();
        f5016g = bkq;
        GeneratedMessageLite.m124024a(bkq.class, bkq);
    }

    private bkq() {
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
            return GeneratedMessageLite.m124022a(f5016g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", bkg.f4963a, "c", cagz.m126623b(), "d", bkn.m3262b(), "e", "f"});
        } else if (i2 == 3) {
            return new bkq();
        } else {
            if (i2 == 4) {
                return new bxvd(f5016g);
            }
            if (i2 == 5) {
                return f5016g;
            }
            bxxk bxxk = f5017h;
            if (bxxk == null) {
                synchronized (bkq.class) {
                    bxxk = f5017h;
                    if (bxxk == null) {
                        bxxk = new bxve(f5016g);
                        f5017h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
