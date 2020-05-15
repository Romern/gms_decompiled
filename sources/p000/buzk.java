package p000;

/* renamed from: buzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final buzk f155391e;

    /* renamed from: f */
    private static volatile bxxk f155392f;

    /* renamed from: a */
    public int f155393a;

    /* renamed from: b */
    public buzt f155394b;

    /* renamed from: c */
    public bxtx f155395c = bxtx.f164797b;

    /* renamed from: d */
    public int f155396d;

    static {
        buzk buzk = new buzk();
        f155391e = buzk;
        bxvk.m124024a(buzk.class, buzk);
    }

    private buzk() {
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
            return bxvk.m124022a(f155391e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", buzr.f155422a});
        } else if (i2 == 3) {
            return new buzk();
        } else {
            if (i2 == 4) {
                return new bxvd(f155391e);
            }
            if (i2 == 5) {
                return f155391e;
            }
            bxxk bxxk = f155392f;
            if (bxxk == null) {
                synchronized (buzk.class) {
                    bxxk = f155392f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155391e);
                        f155392f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
