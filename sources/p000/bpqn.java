package p000;

/* renamed from: bpqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqn extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bpqn f138765b;

    /* renamed from: c */
    private static volatile bxxk f138766c;

    /* renamed from: a */
    public bxvt f138767a = bxvm.f164965b;

    static {
        bpqn bpqn = new bpqn();
        f138765b = bpqn;
        bxvk.m124024a(bpqn.class, bpqn);
    }

    private bpqn() {
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
            return bxvk.m124022a(f138765b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bpot.m112131b()});
        } else if (i2 == 3) {
            return new bpqn();
        } else {
            if (i2 == 4) {
                return new bpqm();
            }
            if (i2 == 5) {
                return f138765b;
            }
            bxxk bxxk = f138766c;
            if (bxxk == null) {
                synchronized (bpqn.class) {
                    bxxk = f138766c;
                    if (bxxk == null) {
                        bxxk = new bxve(f138765b);
                        f138766c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
