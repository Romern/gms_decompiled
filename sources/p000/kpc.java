package p000;

/* renamed from: kpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final kpc f24718d;

    /* renamed from: e */
    private static volatile bxxk f24719e;

    /* renamed from: a */
    public int f24720a;

    /* renamed from: b */
    public int f24721b;

    /* renamed from: c */
    public int f24722c;

    static {
        kpc kpc = new kpc();
        f24718d = kpc;
        bxvk.m124024a(kpc.class, kpc);
    }

    private kpc() {
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
            return bxvk.m124022a(f24718d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new kpc();
        } else {
            if (i2 == 4) {
                return new bxvd(f24718d);
            }
            if (i2 == 5) {
                return f24718d;
            }
            bxxk bxxk = f24719e;
            if (bxxk == null) {
                synchronized (kpc.class) {
                    bxxk = f24719e;
                    if (bxxk == null) {
                        bxxk = new bxve(f24718d);
                        f24719e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
