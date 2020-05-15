package p000;

/* renamed from: byhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhy extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byhy f166528f;

    /* renamed from: g */
    private static volatile bxxk f166529g;

    /* renamed from: a */
    public int f166530a;

    /* renamed from: b */
    public int f166531b;

    /* renamed from: c */
    public bxtx f166532c = bxtx.f164797b;

    /* renamed from: d */
    public long f166533d;

    /* renamed from: e */
    public String f166534e = "";

    static {
        byhy byhy = new byhy();
        f166528f = byhy;
        bxvk.m124024a(byhy.class, byhy);
    }

    private byhy() {
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
            return bxvk.m124022a(f166528f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", byhx.m124832b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new byhy();
        } else {
            if (i2 == 4) {
                return new bxvd(f166528f);
            }
            if (i2 == 5) {
                return f166528f;
            }
            bxxk bxxk = f166529g;
            if (bxxk == null) {
                synchronized (byhy.class) {
                    bxxk = f166529g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166528f);
                        f166529g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
