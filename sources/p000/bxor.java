package p000;

/* renamed from: bxor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxor extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxor f164201c;

    /* renamed from: d */
    private static volatile bxxk f164202d;

    /* renamed from: a */
    public int f164203a;

    /* renamed from: b */
    public long f164204b;

    static {
        bxor bxor = new bxor();
        f164201c = bxor;
        bxvk.m124024a(bxor.class, bxor);
    }

    private bxor() {
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
            return bxvk.m124022a(f164201c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxor();
        } else {
            if (i2 == 4) {
                return new bxvd(f164201c);
            }
            if (i2 == 5) {
                return f164201c;
            }
            bxxk bxxk = f164202d;
            if (bxxk == null) {
                synchronized (bxor.class) {
                    bxxk = f164202d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164201c);
                        f164202d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
