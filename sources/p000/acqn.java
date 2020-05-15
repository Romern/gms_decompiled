package p000;

/* renamed from: acqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final acqn f60505c;

    /* renamed from: e */
    private static volatile bxxk f60506e;

    /* renamed from: a */
    public bxwc f60507a = bxxn.f165040b;

    /* renamed from: b */
    public int f60508b;

    /* renamed from: d */
    private int f60509d;

    static {
        acqn acqn = new acqn();
        f60505c = acqn;
        bxvk.m124024a(acqn.class, acqn);
    }

    private acqn() {
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
            return bxvk.m124022a(f60505c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"d", "a", acqm.class, "b"});
        } else if (i2 == 3) {
            return new acqn();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f60505c;
            }
            bxxk bxxk = f60506e;
            if (bxxk == null) {
                synchronized (acqn.class) {
                    bxxk = f60506e;
                    if (bxxk == null) {
                        bxxk = new bxve(f60505c);
                        f60506e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
