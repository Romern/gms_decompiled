package p000;

/* renamed from: msg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final msg f34532e;

    /* renamed from: f */
    private static volatile bxxk f34533f;

    /* renamed from: a */
    public int f34534a;

    /* renamed from: b */
    public int f34535b;

    /* renamed from: c */
    public String f34536c = "";

    /* renamed from: d */
    public boolean f34537d;

    static {
        msg msg = new msg();
        f34532e = msg;
        GeneratedMessageLite.m124024a(msg.class, msg);
    }

    private msg() {
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
            return GeneratedMessageLite.m124022a(f34532e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", msf.f34531a, "c", "d"});
        } else if (i2 == 3) {
            return new msg();
        } else {
            if (i2 == 4) {
                return new bxvd(f34532e);
            }
            if (i2 == 5) {
                return f34532e;
            }
            bxxk bxxk = f34533f;
            if (bxxk == null) {
                synchronized (msg.class) {
                    bxxk = f34533f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34532e);
                        f34533f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
