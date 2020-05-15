package p000;

/* renamed from: buzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzp extends bxvg implements bxvh {

    /* renamed from: c */
    public static final buzp f155413c;

    /* renamed from: e */
    private static volatile bxxk f155414e;

    /* renamed from: a */
    public int f155415a;

    /* renamed from: b */
    public int f155416b;

    /* renamed from: d */
    private byte f155417d = 2;

    static {
        buzp buzp = new buzp();
        f155413c = buzp;
        GeneratedMessageLite.m124024a(buzp.class, buzp);
    }

    private buzp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155417d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155417d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f155413c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0000", new Object[]{"a", "b", buzr.f155422a});
        } else if (i2 == 3) {
            return new buzp();
        } else {
            if (i2 == 4) {
                return new bxvf(f155413c);
            }
            if (i2 == 5) {
                return f155413c;
            }
            bxxk bxxk = f155414e;
            if (bxxk == null) {
                synchronized (buzp.class) {
                    bxxk = f155414e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155413c);
                        f155414e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
