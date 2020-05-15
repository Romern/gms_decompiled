package p000;

/* renamed from: bwwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwwn f161262d;

    /* renamed from: e */
    public static final bxvj f161263e;

    /* renamed from: g */
    private static volatile bxxk f161264g;

    /* renamed from: a */
    public int f161265a = 0;

    /* renamed from: b */
    public Object f161266b;

    /* renamed from: c */
    public int f161267c;

    /* renamed from: f */
    private int f161268f;

    static {
        bwwn bwwn = new bwwn();
        f161262d = bwwn;
        bxvk.m124024a(bwwn.class, bwwn);
        bwoq bwoq = bwoq.f160480d;
        bwwn bwwn2 = f161262d;
        f161263e = bxvk.m124006a(bwoq, bwwn2, bwwn2, 231698332, bxzf.MESSAGE);
    }

    private bwwn() {
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
            return bxvk.m124022a(f161262d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{"b", "a", "f", "c", bwwl.f161261a, bwwk.class});
        } else if (i2 == 3) {
            return new bwwn();
        } else {
            if (i2 == 4) {
                return new bxvd(f161262d);
            }
            if (i2 == 5) {
                return f161262d;
            }
            bxxk bxxk = f161264g;
            if (bxxk == null) {
                synchronized (bwwn.class) {
                    bxxk = f161264g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161262d);
                        f161264g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
