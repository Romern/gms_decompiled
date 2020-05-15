package p000;

/* renamed from: bkkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bkkb f124494g;

    /* renamed from: k */
    private static volatile bxxk f124495k;

    /* renamed from: a */
    public String f124496a = "";

    /* renamed from: b */
    public bxwc f124497b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f124498c;

    /* renamed from: d */
    public String f124499d = "";

    /* renamed from: e */
    public boolean f124500e;

    /* renamed from: f */
    public bxwc f124501f = bxxn.f165040b;

    /* renamed from: h */
    private int f124502h;

    /* renamed from: i */
    private String f124503i = "";

    /* renamed from: j */
    private byte f124504j = 2;

    static {
        bkkb bkkb = new bkkb();
        f124494g = bkkb;
        GeneratedMessageLite.m124024a(bkkb.class, bkkb);
    }

    private bkkb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124504j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124504j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f124494g, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဇ\u0002\u0005ဈ\u0003\u0006ဇ\u0004\t\u001a", new Object[]{"h", "i", "a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bkkb();
        } else {
            if (i2 == 4) {
                return new bxvd(f124494g);
            }
            if (i2 == 5) {
                return f124494g;
            }
            bxxk bxxk = f124495k;
            if (bxxk == null) {
                synchronized (bkkb.class) {
                    bxxk = f124495k;
                    if (bxxk == null) {
                        bxxk = new bxve(f124494g);
                        f124495k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
