package p000;

/* renamed from: bpmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmm extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpmm f138294h;

    /* renamed from: i */
    private static volatile bxxk f138295i;

    /* renamed from: a */
    public int f138296a;

    /* renamed from: b */
    public int f138297b;

    /* renamed from: c */
    public int f138298c;

    /* renamed from: d */
    public int f138299d;

    /* renamed from: e */
    public int f138300e;

    /* renamed from: f */
    public int f138301f;

    /* renamed from: g */
    public bxwc f138302g = bxxn.f165040b;

    static {
        bpmm bpmm = new bpmm();
        f138294h = bpmm;
        GeneratedMessageLite.m124024a(bpmm.class, bpmm);
    }

    private bpmm() {
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
            return GeneratedMessageLite.m124022a(f138294h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", bpml.class});
        } else if (i2 == 3) {
            return new bpmm();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f138294h;
            }
            bxxk bxxk = f138295i;
            if (bxxk == null) {
                synchronized (bpmm.class) {
                    bxxk = f138295i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138294h);
                        f138295i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
