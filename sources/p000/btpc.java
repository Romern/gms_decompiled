package p000;

/* renamed from: btpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btpc f149829c;

    /* renamed from: d */
    private static volatile bxxk f149830d;

    /* renamed from: a */
    public btpd f149831a;

    /* renamed from: b */
    public btpd f149832b;

    static {
        btpc btpc = new btpc();
        f149829c = btpc;
        bxvk.m124024a(btpc.class, btpc);
    }

    private btpc() {
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
            return bxvk.m124022a(f149829c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btpc();
        } else {
            if (i2 == 4) {
                return new bxvd(f149829c);
            }
            if (i2 == 5) {
                return f149829c;
            }
            bxxk bxxk = f149830d;
            if (bxxk == null) {
                synchronized (btpc.class) {
                    bxxk = f149830d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149829c);
                        f149830d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
