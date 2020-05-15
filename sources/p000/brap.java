package p000;

/* renamed from: brap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brap extends bxvk implements bxxd {

    /* renamed from: c */
    public static final brap f142167c;

    /* renamed from: d */
    private static volatile bxxk f142168d;

    /* renamed from: a */
    public int f142169a = 0;

    /* renamed from: b */
    public Object f142170b;

    static {
        brap brap = new brap();
        f142167c = brap;
        bxvk.m124024a(brap.class, brap);
    }

    private brap() {
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
            return bxvk.m124022a(f142167c, "\u0001\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new brap();
        } else {
            if (i2 == 4) {
                return new bxvd(f142167c);
            }
            if (i2 == 5) {
                return f142167c;
            }
            bxxk bxxk = f142168d;
            if (bxxk == null) {
                synchronized (brap.class) {
                    bxxk = f142168d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142167c);
                        f142168d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
