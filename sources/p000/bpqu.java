package p000;

/* renamed from: bpqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqu extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bpqu f138787b;

    /* renamed from: c */
    private static volatile bxxk f138788c;

    /* renamed from: a */
    public bxvt f138789a = bxvm.f164965b;

    static {
        bpqu bpqu = new bpqu();
        f138787b = bpqu;
        bxvk.m124024a(bpqu.class, bpqu);
    }

    private bpqu() {
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
            return bxvk.m124022a(f138787b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bpry.m112223b()});
        } else if (i2 == 3) {
            return new bpqu();
        } else {
            if (i2 == 4) {
                return new bpqt();
            }
            if (i2 == 5) {
                return f138787b;
            }
            bxxk bxxk = f138788c;
            if (bxxk == null) {
                synchronized (bpqu.class) {
                    bxxk = f138788c;
                    if (bxxk == null) {
                        bxxk = new bxve(f138787b);
                        f138788c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
