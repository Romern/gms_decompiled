package p000;

/* renamed from: buzv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzv extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buzv f155434c;

    /* renamed from: d */
    private static volatile bxxk f155435d;

    /* renamed from: a */
    public int f155436a;

    /* renamed from: b */
    public bxtx f155437b = bxtx.f164797b;

    static {
        buzv buzv = new buzv();
        f155434c = buzv;
        bxvk.m124024a(buzv.class, buzv);
    }

    private buzv() {
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
            return bxvk.m124022a(f155434c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buzv();
        } else {
            if (i2 == 4) {
                return new bxvd(f155434c);
            }
            if (i2 == 5) {
                return f155434c;
            }
            bxxk bxxk = f155435d;
            if (bxxk == null) {
                synchronized (buzv.class) {
                    bxxk = f155435d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155434c);
                        f155435d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
