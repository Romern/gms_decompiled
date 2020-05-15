package p000;

/* renamed from: btuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btuc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btuc f150450c;

    /* renamed from: d */
    private static volatile bxxk f150451d;

    /* renamed from: a */
    public int f150452a;

    /* renamed from: b */
    public btsi f150453b;

    static {
        btuc btuc = new btuc();
        f150450c = btuc;
        GeneratedMessageLite.m124024a(btuc.class, btuc);
    }

    private btuc() {
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
            return GeneratedMessageLite.m124022a(f150450c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btuc();
        } else {
            if (i2 == 4) {
                return new bxvd(f150450c);
            }
            if (i2 == 5) {
                return f150450c;
            }
            bxxk bxxk = f150451d;
            if (bxxk == null) {
                synchronized (btuc.class) {
                    bxxk = f150451d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150450c);
                        f150451d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
