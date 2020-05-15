package p000;

/* renamed from: bpjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpjr f137907c;

    /* renamed from: d */
    private static volatile bxxk f137908d;

    /* renamed from: a */
    public int f137909a;

    /* renamed from: b */
    public boolean f137910b;

    static {
        bpjr bpjr = new bpjr();
        f137907c = bpjr;
        bxvk.m124024a(bpjr.class, bpjr);
    }

    private bpjr() {
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
            return bxvk.m124022a(f137907c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpjr();
        } else {
            if (i2 == 4) {
                return new bxvd(f137907c);
            }
            if (i2 == 5) {
                return f137907c;
            }
            bxxk bxxk = f137908d;
            if (bxxk == null) {
                synchronized (bpjr.class) {
                    bxxk = f137908d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137907c);
                        f137908d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
