package p000;

/* renamed from: abdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdf extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final abdf f57075i;

    /* renamed from: j */
    private static volatile bxxk f57076j;

    /* renamed from: a */
    public int f57077a;

    /* renamed from: b */
    public int f57078b = 0;

    /* renamed from: c */
    public Object f57079c;

    /* renamed from: d */
    public long f57080d;

    /* renamed from: e */
    public bxyl f57081e;

    /* renamed from: f */
    public bxyl f57082f;

    /* renamed from: g */
    public String f57083g = "";

    /* renamed from: h */
    public String f57084h = "";

    static {
        abdf abdf = new abdf();
        f57075i = abdf;
        GeneratedMessageLite.m124024a(abdf.class, abdf);
    }

    private abdf() {
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
            return GeneratedMessageLite.m124022a(f57075i, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bဉ\u0007\tဈ\b\nဈ\t", new Object[]{"c", "b", "a", "d", "e", abdp.class, abdj.class, abdm.class, abdg.class, abdc.class, "f", "g", "h"});
        } else if (i2 == 3) {
            return new abdf();
        } else {
            if (i2 == 4) {
                return new bxvd(f57075i);
            }
            if (i2 == 5) {
                return f57075i;
            }
            bxxk bxxk = f57076j;
            if (bxxk == null) {
                synchronized (abdf.class) {
                    bxxk = f57076j;
                    if (bxxk == null) {
                        bxxk = new bxve(f57075i);
                        f57076j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
