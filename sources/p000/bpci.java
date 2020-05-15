package p000;

/* renamed from: bpci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpci extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpci f135729d;

    /* renamed from: e */
    private static volatile bxxk f135730e;

    /* renamed from: a */
    public int f135731a;

    /* renamed from: b */
    public int f135732b;

    /* renamed from: c */
    public int f135733c;

    static {
        bpci bpci = new bpci();
        f135729d = bpci;
        GeneratedMessageLite.m124024a(bpci.class, bpci);
    }

    private bpci() {
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
            return GeneratedMessageLite.m124022a(f135729d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpci();
        } else {
            if (i2 == 4) {
                return new bxvd(f135729d);
            }
            if (i2 == 5) {
                return f135729d;
            }
            bxxk bxxk = f135730e;
            if (bxxk == null) {
                synchronized (bpci.class) {
                    bxxk = f135730e;
                    if (bxxk == null) {
                        bxxk = new bxve(f135729d);
                        f135730e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
