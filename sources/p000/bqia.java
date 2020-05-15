package p000;

/* renamed from: bqia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqia extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bqia f140760f;

    /* renamed from: g */
    private static volatile bxxk f140761g;

    /* renamed from: a */
    public long f140762a;

    /* renamed from: b */
    public long f140763b;

    /* renamed from: c */
    public bqif f140764c;

    /* renamed from: d */
    public int f140765d;

    /* renamed from: e */
    public bxwc f140766e = bxxn.f165040b;

    static {
        bqia bqia = new bqia();
        f140760f = bqia;
        bxvk.m124024a(bqia.class, bqia);
    }

    private bqia() {
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
            return bxvk.m124022a(f140760f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0003\u0002\u0003\u0003\t\u0004Ț\u0005\f", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new bqia();
        } else {
            if (i2 == 4) {
                return new bxvd(f140760f);
            }
            if (i2 == 5) {
                return f140760f;
            }
            bxxk bxxk = f140761g;
            if (bxxk == null) {
                synchronized (bqia.class) {
                    bxxk = f140761g;
                    if (bxxk == null) {
                        bxxk = new bxve(f140760f);
                        f140761g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
