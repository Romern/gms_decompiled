package p000;

/* renamed from: moy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class moy extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final moy f34089b;

    /* renamed from: c */
    private static volatile bxxk f34090c;

    /* renamed from: a */
    public bxwc f34091a = bxxn.f165040b;

    static {
        moy moy = new moy();
        f34089b = moy;
        GeneratedMessageLite.m124024a(moy.class, moy);
    }

    private moy() {
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
            return GeneratedMessageLite.m124022a(f34089b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mox.class});
        } else if (i2 == 3) {
            return new moy();
        } else {
            if (i2 == 4) {
                return new bxvd(f34089b);
            }
            if (i2 == 5) {
                return f34089b;
            }
            bxxk bxxk = f34090c;
            if (bxxk == null) {
                synchronized (moy.class) {
                    bxxk = f34090c;
                    if (bxxk == null) {
                        bxxk = new bxve(f34089b);
                        f34090c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
