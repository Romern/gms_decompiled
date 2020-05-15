package p000;

/* renamed from: bpmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpmg f138246c;

    /* renamed from: d */
    private static volatile bxxk f138247d;

    /* renamed from: a */
    public int f138248a;

    /* renamed from: b */
    public int f138249b;

    static {
        bpmg bpmg = new bpmg();
        f138246c = bpmg;
        bxvk.m124024a(bpmg.class, bpmg);
    }

    private bpmg() {
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
            return bxvk.m124022a(f138246c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpmv.f138361a});
        } else if (i2 == 3) {
            return new bpmg();
        } else {
            if (i2 == 4) {
                return new bxvd(f138246c);
            }
            if (i2 == 5) {
                return f138246c;
            }
            bxxk bxxk = f138247d;
            if (bxxk == null) {
                synchronized (bpmg.class) {
                    bxxk = f138247d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138246c);
                        f138247d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
