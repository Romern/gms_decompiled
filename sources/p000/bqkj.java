package p000;

/* renamed from: bqkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bqkj f140987g;

    /* renamed from: h */
    private static volatile bxxk f140988h;

    /* renamed from: a */
    public int f140989a;

    /* renamed from: b */
    public String f140990b = "";

    /* renamed from: c */
    public String f140991c = "";

    /* renamed from: d */
    public String f140992d = "";

    /* renamed from: e */
    public bqkm f140993e;

    /* renamed from: f */
    public int f140994f;

    static {
        bqkj bqkj = new bqkj();
        f140987g = bqkj;
        GeneratedMessageLite.m124024a(bqkj.class, bqkj);
    }

    private bqkj() {
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
            return GeneratedMessageLite.m124022a(f140987g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဉ\u0005\tဌ\b", new Object[]{"a", "b", "c", "d", "e", "f", bqkh.f140986a});
        } else if (i2 == 3) {
            return new bqkj();
        } else {
            if (i2 == 4) {
                return new bxvd(f140987g);
            }
            if (i2 == 5) {
                return f140987g;
            }
            bxxk bxxk = f140988h;
            if (bxxk == null) {
                synchronized (bqkj.class) {
                    bxxk = f140988h;
                    if (bxxk == null) {
                        bxxk = new bxve(f140987g);
                        f140988h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
