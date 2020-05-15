package p000;

/* renamed from: ayya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayya extends bxvk implements bxxd {

    /* renamed from: b */
    public static final ayya f98724b;

    /* renamed from: d */
    private static volatile bxxk f98725d;

    /* renamed from: a */
    public int f98726a;

    /* renamed from: c */
    private int f98727c;

    static {
        ayya ayya = new ayya();
        f98724b = ayya;
        bxvk.m124024a(ayya.class, ayya);
    }

    private ayya() {
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
            return bxvk.m124022a(f98724b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bqbl.f140384a});
        } else if (i2 == 3) {
            return new ayya();
        } else {
            if (i2 == 4) {
                return new bxvd(f98724b);
            }
            if (i2 == 5) {
                return f98724b;
            }
            bxxk bxxk = f98725d;
            if (bxxk == null) {
                synchronized (ayya.class) {
                    bxxk = f98725d;
                    if (bxxk == null) {
                        bxxk = new bxve(f98724b);
                        f98725d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
