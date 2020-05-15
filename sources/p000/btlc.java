package p000;

/* renamed from: btlc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btlc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btlc f149344e;

    /* renamed from: f */
    private static volatile bxxk f149345f;

    /* renamed from: a */
    public String f149346a = "";

    /* renamed from: b */
    public bxun f149347b;

    /* renamed from: c */
    public long f149348c;

    /* renamed from: d */
    public String f149349d = "";

    static {
        btlc btlc = new btlc();
        f149344e = btlc;
        bxvk.m124024a(btlc.class, btlc);
    }

    private btlc() {
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
            return bxvk.m124022a(f149344e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btlc();
        } else {
            if (i2 == 4) {
                return new bxvd(f149344e);
            }
            if (i2 == 5) {
                return f149344e;
            }
            bxxk bxxk = f149345f;
            if (bxxk == null) {
                synchronized (btlc.class) {
                    bxxk = f149345f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149344e);
                        f149345f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
