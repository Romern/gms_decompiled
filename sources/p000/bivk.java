package p000;

/* renamed from: bivk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bivk f122002b;

    /* renamed from: d */
    private static volatile bxxk f122003d;

    /* renamed from: a */
    public bxwc f122004a = bxxn.f165040b;

    /* renamed from: c */
    private byte f122005c = 2;

    static {
        bivk bivk = new bivk();
        f122002b = bivk;
        bxvk.m124024a(bivk.class, bivk);
    }

    private bivk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122005c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122005c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f122002b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", bivj.class});
        } else if (i2 == 3) {
            return new bivk();
        } else {
            if (i2 == 4) {
                return new bxvd(f122002b);
            }
            if (i2 == 5) {
                return f122002b;
            }
            bxxk bxxk = f122003d;
            if (bxxk == null) {
                synchronized (bivk.class) {
                    bxxk = f122003d;
                    if (bxxk == null) {
                        bxxk = new bxve(f122002b);
                        f122003d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
