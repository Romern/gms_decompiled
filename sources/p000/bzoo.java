package p000;

/* renamed from: bzoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzoo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzoo f170846c;

    /* renamed from: e */
    private static volatile bxxk f170847e;

    /* renamed from: a */
    public bxwc f170848a = bxxn.f165040b;

    /* renamed from: b */
    public String f170849b = "";

    /* renamed from: d */
    private byte f170850d = 2;

    static {
        bzoo bzoo = new bzoo();
        f170846c = bzoo;
        GeneratedMessageLite.m124024a(bzoo.class, bzoo);
    }

    private bzoo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170850d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170850d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170846c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002Ȉ", new Object[]{"a", bzok.class, "b"});
        } else if (i2 == 3) {
            return new bzoo();
        } else {
            if (i2 == 4) {
                return new bxvd(f170846c);
            }
            if (i2 == 5) {
                return f170846c;
            }
            bxxk bxxk = f170847e;
            if (bxxk == null) {
                synchronized (bzoo.class) {
                    bxxk = f170847e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170846c);
                        f170847e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
