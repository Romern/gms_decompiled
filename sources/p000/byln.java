package p000;

/* renamed from: byln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byln extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byln f166890d;

    /* renamed from: f */
    private static volatile bxxk f166891f;

    /* renamed from: a */
    public int f166892a;

    /* renamed from: b */
    public float f166893b;

    /* renamed from: c */
    public float f166894c;

    /* renamed from: e */
    private byte f166895e = 2;

    static {
        byln byln = new byln();
        f166890d = byln;
        GeneratedMessageLite.m124024a(byln.class, byln);
    }

    private byln() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166895e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166895e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f166890d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔁ\u0000\u0002ᔁ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byln();
        } else {
            if (i2 == 4) {
                return new bxvd(f166890d);
            }
            if (i2 == 5) {
                return f166890d;
            }
            bxxk bxxk = f166891f;
            if (bxxk == null) {
                synchronized (byln.class) {
                    bxxk = f166891f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166890d);
                        f166891f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
