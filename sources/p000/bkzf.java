package p000;

/* renamed from: bkzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkzf f125571d;

    /* renamed from: e */
    private static volatile bxxk f125572e;

    /* renamed from: a */
    public int f125573a;

    /* renamed from: b */
    public int f125574b;

    /* renamed from: c */
    public long f125575c;

    static {
        bkzf bkzf = new bkzf();
        f125571d = bkzf;
        bxvk.m124024a(bkzf.class, bkzf);
    }

    private bkzf() {
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
            return bxvk.m124022a(f125571d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkzf();
        } else {
            if (i2 == 4) {
                return new bxvd(f125571d);
            }
            if (i2 == 5) {
                return f125571d;
            }
            bxxk bxxk = f125572e;
            if (bxxk == null) {
                synchronized (bkzf.class) {
                    bxxk = f125572e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125571d);
                        f125572e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
