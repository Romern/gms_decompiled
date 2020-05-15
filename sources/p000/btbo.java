package p000;

/* renamed from: btbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbo extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btbo f148180e;

    /* renamed from: f */
    private static volatile bxxk f148181f;

    /* renamed from: a */
    public long f148182a;

    /* renamed from: b */
    public String f148183b = "";

    /* renamed from: c */
    public bxyk f148184c;

    /* renamed from: d */
    public int f148185d;

    static {
        btbo btbo = new btbo();
        f148180e = btbo;
        GeneratedMessageLite.m124024a(btbo.class, btbo);
    }

    private btbo() {
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
            return GeneratedMessageLite.m124022a(f148180e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\t\u0004\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btbo();
        } else {
            if (i2 == 4) {
                return new bxvd(f148180e);
            }
            if (i2 == 5) {
                return f148180e;
            }
            bxxk bxxk = f148181f;
            if (bxxk == null) {
                synchronized (btbo.class) {
                    bxxk = f148181f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148180e);
                        f148181f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
