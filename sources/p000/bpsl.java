package p000;

/* renamed from: bpsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpsl extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpsl f138975e;

    /* renamed from: f */
    private static volatile bxxk f138976f;

    /* renamed from: a */
    public int f138977a;

    /* renamed from: b */
    public long f138978b;

    /* renamed from: c */
    public int f138979c;

    /* renamed from: d */
    public int f138980d;

    static {
        bpsl bpsl = new bpsl();
        f138975e = bpsl;
        bxvk.m124024a(bpsl.class, bpsl);
    }

    private bpsl() {
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
            return bxvk.m124022a(f138975e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpsl();
        } else {
            if (i2 == 4) {
                return new bxvd(f138975e);
            }
            if (i2 == 5) {
                return f138975e;
            }
            bxxk bxxk = f138976f;
            if (bxxk == null) {
                synchronized (bpsl.class) {
                    bxxk = f138976f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138975e);
                        f138976f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
