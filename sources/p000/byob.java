package p000;

/* renamed from: byob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byob extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byob f167181f;

    /* renamed from: g */
    private static volatile bxxk f167182g;

    /* renamed from: a */
    public int f167183a;

    /* renamed from: b */
    public String f167184b = "";

    /* renamed from: c */
    public bxwc f167185c = bxxn.f165040b;

    /* renamed from: d */
    public String f167186d = "";

    /* renamed from: e */
    public String f167187e = "";

    static {
        byob byob = new byob();
        f167181f = byob;
        GeneratedMessageLite.m124024a(byob.class, byob);
    }

    private byob() {
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
            return GeneratedMessageLite.m124022a(f167181f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0007ဈ\u0003", new Object[]{"a", "b", "c", byos.class, "d", "e"});
        } else if (i2 == 3) {
            return new byob();
        } else {
            if (i2 == 4) {
                return new bxvd(f167181f);
            }
            if (i2 == 5) {
                return f167181f;
            }
            bxxk bxxk = f167182g;
            if (bxxk == null) {
                synchronized (byob.class) {
                    bxxk = f167182g;
                    if (bxxk == null) {
                        bxxk = new bxve(f167181f);
                        f167182g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
