package p000;

/* renamed from: byxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxs extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byxs f168786e;

    /* renamed from: f */
    private static volatile bxxk f168787f;

    /* renamed from: a */
    public int f168788a;

    /* renamed from: b */
    public int f168789b;

    /* renamed from: c */
    public bxwc f168790c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f168791d = bxxn.f165040b;

    static {
        byxs byxs = new byxs();
        f168786e = byxs;
        GeneratedMessageLite.m124024a(byxs.class, byxs);
    }

    private byxs() {
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
            return GeneratedMessageLite.m124022a(f168786e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", byxn.class, "d", byxk.class});
        } else if (i2 == 3) {
            return new byxs();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f168786e;
            }
            bxxk bxxk = f168787f;
            if (bxxk == null) {
                synchronized (byxs.class) {
                    bxxk = f168787f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168786e);
                        f168787f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
