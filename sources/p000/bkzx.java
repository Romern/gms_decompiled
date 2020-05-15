package p000;

/* renamed from: bkzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzx extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bkzx f125709a;

    /* renamed from: e */
    private static volatile bxxk f125710e;

    /* renamed from: b */
    private int f125711b;

    /* renamed from: c */
    private int f125712c;

    /* renamed from: d */
    private byte f125713d = 2;

    static {
        bkzx bkzx = new bkzx();
        f125709a = bkzx;
        GeneratedMessageLite.m124024a(bkzx.class, bkzx);
    }

    private bkzx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125713d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125713d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125709a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blfs.f126409a});
        } else if (i2 == 3) {
            return new bkzx();
        } else {
            if (i2 == 4) {
                return new bxvd(f125709a);
            }
            if (i2 == 5) {
                return f125709a;
            }
            bxxk bxxk = f125710e;
            if (bxxk == null) {
                synchronized (bkzx.class) {
                    bxxk = f125710e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125709a);
                        f125710e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
