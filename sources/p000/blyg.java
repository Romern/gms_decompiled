package p000;

/* renamed from: blyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blyg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final blyg f128195e;

    /* renamed from: g */
    private static volatile bxxk f128196g;

    /* renamed from: a */
    public int f128197a;

    /* renamed from: b */
    public String f128198b = "";

    /* renamed from: c */
    public String f128199c = "";

    /* renamed from: d */
    public int f128200d;

    /* renamed from: f */
    private int f128201f;

    static {
        blyg blyg = new blyg();
        f128195e = blyg;
        GeneratedMessageLite.m124024a(blyg.class, blyg);
    }

    private blyg() {
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
            return GeneratedMessageLite.m124022a(f128195e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဌ\u0003", new Object[]{"f", "a", blye.f128194a, "b", "c", "d", blyc.f128193a});
        } else if (i2 == 3) {
            return new blyg();
        } else {
            if (i2 == 4) {
                return new bxvd(f128195e);
            }
            if (i2 == 5) {
                return f128195e;
            }
            bxxk bxxk = f128196g;
            if (bxxk == null) {
                synchronized (blyg.class) {
                    bxxk = f128196g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128195e);
                        f128196g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
