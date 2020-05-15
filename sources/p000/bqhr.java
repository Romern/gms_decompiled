package p000;

/* renamed from: bqhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bqhr f140705b;

    /* renamed from: c */
    private static volatile bxxk f140706c;

    /* renamed from: a */
    public long f140707a;

    static {
        bqhr bqhr = new bqhr();
        f140705b = bqhr;
        bxvk.m124024a(bqhr.class, bqhr);
    }

    private bqhr() {
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
            return bxvk.m124022a(f140705b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bqhr();
        } else {
            if (i2 == 4) {
                return new bxvd(f140705b);
            }
            if (i2 == 5) {
                return f140705b;
            }
            bxxk bxxk = f140706c;
            if (bxxk == null) {
                synchronized (bqhr.class) {
                    bxxk = f140706c;
                    if (bxxk == null) {
                        bxxk = new bxve(f140705b);
                        f140706c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
