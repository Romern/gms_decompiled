package p000;

/* renamed from: bozg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bozg extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bozg f135375g;

    /* renamed from: h */
    private static volatile bxxk f135376h;

    /* renamed from: a */
    public int f135377a;

    /* renamed from: b */
    public int f135378b;

    /* renamed from: c */
    public int f135379c;

    /* renamed from: d */
    public int f135380d;

    /* renamed from: e */
    public long f135381e;

    /* renamed from: f */
    public int f135382f;

    static {
        bozg bozg = new bozg();
        f135375g = bozg;
        GeneratedMessageLite.m124024a(bozg.class, bozg);
    }

    private bozg() {
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
            return GeneratedMessageLite.m124022a(f135375g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", bozf.f135374a, "e", "f", boze.f135373a});
        } else if (i2 == 3) {
            return new bozg();
        } else {
            if (i2 == 4) {
                return new bxvd(f135375g);
            }
            if (i2 == 5) {
                return f135375g;
            }
            bxxk bxxk = f135376h;
            if (bxxk == null) {
                synchronized (bozg.class) {
                    bxxk = f135376h;
                    if (bxxk == null) {
                        bxxk = new bxve(f135375g);
                        f135376h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
