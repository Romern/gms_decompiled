package p000;

/* renamed from: btqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btqs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final btqs f150036a;

    /* renamed from: b */
    private static volatile bxxk f150037b;

    static {
        btqs btqs = new btqs();
        f150036a = btqs;
        bxvk.m124024a(btqs.class, btqs);
    }

    private btqs() {
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
            return bxvk.m124022a(f150036a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new btqs();
        }
        if (i2 == 4) {
            return new bxvd(f150036a);
        }
        if (i2 == 5) {
            return f150036a;
        }
        bxxk bxxk = f150037b;
        if (bxxk == null) {
            synchronized (btqs.class) {
                bxxk = f150037b;
                if (bxxk == null) {
                    bxxk = new bxve(f150036a);
                    f150037b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
