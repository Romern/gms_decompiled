package p000;

/* renamed from: bsjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsjc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsjc f144774c;

    /* renamed from: d */
    private static volatile bxxk f144775d;

    /* renamed from: a */
    public String f144776a = "";

    /* renamed from: b */
    public int f144777b;

    static {
        bsjc bsjc = new bsjc();
        f144774c = bsjc;
        bxvk.m124024a(bsjc.class, bsjc);
    }

    private bsjc() {
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
            return bxvk.m124022a(f144774c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsjc();
        } else {
            if (i2 == 4) {
                return new bxvd(f144774c);
            }
            if (i2 == 5) {
                return f144774c;
            }
            bxxk bxxk = f144775d;
            if (bxxk == null) {
                synchronized (bsjc.class) {
                    bxxk = f144775d;
                    if (bxxk == null) {
                        bxxk = new bxve(f144774c);
                        f144775d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
