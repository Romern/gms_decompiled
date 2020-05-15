package p000;

/* renamed from: bxgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgi extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxgi f163254d;

    /* renamed from: e */
    private static volatile bxxk f163255e;

    /* renamed from: a */
    public int f163256a;

    /* renamed from: b */
    public bxge f163257b;

    /* renamed from: c */
    public int f163258c;

    static {
        bxgi bxgi = new bxgi();
        f163254d = bxgi;
        GeneratedMessageLite.m124024a(bxgi.class, bxgi);
    }

    private bxgi() {
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
            return GeneratedMessageLite.m124022a(f163254d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxgi();
        } else {
            if (i2 == 4) {
                return new bxvd(f163254d);
            }
            if (i2 == 5) {
                return f163254d;
            }
            bxxk bxxk = f163255e;
            if (bxxk == null) {
                synchronized (bxgi.class) {
                    bxxk = f163255e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163254d);
                        f163255e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
