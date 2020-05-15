package p000;

/* renamed from: bwqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwqk f160672d;

    /* renamed from: e */
    private static volatile bxxk f160673e;

    /* renamed from: a */
    public int f160674a;

    /* renamed from: b */
    public long f160675b;

    /* renamed from: c */
    public int f160676c;

    static {
        bwqk bwqk = new bwqk();
        f160672d = bwqk;
        bxvk.m124024a(bwqk.class, bwqk);
    }

    private bwqk() {
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
            return bxvk.m124022a(f160672d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f160672d);
            }
            if (i2 == 5) {
                return f160672d;
            }
            bxxk bxxk = f160673e;
            if (bxxk == null) {
                synchronized (bwqk.class) {
                    bxxk = f160673e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160672d);
                        f160673e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
