package p000;

/* renamed from: cilz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cilz extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final cilz f190690g;

    /* renamed from: h */
    private static volatile bxxk f190691h;

    /* renamed from: a */
    public int f190692a;

    /* renamed from: b */
    public cilx f190693b;

    /* renamed from: c */
    public int f190694c;

    /* renamed from: d */
    public cily f190695d;

    /* renamed from: e */
    public int f190696e;

    /* renamed from: f */
    public String f190697f = "";

    static {
        cilz cilz = new cilz();
        f190690g = cilz;
        GeneratedMessageLite.m124024a(cilz.class, cilz);
    }

    private cilz() {
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
            return GeneratedMessageLite.m124022a(f190690g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", cilu.f190676a, "d", "e", cilw.f190678a, "f"});
        } else if (i2 == 3) {
            return new cilz();
        } else {
            if (i2 == 4) {
                return new bxvd(f190690g);
            }
            if (i2 == 5) {
                return f190690g;
            }
            bxxk bxxk = f190691h;
            if (bxxk == null) {
                synchronized (cilz.class) {
                    bxxk = f190691h;
                    if (bxxk == null) {
                        bxxk = new bxve(f190690g);
                        f190691h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
