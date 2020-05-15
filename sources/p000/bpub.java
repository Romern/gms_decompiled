package p000;

/* renamed from: bpub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpub extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpub f139226d;

    /* renamed from: e */
    private static volatile bxxk f139227e;

    /* renamed from: a */
    public int f139228a;

    /* renamed from: b */
    public long f139229b;

    /* renamed from: c */
    public bxwc f139230c = bxxn.f165040b;

    static {
        bpub bpub = new bpub();
        f139226d = bpub;
        bxvk.m124024a(bpub.class, bpub);
    }

    private bpub() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f139226d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0004\u001b", new Object[]{"a", "b", "c", bpua.class});
        } else if (i2 == 3) {
            return new bpub();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f139226d;
            }
            bxxk bxxk = f139227e;
            if (bxxk == null) {
                synchronized (bpub.class) {
                    bxxk = f139227e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139226d);
                        f139227e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
