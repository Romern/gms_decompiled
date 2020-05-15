package p000;

/* renamed from: bmgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmgr f129315c;

    /* renamed from: d */
    private static volatile bxxk f129316d;

    /* renamed from: a */
    public int f129317a = 0;

    /* renamed from: b */
    public Object f129318b;

    static {
        bmgr bmgr = new bmgr();
        f129315c = bmgr;
        GeneratedMessageLite.m124024a(bmgr.class, bmgr);
    }

    private bmgr() {
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
            return GeneratedMessageLite.m124022a(f129315c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", bmgy.class, bmgt.class, bmha.class});
        } else if (i2 == 3) {
            return new bmgr();
        } else {
            if (i2 == 4) {
                return new bxvd(f129315c);
            }
            if (i2 == 5) {
                return f129315c;
            }
            bxxk bxxk = f129316d;
            if (bxxk == null) {
                synchronized (bmgr.class) {
                    bxxk = f129316d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129315c);
                        f129316d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
