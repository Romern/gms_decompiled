package p000;

/* renamed from: btoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btoy extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btoy f149818a;

    /* renamed from: b */
    private static volatile bxxk f149819b;

    static {
        btoy btoy = new btoy();
        f149818a = btoy;
        bxvk.m124024a(btoy.class, btoy);
    }

    private btoy() {
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
            return bxvk.m124022a(f149818a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btoy();
        }
        if (i2 == 4) {
            return new bxvd(f149818a);
        }
        if (i2 == 5) {
            return f149818a;
        }
        bxxk bxxk = f149819b;
        if (bxxk == null) {
            synchronized (btoy.class) {
                bxxk = f149819b;
                if (bxxk == null) {
                    bxxk = new bxve(f149818a);
                    f149819b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
