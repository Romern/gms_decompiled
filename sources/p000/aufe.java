package p000;

/* renamed from: aufe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aufe f91636c;

    /* renamed from: d */
    private static volatile bxxk f91637d;

    /* renamed from: a */
    public int f91638a;

    /* renamed from: b */
    public int f91639b;

    static {
        aufe aufe = new aufe();
        f91636c = aufe;
        bxvk.m124024a(aufe.class, aufe);
    }

    private aufe() {
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
            return bxvk.m124022a(f91636c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဆ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aufe();
        } else {
            if (i2 == 4) {
                return new bxvd(f91636c);
            }
            if (i2 == 5) {
                return f91636c;
            }
            bxxk bxxk = f91637d;
            if (bxxk == null) {
                synchronized (aufe.class) {
                    bxxk = f91637d;
                    if (bxxk == null) {
                        bxxk = new bxve(f91636c);
                        f91637d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
