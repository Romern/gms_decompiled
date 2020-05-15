package p000;

/* renamed from: bpvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpvp f139399c;

    /* renamed from: d */
    private static volatile bxxk f139400d;

    /* renamed from: a */
    public int f139401a;

    /* renamed from: b */
    public int f139402b;

    static {
        bpvp bpvp = new bpvp();
        f139399c = bpvp;
        bxvk.m124024a(bpvp.class, bpvp);
    }

    private bpvp() {
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
            return bxvk.m124022a(f139399c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpvo.f139398a});
        } else if (i2 == 3) {
            return new bpvp();
        } else {
            if (i2 == 4) {
                return new bxvd(f139399c);
            }
            if (i2 == 5) {
                return f139399c;
            }
            bxxk bxxk = f139400d;
            if (bxxk == null) {
                synchronized (bpvp.class) {
                    bxxk = f139400d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139399c);
                        f139400d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
