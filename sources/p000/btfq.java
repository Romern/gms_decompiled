package p000;

/* renamed from: btfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btfq f148736c;

    /* renamed from: d */
    private static volatile bxxk f148737d;

    /* renamed from: a */
    public String f148738a = "";

    /* renamed from: b */
    public int f148739b;

    static {
        btfq btfq = new btfq();
        f148736c = btfq;
        bxvk.m124024a(btfq.class, btfq);
    }

    private btfq() {
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
            return bxvk.m124022a(f148736c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btfq();
        } else {
            if (i2 == 4) {
                return new bxvd(f148736c);
            }
            if (i2 == 5) {
                return f148736c;
            }
            bxxk bxxk = f148737d;
            if (bxxk == null) {
                synchronized (btfq.class) {
                    bxxk = f148737d;
                    if (bxxk == null) {
                        bxxk = new bxve(f148736c);
                        f148737d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
