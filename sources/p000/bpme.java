package p000;

/* renamed from: bpme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpme extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpme f138233e;

    /* renamed from: f */
    private static volatile bxxk f138234f;

    /* renamed from: a */
    public int f138235a;

    /* renamed from: b */
    public int f138236b;

    /* renamed from: c */
    public long f138237c;

    /* renamed from: d */
    public int f138238d;

    static {
        bpme bpme = new bpme();
        f138233e = bpme;
        GeneratedMessageLite.m124024a(bpme.class, bpme);
    }

    private bpme() {
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
            return GeneratedMessageLite.m124022a(f138233e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpme();
        } else {
            if (i2 == 4) {
                return new bxvd(f138233e);
            }
            if (i2 == 5) {
                return f138233e;
            }
            bxxk bxxk = f138234f;
            if (bxxk == null) {
                synchronized (bpme.class) {
                    bxxk = f138234f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138233e);
                        f138234f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
