package p000;

/* renamed from: bwjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwjo f159838d;

    /* renamed from: e */
    private static volatile bxxk f159839e;

    /* renamed from: a */
    public int f159840a;

    /* renamed from: b */
    public bmaj f159841b;

    /* renamed from: c */
    public bwjn f159842c;

    static {
        bwjo bwjo = new bwjo();
        f159838d = bwjo;
        bxvk.m124024a(bwjo.class, bwjo);
    }

    private bwjo() {
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
            return bxvk.m124022a(f159838d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwjo();
        } else {
            if (i2 == 4) {
                return new bxvd(f159838d);
            }
            if (i2 == 5) {
                return f159838d;
            }
            bxxk bxxk = f159839e;
            if (bxxk == null) {
                synchronized (bwjo.class) {
                    bxxk = f159839e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159838d);
                        f159839e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
