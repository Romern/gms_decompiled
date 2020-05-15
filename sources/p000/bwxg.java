package p000;

/* renamed from: bwxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwxg extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bwxg f161345e;

    /* renamed from: f */
    private static volatile bxxk f161346f;

    /* renamed from: a */
    public int f161347a;

    /* renamed from: b */
    public bwxf f161348b;

    /* renamed from: c */
    public bwxf f161349c;

    /* renamed from: d */
    public bwwz f161350d;

    static {
        bwxg bwxg = new bwxg();
        f161345e = bwxg;
        bxvk.m124024a(bwxg.class, bwxg);
    }

    private bwxg() {
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
            return bxvk.m124022a(f161345e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwxg();
        } else {
            if (i2 == 4) {
                return new bxvd(f161345e);
            }
            if (i2 == 5) {
                return f161345e;
            }
            bxxk bxxk = f161346f;
            if (bxxk == null) {
                synchronized (bwxg.class) {
                    bxxk = f161346f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161345e);
                        f161346f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
