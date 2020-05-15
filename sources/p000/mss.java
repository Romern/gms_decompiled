package p000;

/* renamed from: mss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mss extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final mss f34585e;

    /* renamed from: f */
    private static volatile bxxk f34586f;

    /* renamed from: a */
    public int f34587a;

    /* renamed from: b */
    public long f34588b;

    /* renamed from: c */
    public bxwc f34589c = bxxn.f165040b;

    /* renamed from: d */
    public boolean f34590d;

    static {
        mss mss = new mss();
        f34585e = mss;
        GeneratedMessageLite.m124024a(mss.class, mss);
    }

    private mss() {
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
            return GeneratedMessageLite.m124022a(f34585e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new mss();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f34585e;
            }
            bxxk bxxk = f34586f;
            if (bxxk == null) {
                synchronized (mss.class) {
                    bxxk = f34586f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34585e);
                        f34586f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
