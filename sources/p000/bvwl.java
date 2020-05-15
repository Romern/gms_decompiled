package p000;

/* renamed from: bvwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwl extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bvwl f157951m;

    /* renamed from: n */
    private static volatile bxxk f157952n;

    /* renamed from: a */
    public int f157953a;

    /* renamed from: b */
    public int f157954b;

    /* renamed from: c */
    public int f157955c;

    /* renamed from: d */
    public int f157956d;

    /* renamed from: e */
    public int f157957e;

    /* renamed from: f */
    public int f157958f;

    /* renamed from: g */
    public int f157959g;

    /* renamed from: h */
    public String f157960h = "";

    /* renamed from: i */
    public int f157961i;

    /* renamed from: j */
    public int f157962j;

    /* renamed from: k */
    public int f157963k;

    /* renamed from: l */
    public boolean f157964l;

    static {
        bvwl bvwl = new bvwl();
        f157951m = bvwl;
        GeneratedMessageLite.m124024a(bvwl.class, bvwl);
    }

    private bvwl() {
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
            return GeneratedMessageLite.m124022a(f157951m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006\bင\u0007\tင\b\nင\t\u000bဇ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bvwl();
        } else {
            if (i2 == 4) {
                return new bxvd(f157951m);
            }
            if (i2 == 5) {
                return f157951m;
            }
            bxxk bxxk = f157952n;
            if (bxxk == null) {
                synchronized (bvwl.class) {
                    bxxk = f157952n;
                    if (bxxk == null) {
                        bxxk = new bxve(f157951m);
                        f157952n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
