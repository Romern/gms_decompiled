package p000;

/* renamed from: bony */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bony extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bony f133869c;

    /* renamed from: d */
    private static volatile bxxk f133870d;

    /* renamed from: a */
    public boolean f133871a;

    /* renamed from: b */
    public bxvt f133872b = bxvm.f164965b;

    static {
        bony bony = new bony();
        f133869c = bony;
        bxvk.m124024a(bony.class, bony);
    }

    private bony() {
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
            return bxvk.m124022a(f133869c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0007\u0002,", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bony();
        } else {
            if (i2 == 4) {
                return new bonx();
            }
            if (i2 == 5) {
                return f133869c;
            }
            bxxk bxxk = f133870d;
            if (bxxk == null) {
                synchronized (bony.class) {
                    bxxk = f133870d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133869c);
                        f133870d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
