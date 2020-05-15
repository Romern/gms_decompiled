package p000;

/* renamed from: bivl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bivl f122006e;

    /* renamed from: g */
    private static volatile bxxk f122007g;

    /* renamed from: a */
    public int f122008a;

    /* renamed from: b */
    public int f122009b;

    /* renamed from: c */
    public boolean f122010c;

    /* renamed from: d */
    public boolean f122011d;

    /* renamed from: f */
    private byte f122012f = 2;

    static {
        bivl bivl = new bivl();
        f122006e = bivl;
        GeneratedMessageLite.m124024a(bivl.class, bivl);
    }

    private bivl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122012f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122012f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f122006e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔇ\u0001\u0003ᔇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bivl();
        } else {
            if (i2 == 4) {
                return new bxvd(f122006e);
            }
            if (i2 == 5) {
                return f122006e;
            }
            bxxk bxxk = f122007g;
            if (bxxk == null) {
                synchronized (bivl.class) {
                    bxxk = f122007g;
                    if (bxxk == null) {
                        bxxk = new bxve(f122006e);
                        f122007g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
