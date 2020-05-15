package p000;

/* renamed from: byym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byym extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byym f168972f;

    /* renamed from: g */
    private static volatile bxxk f168973g;

    /* renamed from: a */
    public int f168974a;

    /* renamed from: b */
    public long f168975b = 15000;

    /* renamed from: c */
    public long f168976c = 2;

    /* renamed from: d */
    public long f168977d = 600000;

    /* renamed from: e */
    public long f168978e = 600000;

    static {
        byym byym = new byym();
        f168972f = byym;
        GeneratedMessageLite.m124024a(byym.class, byym);
    }

    private byym() {
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
            return GeneratedMessageLite.m124022a(f168972f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byym();
        } else {
            if (i2 == 4) {
                return new bxvd(f168972f);
            }
            if (i2 == 5) {
                return f168972f;
            }
            bxxk bxxk = f168973g;
            if (bxxk == null) {
                synchronized (byym.class) {
                    bxxk = f168973g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168972f);
                        f168973g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
