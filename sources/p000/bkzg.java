package p000;

/* renamed from: bkzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkzg f125576d;

    /* renamed from: e */
    private static volatile bxxk f125577e;

    /* renamed from: a */
    public int f125578a;

    /* renamed from: b */
    public int f125579b;

    /* renamed from: c */
    public int f125580c;

    static {
        bkzg bkzg = new bkzg();
        f125576d = bkzg;
        bxvk.m124024a(bkzg.class, bkzg);
    }

    private bkzg() {
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
            return bxvk.m124022a(f125576d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkzg();
        } else {
            if (i2 == 4) {
                return new bxvd(f125576d);
            }
            if (i2 == 5) {
                return f125576d;
            }
            bxxk bxxk = f125577e;
            if (bxxk == null) {
                synchronized (bkzg.class) {
                    bxxk = f125577e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125576d);
                        f125577e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
