package p000;

/* renamed from: bmsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmsn f130714d;

    /* renamed from: e */
    private static volatile bxxk f130715e;

    /* renamed from: a */
    public int f130716a;

    /* renamed from: b */
    public bmaj f130717b;

    /* renamed from: c */
    public bmsm f130718c;

    static {
        bmsn bmsn = new bmsn();
        f130714d = bmsn;
        GeneratedMessageLite.m124024a(bmsn.class, bmsn);
    }

    private bmsn() {
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
            return GeneratedMessageLite.m124022a(f130714d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmsn();
        } else {
            if (i2 == 4) {
                return new bxvd(f130714d);
            }
            if (i2 == 5) {
                return f130714d;
            }
            bxxk bxxk = f130715e;
            if (bxxk == null) {
                synchronized (bmsn.class) {
                    bxxk = f130715e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130714d);
                        f130715e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
