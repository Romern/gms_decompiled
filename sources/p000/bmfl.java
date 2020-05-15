package p000;

/* renamed from: bmfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfl extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmfl f129116i;

    /* renamed from: k */
    private static volatile bxxk f129117k;

    /* renamed from: a */
    public int f129118a;

    /* renamed from: b */
    public String f129119b = "";

    /* renamed from: c */
    public int f129120c;

    /* renamed from: d */
    public ByteString f129121d = ByteString.f164797b;

    /* renamed from: e */
    public String f129122e = "";

    /* renamed from: f */
    public bmde f129123f;

    /* renamed from: g */
    public bwhm f129124g;

    /* renamed from: h */
    public boolean f129125h;

    /* renamed from: j */
    private byte f129126j = 2;

    static {
        bmfl bmfl = new bmfl();
        f129116i = bmfl;
        GeneratedMessageLite.m124024a(bmfl.class, bmfl);
    }

    private bmfl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129126j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129126j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f129116i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ည\u0003\u0006ဉ\u0006\tဈ\u0005\nဉ\u0007\fဇ\b", new Object[]{"a", "b", "c", bmfm.f129127a, "d", "f", "e", "g", "h"});
        } else if (i2 == 3) {
            return new bmfl();
        } else {
            if (i2 == 4) {
                return new bxvd(f129116i);
            }
            if (i2 == 5) {
                return f129116i;
            }
            bxxk bxxk = f129117k;
            if (bxxk == null) {
                synchronized (bmfl.class) {
                    bxxk = f129117k;
                    if (bxxk == null) {
                        bxxk = new bxve(f129116i);
                        f129117k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
