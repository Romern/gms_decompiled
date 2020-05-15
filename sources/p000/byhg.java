package p000;

/* renamed from: byhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byhg f166443c;

    /* renamed from: d */
    private static volatile bxxk f166444d;

    /* renamed from: a */
    public int f166445a;

    /* renamed from: b */
    public long f166446b;

    static {
        byhg byhg = new byhg();
        f166443c = byhg;
        bxvk.m124024a(byhg.class, byhg);
    }

    private byhg() {
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
            return bxvk.m124022a(f166443c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001တ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byhg();
        } else {
            if (i2 == 4) {
                return new bxvd(f166443c);
            }
            if (i2 == 5) {
                return f166443c;
            }
            bxxk bxxk = f166444d;
            if (bxxk == null) {
                synchronized (byhg.class) {
                    bxxk = f166444d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166443c);
                        f166444d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
