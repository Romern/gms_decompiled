package p000;

/* renamed from: btiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btiu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btiu f149038b;

    /* renamed from: c */
    private static volatile bxxk f149039c;

    /* renamed from: a */
    public int f149040a;

    static {
        btiu btiu = new btiu();
        f149038b = btiu;
        bxvk.m124024a(btiu.class, btiu);
    }

    private btiu() {
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
            return bxvk.m124022a(f149038b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btiu();
        } else {
            if (i2 == 4) {
                return new bxvd(f149038b);
            }
            if (i2 == 5) {
                return f149038b;
            }
            bxxk bxxk = f149039c;
            if (bxxk == null) {
                synchronized (btiu.class) {
                    bxxk = f149039c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149038b);
                        f149039c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
