package p000;

/* renamed from: buyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyq extends bxvg implements bxvh {

    /* renamed from: f */
    public static final buyq f155323f;

    /* renamed from: h */
    private static volatile bxxk f155324h;

    /* renamed from: a */
    public int f155325a;

    /* renamed from: b */
    public int f155326b;

    /* renamed from: c */
    public buzq f155327c;

    /* renamed from: d */
    public buzh f155328d;

    /* renamed from: e */
    public buyx f155329e;

    /* renamed from: g */
    private byte f155330g = 2;

    static {
        buyq buyq = new buyq();
        f155323f = buyq;
        bxvk.m124024a(buyq.class, buyq);
    }

    private buyq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155330g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155330g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f155323f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", buys.f155335a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new buyq();
        } else {
            if (i2 == 4) {
                return new bxvf(f155323f);
            }
            if (i2 == 5) {
                return f155323f;
            }
            bxxk bxxk = f155324h;
            if (bxxk == null) {
                synchronized (buyq.class) {
                    bxxk = f155324h;
                    if (bxxk == null) {
                        bxxk = new bxve(f155323f);
                        f155324h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
