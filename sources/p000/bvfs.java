package p000;

/* renamed from: bvfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfs extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvfs f155910e;

    /* renamed from: f */
    private static volatile bxxk f155911f;

    /* renamed from: a */
    public int f155912a;

    /* renamed from: b */
    public long f155913b;

    /* renamed from: c */
    public int f155914c;

    /* renamed from: d */
    public int f155915d;

    static {
        bvfs bvfs = new bvfs();
        f155910e = bvfs;
        GeneratedMessageLite.m124024a(bvfs.class, bvfs);
    }

    private bvfs() {
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
            return GeneratedMessageLite.m124022a(f155910e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", bvjr.f156352a, "d", bvjo.f156349a});
        } else if (i2 == 3) {
            return new bvfs();
        } else {
            if (i2 == 4) {
                return new bxvd(f155910e);
            }
            if (i2 == 5) {
                return f155910e;
            }
            bxxk bxxk = f155911f;
            if (bxxk == null) {
                synchronized (bvfs.class) {
                    bxxk = f155911f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155910e);
                        f155911f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
