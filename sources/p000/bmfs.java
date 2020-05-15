package p000;

/* renamed from: bmfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfs extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmfs f129155e;

    /* renamed from: f */
    private static volatile bxxk f129156f;

    /* renamed from: a */
    public int f129157a;

    /* renamed from: b */
    public int f129158b = 0;

    /* renamed from: c */
    public Object f129159c;

    /* renamed from: d */
    public bmdn f129160d;

    static {
        bmfs bmfs = new bmfs();
        f129155e = bmfs;
        GeneratedMessageLite.m124024a(bmfs.class, bmfs);
    }

    private bmfs() {
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
            return GeneratedMessageLite.m124022a(f129155e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဉ\u0000", new Object[]{"c", "b", "a", bmgr.class, bmgv.class, "d"});
        } else if (i2 == 3) {
            return new bmfs();
        } else {
            if (i2 == 4) {
                return new bxvd(f129155e);
            }
            if (i2 == 5) {
                return f129155e;
            }
            bxxk bxxk = f129156f;
            if (bxxk == null) {
                synchronized (bmfs.class) {
                    bxxk = f129156f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129155e);
                        f129156f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
