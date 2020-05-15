package p000;

/* renamed from: bwto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwto extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwto f160976c;

    /* renamed from: d */
    public static final bxvj f160977d;

    /* renamed from: e */
    private static volatile bxxk f160978e;

    /* renamed from: a */
    public int f160979a;

    /* renamed from: b */
    public bwtj f160980b;

    static {
        bwto bwto = new bwto();
        f160976c = bwto;
        bxvk.m124024a(bwto.class, bwto);
        bwny bwny = bwny.f160414k;
        bwto bwto2 = f160976c;
        f160977d = bxvk.m124006a(bwny, bwto2, bwto2, 265527174, bxzf.MESSAGE);
    }

    private bwto() {
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
            return bxvk.m124022a(f160976c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwto();
        } else {
            if (i2 == 4) {
                return new bxvd(f160976c);
            }
            if (i2 == 5) {
                return f160976c;
            }
            bxxk bxxk = f160978e;
            if (bxxk == null) {
                synchronized (bwto.class) {
                    bxxk = f160978e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160976c);
                        f160978e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
