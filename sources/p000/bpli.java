package p000;

/* renamed from: bpli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpli extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bpli f138094a;

    /* renamed from: f */
    private static volatile bxxk f138095f;

    /* renamed from: b */
    private int f138096b;

    /* renamed from: c */
    private bplh f138097c;

    /* renamed from: d */
    private bplh f138098d;

    /* renamed from: e */
    private byte f138099e = 2;

    static {
        bpli bpli = new bpli();
        f138094a = bpli;
        bxvk.m124024a(bpli.class, bpli);
    }

    private bpli() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138099e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138099e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f138094a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new bpli();
        } else {
            if (i2 == 4) {
                return new bxvd(f138094a);
            }
            if (i2 == 5) {
                return f138094a;
            }
            bxxk bxxk = f138095f;
            if (bxxk == null) {
                synchronized (bpli.class) {
                    bxxk = f138095f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138094a);
                        f138095f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
