package p000;

/* renamed from: bwsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwsx f160923b;

    /* renamed from: c */
    public static final bxvj f160924c;

    /* renamed from: d */
    private static volatile bxxk f160925d;

    /* renamed from: a */
    public bxvw f160926a = bxwq.f165002b;

    static {
        bwsx bwsx = new bwsx();
        f160923b = bwsx;
        bxvk.m124024a(bwsx.class, bwsx);
        bwny bwny = bwny.f160414k;
        bwsx bwsx2 = f160923b;
        f160924c = bxvk.m124006a(bwny, bwsx2, bwsx2, 223344555, bxzf.MESSAGE);
    }

    private bwsx() {
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
            return bxvk.m124022a(f160923b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwsx();
        } else {
            if (i2 == 4) {
                return new bwsw();
            }
            if (i2 == 5) {
                return f160923b;
            }
            bxxk bxxk = f160925d;
            if (bxxk == null) {
                synchronized (bwsx.class) {
                    bxxk = f160925d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160923b);
                        f160925d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
