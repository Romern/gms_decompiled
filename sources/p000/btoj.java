package p000;

/* renamed from: btoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btoj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btoj f149763b;

    /* renamed from: c */
    private static volatile bxxk f149764c;

    /* renamed from: a */
    public btnn f149765a;

    static {
        btoj btoj = new btoj();
        f149763b = btoj;
        bxvk.m124024a(btoj.class, btoj);
    }

    private btoj() {
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
            return bxvk.m124022a(f149763b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btoj();
        } else {
            if (i2 == 4) {
                return new bxvd(f149763b);
            }
            if (i2 == 5) {
                return f149763b;
            }
            bxxk bxxk = f149764c;
            if (bxxk == null) {
                synchronized (btoj.class) {
                    bxxk = f149764c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149763b);
                        f149764c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
