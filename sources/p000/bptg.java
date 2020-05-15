package p000;

/* renamed from: bptg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bptg f139107c;

    /* renamed from: d */
    private static volatile bxxk f139108d;

    /* renamed from: a */
    public int f139109a;

    /* renamed from: b */
    public int f139110b;

    static {
        bptg bptg = new bptg();
        f139107c = bptg;
        bxvk.m124024a(bptg.class, bptg);
    }

    private bptg() {
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
            return bxvk.m124022a(f139107c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bptg();
        } else {
            if (i2 == 4) {
                return new bxvd(f139107c);
            }
            if (i2 == 5) {
                return f139107c;
            }
            bxxk bxxk = f139108d;
            if (bxxk == null) {
                synchronized (bptg.class) {
                    bxxk = f139108d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139107c);
                        f139108d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
