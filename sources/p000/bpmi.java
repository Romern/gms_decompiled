package p000;

/* renamed from: bpmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmi extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpmi f138262e;

    /* renamed from: f */
    private static volatile bxxk f138263f;

    /* renamed from: a */
    public int f138264a;

    /* renamed from: b */
    public String f138265b = "";

    /* renamed from: c */
    public int f138266c;

    /* renamed from: d */
    public bxwc f138267d = bxxn.f165040b;

    static {
        bpmi bpmi = new bpmi();
        f138262e = bpmi;
        GeneratedMessageLite.m124024a(bpmi.class, bpmi);
    }

    private bpmi() {
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
            return GeneratedMessageLite.m124022a(f138262e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", bpmh.class});
        } else if (i2 == 3) {
            return new bpmi();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f138262e;
            }
            bxxk bxxk = f138263f;
            if (bxxk == null) {
                synchronized (bpmi.class) {
                    bxxk = f138263f;
                    if (bxxk == null) {
                        bxxk = new bxve(f138262e);
                        f138263f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
