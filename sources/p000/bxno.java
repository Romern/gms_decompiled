package p000;

/* renamed from: bxno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxno extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxno f164069c;

    /* renamed from: d */
    private static volatile bxxk f164070d;

    /* renamed from: a */
    public int f164071a;

    /* renamed from: b */
    public bxnt f164072b;

    static {
        bxno bxno = new bxno();
        f164069c = bxno;
        bxvk.m124024a(bxno.class, bxno);
    }

    private bxno() {
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
            return bxvk.m124022a(f164069c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxno();
        } else {
            if (i2 == 4) {
                return new bxvd(f164069c);
            }
            if (i2 == 5) {
                return f164069c;
            }
            bxxk bxxk = f164070d;
            if (bxxk == null) {
                synchronized (bxno.class) {
                    bxxk = f164070d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164069c);
                        f164070d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
