package p000;

/* renamed from: buzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzl extends bxvk implements bxxd {

    /* renamed from: g */
    public static final buzl f155397g;

    /* renamed from: i */
    private static volatile bxxk f155398i;

    /* renamed from: a */
    public int f155399a;

    /* renamed from: b */
    public bvaa f155400b;

    /* renamed from: c */
    public int f155401c;

    /* renamed from: d */
    public buzo f155402d;

    /* renamed from: e */
    public buzq f155403e;

    /* renamed from: f */
    public String f155404f = "";

    /* renamed from: h */
    private byte f155405h = 2;

    static {
        buzl buzl = new buzl();
        f155397g = buzl;
        bxvk.m124024a(buzl.class, buzl);
    }

    private buzl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155405h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155405h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f155397g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", buzm.f155406a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new buzl();
        } else {
            if (i2 == 4) {
                return new bxvd(f155397g);
            }
            if (i2 == 5) {
                return f155397g;
            }
            bxxk bxxk = f155398i;
            if (bxxk == null) {
                synchronized (buzl.class) {
                    bxxk = f155398i;
                    if (bxxk == null) {
                        bxxk = new bxve(f155397g);
                        f155398i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
