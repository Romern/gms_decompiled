package p000;

/* renamed from: vvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vvu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final vvu f50069c;

    /* renamed from: e */
    private static volatile bxxk f50070e;

    /* renamed from: a */
    public bxtx f50071a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f50072b = bxtx.f164797b;

    /* renamed from: d */
    private int f50073d;

    static {
        vvu vvu = new vvu();
        f50069c = vvu;
        bxvk.m124024a(vvu.class, vvu);
    }

    private vvu() {
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
            return bxvk.m124022a(f50069c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new vvu();
        } else {
            if (i2 == 4) {
                return new bxvd(f50069c);
            }
            if (i2 == 5) {
                return f50069c;
            }
            bxxk bxxk = f50070e;
            if (bxxk == null) {
                synchronized (vvu.class) {
                    bxxk = f50070e;
                    if (bxxk == null) {
                        bxxk = new bxve(f50069c);
                        f50070e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
