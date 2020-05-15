package p000;

/* renamed from: byhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byhk f166467c;

    /* renamed from: d */
    private static volatile bxxk f166468d;

    /* renamed from: a */
    public int f166469a;

    /* renamed from: b */
    public long f166470b;

    static {
        byhk byhk = new byhk();
        f166467c = byhk;
        bxvk.m124024a(byhk.class, byhk);
    }

    private byhk() {
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
            return bxvk.m124022a(f166467c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byhk();
        } else {
            if (i2 == 4) {
                return new bxvd(f166467c);
            }
            if (i2 == 5) {
                return f166467c;
            }
            bxxk bxxk = f166468d;
            if (bxxk == null) {
                synchronized (byhk.class) {
                    bxxk = f166468d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166467c);
                        f166468d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
