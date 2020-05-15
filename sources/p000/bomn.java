package p000;

/* renamed from: bomn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bomn f133673d;

    /* renamed from: e */
    private static volatile bxxk f133674e;

    /* renamed from: a */
    public int f133675a;

    /* renamed from: b */
    public int f133676b;

    /* renamed from: c */
    public int f133677c;

    static {
        bomn bomn = new bomn();
        f133673d = bomn;
        bxvk.m124024a(bomn.class, bomn);
    }

    private bomn() {
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
            return bxvk.m124022a(f133673d, "\u0000\u0003\u0000\u0000\u0001\b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\b\u000b", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bomn();
        } else {
            if (i2 == 4) {
                return new bxvd(f133673d);
            }
            if (i2 == 5) {
                return f133673d;
            }
            bxxk bxxk = f133674e;
            if (bxxk == null) {
                synchronized (bomn.class) {
                    bxxk = f133674e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133673d);
                        f133674e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
