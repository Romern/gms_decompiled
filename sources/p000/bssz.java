package p000;

/* renamed from: bssz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssz extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bssz f146944k;

    /* renamed from: l */
    private static volatile bxxk f146945l;

    /* renamed from: a */
    public String f146946a = "";

    /* renamed from: b */
    public int f146947b;

    /* renamed from: c */
    public String f146948c = "";

    /* renamed from: d */
    public String f146949d = "";

    /* renamed from: e */
    public String f146950e = "";

    /* renamed from: f */
    public String f146951f = "";

    /* renamed from: g */
    public String f146952g = "";

    /* renamed from: h */
    public String f146953h = "";

    /* renamed from: i */
    public String f146954i = "";

    /* renamed from: j */
    public String f146955j = "";

    static {
        bssz bssz = new bssz();
        f146944k = bssz;
        GeneratedMessageLite.m124024a(bssz.class, bssz);
    }

    private bssz() {
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
            return GeneratedMessageLite.m124022a(f146944k, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bssz();
        } else {
            if (i2 == 4) {
                return new bxvd(f146944k);
            }
            if (i2 == 5) {
                return f146944k;
            }
            bxxk bxxk = f146945l;
            if (bxxk == null) {
                synchronized (bssz.class) {
                    bxxk = f146945l;
                    if (bxxk == null) {
                        bxxk = new bxve(f146944k);
                        f146945l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
