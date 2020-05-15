package p000;

/* renamed from: bpge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpge extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpge f137478d;

    /* renamed from: e */
    private static volatile bxxk f137479e;

    /* renamed from: a */
    public int f137480a;

    /* renamed from: b */
    public int f137481b;

    /* renamed from: c */
    public boolean f137482c;

    static {
        bpge bpge = new bpge();
        f137478d = bpge;
        bxvk.m124024a(bpge.class, bpge);
    }

    private bpge() {
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
            return bxvk.m124022a(f137478d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", bzzv.m126374b(), "c"});
        } else if (i2 == 3) {
            return new bpge();
        } else {
            if (i2 == 4) {
                return new bxvd(f137478d);
            }
            if (i2 == 5) {
                return f137478d;
            }
            bxxk bxxk = f137479e;
            if (bxxk == null) {
                synchronized (bpge.class) {
                    bxxk = f137479e;
                    if (bxxk == null) {
                        bxxk = new bxve(f137478d);
                        f137479e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
