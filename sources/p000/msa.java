package p000;

/* renamed from: msa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msa extends bxvk implements bxxd {

    /* renamed from: g */
    public static final msa f34506g;

    /* renamed from: h */
    private static volatile bxxk f34507h;

    /* renamed from: a */
    public int f34508a;

    /* renamed from: b */
    public boolean f34509b;

    /* renamed from: c */
    public boolean f34510c;

    /* renamed from: d */
    public boolean f34511d;

    /* renamed from: e */
    public boolean f34512e;

    /* renamed from: f */
    public long f34513f;

    static {
        msa msa = new msa();
        f34506g = msa;
        bxvk.m124024a(msa.class, msa);
    }

    private msa() {
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
            return bxvk.m124022a(f34506g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new msa();
        } else {
            if (i2 == 4) {
                return new bxvd(f34506g);
            }
            if (i2 == 5) {
                return f34506g;
            }
            bxxk bxxk = f34507h;
            if (bxxk == null) {
                synchronized (msa.class) {
                    bxxk = f34507h;
                    if (bxxk == null) {
                        bxxk = new bxve(f34506g);
                        f34507h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
