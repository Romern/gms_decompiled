package p000;

/* renamed from: biqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqt extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final biqt f121337g;

    /* renamed from: i */
    private static volatile bxxk f121338i;

    /* renamed from: a */
    public int f121339a;

    /* renamed from: b */
    public int f121340b;

    /* renamed from: c */
    public int f121341c;

    /* renamed from: d */
    public boolean f121342d;

    /* renamed from: e */
    public int f121343e;

    /* renamed from: f */
    public int f121344f;

    /* renamed from: h */
    private byte f121345h = 2;

    static {
        biqt biqt = new biqt();
        f121337g = biqt;
        GeneratedMessageLite.m124024a(biqt.class, biqt);
    }

    private biqt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121345h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121345h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121337g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔇ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new biqt();
        } else {
            if (i2 == 4) {
                return new bxvd(f121337g);
            }
            if (i2 == 5) {
                return f121337g;
            }
            bxxk bxxk = f121338i;
            if (bxxk == null) {
                synchronized (biqt.class) {
                    bxxk = f121338i;
                    if (bxxk == null) {
                        bxxk = new bxve(f121337g);
                        f121338i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
