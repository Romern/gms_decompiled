package p000;

/* renamed from: bpif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpif extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpif f137729h;

    /* renamed from: i */
    private static volatile bxxk f137730i;

    /* renamed from: a */
    public int f137731a;

    /* renamed from: b */
    public int f137732b;

    /* renamed from: c */
    public int f137733c;

    /* renamed from: d */
    public long f137734d = -1;

    /* renamed from: e */
    public int f137735e;

    /* renamed from: f */
    public int f137736f;

    /* renamed from: g */
    public boolean f137737g;

    static {
        bpif bpif = new bpif();
        f137729h = bpif;
        GeneratedMessageLite.m124024a(bpif.class, bpif);
    }

    private bpif() {
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
            return GeneratedMessageLite.m124022a(f137729h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005", new Object[]{"a", "b", bphy.f137713a, "c", bpie.f137728a, "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpif();
        } else {
            if (i2 == 4) {
                return new bxvd(f137729h);
            }
            if (i2 == 5) {
                return f137729h;
            }
            bxxk bxxk = f137730i;
            if (bxxk == null) {
                synchronized (bpif.class) {
                    bxxk = f137730i;
                    if (bxxk == null) {
                        bxxk = new bxve(f137729h);
                        f137730i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
