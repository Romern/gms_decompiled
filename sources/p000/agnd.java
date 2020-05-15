package p000;

/* renamed from: agnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnd extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final agnd f66031f;

    /* renamed from: g */
    private static volatile bxxk f66032g;

    /* renamed from: a */
    public int f66033a;

    /* renamed from: b */
    public String f66034b = "";

    /* renamed from: c */
    public boolean f66035c;

    /* renamed from: d */
    public boolean f66036d;

    /* renamed from: e */
    public int f66037e;

    static {
        agnd agnd = new agnd();
        f66031f = agnd;
        GeneratedMessageLite.m124024a(agnd.class, agnd);
    }

    private agnd() {
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
            return GeneratedMessageLite.m124022a(f66031f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new agnd();
        } else {
            if (i2 == 4) {
                return new bxvd(f66031f);
            }
            if (i2 == 5) {
                return f66031f;
            }
            bxxk bxxk = f66032g;
            if (bxxk == null) {
                synchronized (agnd.class) {
                    bxxk = f66032g;
                    if (bxxk == null) {
                        bxxk = new bxve(f66031f);
                        f66032g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
