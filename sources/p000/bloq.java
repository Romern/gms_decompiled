package p000;

/* renamed from: bloq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bloq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvu f127123b = new blop();

    /* renamed from: c */
    public static final bloq f127124c;

    /* renamed from: d */
    private static volatile bxxk f127125d;

    /* renamed from: a */
    public bxvt f127126a = bxvm.f164965b;

    static {
        bloq bloq = new bloq();
        f127124c = bloq;
        GeneratedMessageLite.m124024a(bloq.class, bloq);
    }

    private bloq() {
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
            return GeneratedMessageLite.m124022a(f127124c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bloo.m107422b()});
        } else if (i2 == 3) {
            return new bloq();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f127124c;
            }
            bxxk bxxk = f127125d;
            if (bxxk == null) {
                synchronized (bloq.class) {
                    bxxk = f127125d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127124c);
                        f127125d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
