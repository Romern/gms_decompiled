package p000;

/* renamed from: byxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxl extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byxl f168753f;

    /* renamed from: g */
    private static volatile bxxk f168754g;

    /* renamed from: a */
    public int f168755a;

    /* renamed from: b */
    public String f168756b = "";

    /* renamed from: c */
    public long f168757c;

    /* renamed from: d */
    public byxb f168758d;

    /* renamed from: e */
    public byxo f168759e;

    static {
        byxl byxl = new byxl();
        f168753f = byxl;
        GeneratedMessageLite.m124024a(byxl.class, byxl);
    }

    private byxl() {
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
            return GeneratedMessageLite.m124022a(f168753f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byxl();
        } else {
            if (i2 == 4) {
                return new bxvd(f168753f);
            }
            if (i2 == 5) {
                return f168753f;
            }
            bxxk bxxk = f168754g;
            if (bxxk == null) {
                synchronized (byxl.class) {
                    bxxk = f168754g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168753f);
                        f168754g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
