package p000;

/* renamed from: btvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btvx extends bxvk implements bxxd {

    /* renamed from: k */
    public static final btvx f152648k;

    /* renamed from: l */
    private static volatile bxxk f152649l;

    /* renamed from: a */
    public boolean f152650a;

    /* renamed from: b */
    public boolean f152651b;

    /* renamed from: c */
    public boolean f152652c;

    /* renamed from: d */
    public boolean f152653d;

    /* renamed from: e */
    public boolean f152654e;

    /* renamed from: f */
    public boolean f152655f;

    /* renamed from: g */
    public boolean f152656g;

    /* renamed from: h */
    public boolean f152657h;

    /* renamed from: i */
    public boolean f152658i;

    /* renamed from: j */
    public boolean f152659j;

    static {
        btvx btvx = new btvx();
        f152648k = btvx;
        bxvk.m124024a(btvx.class, btvx);
    }

    private btvx() {
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
            return bxvk.m124022a(f152648k, "\u0000\n\u0000\u0000\u0003\u0010\n\u0000\u0000\u0000\u0003\u0007\u0006\u0007\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000e\u0007\u0010\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new btvx();
        } else {
            if (i2 == 4) {
                return new bxvd(f152648k);
            }
            if (i2 == 5) {
                return f152648k;
            }
            bxxk bxxk = f152649l;
            if (bxxk == null) {
                synchronized (btvx.class) {
                    bxxk = f152649l;
                    if (bxxk == null) {
                        bxxk = new bxve(f152648k);
                        f152649l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
