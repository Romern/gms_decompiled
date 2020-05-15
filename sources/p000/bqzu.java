package p000;

/* renamed from: bqzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzu extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bqzu f142084g;

    /* renamed from: i */
    private static volatile bxxk f142085i;

    /* renamed from: a */
    public int f142086a;

    /* renamed from: b */
    public qhd f142087b;

    /* renamed from: c */
    public bxww f142088c = bxww.f165013b;

    /* renamed from: d */
    public String f142089d = "";

    /* renamed from: e */
    public int f142090e;

    /* renamed from: f */
    public int f142091f;

    /* renamed from: h */
    private byte f142092h = 2;

    static {
        bqzu bqzu = new bqzu();
        f142084g = bqzu;
        GeneratedMessageLite.m124024a(bqzu.class, bqzu);
    }

    private bqzu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142092h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142092h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f142084g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0001\u0001ᐉ\u0000\u00022\u0003ဈ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", "c", bqzr.f142081a, "d", "e", bqzs.f142082a, "f", bqzt.f142083a});
        } else if (i2 == 3) {
            return new bqzu();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f142084g;
            }
            bxxk bxxk = f142085i;
            if (bxxk == null) {
                synchronized (bqzu.class) {
                    bxxk = f142085i;
                    if (bxxk == null) {
                        bxxk = new bxve(f142084g);
                        f142085i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
