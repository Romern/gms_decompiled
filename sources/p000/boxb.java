package p000;

/* renamed from: boxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boxb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final boxb f135220e;

    /* renamed from: f */
    private static volatile bxxk f135221f;

    /* renamed from: a */
    public int f135222a;

    /* renamed from: b */
    public boolean f135223b;

    /* renamed from: c */
    public int f135224c;

    /* renamed from: d */
    public long f135225d;

    static {
        boxb boxb = new boxb();
        f135220e = boxb;
        GeneratedMessageLite.m124024a(boxb.class, boxb);
    }

    private boxb() {
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
            return GeneratedMessageLite.m124022a(f135220e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new boxb();
        } else {
            if (i2 == 4) {
                return new bxvd(f135220e);
            }
            if (i2 == 5) {
                return f135220e;
            }
            bxxk bxxk = f135221f;
            if (bxxk == null) {
                synchronized (boxb.class) {
                    bxxk = f135221f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135220e);
                        f135221f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
