package p000;

/* renamed from: btjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btjj f149115c;

    /* renamed from: d */
    private static volatile bxxk f149116d;

    /* renamed from: a */
    public int f149117a;

    /* renamed from: b */
    public int f149118b;

    static {
        btjj btjj = new btjj();
        f149115c = btjj;
        GeneratedMessageLite.m124024a(btjj.class, btjj);
    }

    private btjj() {
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
            return GeneratedMessageLite.m124022a(f149115c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btjj();
        } else {
            if (i2 == 4) {
                return new bxvd(f149115c);
            }
            if (i2 == 5) {
                return f149115c;
            }
            bxxk bxxk = f149116d;
            if (bxxk == null) {
                synchronized (btjj.class) {
                    bxxk = f149116d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149115c);
                        f149116d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
