package p000;

/* renamed from: bwxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwxo f161395b;

    /* renamed from: c */
    public static final bxvj f161396c;

    /* renamed from: e */
    private static volatile bxxk f161397e;

    /* renamed from: a */
    public int f161398a;

    /* renamed from: d */
    private int f161399d;

    static {
        bwxo bwxo = new bwxo();
        f161395b = bwxo;
        bxvk.m124024a(bwxo.class, bwxo);
        bwou bwou = bwou.f160492e;
        bwxo bwxo2 = f161395b;
        f161396c = bxvk.m124006a(bwou, bwxo2, bwxo2, 234156385, bxzf.MESSAGE);
    }

    private bwxo() {
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
            return bxvk.m124022a(f161395b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwxm.f161394a});
        } else if (i2 == 3) {
            return new bwxo();
        } else {
            if (i2 == 4) {
                return new bxvd(f161395b);
            }
            if (i2 == 5) {
                return f161395b;
            }
            bxxk bxxk = f161397e;
            if (bxxk == null) {
                synchronized (bwxo.class) {
                    bxxk = f161397e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161395b);
                        f161397e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
