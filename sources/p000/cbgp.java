package p000;

/* renamed from: cbgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgp extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cbgp f177063h;

    /* renamed from: i */
    private static volatile bxxk f177064i;

    /* renamed from: a */
    public cbmo f177065a;

    /* renamed from: b */
    public String f177066b = "";

    /* renamed from: c */
    public String f177067c = "";

    /* renamed from: d */
    public String f177068d = "";

    /* renamed from: e */
    public int f177069e;

    /* renamed from: f */
    public String f177070f = "";

    /* renamed from: g */
    public String f177071g = "";

    static {
        cbgp cbgp = new cbgp();
        f177063h = cbgp;
        GeneratedMessageLite.m124024a(cbgp.class, cbgp);
    }

    private cbgp() {
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
            return GeneratedMessageLite.m124022a(f177063h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new cbgp();
        } else {
            if (i2 == 4) {
                return new bxvd(f177063h);
            }
            if (i2 == 5) {
                return f177063h;
            }
            bxxk bxxk = f177064i;
            if (bxxk == null) {
                synchronized (cbgp.class) {
                    bxxk = f177064i;
                    if (bxxk == null) {
                        bxxk = new bxve(f177063h);
                        f177064i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
