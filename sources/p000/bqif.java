package p000;

/* renamed from: bqif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqif extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bqif f140792c;

    /* renamed from: d */
    private static volatile bxxk f140793d;

    /* renamed from: a */
    public int f140794a = 0;

    /* renamed from: b */
    public Object f140795b;

    static {
        bqif bqif = new bqif();
        f140792c = bqif;
        GeneratedMessageLite.m124024a(bqif.class, bqif);
    }

    private bqif() {
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
            return GeneratedMessageLite.m124022a(f140792c, "\u0000\u0002\u0001\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", bqhv.class, bqhw.class});
        } else if (i2 == 3) {
            return new bqif();
        } else {
            if (i2 == 4) {
                return new bxvd(f140792c);
            }
            if (i2 == 5) {
                return f140792c;
            }
            bxxk bxxk = f140793d;
            if (bxxk == null) {
                synchronized (bqif.class) {
                    bxxk = f140793d;
                    if (bxxk == null) {
                        bxxk = new bxve(f140792c);
                        f140793d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
