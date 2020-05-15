package p000;

/* renamed from: bshy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bshy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bshy f144640c;

    /* renamed from: e */
    private static volatile bxxk f144641e;

    /* renamed from: a */
    public boolean f144642a;

    /* renamed from: b */
    public bshz f144643b;

    /* renamed from: d */
    private int f144644d;

    static {
        bshy bshy = new bshy();
        f144640c = bshy;
        bxvk.m124024a(bshy.class, bshy);
    }

    private bshy() {
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
            return bxvk.m124022a(f144640c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bshy();
        } else {
            if (i2 == 4) {
                return new bxvd(f144640c);
            }
            if (i2 == 5) {
                return f144640c;
            }
            bxxk bxxk = f144641e;
            if (bxxk == null) {
                synchronized (bshy.class) {
                    bxxk = f144641e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144640c);
                        f144641e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
