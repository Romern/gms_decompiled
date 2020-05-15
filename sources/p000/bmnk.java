package p000;

/* renamed from: bmnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmnk f130113c;

    /* renamed from: d */
    private static volatile bxxk f130114d;

    /* renamed from: a */
    public int f130115a;

    /* renamed from: b */
    public String f130116b = "";

    static {
        bmnk bmnk = new bmnk();
        f130113c = bmnk;
        bxvk.m124024a(bmnk.class, bmnk);
    }

    private bmnk() {
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
            return bxvk.m124022a(f130113c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmnk();
        } else {
            if (i2 == 4) {
                return new bxvd(f130113c);
            }
            if (i2 == 5) {
                return f130113c;
            }
            bxxk bxxk = f130114d;
            if (bxxk == null) {
                synchronized (bmnk.class) {
                    bxxk = f130114d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130113c);
                        f130114d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
