package p000;

/* renamed from: bwka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwka extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwka f159929d;

    /* renamed from: e */
    private static volatile bxxk f159930e;

    /* renamed from: a */
    public int f159931a;

    /* renamed from: b */
    public bmaj f159932b;

    /* renamed from: c */
    public bwjz f159933c;

    static {
        bwka bwka = new bwka();
        f159929d = bwka;
        bxvk.m124024a(bwka.class, bwka);
    }

    private bwka() {
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
            return bxvk.m124022a(f159929d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwka();
        } else {
            if (i2 == 4) {
                return new bxvd(f159929d);
            }
            if (i2 == 5) {
                return f159929d;
            }
            bxxk bxxk = f159930e;
            if (bxxk == null) {
                synchronized (bwka.class) {
                    bxxk = f159930e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159929d);
                        f159930e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
