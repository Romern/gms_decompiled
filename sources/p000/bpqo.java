package p000;

/* renamed from: bpqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpqo f138768d;

    /* renamed from: e */
    private static volatile bxxk f138769e;

    /* renamed from: a */
    public int f138770a;

    /* renamed from: b */
    public int f138771b;

    /* renamed from: c */
    public int f138772c;

    static {
        bpqo bpqo = new bpqo();
        f138768d = bpqo;
        GeneratedMessageLite.m124024a(bpqo.class, bpqo);
    }

    private bpqo() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f138768d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဋ\u0001", new Object[]{"a", "b", bppd.f138604a, "c"});
        } else if (i2 == 3) {
            return new bpqo();
        } else {
            if (i2 == 4) {
                return new bxvd(f138768d);
            }
            if (i2 == 5) {
                return f138768d;
            }
            bxxk bxxk = f138769e;
            if (bxxk == null) {
                synchronized (bpqo.class) {
                    bxxk = f138769e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138768d);
                        f138769e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
