package p000;

/* renamed from: bzgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzgt f169976d;

    /* renamed from: f */
    private static volatile bxxk f169977f;

    /* renamed from: a */
    public int f169978a;

    /* renamed from: b */
    public String f169979b = "";

    /* renamed from: c */
    public String f169980c = "";

    /* renamed from: e */
    private int f169981e;

    static {
        bzgt bzgt = new bzgt();
        f169976d = bzgt;
        GeneratedMessageLite.m124024a(bzgt.class, bzgt);
    }

    private bzgt() {
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
            return GeneratedMessageLite.m124022a(f169976d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", bzgr.f169975a, "b", "c"});
        } else if (i2 == 3) {
            return new bzgt();
        } else {
            if (i2 == 4) {
                return new bxvd(f169976d);
            }
            if (i2 == 5) {
                return f169976d;
            }
            bxxk bxxk = f169977f;
            if (bxxk == null) {
                synchronized (bzgt.class) {
                    bxxk = f169977f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169976d);
                        f169977f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
