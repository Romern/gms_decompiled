package p000;

/* renamed from: bpmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpmz f138374e;

    /* renamed from: f */
    private static volatile bxxk f138375f;

    /* renamed from: a */
    public int f138376a;

    /* renamed from: b */
    public int f138377b;

    /* renamed from: c */
    public long f138378c;

    /* renamed from: d */
    public long f138379d;

    static {
        bpmz bpmz = new bpmz();
        f138374e = bpmz;
        GeneratedMessageLite.m124024a(bpmz.class, bpmz);
    }

    private bpmz() {
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
            return GeneratedMessageLite.m124022a(f138374e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bpms.m112074b(), "c", "d"});
        } else if (i2 == 3) {
            return new bpmz();
        } else {
            if (i2 == 4) {
                return new bxvd(f138374e);
            }
            if (i2 == 5) {
                return f138374e;
            }
            bxxk bxxk = f138375f;
            if (bxxk == null) {
                synchronized (bpmz.class) {
                    bxxk = f138375f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138374e);
                        f138375f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
