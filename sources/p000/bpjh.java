package p000;

/* renamed from: bpjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpjh extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bpjh f137858l;

    /* renamed from: m */
    private static volatile bxxk f137859m;

    /* renamed from: a */
    public int f137860a;

    /* renamed from: b */
    public int f137861b;

    /* renamed from: c */
    public int f137862c = -1;

    /* renamed from: d */
    public int f137863d;

    /* renamed from: e */
    public String f137864e = "";

    /* renamed from: f */
    public boolean f137865f;

    /* renamed from: g */
    public int f137866g;

    /* renamed from: h */
    public long f137867h;

    /* renamed from: i */
    public int f137868i;

    /* renamed from: j */
    public boolean f137869j;

    /* renamed from: k */
    public int f137870k;

    static {
        bpjh bpjh = new bpjh();
        f137858l = bpjh;
        GeneratedMessageLite.m124024a(bpjh.class, bpjh);
    }

    private bpjh() {
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
            return GeneratedMessageLite.m124022a(f137858l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006င\u0005\bဂ\u0007\u000bဌ\n\fဇ\u000b\rင\f", new Object[]{"a", "b", bphy.f137713a, "c", "d", bpjf.f137857a, "e", "f", "g", "h", "i", bpii.f137756a, "j", "k"});
        } else if (i2 == 3) {
            return new bpjh();
        } else {
            if (i2 == 4) {
                return new bxvd(f137858l);
            }
            if (i2 == 5) {
                return f137858l;
            }
            bxxk bxxk = f137859m;
            if (bxxk == null) {
                synchronized (bpjh.class) {
                    bxxk = f137859m;
                    if (bxxk == null) {
                        bxxk = new bxve(f137858l);
                        f137859m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
