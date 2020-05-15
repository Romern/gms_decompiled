package p000;

/* renamed from: mrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mrc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final mrc f34385c;

    /* renamed from: d */
    private static volatile bxxk f34386d;

    /* renamed from: a */
    public int f34387a;

    /* renamed from: b */
    public int f34388b;

    static {
        mrc mrc = new mrc();
        f34385c = mrc;
        GeneratedMessageLite.m124024a(mrc.class, mrc);
    }

    private mrc() {
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
            return GeneratedMessageLite.m124022a(f34385c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mrb.f34384a});
        } else if (i2 == 3) {
            return new mrc();
        } else {
            if (i2 == 4) {
                return new bxvd(f34385c);
            }
            if (i2 == 5) {
                return f34385c;
            }
            bxxk bxxk = f34386d;
            if (bxxk == null) {
                synchronized (mrc.class) {
                    bxxk = f34386d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34385c);
                        f34386d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
