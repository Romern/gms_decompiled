package p000;

/* renamed from: bylm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylm extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bylm f166879i;

    /* renamed from: k */
    private static volatile bxxk f166880k;

    /* renamed from: a */
    public int f166881a;

    /* renamed from: b */
    public String f166882b = "";

    /* renamed from: c */
    public String f166883c = "";

    /* renamed from: d */
    public String f166884d = "";

    /* renamed from: e */
    public int f166885e;

    /* renamed from: f */
    public String f166886f = "";

    /* renamed from: g */
    public String f166887g = "";

    /* renamed from: h */
    public String f166888h = "";

    /* renamed from: j */
    private byte f166889j = 2;

    static {
        bylm bylm = new bylm();
        f166879i = bylm;
        GeneratedMessageLite.m124024a(bylm.class, bylm);
    }

    private bylm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166889j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166889j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f166879i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ᔈ\u0002\u0004ᔄ\u0003\u0005ᔈ\u0004\u0006ᔈ\u0005\u0007ᔈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bylm();
        } else {
            if (i2 == 4) {
                return new bxvd(f166879i);
            }
            if (i2 == 5) {
                return f166879i;
            }
            bxxk bxxk = f166880k;
            if (bxxk == null) {
                synchronized (bylm.class) {
                    bxxk = f166880k;
                    if (bxxk == null) {
                        bxxk = new bxve(f166879i);
                        f166880k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
