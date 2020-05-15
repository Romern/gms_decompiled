package p000;

/* renamed from: msu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msu extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final msu f34592c;

    /* renamed from: d */
    private static volatile bxxk f34593d;

    /* renamed from: a */
    public int f34594a;

    /* renamed from: b */
    public int f34595b;

    static {
        msu msu = new msu();
        f34592c = msu;
        GeneratedMessageLite.m124024a(msu.class, msu);
    }

    private msu() {
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
            return GeneratedMessageLite.m124022a(f34592c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", mst.f34591a});
        } else if (i2 == 3) {
            return new msu();
        } else {
            if (i2 == 4) {
                return new bxvd(f34592c);
            }
            if (i2 == 5) {
                return f34592c;
            }
            bxxk bxxk = f34593d;
            if (bxxk == null) {
                synchronized (msu.class) {
                    bxxk = f34593d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34592c);
                        f34593d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
