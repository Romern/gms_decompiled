package p000;

/* renamed from: bwiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwiu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwiu f159689b;

    /* renamed from: d */
    private static volatile bxxk f159690d;

    /* renamed from: a */
    public bwiv f159691a;

    /* renamed from: c */
    private int f159692c;

    static {
        bwiu bwiu = new bwiu();
        f159689b = bwiu;
        bxvk.m124024a(bwiu.class, bwiu);
    }

    private bwiu() {
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
            return bxvk.m124022a(f159689b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bwiu();
        } else {
            if (i2 == 4) {
                return new bxvd(f159689b);
            }
            if (i2 == 5) {
                return f159689b;
            }
            bxxk bxxk = f159690d;
            if (bxxk == null) {
                synchronized (bwiu.class) {
                    bxxk = f159690d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159689b);
                        f159690d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
