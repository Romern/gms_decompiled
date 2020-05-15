package p000;

/* renamed from: bpyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpyo f139901d;

    /* renamed from: e */
    private static volatile bxxk f139902e;

    /* renamed from: a */
    public int f139903a;

    /* renamed from: b */
    public int f139904b;

    /* renamed from: c */
    public int f139905c;

    static {
        bpyo bpyo = new bpyo();
        f139901d = bpyo;
        bxvk.m124024a(bpyo.class, bpyo);
    }

    private bpyo() {
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
            return bxvk.m124022a(f139901d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpyo();
        } else {
            if (i2 == 4) {
                return new bxvd(f139901d);
            }
            if (i2 == 5) {
                return f139901d;
            }
            bxxk bxxk = f139902e;
            if (bxxk == null) {
                synchronized (bpyo.class) {
                    bxxk = f139902e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139901d);
                        f139902e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
