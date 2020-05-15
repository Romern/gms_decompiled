package p000;

/* renamed from: kpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final kpf f24737c;

    /* renamed from: d */
    private static volatile bxxk f24738d;

    /* renamed from: a */
    public int f24739a;

    /* renamed from: b */
    public String f24740b = "";

    static {
        kpf kpf = new kpf();
        f24737c = kpf;
        GeneratedMessageLite.m124024a(kpf.class, kpf);
    }

    private kpf() {
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
            return GeneratedMessageLite.m124022a(f24737c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kpf();
        } else {
            if (i2 == 4) {
                return new bxvd(f24737c);
            }
            if (i2 == 5) {
                return f24737c;
            }
            bxxk bxxk = f24738d;
            if (bxxk == null) {
                synchronized (kpf.class) {
                    bxxk = f24738d;
                    if (bxxk == null) {
                        bxxk = new bxve(f24737c);
                        f24738d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
