package p000;

/* renamed from: amkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amkv extends bxvk implements bxxd {

    /* renamed from: m */
    public static final amkv f75106m;

    /* renamed from: n */
    private static volatile bxxk f75107n;

    /* renamed from: a */
    public int f75108a;

    /* renamed from: b */
    public boolean f75109b;

    /* renamed from: c */
    public boolean f75110c;

    /* renamed from: d */
    public boolean f75111d;

    /* renamed from: e */
    public boolean f75112e;

    /* renamed from: f */
    public boolean f75113f;

    /* renamed from: g */
    public int f75114g;

    /* renamed from: h */
    public boolean f75115h;

    /* renamed from: i */
    public boolean f75116i;

    /* renamed from: j */
    public boolean f75117j;

    /* renamed from: k */
    public amks f75118k;

    /* renamed from: l */
    public amku f75119l;

    static {
        amkv amkv = new amkv();
        f75106m = amkv;
        bxvk.m124024a(amkv.class, amkv);
    }

    private amkv() {
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
            return bxvk.m124022a(f75106m, "\u0001\u000b\u0000\u0001\u0004\u0012\u000b\u0000\u0000\u0000\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\u000bင\n\rဇ\f\u000eဇ\r\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဉ\u0011", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new amkv();
        } else {
            if (i2 == 4) {
                return new bxvd(f75106m);
            }
            if (i2 == 5) {
                return f75106m;
            }
            bxxk bxxk = f75107n;
            if (bxxk == null) {
                synchronized (amkv.class) {
                    bxxk = f75107n;
                    if (bxxk == null) {
                        bxxk = new bxve(f75106m);
                        f75107n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
