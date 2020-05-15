package p000;

/* renamed from: bpom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpom extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpom f138545d;

    /* renamed from: e */
    private static volatile bxxk f138546e;

    /* renamed from: a */
    public int f138547a;

    /* renamed from: b */
    public int f138548b;

    /* renamed from: c */
    public long f138549c;

    static {
        bpom bpom = new bpom();
        f138545d = bpom;
        bxvk.m124024a(bpom.class, bpom);
    }

    private bpom() {
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
            return bxvk.m124022a(f138545d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", bpol.m112121b(), "c"});
        } else if (i2 == 3) {
            return new bpom();
        } else {
            if (i2 == 4) {
                return new bxvd(f138545d);
            }
            if (i2 == 5) {
                return f138545d;
            }
            bxxk bxxk = f138546e;
            if (bxxk == null) {
                synchronized (bpom.class) {
                    bxxk = f138546e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138545d);
                        f138546e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
