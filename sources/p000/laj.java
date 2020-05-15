package p000;

/* renamed from: laj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class laj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final laj f25551g;

    /* renamed from: h */
    private static volatile bxxk f25552h;

    /* renamed from: a */
    public kzz f25553a;

    /* renamed from: b */
    public lbf f25554b;

    /* renamed from: c */
    public bxwc f25555c = bxxn.f165040b;

    /* renamed from: d */
    public lba f25556d;

    /* renamed from: e */
    public int f25557e;

    /* renamed from: f */
    public int f25558f;

    static {
        laj laj = new laj();
        f25551g = laj;
        GeneratedMessageLite.m124024a(laj.class, laj);
    }

    private laj() {
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
            return GeneratedMessageLite.m124022a(f25551g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0002\t\u0003\u001b\u0004\t\u0005\u0004\u0006\u0004", new Object[]{"a", "b", "c", lba.class, "d", "e", "f"});
        } else if (i2 == 3) {
            return new laj();
        } else {
            if (i2 == 4) {
                return new bxvd(f25551g);
            }
            if (i2 == 5) {
                return f25551g;
            }
            bxxk bxxk = f25552h;
            if (bxxk == null) {
                synchronized (laj.class) {
                    bxxk = f25552h;
                    if (bxxk == null) {
                        bxxk = new bxve(f25551g);
                        f25552h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
