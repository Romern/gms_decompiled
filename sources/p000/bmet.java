package p000;

/* renamed from: bmet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmet extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bmet f129017l;

    /* renamed from: m */
    private static volatile bxxk f129018m;

    /* renamed from: a */
    public int f129019a;

    /* renamed from: b */
    public bmdn f129020b;

    /* renamed from: c */
    public long f129021c;

    /* renamed from: d */
    public String f129022d = "";

    /* renamed from: e */
    public bxwc f129023e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f129024f = bxxn.f165040b;

    /* renamed from: g */
    public long f129025g;

    /* renamed from: h */
    public long f129026h;

    /* renamed from: i */
    public String f129027i = "";

    /* renamed from: j */
    public ByteString f129028j = ByteString.f164797b;

    /* renamed from: k */
    public boolean f129029k;

    static {
        bmet bmet = new bmet();
        f129017l = bmet;
        GeneratedMessageLite.m124024a(bmet.class, bmet);
    }

    private bmet() {
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
            return GeneratedMessageLite.m124022a(f129017l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0002\u0000\u0001ဈ\u0002\u0002\u001b\u0003ဂ\u0001\u0005ဂ\u0003\u0006ဈ\u0005\u0007ည\u0006\b\u001b\tဇ\u0007\nဉ\u0000\rဂ\u0004", new Object[]{"a", "d", "f", bmes.class, "c", "g", "i", "j", "e", bmnr.class, "k", "b", "h"});
        } else if (i2 == 3) {
            return new bmet();
        } else {
            if (i2 == 4) {
                return new bxvd(f129017l);
            }
            if (i2 == 5) {
                return f129017l;
            }
            bxxk bxxk = f129018m;
            if (bxxk == null) {
                synchronized (bmet.class) {
                    bxxk = f129018m;
                    if (bxxk == null) {
                        bxxk = new bxve(f129017l);
                        f129018m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
