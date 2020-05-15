package p000;

/* renamed from: bsad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsad extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsad f143828d;

    /* renamed from: e */
    private static volatile bxxk f143829e;

    /* renamed from: a */
    public int f143830a;

    /* renamed from: b */
    public bxwc f143831b = bxxn.f165040b;

    /* renamed from: c */
    public int f143832c = 1;

    static {
        bsad bsad = new bsad();
        f143828d = bsad;
        bxvk.m124024a(bsad.class, bsad);
    }

    private bsad() {
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
            return bxvk.m124022a(f143828d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"a", "b", bsai.class, "c", brzr.f143778a});
        } else if (i2 == 3) {
            return new bsad();
        } else {
            if (i2 == 4) {
                return new bsac();
            }
            if (i2 == 5) {
                return f143828d;
            }
            bxxk bxxk = f143829e;
            if (bxxk == null) {
                synchronized (bsad.class) {
                    bxxk = f143829e;
                    if (bxxk == null) {
                        bxxk = new bxve(f143828d);
                        f143829e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
