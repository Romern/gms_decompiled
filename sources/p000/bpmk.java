package p000;

/* renamed from: bpmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmk extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpmk f138277e;

    /* renamed from: f */
    private static volatile bxxk f138278f;

    /* renamed from: a */
    public int f138279a;

    /* renamed from: b */
    public int f138280b;

    /* renamed from: c */
    public int f138281c;

    /* renamed from: d */
    public int f138282d;

    static {
        bpmk bpmk = new bpmk();
        f138277e = bpmk;
        bxvk.m124024a(bpmk.class, bpmk);
    }

    private bpmk() {
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
            return bxvk.m124022a(f138277e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpmk();
        } else {
            if (i2 == 4) {
                return new bxvd(f138277e);
            }
            if (i2 == 5) {
                return f138277e;
            }
            bxxk bxxk = f138278f;
            if (bxxk == null) {
                synchronized (bpmk.class) {
                    bxxk = f138278f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138277e);
                        f138278f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
