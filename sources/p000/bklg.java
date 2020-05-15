package p000;

/* renamed from: bklg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bklg extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bklg f124743j;

    /* renamed from: n */
    private static volatile bxxk f124744n;

    /* renamed from: a */
    public String f124745a = "";

    /* renamed from: b */
    public String f124746b = "";

    /* renamed from: c */
    public String f124747c = "";

    /* renamed from: d */
    public String f124748d = "";

    /* renamed from: e */
    public String f124749e = "";

    /* renamed from: f */
    public String f124750f = "";

    /* renamed from: g */
    public long f124751g;

    /* renamed from: h */
    public String f124752h = "";

    /* renamed from: i */
    public bxwc f124753i = bxxn.f165040b;

    /* renamed from: k */
    private int f124754k;

    /* renamed from: l */
    private String f124755l = "";

    /* renamed from: m */
    private byte f124756m = 2;

    static {
        bklg bklg = new bklg();
        f124743j = bklg;
        bxvk.m124024a(bklg.class, bklg);
    }

    private bklg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124756m);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124756m = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f124743j, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0007ဈ\u0006\u000bဈ\n\fဂ\u000b\u000eဈ\f\u000f\u001b", new Object[]{"k", "l", "a", "b", "c", "d", "e", "f", "g", "h", "i", bkll.class});
        } else if (i2 == 3) {
            return new bklg();
        } else {
            if (i2 == 4) {
                return new bxvd(f124743j);
            }
            if (i2 == 5) {
                return f124743j;
            }
            bxxk bxxk = f124744n;
            if (bxxk == null) {
                synchronized (bklg.class) {
                    bxxk = f124744n;
                    if (bxxk == null) {
                        bxxk = new bxve(f124743j);
                        f124744n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
