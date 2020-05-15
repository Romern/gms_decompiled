package p000;

/* renamed from: bsas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsas extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsas f143900b;

    /* renamed from: c */
    private static volatile bxxk f143901c;

    /* renamed from: a */
    public bxwc f143902a = bxxn.f165040b;

    static {
        bsas bsas = new bsas();
        f143900b = bsas;
        bxvk.m124024a(bsas.class, bsas);
    }

    private bsas() {
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
            return bxvk.m124022a(f143900b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsar.class});
        } else if (i2 == 3) {
            return new bsas();
        } else {
            if (i2 == 4) {
                return new bxvd(f143900b);
            }
            if (i2 == 5) {
                return f143900b;
            }
            bxxk bxxk = f143901c;
            if (bxxk == null) {
                synchronized (bsas.class) {
                    bxxk = f143901c;
                    if (bxxk == null) {
                        bxxk = new bxve(f143900b);
                        f143901c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
