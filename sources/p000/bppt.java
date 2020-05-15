package p000;

/* renamed from: bppt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bppt f138657d;

    /* renamed from: e */
    private static volatile bxxk f138658e;

    /* renamed from: a */
    public int f138659a;

    /* renamed from: b */
    public bxwc f138660b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f138661c;

    static {
        bppt bppt = new bppt();
        f138657d = bppt;
        GeneratedMessageLite.m124024a(bppt.class, bppt);
    }

    private bppt() {
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
            return GeneratedMessageLite.m124022a(f138657d, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0001\u0000\u0002\u001a\u0005ဇ\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bppt();
        } else {
            if (i2 == 4) {
                return new bpps();
            }
            if (i2 == 5) {
                return f138657d;
            }
            bxxk bxxk = f138658e;
            if (bxxk == null) {
                synchronized (bppt.class) {
                    bxxk = f138658e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138657d);
                        f138658e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
