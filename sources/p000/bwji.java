package p000;

/* renamed from: bwji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwji extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwji f159782d;

    /* renamed from: e */
    private static volatile bxxk f159783e;

    /* renamed from: a */
    public int f159784a;

    /* renamed from: b */
    public bmaj f159785b;

    /* renamed from: c */
    public bwjh f159786c;

    static {
        bwji bwji = new bwji();
        f159782d = bwji;
        bxvk.m124024a(bwji.class, bwji);
    }

    private bwji() {
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
            return bxvk.m124022a(f159782d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwji();
        } else {
            if (i2 == 4) {
                return new bxvd(f159782d);
            }
            if (i2 == 5) {
                return f159782d;
            }
            bxxk bxxk = f159783e;
            if (bxxk == null) {
                synchronized (bwji.class) {
                    bxxk = f159783e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159782d);
                        f159783e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
