package p000;

/* renamed from: bkku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkku extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bkku f124634i;

    /* renamed from: m */
    private static volatile bxxk f124635m;

    /* renamed from: a */
    public String f124636a = "";

    /* renamed from: b */
    public String f124637b = "";

    /* renamed from: c */
    public String f124638c;

    /* renamed from: d */
    public bxwc f124639d;

    /* renamed from: e */
    public String f124640e;

    /* renamed from: f */
    public String f124641f;

    /* renamed from: g */
    public long f124642g;

    /* renamed from: h */
    public String f124643h;

    /* renamed from: j */
    private int f124644j;

    /* renamed from: k */
    private String f124645k = "";

    /* renamed from: l */
    private byte f124646l = 2;

    static {
        bkku bkku = new bkku();
        f124634i = bkku;
        bxvk.m124024a(bkku.class, bkku);
    }

    private bkku() {
        bxxn bxxn = bxxn.f165040b;
        this.f124638c = "";
        this.f124639d = bxxn.f165040b;
        this.f124640e = "";
        this.f124641f = "";
        this.f124643h = "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f124646l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f124646l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f124634i, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0001\u0001ᔈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဈ\u0004\u0007\u001b\tဈ\u0006\nဈ\u0007\u000bဂ\b\fဈ\t", new Object[]{"j", "k", "a", "b", "c", "d", bklm.class, "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bkku();
        } else {
            if (i2 == 4) {
                return new bxvd(f124634i);
            }
            if (i2 == 5) {
                return f124634i;
            }
            bxxk bxxk = f124635m;
            if (bxxk == null) {
                synchronized (bkku.class) {
                    bxxk = f124635m;
                    if (bxxk == null) {
                        bxxk = new bxve(f124634i);
                        f124635m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
