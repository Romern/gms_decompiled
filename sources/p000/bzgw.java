package p000;

/* renamed from: bzgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzgw f169993c;

    /* renamed from: e */
    private static volatile bxxk f169994e;

    /* renamed from: a */
    public String f169995a = "";

    /* renamed from: b */
    public String f169996b = "";

    /* renamed from: d */
    private int f169997d;

    static {
        bzgw bzgw = new bzgw();
        f169993c = bzgw;
        GeneratedMessageLite.m124024a(bzgw.class, bzgw);
    }

    private bzgw() {
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
            return GeneratedMessageLite.m124022a(f169993c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzgw();
        } else {
            if (i2 == 4) {
                return new bxvd(f169993c);
            }
            if (i2 == 5) {
                return f169993c;
            }
            bxxk bxxk = f169994e;
            if (bxxk == null) {
                synchronized (bzgw.class) {
                    bxxk = f169994e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169993c);
                        f169994e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
