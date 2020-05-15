package p000;

/* renamed from: mox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mox extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mox f34084d;

    /* renamed from: e */
    private static volatile bxxk f34085e;

    /* renamed from: a */
    public int f34086a;

    /* renamed from: b */
    public String f34087b = "";

    /* renamed from: c */
    public int f34088c;

    static {
        mox mox = new mox();
        f34084d = mox;
        GeneratedMessageLite.m124024a(mox.class, mox);
    }

    private mox() {
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
            return GeneratedMessageLite.m124022a(f34084d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mox();
        } else {
            if (i2 == 4) {
                return new bxvd(f34084d);
            }
            if (i2 == 5) {
                return f34084d;
            }
            bxxk bxxk = f34085e;
            if (bxxk == null) {
                synchronized (mox.class) {
                    bxxk = f34085e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34084d);
                        f34085e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
