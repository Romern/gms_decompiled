package p000;

/* renamed from: boxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boxh f135250d;

    /* renamed from: e */
    private static volatile bxxk f135251e;

    /* renamed from: a */
    public int f135252a;

    /* renamed from: b */
    public boolean f135253b;

    /* renamed from: c */
    public boolean f135254c;

    static {
        boxh boxh = new boxh();
        f135250d = boxh;
        GeneratedMessageLite.m124024a(boxh.class, boxh);
    }

    private boxh() {
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
            return GeneratedMessageLite.m124022a(f135250d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boxh();
        } else {
            if (i2 == 4) {
                return new bxvd(f135250d);
            }
            if (i2 == 5) {
                return f135250d;
            }
            bxxk bxxk = f135251e;
            if (bxxk == null) {
                synchronized (boxh.class) {
                    bxxk = f135251e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135250d);
                        f135251e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
