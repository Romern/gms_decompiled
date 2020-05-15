package p000;

/* renamed from: brdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final brdl f142529c;

    /* renamed from: d */
    private static volatile bxxk f142530d;

    /* renamed from: a */
    public int f142531a;

    /* renamed from: b */
    public brbh f142532b;

    static {
        brdl brdl = new brdl();
        f142529c = brdl;
        GeneratedMessageLite.m124024a(brdl.class, brdl);
    }

    private brdl() {
        bxvm bxvm = bxvm.f164965b;
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f142529c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brdl();
        } else {
            if (i2 == 4) {
                return new bxvd(f142529c);
            }
            if (i2 == 5) {
                return f142529c;
            }
            bxxk bxxk = f142530d;
            if (bxxk == null) {
                synchronized (brdl.class) {
                    bxxk = f142530d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142529c);
                        f142530d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
