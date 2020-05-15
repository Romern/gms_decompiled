package p000;

/* renamed from: btdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btdz f148478b;

    /* renamed from: d */
    private static volatile bxxk f148479d;

    /* renamed from: a */
    public boolean f148480a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f148481c;

    static {
        btdz btdz = new btdz();
        f148478b = btdz;
        GeneratedMessageLite.m124024a(btdz.class, btdz);
    }

    private btdz() {
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
            return GeneratedMessageLite.m124022a(f148478b, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "c"});
        } else if (i2 == 3) {
            return new btdz();
        } else {
            if (i2 == 4) {
                return new bxvd(f148478b);
            }
            if (i2 == 5) {
                return f148478b;
            }
            bxxk bxxk = f148479d;
            if (bxxk == null) {
                synchronized (btdz.class) {
                    bxxk = f148479d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148478b);
                        f148479d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
