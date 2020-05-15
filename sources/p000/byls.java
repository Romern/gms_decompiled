package p000;

/* renamed from: byls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byls extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final byls f166935i;

    /* renamed from: k */
    private static volatile bxxk f166936k;

    /* renamed from: a */
    public int f166937a;

    /* renamed from: b */
    public String f166938b = "";

    /* renamed from: c */
    public String f166939c = "";

    /* renamed from: d */
    public String f166940d = "";

    /* renamed from: e */
    public int f166941e;

    /* renamed from: f */
    public String f166942f = "";

    /* renamed from: g */
    public boolean f166943g;

    /* renamed from: h */
    public String f166944h = "";

    /* renamed from: j */
    private byte f166945j = 2;

    static {
        byls byls = new byls();
        f166935i = byls;
        GeneratedMessageLite.m124024a(byls.class, byls);
    }

    private byls() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166945j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166945j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f166935i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new byls();
        } else {
            if (i2 == 4) {
                return new bxvd(f166935i);
            }
            if (i2 == 5) {
                return f166935i;
            }
            bxxk bxxk = f166936k;
            if (bxxk == null) {
                synchronized (byls.class) {
                    bxxk = f166936k;
                    if (bxxk == null) {
                        bxxk = new bxve(f166935i);
                        f166936k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
