package p000;

/* renamed from: bylq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bylq f166910e;

    /* renamed from: g */
    private static volatile bxxk f166911g;

    /* renamed from: a */
    public int f166912a;

    /* renamed from: b */
    public byll f166913b;

    /* renamed from: c */
    public bylr f166914c;

    /* renamed from: d */
    public int f166915d;

    /* renamed from: f */
    private byte f166916f = 2;

    static {
        bylq bylq = new bylq();
        f166910e = bylq;
        bxvk.m124024a(bylq.class, bylq);
    }

    private bylq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166916f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166916f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166910e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bylq();
        } else {
            if (i2 == 4) {
                return new bxvd(f166910e);
            }
            if (i2 == 5) {
                return f166910e;
            }
            bxxk bxxk = f166911g;
            if (bxxk == null) {
                synchronized (bylq.class) {
                    bxxk = f166911g;
                    if (bxxk == null) {
                        bxxk = new bxve(f166910e);
                        f166911g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
