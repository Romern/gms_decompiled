package p000;

/* renamed from: bprh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bprh f138851c;

    /* renamed from: d */
    private static volatile bxxk f138852d;

    /* renamed from: a */
    public int f138853a;

    /* renamed from: b */
    public int f138854b;

    static {
        bprh bprh = new bprh();
        f138851c = bprh;
        bxvk.m124024a(bprh.class, bprh);
    }

    private bprh() {
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
            return bxvk.m124022a(f138851c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bprh();
        } else {
            if (i2 == 4) {
                return new bxvd(f138851c);
            }
            if (i2 == 5) {
                return f138851c;
            }
            bxxk bxxk = f138852d;
            if (bxxk == null) {
                synchronized (bprh.class) {
                    bxxk = f138852d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138851c);
                        f138852d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
