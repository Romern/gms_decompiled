package p000;

/* renamed from: bsij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsij extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsij f144723b;

    /* renamed from: c */
    private static volatile bxxk f144724c;

    /* renamed from: a */
    public boolean f144725a;

    static {
        bsij bsij = new bsij();
        f144723b = bsij;
        bxvk.m124024a(bsij.class, bsij);
    }

    private bsij() {
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
            return bxvk.m124022a(f144723b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\u0007", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsij();
        } else {
            if (i2 == 4) {
                return new bxvd(f144723b);
            }
            if (i2 == 5) {
                return f144723b;
            }
            bxxk bxxk = f144724c;
            if (bxxk == null) {
                synchronized (bsij.class) {
                    bxxk = f144724c;
                    if (bxxk == null) {
                        bxxk = new bxve(f144723b);
                        f144724c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
