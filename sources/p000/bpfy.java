package p000;

/* renamed from: bpfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpfy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpfy f137461c;

    /* renamed from: d */
    private static volatile bxxk f137462d;

    /* renamed from: a */
    public int f137463a;

    /* renamed from: b */
    public int f137464b;

    static {
        bpfy bpfy = new bpfy();
        f137461c = bpfy;
        bxvk.m124024a(bpfy.class, bpfy);
    }

    private bpfy() {
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
            return bxvk.m124022a(f137461c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpfy();
        } else {
            if (i2 == 4) {
                return new bxvd(f137461c);
            }
            if (i2 == 5) {
                return f137461c;
            }
            bxxk bxxk = f137462d;
            if (bxxk == null) {
                synchronized (bpfy.class) {
                    bxxk = f137462d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137461c);
                        f137462d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
