package p000;

/* renamed from: bmnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bmnx f130188b;

    /* renamed from: d */
    private static volatile bxxk f130189d;

    /* renamed from: a */
    public bmnw f130190a;

    /* renamed from: c */
    private int f130191c;

    static {
        bmnx bmnx = new bmnx();
        f130188b = bmnx;
        GeneratedMessageLite.m124024a(bmnx.class, bmnx);
    }

    private bmnx() {
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
            return GeneratedMessageLite.m124022a(f130188b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bmnx();
        } else {
            if (i2 == 4) {
                return new bxvd(f130188b);
            }
            if (i2 == 5) {
                return f130188b;
            }
            bxxk bxxk = f130189d;
            if (bxxk == null) {
                synchronized (bmnx.class) {
                    bxxk = f130189d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130188b);
                        f130189d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
