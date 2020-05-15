package p000;

/* renamed from: cafz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cafz f173060e;

    /* renamed from: g */
    private static volatile bxxk f173061g;

    /* renamed from: a */
    public int f173062a;

    /* renamed from: b */
    public bxwc f173063b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f173064c;

    /* renamed from: d */
    public long f173065d;

    /* renamed from: f */
    private byte f173066f = 2;

    static {
        cafz cafz = new cafz();
        f173060e = cafz;
        bxvk.m124024a(cafz.class, cafz);
    }

    private cafz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f173066f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f173066f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f173060e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001Л\u0003ဇ\u0000\u0005ဂ\u0002", new Object[]{"a", "b", cagn.class, "c", "d"});
        } else if (i2 == 3) {
            return new cafz();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f173060e;
            }
            bxxk bxxk = f173061g;
            if (bxxk == null) {
                synchronized (cafz.class) {
                    bxxk = f173061g;
                    if (bxxk == null) {
                        bxxk = new bxve(f173060e);
                        f173061g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
