package p000;

/* renamed from: msh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final msh f34538d;

    /* renamed from: e */
    private static volatile bxxk f34539e;

    /* renamed from: a */
    public int f34540a;

    /* renamed from: b */
    public int f34541b;

    /* renamed from: c */
    public long f34542c;

    static {
        msh msh = new msh();
        f34538d = msh;
        GeneratedMessageLite.m124024a(msh.class, msh);
    }

    private msh() {
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
            return GeneratedMessageLite.m124022a(f34538d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new msh();
        } else {
            if (i2 == 4) {
                return new bxvd(f34538d);
            }
            if (i2 == 5) {
                return f34538d;
            }
            bxxk bxxk = f34539e;
            if (bxxk == null) {
                synchronized (msh.class) {
                    bxxk = f34539e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34538d);
                        f34539e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
