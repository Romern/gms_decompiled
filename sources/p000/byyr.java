package p000;

/* renamed from: byyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byyr f168996d;

    /* renamed from: f */
    private static volatile bxxk f168997f;

    /* renamed from: a */
    public int f168998a;

    /* renamed from: b */
    public byys f168999b;

    /* renamed from: c */
    public int f169000c;

    /* renamed from: e */
    private byte f169001e = 2;

    static {
        byyr byyr = new byyr();
        f168996d = byyr;
        GeneratedMessageLite.m124024a(byyr.class, byyr);
    }

    private byyr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f169001e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f169001e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168996d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byyr();
        } else {
            if (i2 == 4) {
                return new bxvd(f168996d);
            }
            if (i2 == 5) {
                return f168996d;
            }
            bxxk bxxk = f168997f;
            if (bxxk == null) {
                synchronized (byyr.class) {
                    bxxk = f168997f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168996d);
                        f168997f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
