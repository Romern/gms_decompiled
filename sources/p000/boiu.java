package p000;

/* renamed from: boiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boiu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final boiu f133232f;

    /* renamed from: g */
    private static volatile bxxk f133233g;

    /* renamed from: a */
    public int f133234a;

    /* renamed from: b */
    public boje f133235b;

    /* renamed from: c */
    public int f133236c;

    /* renamed from: d */
    public boiz f133237d;

    /* renamed from: e */
    public int f133238e;

    static {
        boiu boiu = new boiu();
        f133232f = boiu;
        bxvk.m124024a(boiu.class, boiu);
    }

    private boiu() {
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
            return bxvk.m124022a(f133232f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", bojc.f133262a, "d", "e", bojb.f133261a});
        } else if (i2 == 3) {
            return new boiu();
        } else {
            if (i2 == 4) {
                return new bxvd(f133232f);
            }
            if (i2 == 5) {
                return f133232f;
            }
            bxxk bxxk = f133233g;
            if (bxxk == null) {
                synchronized (boiu.class) {
                    bxxk = f133233g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133232f);
                        f133233g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
