package p000;

/* renamed from: btbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btbm extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btbm f148158h;

    /* renamed from: i */
    private static volatile bxxk f148159i;

    /* renamed from: a */
    public btbl f148160a;

    /* renamed from: b */
    public bxwc f148161b = bxxn.f165040b;

    /* renamed from: c */
    public String f148162c = "";

    /* renamed from: d */
    public String f148163d = "";

    /* renamed from: e */
    public bszw f148164e;

    /* renamed from: f */
    public long f148165f;

    /* renamed from: g */
    public int f148166g;

    static {
        btbm btbm = new btbm();
        f148158h = btbm;
        GeneratedMessageLite.m124024a(btbm.class, btbm);
    }

    private btbm() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f148158h, "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0001\u0000\u0001\t\u0002\u001b\u0005Ȉ\u0006Ȉ\u0007\t\b\u0002\t\u0004", new Object[]{"a", "b", btbn.class, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new btbm();
        } else {
            if (i2 == 4) {
                return new bxvd(f148158h);
            }
            if (i2 == 5) {
                return f148158h;
            }
            bxxk bxxk = f148159i;
            if (bxxk == null) {
                synchronized (btbm.class) {
                    bxxk = f148159i;
                    if (bxxk == null) {
                        bxxk = new bxve(f148158h);
                        f148159i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
