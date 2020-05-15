package p000;

/* renamed from: bwks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwks extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwks f160029e;

    /* renamed from: f */
    private static volatile bxxk f160030f;

    /* renamed from: a */
    public int f160031a;

    /* renamed from: b */
    public bxtx f160032b = bxtx.f164797b;

    /* renamed from: c */
    public bwhy f160033c;

    /* renamed from: d */
    public bwho f160034d;

    static {
        bwks bwks = new bwks();
        f160029e = bwks;
        bxvk.m124024a(bwks.class, bwks);
    }

    private bwks() {
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
            return bxvk.m124022a(f160029e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ည\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwks();
        } else {
            if (i2 == 4) {
                return new bxvd(f160029e);
            }
            if (i2 == 5) {
                return f160029e;
            }
            bxxk bxxk = f160030f;
            if (bxxk == null) {
                synchronized (bwks.class) {
                    bxxk = f160030f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160029e);
                        f160030f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
