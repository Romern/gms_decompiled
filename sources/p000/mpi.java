package p000;

/* renamed from: mpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final mpi f34148c;

    /* renamed from: e */
    private static volatile bxxk f34149e;

    /* renamed from: a */
    public moz f34150a;

    /* renamed from: b */
    public mph f34151b;

    /* renamed from: d */
    private int f34152d;

    static {
        mpi mpi = new mpi();
        f34148c = mpi;
        GeneratedMessageLite.m124024a(mpi.class, mpi);
    }

    private mpi() {
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
            return GeneratedMessageLite.m124022a(f34148c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new mpi();
        } else {
            if (i2 == 4) {
                return new bxvd(f34148c);
            }
            if (i2 == 5) {
                return f34148c;
            }
            bxxk bxxk = f34149e;
            if (bxxk == null) {
                synchronized (mpi.class) {
                    bxxk = f34149e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34148c);
                        f34149e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
