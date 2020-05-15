package p000;

/* renamed from: bkya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkya extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bkya f125435a;

    /* renamed from: c */
    private static volatile bxxk f125436c;

    /* renamed from: b */
    private bxww f125437b = bxww.f165013b;

    static {
        bkya bkya = new bkya();
        f125435a = bkya;
        GeneratedMessageLite.m124024a(bkya.class, bkya);
    }

    private bkya() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f125435a, "\u0001\u0001\u0000\u0000vv\u0001\u0001\u0000\u0000v2", new Object[]{"b", bkxz.f125434a});
        } else if (i2 == 3) {
            return new bkya();
        } else {
            if (i2 == 4) {
                return new bxvd(f125435a);
            }
            if (i2 == 5) {
                return f125435a;
            }
            bxxk bxxk = f125436c;
            if (bxxk == null) {
                synchronized (bkya.class) {
                    bxxk = f125436c;
                    if (bxxk == null) {
                        bxxk = new bxve(f125435a);
                        f125436c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
