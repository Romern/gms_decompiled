package p000;

/* renamed from: lab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lab extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final lab f25517d;

    /* renamed from: e */
    private static volatile bxxk f25518e;

    /* renamed from: a */
    public kzz f25519a;

    /* renamed from: b */
    public boolean f25520b;

    /* renamed from: c */
    public int f25521c;

    static {
        lab lab = new lab();
        f25517d = lab;
        GeneratedMessageLite.m124024a(lab.class, lab);
    }

    private lab() {
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
            return GeneratedMessageLite.m124022a(f25517d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0007\u0003\f", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new lab();
        } else {
            if (i2 == 4) {
                return new bxvd(f25517d);
            }
            if (i2 == 5) {
                return f25517d;
            }
            bxxk bxxk = f25518e;
            if (bxxk == null) {
                synchronized (lab.class) {
                    bxxk = f25518e;
                    if (bxxk == null) {
                        bxxk = new bxve(f25517d);
                        f25518e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
