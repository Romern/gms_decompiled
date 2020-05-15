package p000;

/* renamed from: bwyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwyu f161528c;

    /* renamed from: e */
    private static volatile bxxk f161529e;

    /* renamed from: a */
    public int f161530a;

    /* renamed from: b */
    public bxvw f161531b = bxwq.f165002b;

    /* renamed from: d */
    private int f161532d;

    static {
        bwyu bwyu = new bwyu();
        f161528c = bwyu;
        bxvk.m124024a(bwyu.class, bwyu);
    }

    private bwyu() {
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
            return bxvk.m124022a(f161528c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bwyu();
        } else {
            if (i2 == 4) {
                return new bxvd(f161528c);
            }
            if (i2 == 5) {
                return f161528c;
            }
            bxxk bxxk = f161529e;
            if (bxxk == null) {
                synchronized (bwyu.class) {
                    bxxk = f161529e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161528c);
                        f161529e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
