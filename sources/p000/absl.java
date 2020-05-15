package p000;

/* renamed from: absl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final absl f58109d;

    /* renamed from: f */
    private static volatile bxxk f58110f;

    /* renamed from: a */
    public String f58111a = "";

    /* renamed from: b */
    public absk f58112b;

    /* renamed from: c */
    public absk f58113c;

    /* renamed from: e */
    private int f58114e;

    static {
        absl absl = new absl();
        f58109d = absl;
        GeneratedMessageLite.m124024a(absl.class, absl);
    }

    private absl() {
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
            return GeneratedMessageLite.m124022a(f58109d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new absl();
        } else {
            if (i2 == 4) {
                return new bxvd(f58109d);
            }
            if (i2 == 5) {
                return f58109d;
            }
            bxxk bxxk = f58110f;
            if (bxxk == null) {
                synchronized (absl.class) {
                    bxxk = f58110f;
                    if (bxxk == null) {
                        bxxk = new bxve(f58109d);
                        f58110f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
