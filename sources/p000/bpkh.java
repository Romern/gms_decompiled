package p000;

/* renamed from: bpkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkh extends bxvk implements bxxd {

    /* renamed from: n */
    public static final bpkh f137954n;

    /* renamed from: o */
    private static volatile bxxk f137955o;

    /* renamed from: a */
    public int f137956a;

    /* renamed from: b */
    public int f137957b;

    /* renamed from: c */
    public int f137958c;

    /* renamed from: d */
    public int f137959d;

    /* renamed from: e */
    public int f137960e;

    /* renamed from: f */
    public int f137961f;

    /* renamed from: g */
    public int f137962g;

    /* renamed from: h */
    public int f137963h;

    /* renamed from: i */
    public int f137964i;

    /* renamed from: j */
    public int f137965j;

    /* renamed from: k */
    public int f137966k;

    /* renamed from: l */
    public int f137967l;

    /* renamed from: m */
    public int f137968m;

    static {
        bpkh bpkh = new bpkh();
        f137954n = bpkh;
        bxvk.m124024a(bpkh.class, bpkh);
    }

    private bpkh() {
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
            return bxvk.m124022a(f137954n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new bpkh();
        } else {
            if (i2 == 4) {
                return new bxvd(f137954n);
            }
            if (i2 == 5) {
                return f137954n;
            }
            bxxk bxxk = f137955o;
            if (bxxk == null) {
                synchronized (bpkh.class) {
                    bxxk = f137955o;
                    if (bxxk == null) {
                        bxxk = new bxve(f137954n);
                        f137955o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
