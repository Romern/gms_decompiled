package p000;

/* renamed from: btsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btsi f150214c;

    /* renamed from: d */
    private static volatile bxxk f150215d;

    /* renamed from: a */
    public int f150216a;

    /* renamed from: b */
    public String f150217b = "";

    static {
        btsi btsi = new btsi();
        f150214c = btsi;
        GeneratedMessageLite.m124024a(btsi.class, btsi);
    }

    private btsi() {
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
            return GeneratedMessageLite.m124022a(f150214c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btsi();
        } else {
            if (i2 == 4) {
                return new bxvd(f150214c);
            }
            if (i2 == 5) {
                return f150214c;
            }
            bxxk bxxk = f150215d;
            if (bxxk == null) {
                synchronized (btsi.class) {
                    bxxk = f150215d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150214c);
                        f150215d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
