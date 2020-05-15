package p000;

/* renamed from: btmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmd extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btmd f149473c;

    /* renamed from: d */
    private static volatile bxxk f149474d;

    /* renamed from: a */
    public int f149475a = 0;

    /* renamed from: b */
    public Object f149476b;

    static {
        btmd btmd = new btmd();
        f149473c = btmd;
        GeneratedMessageLite.m124024a(btmd.class, btmd);
    }

    private btmd() {
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
            return GeneratedMessageLite.m124022a(f149473c, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", btmb.class, btmc.class, btlw.class, btly.class, btlx.class});
        } else if (i2 == 3) {
            return new btmd();
        } else {
            if (i2 == 4) {
                return new bxvd(f149473c);
            }
            if (i2 == 5) {
                return f149473c;
            }
            bxxk bxxk = f149474d;
            if (bxxk == null) {
                synchronized (btmd.class) {
                    bxxk = f149474d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149473c);
                        f149474d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
