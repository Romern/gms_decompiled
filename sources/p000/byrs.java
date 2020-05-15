package p000;

/* renamed from: byrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrs extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byrs f167510d;

    /* renamed from: f */
    private static volatile bxxk f167511f;

    /* renamed from: a */
    public int f167512a;

    /* renamed from: b */
    public ByteString f167513b = ByteString.f164797b;

    /* renamed from: c */
    public long f167514c;

    /* renamed from: e */
    private int f167515e;

    static {
        byrs byrs = new byrs();
        f167510d = byrs;
        GeneratedMessageLite.m124024a(byrs.class, byrs);
    }

    private byrs() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125228a(byrs byrs) {
        byrs.f167512a |= 4;
        byrs.f167515e = 1;
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
            return GeneratedMessageLite.m124022a(f167510d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "e"});
        } else if (i2 == 3) {
            return new byrs();
        } else {
            if (i2 == 4) {
                return new bxvd(f167510d);
            }
            if (i2 == 5) {
                return f167510d;
            }
            bxxk bxxk = f167511f;
            if (bxxk == null) {
                synchronized (byrs.class) {
                    bxxk = f167511f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167510d);
                        f167511f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
