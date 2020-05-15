package p000;

/* renamed from: bsjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjs extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsjs f144842b;

    /* renamed from: c */
    private static volatile bxxk f144843c;

    /* renamed from: a */
    public bsjt f144844a;

    static {
        bsjs bsjs = new bsjs();
        f144842b = bsjs;
        bxvk.m124024a(bsjs.class, bsjs);
    }

    private bsjs() {
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
            return bxvk.m124022a(f144842b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsjs();
        } else {
            if (i2 == 4) {
                return new bxvd(f144842b);
            }
            if (i2 == 5) {
                return f144842b;
            }
            bxxk bxxk = f144843c;
            if (bxxk == null) {
                synchronized (bsjs.class) {
                    bxxk = f144843c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144842b);
                        f144843c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
