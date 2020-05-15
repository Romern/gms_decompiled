package p000;

/* renamed from: bxrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxrm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxrm f164575c;

    /* renamed from: d */
    private static volatile bxxk f164576d;

    /* renamed from: a */
    public int f164577a;

    /* renamed from: b */
    public bxrl f164578b;

    static {
        bxrm bxrm = new bxrm();
        f164575c = bxrm;
        bxvk.m124024a(bxrm.class, bxrm);
    }

    private bxrm() {
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
            return bxvk.m124022a(f164575c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxrm();
        } else {
            if (i2 == 4) {
                return new bxvd(f164575c);
            }
            if (i2 == 5) {
                return f164575c;
            }
            bxxk bxxk = f164576d;
            if (bxxk == null) {
                synchronized (bxrm.class) {
                    bxxk = f164576d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164575c);
                        f164576d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
