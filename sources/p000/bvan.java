package p000;

/* renamed from: bvan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvan extends bxvg implements bxvh {

    /* renamed from: d */
    public static final bvan f155497d;

    /* renamed from: f */
    private static volatile bxxk f155498f;

    /* renamed from: a */
    public int f155499a;

    /* renamed from: b */
    public int f155500b;

    /* renamed from: c */
    public byyg f155501c;

    /* renamed from: e */
    private byte f155502e = 2;

    static {
        bvan bvan = new bvan();
        f155497d = bvan;
        bxvk.m124024a(bvan.class, bvan);
    }

    private bvan() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155502e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155502e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f155497d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", bvao.f155503a, "c"});
        } else if (i2 == 3) {
            return new bvan();
        } else {
            if (i2 == 4) {
                return new bxvf(f155497d);
            }
            if (i2 == 5) {
                return f155497d;
            }
            bxxk bxxk = f155498f;
            if (bxxk == null) {
                synchronized (bvan.class) {
                    bxxk = f155498f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155497d);
                        f155498f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
