package p000;

/* renamed from: abub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abub extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final abub f58337e;

    /* renamed from: f */
    private static volatile bxxk f58338f;

    /* renamed from: a */
    public int f58339a;

    /* renamed from: b */
    public int f58340b;

    /* renamed from: c */
    public boolean f58341c;

    /* renamed from: d */
    public int f58342d;

    static {
        abub abub = new abub();
        f58337e = abub;
        GeneratedMessageLite.m124024a(abub.class, abub);
    }

    private abub() {
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
            return GeneratedMessageLite.m124022a(f58337e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001\u0004ဋ\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new abub();
        } else {
            if (i2 == 4) {
                return new bxvd(f58337e);
            }
            if (i2 == 5) {
                return f58337e;
            }
            bxxk bxxk = f58338f;
            if (bxxk == null) {
                synchronized (abub.class) {
                    bxxk = f58338f;
                    if (bxxk == null) {
                        bxxk = new bxve(f58337e);
                        f58338f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
