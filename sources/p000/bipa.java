package p000;

/* renamed from: bipa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipa extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bipa f121130c;

    /* renamed from: e */
    private static volatile bxxk f121131e;

    /* renamed from: a */
    public int f121132a;

    /* renamed from: b */
    public int f121133b = 1;

    /* renamed from: d */
    private byte f121134d = 2;

    static {
        bipa bipa = new bipa();
        f121130c = bipa;
        GeneratedMessageLite.m124024a(bipa.class, bipa);
    }

    private bipa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121134d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121134d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121130c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"a", "b", bisf.m102782b()});
        } else if (i2 == 3) {
            return new bipa();
        } else {
            if (i2 == 4) {
                return new bxvd(f121130c);
            }
            if (i2 == 5) {
                return f121130c;
            }
            bxxk bxxk = f121131e;
            if (bxxk == null) {
                synchronized (bipa.class) {
                    bxxk = f121131e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121130c);
                        f121131e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
