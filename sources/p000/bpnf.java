package p000;

/* renamed from: bpnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpnf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpnf f138397e;

    /* renamed from: f */
    private static volatile bxxk f138398f;

    /* renamed from: a */
    public int f138399a;

    /* renamed from: b */
    public int f138400b;

    /* renamed from: c */
    public bpnk f138401c;

    /* renamed from: d */
    public bpnb f138402d;

    static {
        bpnf bpnf = new bpnf();
        f138397e = bpnf;
        GeneratedMessageLite.m124024a(bpnf.class, bpnf);
    }

    private bpnf() {
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
            return GeneratedMessageLite.m124022a(f138397e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bpne.f138396a, "c", "d"});
        } else if (i2 == 3) {
            return new bpnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f138397e);
            }
            if (i2 == 5) {
                return f138397e;
            }
            bxxk bxxk = f138398f;
            if (bxxk == null) {
                synchronized (bpnf.class) {
                    bxxk = f138398f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138397e);
                        f138398f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
