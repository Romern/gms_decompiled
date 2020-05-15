package p000;

/* renamed from: bvtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvtx f157629d;

    /* renamed from: e */
    private static volatile bxxk f157630e;

    /* renamed from: a */
    public int f157631a;

    /* renamed from: b */
    public bzrv f157632b;

    /* renamed from: c */
    public bzrv f157633c;

    static {
        bvtx bvtx = new bvtx();
        f157629d = bvtx;
        GeneratedMessageLite.m124024a(bvtx.class, bvtx);
    }

    private bvtx() {
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
            return GeneratedMessageLite.m124022a(f157629d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvtx();
        } else {
            if (i2 == 4) {
                return new bxvd(f157629d);
            }
            if (i2 == 5) {
                return f157629d;
            }
            bxxk bxxk = f157630e;
            if (bxxk == null) {
                synchronized (bvtx.class) {
                    bxxk = f157630e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157629d);
                        f157630e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
