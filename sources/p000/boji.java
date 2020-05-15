package p000;

/* renamed from: boji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boji extends bxvk implements bxxd {

    /* renamed from: k */
    public static final boji f133277k;

    /* renamed from: l */
    private static volatile bxxk f133278l;

    /* renamed from: a */
    public int f133279a;

    /* renamed from: b */
    public boolean f133280b;

    /* renamed from: c */
    public int f133281c;

    /* renamed from: d */
    public int f133282d;

    /* renamed from: e */
    public int f133283e;

    /* renamed from: f */
    public int f133284f;

    /* renamed from: g */
    public long f133285g;

    /* renamed from: h */
    public long f133286h;

    /* renamed from: i */
    public boolean f133287i;

    /* renamed from: j */
    public boolean f133288j;

    static {
        boji boji = new boji();
        f133277k = boji;
        bxvk.m124024a(boji.class, boji);
    }

    private boji() {
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
            return bxvk.m124022a(f133277k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007\tဇ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new boji();
        } else {
            if (i2 == 4) {
                return new bxvd(f133277k);
            }
            if (i2 == 5) {
                return f133277k;
            }
            bxxk bxxk = f133278l;
            if (bxxk == null) {
                synchronized (boji.class) {
                    bxxk = f133278l;
                    if (bxxk == null) {
                        bxxk = new bxve(f133277k);
                        f133278l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
