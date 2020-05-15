package p000;

/* renamed from: agmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agmt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final agmt f65982e;

    /* renamed from: f */
    private static volatile bxxk f65983f;

    /* renamed from: a */
    public int f65984a;

    /* renamed from: b */
    public int f65985b;

    /* renamed from: c */
    public bxwc f65986c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f65987d = bxxn.f165040b;

    static {
        agmt agmt = new agmt();
        f65982e = agmt;
        bxvk.m124024a(agmt.class, agmt);
    }

    private agmt() {
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
            return bxvk.m124022a(f65982e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", agmz.class, "d", agmu.class});
        } else if (i2 == 3) {
            return new agmt();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f65982e;
            }
            bxxk bxxk = f65983f;
            if (bxxk == null) {
                synchronized (agmt.class) {
                    bxxk = f65983f;
                    if (bxxk == null) {
                        bxxk = new bxve(f65982e);
                        f65983f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
