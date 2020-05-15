package p000;

/* renamed from: bwxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwxk f161378d;

    /* renamed from: e */
    private static volatile bxxk f161379e;

    /* renamed from: a */
    public int f161380a;

    /* renamed from: b */
    public bwya f161381b;

    /* renamed from: c */
    public bwya f161382c;

    static {
        bwxk bwxk = new bwxk();
        f161378d = bwxk;
        bxvk.m124024a(bwxk.class, bwxk);
    }

    private bwxk() {
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
            return bxvk.m124022a(f161378d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwxk();
        } else {
            if (i2 == 4) {
                return new bxvd(f161378d);
            }
            if (i2 == 5) {
                return f161378d;
            }
            bxxk bxxk = f161379e;
            if (bxxk == null) {
                synchronized (bwxk.class) {
                    bxxk = f161379e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161378d);
                        f161379e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
