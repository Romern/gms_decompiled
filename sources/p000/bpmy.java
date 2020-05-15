package p000;

/* renamed from: bpmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmy extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpmy f138368e;

    /* renamed from: f */
    private static volatile bxxk f138369f;

    /* renamed from: a */
    public int f138370a;

    /* renamed from: b */
    public int f138371b;

    /* renamed from: c */
    public int f138372c;

    /* renamed from: d */
    public String f138373d = "";

    static {
        bpmy bpmy = new bpmy();
        f138368e = bpmy;
        GeneratedMessageLite.m124024a(bpmy.class, bpmy);
    }

    private bpmy() {
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
            return GeneratedMessageLite.m124022a(f138368e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", bpmx.f138367a, "c", "d"});
        } else if (i2 == 3) {
            return new bpmy();
        } else {
            if (i2 == 4) {
                return new bxvd(f138368e);
            }
            if (i2 == 5) {
                return f138368e;
            }
            bxxk bxxk = f138369f;
            if (bxxk == null) {
                synchronized (bpmy.class) {
                    bxxk = f138369f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138368e);
                        f138369f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
