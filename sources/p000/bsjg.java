package p000;

/* renamed from: bsjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjg extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsjg f144789b;

    /* renamed from: c */
    private static volatile bxxk f144790c;

    /* renamed from: a */
    public float f144791a;

    static {
        bsjg bsjg = new bsjg();
        f144789b = bsjg;
        bxvk.m124024a(bsjg.class, bsjg);
    }

    private bsjg() {
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
            return bxvk.m124022a(f144789b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsjg();
        } else {
            if (i2 == 4) {
                return new bxvd(f144789b);
            }
            if (i2 == 5) {
                return f144789b;
            }
            bxxk bxxk = f144790c;
            if (bxxk == null) {
                synchronized (bsjg.class) {
                    bxxk = f144790c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144789b);
                        f144790c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
