package p000;

/* renamed from: bpjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpjz f137929d;

    /* renamed from: e */
    private static volatile bxxk f137930e;

    /* renamed from: a */
    public int f137931a;

    /* renamed from: b */
    public int f137932b;

    /* renamed from: c */
    public int f137933c = 1;

    static {
        bpjz bpjz = new bpjz();
        f137929d = bpjz;
        bxvk.m124024a(bpjz.class, bpjz);
    }

    private bpjz() {
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
            return bxvk.m124022a(f137929d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bpjx.f137928a});
        } else if (i2 == 3) {
            return new bpjz();
        } else {
            if (i2 == 4) {
                return new bxvd(f137929d);
            }
            if (i2 == 5) {
                return f137929d;
            }
            bxxk bxxk = f137930e;
            if (bxxk == null) {
                synchronized (bpjz.class) {
                    bxxk = f137930e;
                    if (bxxk == null) {
                        bxxk = new bxve(f137929d);
                        f137930e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
