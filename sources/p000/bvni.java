package p000;

/* renamed from: bvni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvni extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvni f156861b;

    /* renamed from: f */
    private static volatile bxxk f156862f;

    /* renamed from: a */
    public long f156863a;

    /* renamed from: c */
    private int f156864c;

    /* renamed from: d */
    private long f156865d;

    /* renamed from: e */
    private byte f156866e = 2;

    static {
        bvni bvni = new bvni();
        f156861b = bvni;
        bxvk.m124024a(bvni.class, bvni);
    }

    private bvni() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f156866e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f156866e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f156861b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔅ\u0000\u0002ᔅ\u0001", new Object[]{"c", "d", "a"});
        } else if (i2 == 3) {
            return new bvni();
        } else {
            if (i2 == 4) {
                return new bxvd(f156861b);
            }
            if (i2 == 5) {
                return f156861b;
            }
            bxxk bxxk = f156862f;
            if (bxxk == null) {
                synchronized (bvni.class) {
                    bxxk = f156862f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156861b);
                        f156862f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
