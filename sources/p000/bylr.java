package p000;

/* renamed from: bylr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylr extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bylr f166917p;

    /* renamed from: r */
    private static volatile bxxk f166918r;

    /* renamed from: a */
    public int f166919a;

    /* renamed from: b */
    public byma f166920b;

    /* renamed from: c */
    public byls f166921c;

    /* renamed from: d */
    public bylk f166922d;

    /* renamed from: e */
    public bylm f166923e;

    /* renamed from: f */
    public byli f166924f;

    /* renamed from: g */
    public bylj f166925g;

    /* renamed from: h */
    public byly f166926h;

    /* renamed from: i */
    public bymc f166927i;

    /* renamed from: j */
    public boolean f166928j;

    /* renamed from: k */
    public boolean f166929k = true;

    /* renamed from: l */
    public String f166930l = "";

    /* renamed from: m */
    public boolean f166931m;

    /* renamed from: n */
    public bxwc f166932n = bxxn.f165040b;

    /* renamed from: o */
    public bylv f166933o;

    /* renamed from: q */
    private byte f166934q = 2;

    static {
        bylr bylr = new bylr();
        f166917p = bylr;
        bxvk.m124024a(bylr.class, bylr);
    }

    private bylr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166934q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166934q = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166917p, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0001\b\u0001ᔉ\u0000\u0002ᔉ\u0001\u0003ᔉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tᐉ\u0007\fဇ\n\rဇ\u000b\u000eဈ\f\u000fဇ\r\u0010\u001b\u0013ဉ\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", bylz.class, "o"});
        } else if (i2 == 3) {
            return new bylr();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (float[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f166917p;
            }
            bxxk bxxk = f166918r;
            if (bxxk == null) {
                synchronized (bylr.class) {
                    bxxk = f166918r;
                    if (bxxk == null) {
                        bxxk = new bxve(f166917p);
                        f166918r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
