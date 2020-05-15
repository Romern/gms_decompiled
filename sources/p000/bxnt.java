package p000;

/* renamed from: bxnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnt extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bxnt f164083f;

    /* renamed from: h */
    private static volatile bxxk f164084h;

    /* renamed from: a */
    public float f164085a;

    /* renamed from: b */
    public float f164086b;

    /* renamed from: c */
    public float f164087c;

    /* renamed from: d */
    public int f164088d;

    /* renamed from: e */
    public bxwc f164089e = bxxn.f165040b;

    /* renamed from: g */
    private int f164090g;

    static {
        bxnt bxnt = new bxnt();
        f164083f = bxnt;
        GeneratedMessageLite.m124024a(bxnt.class, bxnt);
    }

    private bxnt() {
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
            return GeneratedMessageLite.m124022a(f164083f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005\u001b", new Object[]{"g", "a", "b", "c", "d", "e", bxns.class});
        } else if (i2 == 3) {
            return new bxnt();
        } else {
            if (i2 == 4) {
                return new bxvd(f164083f);
            }
            if (i2 == 5) {
                return f164083f;
            }
            bxxk bxxk = f164084h;
            if (bxxk == null) {
                synchronized (bxnt.class) {
                    bxxk = f164084h;
                    if (bxxk == null) {
                        bxxk = new bxve(f164083f);
                        f164084h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
