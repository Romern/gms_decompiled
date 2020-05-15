package p000;

/* renamed from: bykh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bykh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bykh f166752c;

    /* renamed from: e */
    private static volatile bxxk f166753e;

    /* renamed from: a */
    public bykz f166754a;

    /* renamed from: b */
    public byki f166755b;

    /* renamed from: d */
    private int f166756d;

    static {
        bykh bykh = new bykh();
        f166752c = bykh;
        GeneratedMessageLite.m124024a(bykh.class, bykh);
    }

    private bykh() {
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
            return GeneratedMessageLite.m124022a(f166752c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bykh();
        } else {
            if (i2 == 4) {
                return new bxvd(f166752c);
            }
            if (i2 == 5) {
                return f166752c;
            }
            bxxk bxxk = f166753e;
            if (bxxk == null) {
                synchronized (bykh.class) {
                    bxxk = f166753e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166752c);
                        f166753e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
