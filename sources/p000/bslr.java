package p000;

/* renamed from: bslr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bslr f144942b;

    /* renamed from: d */
    private static volatile bxxk f144943d;

    /* renamed from: a */
    public int f144944a;

    /* renamed from: c */
    private int f144945c;

    static {
        bslr bslr = new bslr();
        f144942b = bslr;
        bxvk.m124024a(bslr.class, bslr);
    }

    private bslr() {
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
            return bxvk.m124022a(f144942b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bslj.f144928a});
        } else if (i2 == 3) {
            return new bslr();
        } else {
            if (i2 == 4) {
                return new bxvd(f144942b);
            }
            if (i2 == 5) {
                return f144942b;
            }
            bxxk bxxk = f144943d;
            if (bxxk == null) {
                synchronized (bslr.class) {
                    bxxk = f144943d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144942b);
                        f144943d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
