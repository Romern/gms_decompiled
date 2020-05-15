package p000;

/* renamed from: cioi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cioi extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cioi f191066h;

    /* renamed from: i */
    private static volatile bxxk f191067i;

    /* renamed from: a */
    public int f191068a;

    /* renamed from: b */
    public int f191069b;

    /* renamed from: c */
    public int f191070c;

    /* renamed from: d */
    public int f191071d;

    /* renamed from: e */
    public int f191072e;

    /* renamed from: f */
    public bxwc f191073f = bxxn.f165040b;

    /* renamed from: g */
    public int f191074g;

    static {
        cioi cioi = new cioi();
        f191066h = cioi;
        GeneratedMessageLite.m124024a(cioi.class, cioi);
    }

    private cioi() {
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
            return GeneratedMessageLite.m124022a(f191066h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001b\u0006င\u0004", new Object[]{"a", "b", "c", "d", "e", "f", cioh.class, "g"});
        } else if (i2 == 3) {
            return new cioi();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f191066h;
            }
            bxxk bxxk = f191067i;
            if (bxxk == null) {
                synchronized (cioi.class) {
                    bxxk = f191067i;
                    if (bxxk == null) {
                        bxxk = new bxve(f191066h);
                        f191067i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
