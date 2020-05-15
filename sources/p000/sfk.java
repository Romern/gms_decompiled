package p000;

/* renamed from: sfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sfk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final sfk f44118c;

    /* renamed from: d */
    private static volatile bxxk f44119d;

    /* renamed from: a */
    public int f44120a;

    /* renamed from: b */
    public sfl f44121b;

    static {
        sfk sfk = new sfk();
        f44118c = sfk;
        bxvk.m124024a(sfk.class, sfk);
    }

    private sfk() {
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
            return bxvk.m124022a(f44118c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new sfk();
        } else {
            if (i2 == 4) {
                return new bxvd(f44118c);
            }
            if (i2 == 5) {
                return f44118c;
            }
            bxxk bxxk = f44119d;
            if (bxxk == null) {
                synchronized (sfk.class) {
                    bxxk = f44119d;
                    if (bxxk == null) {
                        bxxk = new bxve(f44118c);
                        f44119d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
