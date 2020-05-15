package p000;

/* renamed from: bsis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsis extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsis f144750b;

    /* renamed from: c */
    private static volatile bxxk f144751c;

    /* renamed from: a */
    public bsjk f144752a;

    static {
        bsis bsis = new bsis();
        f144750b = bsis;
        bxvk.m124024a(bsis.class, bsis);
    }

    private bsis() {
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
            return bxvk.m124022a(f144750b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsis();
        } else {
            if (i2 == 4) {
                return new bxvd(f144750b);
            }
            if (i2 == 5) {
                return f144750b;
            }
            bxxk bxxk = f144751c;
            if (bxxk == null) {
                synchronized (bsis.class) {
                    bxxk = f144751c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144750b);
                        f144751c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
