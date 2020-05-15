package p000;

/* renamed from: btrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrc extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btrc f150068a;

    /* renamed from: b */
    private static volatile bxxk f150069b;

    static {
        btrc btrc = new btrc();
        f150068a = btrc;
        bxvk.m124024a(btrc.class, btrc);
    }

    private btrc() {
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
            return bxvk.m124022a(f150068a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btrc();
        }
        if (i2 == 4) {
            return new bxvd(f150068a);
        }
        if (i2 == 5) {
            return f150068a;
        }
        bxxk bxxk = f150069b;
        if (bxxk == null) {
            synchronized (btrc.class) {
                bxxk = f150069b;
                if (bxxk == null) {
                    bxxk = new bxve(f150068a);
                    f150069b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
