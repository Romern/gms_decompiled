package p000;

/* renamed from: bsit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsit extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsit f144753b;

    /* renamed from: c */
    private static volatile bxxk f144754c;

    /* renamed from: a */
    public bxwc f144755a = bxxn.f165040b;

    static {
        bsit bsit = new bsit();
        f144753b = bsit;
        bxvk.m124024a(bsit.class, bsit);
    }

    private bsit() {
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
            return bxvk.m124022a(f144753b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsjf.class});
        } else if (i2 == 3) {
            return new bsit();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f144753b;
            }
            bxxk bxxk = f144754c;
            if (bxxk == null) {
                synchronized (bsit.class) {
                    bxxk = f144754c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144753b);
                        f144754c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
