package p000;

/* renamed from: byhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byhv f166516c;

    /* renamed from: e */
    private static volatile bxxk f166517e;

    /* renamed from: a */
    public long f166518a;

    /* renamed from: b */
    public long f166519b;

    /* renamed from: d */
    private int f166520d;

    static {
        byhv byhv = new byhv();
        f166516c = byhv;
        GeneratedMessageLite.m124024a(byhv.class, byhv);
    }

    private byhv() {
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
            return GeneratedMessageLite.m124022a(f166516c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new byhv();
        } else {
            if (i2 == 4) {
                return new bxvd(f166516c);
            }
            if (i2 == 5) {
                return f166516c;
            }
            bxxk bxxk = f166517e;
            if (bxxk == null) {
                synchronized (byhv.class) {
                    bxxk = f166517e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166516c);
                        f166517e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
