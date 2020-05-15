package p000;

/* renamed from: btua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btua extends bxvk implements bxxd {

    /* renamed from: m */
    public static final btua f150424m;

    /* renamed from: o */
    private static volatile bxxk f150425o;

    /* renamed from: a */
    public int f150426a;

    /* renamed from: b */
    public String f150427b = "";

    /* renamed from: c */
    public btrw f150428c;

    /* renamed from: d */
    public btsf f150429d;

    /* renamed from: e */
    public btsb f150430e;

    /* renamed from: f */
    public String f150431f = "";

    /* renamed from: g */
    public int f150432g;

    /* renamed from: h */
    public int f150433h;

    /* renamed from: i */
    public bxvt f150434i = bxvm.f164965b;

    /* renamed from: j */
    public btsg f150435j;

    /* renamed from: k */
    public btsi f150436k;

    /* renamed from: l */
    public btrt f150437l;

    /* renamed from: n */
    private byte f150438n = 2;

    static {
        btua btua = new btua();
        f150424m = btua;
        bxvk.m124024a(btua.class, btua);
    }

    private btua() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f150438n);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f150438n = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f150424m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\b\u001e\tဉ\u0007\nဉ\b\u000bဉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", btty.f150422a, "h", bttz.f150423a, "i", btrr.m117076b(), "j", "k", "l"});
        } else if (i2 == 3) {
            return new btua();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f150424m;
            }
            bxxk bxxk = f150425o;
            if (bxxk == null) {
                synchronized (btua.class) {
                    bxxk = f150425o;
                    if (bxxk == null) {
                        bxxk = new bxve(f150424m);
                        f150425o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
