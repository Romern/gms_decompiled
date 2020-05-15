package p000;

/* renamed from: bzqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqe extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzqe f170976d;

    /* renamed from: f */
    private static volatile bxxk f170977f;

    /* renamed from: a */
    public int f170978a;

    /* renamed from: b */
    public String f170979b = "";

    /* renamed from: c */
    public long f170980c;

    /* renamed from: e */
    private int f170981e;

    static {
        bzqe bzqe = new bzqe();
        f170976d = bzqe;
        GeneratedMessageLite.m124024a(bzqe.class, bzqe);
    }

    private bzqe() {
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
            return GeneratedMessageLite.m124022a(f170976d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bzqe();
        } else {
            if (i2 == 4) {
                return new bxvd(f170976d);
            }
            if (i2 == 5) {
                return f170976d;
            }
            bxxk bxxk = f170977f;
            if (bxxk == null) {
                synchronized (bzqe.class) {
                    bxxk = f170977f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170976d);
                        f170977f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
