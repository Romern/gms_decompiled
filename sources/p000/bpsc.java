package p000;

/* renamed from: bpsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsc extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bpsc f138934h;

    /* renamed from: i */
    private static volatile bxxk f138935i;

    /* renamed from: a */
    public int f138936a;

    /* renamed from: b */
    public boolean f138937b;

    /* renamed from: c */
    public boolean f138938c;

    /* renamed from: d */
    public boolean f138939d;

    /* renamed from: e */
    public boolean f138940e;

    /* renamed from: f */
    public boolean f138941f;

    /* renamed from: g */
    public boolean f138942g;

    static {
        bpsc bpsc = new bpsc();
        f138934h = bpsc;
        bxvk.m124024a(bpsc.class, bpsc);
    }

    private bpsc() {
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
            return bxvk.m124022a(f138934h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpsc();
        } else {
            if (i2 == 4) {
                return new bxvd(f138934h);
            }
            if (i2 == 5) {
                return f138934h;
            }
            bxxk bxxk = f138935i;
            if (bxxk == null) {
                synchronized (bpsc.class) {
                    bxxk = f138935i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138934h);
                        f138935i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
