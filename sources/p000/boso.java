package p000;

/* renamed from: boso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boso extends bxvk implements bxxd {

    /* renamed from: g */
    public static final boso f134628g;

    /* renamed from: h */
    private static volatile bxxk f134629h;

    /* renamed from: a */
    public int f134630a;

    /* renamed from: b */
    public bosa f134631b;

    /* renamed from: c */
    public bosw f134632c;

    /* renamed from: d */
    public bosb f134633d;

    /* renamed from: e */
    public bosd f134634e;

    /* renamed from: f */
    public bosv f134635f;

    static {
        boso boso = new boso();
        f134628g = boso;
        bxvk.m124024a(boso.class, boso);
    }

    private boso() {
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
            return bxvk.m124022a(f134628g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new boso();
        } else {
            if (i2 == 4) {
                return new bxvd(f134628g);
            }
            if (i2 == 5) {
                return f134628g;
            }
            bxxk bxxk = f134629h;
            if (bxxk == null) {
                synchronized (boso.class) {
                    bxxk = f134629h;
                    if (bxxk == null) {
                        bxxk = new bxve(f134628g);
                        f134629h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
