package p000;

/* renamed from: bxbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxbg f161808c;

    /* renamed from: g */
    private static volatile bxxk f161809g;

    /* renamed from: a */
    public int f161810a;

    /* renamed from: b */
    public String f161811b = "";

    /* renamed from: d */
    private int f161812d;

    /* renamed from: e */
    private bygm f161813e;

    /* renamed from: f */
    private byte f161814f = 2;

    static {
        bxbg bxbg = new bxbg();
        f161808c = bxbg;
        GeneratedMessageLite.m124024a(bxbg.class, bxbg);
    }

    private bxbg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161814f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161814f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f161808c, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001င\u0000\u0003ဈ\u0002\u0004ᐉ\u0004", new Object[]{"d", "a", "b", "e"});
        } else if (i2 == 3) {
            return new bxbg();
        } else {
            if (i2 == 4) {
                return new bxvd(f161808c);
            }
            if (i2 == 5) {
                return f161808c;
            }
            bxxk bxxk = f161809g;
            if (bxxk == null) {
                synchronized (bxbg.class) {
                    bxxk = f161809g;
                    if (bxxk == null) {
                        bxxk = new bxve(f161808c);
                        f161809g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
