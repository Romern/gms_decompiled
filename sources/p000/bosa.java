package p000;

/* renamed from: bosa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bosa extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bosa f134539j;

    /* renamed from: k */
    private static volatile bxxk f134540k;

    /* renamed from: a */
    public int f134541a;

    /* renamed from: b */
    public int f134542b;

    /* renamed from: c */
    public int f134543c;

    /* renamed from: d */
    public int f134544d;

    /* renamed from: e */
    public int f134545e;

    /* renamed from: f */
    public int f134546f;

    /* renamed from: g */
    public int f134547g;

    /* renamed from: h */
    public int f134548h;

    /* renamed from: i */
    public int f134549i;

    static {
        bosa bosa = new bosa();
        f134539j = bosa;
        bxvk.m124024a(bosa.class, bosa);
    }

    private bosa() {
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
            return bxvk.m124022a(f134539j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bosa();
        } else {
            if (i2 == 4) {
                return new bxvd(f134539j);
            }
            if (i2 == 5) {
                return f134539j;
            }
            bxxk bxxk = f134540k;
            if (bxxk == null) {
                synchronized (bosa.class) {
                    bxxk = f134540k;
                    if (bxxk == null) {
                        bxxk = new bxve(f134539j);
                        f134540k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
