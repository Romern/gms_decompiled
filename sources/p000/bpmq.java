package p000;

/* renamed from: bpmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpmq f138321d;

    /* renamed from: e */
    private static volatile bxxk f138322e;

    /* renamed from: a */
    public int f138323a;

    /* renamed from: b */
    public bpmp f138324b;

    /* renamed from: c */
    public bpmm f138325c;

    static {
        bpmq bpmq = new bpmq();
        f138321d = bpmq;
        bxvk.m124024a(bpmq.class, bpmq);
    }

    private bpmq() {
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
            return bxvk.m124022a(f138321d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpmq();
        } else {
            if (i2 == 4) {
                return new bxvd(f138321d);
            }
            if (i2 == 5) {
                return f138321d;
            }
            bxxk bxxk = f138322e;
            if (bxxk == null) {
                synchronized (bpmq.class) {
                    bxxk = f138322e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138321d);
                        f138322e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
