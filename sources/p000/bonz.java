package p000;

/* renamed from: bonz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonz extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bonz f133873h;

    /* renamed from: i */
    private static volatile bxxk f133874i;

    /* renamed from: a */
    public int f133875a;

    /* renamed from: b */
    public int f133876b;

    /* renamed from: c */
    public bonw f133877c;

    /* renamed from: d */
    public bonv f133878d;

    /* renamed from: e */
    public bons f133879e;

    /* renamed from: f */
    public bony f133880f;

    /* renamed from: g */
    public bont f133881g;

    static {
        bonz bonz = new bonz();
        f133873h = bonz;
        bxvk.m124024a(bonz.class, bonz);
    }

    private bonz() {
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
            return bxvk.m124022a(f133873h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\f\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bonz();
        } else {
            if (i2 == 4) {
                return new bxvd(f133873h);
            }
            if (i2 == 5) {
                return f133873h;
            }
            bxxk bxxk = f133874i;
            if (bxxk == null) {
                synchronized (bonz.class) {
                    bxxk = f133874i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133873h);
                        f133874i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
