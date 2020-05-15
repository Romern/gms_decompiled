package p000;

/* renamed from: bpmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmn extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpmn f138303g;

    /* renamed from: h */
    private static volatile bxxk f138304h;

    /* renamed from: a */
    public int f138305a;

    /* renamed from: b */
    public boolean f138306b;

    /* renamed from: c */
    public boolean f138307c;

    /* renamed from: d */
    public boolean f138308d;

    /* renamed from: e */
    public boolean f138309e;

    /* renamed from: f */
    public boolean f138310f;

    static {
        bpmn bpmn = new bpmn();
        f138303g = bpmn;
        bxvk.m124024a(bpmn.class, bpmn);
    }

    private bpmn() {
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
            return bxvk.m124022a(f138303g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpmn();
        } else {
            if (i2 == 4) {
                return new bxvd(f138303g);
            }
            if (i2 == 5) {
                return f138303g;
            }
            bxxk bxxk = f138304h;
            if (bxxk == null) {
                synchronized (bpmn.class) {
                    bxxk = f138304h;
                    if (bxxk == null) {
                        bxxk = new bxve(f138303g);
                        f138304h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
