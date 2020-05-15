package p000;

/* renamed from: bznx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bznx f170773c;

    /* renamed from: d */
    private static volatile bxxk f170774d;

    /* renamed from: a */
    public int f170775a = 0;

    /* renamed from: b */
    public Object f170776b;

    static {
        bznx bznx = new bznx();
        f170773c = bznx;
        bxvk.m124024a(bznx.class, bznx);
    }

    private bznx() {
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
            return bxvk.m124022a(f170773c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", bznu.class, bznv.class, bznw.class, bznz.class});
        } else if (i2 == 3) {
            return new bznx();
        } else {
            if (i2 == 4) {
                return new bxvd(f170773c);
            }
            if (i2 == 5) {
                return f170773c;
            }
            bxxk bxxk = f170774d;
            if (bxxk == null) {
                synchronized (bznx.class) {
                    bxxk = f170774d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170773c);
                        f170774d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
