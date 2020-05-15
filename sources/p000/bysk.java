package p000;

/* renamed from: bysk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bysk f167579f;

    /* renamed from: g */
    private static volatile bxxk f167580g;

    /* renamed from: a */
    public int f167581a;

    /* renamed from: b */
    public int f167582b;

    /* renamed from: c */
    public ByteString f167583c = ByteString.f164797b;

    /* renamed from: d */
    public bxwc f167584d = bxxn.f165040b;

    /* renamed from: e */
    public String f167585e = "";

    static {
        bysk bysk = new bysk();
        f167579f = bysk;
        GeneratedMessageLite.m124024a(bysk.class, bysk);
    }

    private bysk() {
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
            return GeneratedMessageLite.m124022a(f167579f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002ည\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", bysj.class, "e"});
        } else if (i2 == 3) {
            return new bysk();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f167579f;
            }
            bxxk bxxk = f167580g;
            if (bxxk == null) {
                synchronized (bysk.class) {
                    bxxk = f167580g;
                    if (bxxk == null) {
                        bxxk = new bxve(f167579f);
                        f167580g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
