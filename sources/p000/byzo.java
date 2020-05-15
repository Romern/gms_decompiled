package p000;

/* renamed from: byzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byzo f169137c;

    /* renamed from: d */
    private static volatile bxxk f169138d;

    /* renamed from: a */
    public int f169139a;

    /* renamed from: b */
    public int f169140b;

    static {
        byzo byzo = new byzo();
        f169137c = byzo;
        bxvk.m124024a(byzo.class, byzo);
    }

    private byzo() {
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
            return bxvk.m124022a(f169137c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzbu.m125628b()});
        } else if (i2 == 3) {
            return new byzo();
        } else {
            if (i2 == 4) {
                return new bxvd(f169137c);
            }
            if (i2 == 5) {
                return f169137c;
            }
            bxxk bxxk = f169138d;
            if (bxxk == null) {
                synchronized (byzo.class) {
                    bxxk = f169138d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169137c);
                        f169138d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
