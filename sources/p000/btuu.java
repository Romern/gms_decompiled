package p000;

/* renamed from: btuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final btuu f150632e;

    /* renamed from: f */
    private static volatile bxxk f150633f;

    /* renamed from: a */
    public int f150634a;

    /* renamed from: b */
    public bxvs f150635b = bxuz.f164939b;

    /* renamed from: c */
    public boolean f150636c;

    /* renamed from: d */
    public int f150637d;

    static {
        btuu btuu = new btuu();
        f150632e = btuu;
        bxvk.m124024a(btuu.class, btuu);
    }

    private btuu() {
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
            return bxvk.m124022a(f150632e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u0013\u0003ဇ\u0000\u0004င\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btuu();
        } else {
            if (i2 == 4) {
                return new bxvd(f150632e);
            }
            if (i2 == 5) {
                return f150632e;
            }
            bxxk bxxk = f150633f;
            if (bxxk == null) {
                synchronized (btuu.class) {
                    bxxk = f150633f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150632e);
                        f150633f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
