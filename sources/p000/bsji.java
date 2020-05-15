package p000;

/* renamed from: bsji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsji extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsji f144795c;

    /* renamed from: d */
    private static volatile bxxk f144796d;

    /* renamed from: a */
    public int f144797a;

    /* renamed from: b */
    public float f144798b;

    static {
        bsji bsji = new bsji();
        f144795c = bsji;
        bxvk.m124024a(bsji.class, bsji);
    }

    private bsji() {
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
            return bxvk.m124022a(f144795c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsji();
        } else {
            if (i2 == 4) {
                return new bxvd(f144795c);
            }
            if (i2 == 5) {
                return f144795c;
            }
            bxxk bxxk = f144796d;
            if (bxxk == null) {
                synchronized (bsji.class) {
                    bxxk = f144796d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144795c);
                        f144796d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
