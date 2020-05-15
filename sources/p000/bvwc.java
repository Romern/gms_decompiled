package p000;

/* renamed from: bvwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvwc f157904d;

    /* renamed from: f */
    private static volatile bxxk f157905f;

    /* renamed from: a */
    public long f157906a;

    /* renamed from: b */
    public long f157907b;

    /* renamed from: c */
    public long f157908c;

    /* renamed from: e */
    private int f157909e;

    static {
        bvwc bvwc = new bvwc();
        f157904d = bvwc;
        GeneratedMessageLite.m124024a(bvwc.class, bvwc);
    }

    private bvwc() {
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
            return GeneratedMessageLite.m124022a(f157904d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bvwc();
        } else {
            if (i2 == 4) {
                return new bxvd(f157904d);
            }
            if (i2 == 5) {
                return f157904d;
            }
            bxxk bxxk = f157905f;
            if (bxxk == null) {
                synchronized (bvwc.class) {
                    bxxk = f157905f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157904d);
                        f157905f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
