package p000;

/* renamed from: bkzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bkzh f125581e;

    /* renamed from: f */
    private static volatile bxxk f125582f;

    /* renamed from: a */
    public int f125583a;

    /* renamed from: b */
    public String f125584b = "";

    /* renamed from: c */
    public String f125585c = "";

    /* renamed from: d */
    public boolean f125586d;

    static {
        bkzh bkzh = new bkzh();
        f125581e = bkzh;
        GeneratedMessageLite.m124024a(bkzh.class, bkzh);
    }

    private bkzh() {
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
            return GeneratedMessageLite.m124022a(f125581e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bkzh();
        } else {
            if (i2 == 4) {
                return new bxvd(f125581e);
            }
            if (i2 == 5) {
                return f125581e;
            }
            bxxk bxxk = f125582f;
            if (bxxk == null) {
                synchronized (bkzh.class) {
                    bxxk = f125582f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125581e);
                        f125582f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
