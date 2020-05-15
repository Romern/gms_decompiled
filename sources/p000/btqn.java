package p000;

/* renamed from: btqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btqn f149986e;

    /* renamed from: f */
    private static volatile bxxk f149987f;

    /* renamed from: a */
    public btnc f149988a;

    /* renamed from: b */
    public bxwc f149989b = bxxn.f165040b;

    /* renamed from: c */
    public long f149990c;

    /* renamed from: d */
    public int f149991d;

    static {
        btqn btqn = new btqn();
        f149986e = btqn;
        GeneratedMessageLite.m124024a(btqn.class, btqn);
    }

    private btqn() {
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
            return GeneratedMessageLite.m124022a(f149986e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\u0002\u0004\f", new Object[]{"a", "b", btqm.class, "c", "d"});
        } else if (i2 == 3) {
            return new btqn();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f149986e;
            }
            bxxk bxxk = f149987f;
            if (bxxk == null) {
                synchronized (btqn.class) {
                    bxxk = f149987f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149986e);
                        f149987f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
