package p000;

/* renamed from: btnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btnd f149596c;

    /* renamed from: d */
    private static volatile bxxk f149597d;

    /* renamed from: a */
    public long f149598a;

    /* renamed from: b */
    public String f149599b = "";

    static {
        btnd btnd = new btnd();
        f149596c = btnd;
        bxvk.m124024a(btnd.class, btnd);
    }

    private btnd() {
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
            return bxvk.m124022a(f149596c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btnd();
        } else {
            if (i2 == 4) {
                return new bxvd(f149596c);
            }
            if (i2 == 5) {
                return f149596c;
            }
            bxxk bxxk = f149597d;
            if (bxxk == null) {
                synchronized (btnd.class) {
                    bxxk = f149597d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149596c);
                        f149597d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
