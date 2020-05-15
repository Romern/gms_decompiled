package p000;

/* renamed from: mpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpy extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final mpy f34225c;

    /* renamed from: d */
    private static volatile bxxk f34226d;

    /* renamed from: a */
    public int f34227a;

    /* renamed from: b */
    public int f34228b;

    static {
        mpy mpy = new mpy();
        f34225c = mpy;
        GeneratedMessageLite.m124024a(mpy.class, mpy);
    }

    private mpy() {
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
            return GeneratedMessageLite.m124022a(f34225c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new mpy();
        } else {
            if (i2 == 4) {
                return new bxvd(f34225c);
            }
            if (i2 == 5) {
                return f34225c;
            }
            bxxk bxxk = f34226d;
            if (bxxk == null) {
                synchronized (mpy.class) {
                    bxxk = f34226d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34225c);
                        f34226d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
