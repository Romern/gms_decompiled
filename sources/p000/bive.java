package p000;

/* renamed from: bive */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bive extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bive f121965c;

    /* renamed from: e */
    private static volatile bxxk f121966e;

    /* renamed from: a */
    public int f121967a;

    /* renamed from: b */
    public bivb f121968b;

    /* renamed from: d */
    private byte f121969d = 2;

    static {
        bive bive = new bive();
        f121965c = bive;
        GeneratedMessageLite.m124024a(bive.class, bive);
    }

    private bive() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121969d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121969d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121965c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bive();
        } else {
            if (i2 == 4) {
                return new bxvd(f121965c);
            }
            if (i2 == 5) {
                return f121965c;
            }
            bxxk bxxk = f121966e;
            if (bxxk == null) {
                synchronized (bive.class) {
                    bxxk = f121966e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121965c);
                        f121966e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
