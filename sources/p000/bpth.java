package p000;

/* renamed from: bpth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpth extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpth f139111e;

    /* renamed from: g */
    private static volatile bxxk f139112g;

    /* renamed from: a */
    public int f139113a;

    /* renamed from: b */
    public int f139114b;

    /* renamed from: c */
    public int f139115c;

    /* renamed from: d */
    public int f139116d;

    /* renamed from: f */
    private byte f139117f = 2;

    static {
        bpth bpth = new bpth();
        f139111e = bpth;
        bxvk.m124024a(bpth.class, bpth);
    }

    private bpth() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139117f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139117f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f139111e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bpex.f137366a, "c", "d", bpfs.f137435a});
        } else if (i2 == 3) {
            return new bpth();
        } else {
            if (i2 == 4) {
                return new bxvd(f139111e);
            }
            if (i2 == 5) {
                return f139111e;
            }
            bxxk bxxk = f139112g;
            if (bxxk == null) {
                synchronized (bpth.class) {
                    bxxk = f139112g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139111e);
                        f139112g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
