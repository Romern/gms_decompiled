package p000;

/* renamed from: bpmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpmo f138311d;

    /* renamed from: e */
    private static volatile bxxk f138312e;

    /* renamed from: a */
    public int f138313a;

    /* renamed from: b */
    public int f138314b;

    /* renamed from: c */
    public long f138315c;

    static {
        bpmo bpmo = new bpmo();
        f138311d = bpmo;
        bxvk.m124024a(bpmo.class, bpmo);
    }

    private bpmo() {
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
            return bxvk.m124022a(f138311d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bpms.m112074b(), "c"});
        } else if (i2 == 3) {
            return new bpmo();
        } else {
            if (i2 == 4) {
                return new bxvd(f138311d);
            }
            if (i2 == 5) {
                return f138311d;
            }
            bxxk bxxk = f138312e;
            if (bxxk == null) {
                synchronized (bpmo.class) {
                    bxxk = f138312e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138311d);
                        f138312e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
