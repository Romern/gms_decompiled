package p000;

/* renamed from: qou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qou extends bxvk implements bxxd {

    /* renamed from: c */
    public static final qou f41893c;

    /* renamed from: d */
    private static volatile bxxk f41894d;

    /* renamed from: a */
    public int f41895a;

    /* renamed from: b */
    public int f41896b;

    static {
        qou qou = new qou();
        f41893c = qou;
        bxvk.m124024a(qou.class, qou);
    }

    private qou() {
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
            return bxvk.m124022a(f41893c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", qos.f41892a});
        } else if (i2 == 3) {
            return new qou();
        } else {
            if (i2 == 4) {
                return new bxvd(f41893c);
            }
            if (i2 == 5) {
                return f41893c;
            }
            bxxk bxxk = f41894d;
            if (bxxk == null) {
                synchronized (qou.class) {
                    bxxk = f41894d;
                    if (bxxk == null) {
                        bxxk = new bxve(f41893c);
                        f41894d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
