package p000;

/* renamed from: btjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btjq f149162e;

    /* renamed from: f */
    private static volatile bxxk f149163f;

    /* renamed from: a */
    public String f149164a = "";

    /* renamed from: b */
    public String f149165b = "";

    /* renamed from: c */
    public bxtx f149166c = bxtx.f164797b;

    /* renamed from: d */
    public btjo f149167d;

    static {
        btjq btjq = new btjq();
        f149162e = btjq;
        bxvk.m124024a(btjq.class, btjq);
    }

    private btjq() {
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
            return bxvk.m124022a(f149162e, "\u0000\u0004\u0000\u0000\u0003\u0006\u0004\u0000\u0000\u0000\u0003Ȉ\u0004\n\u0005\t\u0006Ȉ", new Object[]{"b", "c", "d", "a"});
        } else if (i2 == 3) {
            return new btjq();
        } else {
            if (i2 == 4) {
                return new bxvd(f149162e);
            }
            if (i2 == 5) {
                return f149162e;
            }
            bxxk bxxk = f149163f;
            if (bxxk == null) {
                synchronized (btjq.class) {
                    bxxk = f149163f;
                    if (bxxk == null) {
                        bxxk = new bxve(f149162e);
                        f149163f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
