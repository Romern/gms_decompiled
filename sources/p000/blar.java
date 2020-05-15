package p000;

/* renamed from: blar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blar extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blar f125781a;

    /* renamed from: g */
    private static volatile bxxk f125782g;

    /* renamed from: b */
    private int f125783b;

    /* renamed from: c */
    private long f125784c;

    /* renamed from: d */
    private int f125785d;

    /* renamed from: e */
    private int f125786e;

    /* renamed from: f */
    private byte f125787f = 2;

    static {
        blar blar = new blar();
        f125781a = blar;
        GeneratedMessageLite.m124024a(blar.class, blar);
    }

    private blar() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125787f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125787f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125781a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new blar();
        } else {
            if (i2 == 4) {
                return new bxvd(f125781a);
            }
            if (i2 == 5) {
                return f125781a;
            }
            bxxk bxxk = f125782g;
            if (bxxk == null) {
                synchronized (blar.class) {
                    bxxk = f125782g;
                    if (bxxk == null) {
                        bxxk = new bxve(f125781a);
                        f125782g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
