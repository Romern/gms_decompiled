package p000;

/* renamed from: zzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final zzq f56322f;

    /* renamed from: g */
    private static volatile bxxk f56323g;

    /* renamed from: a */
    public int f56324a;

    /* renamed from: b */
    public zzp f56325b;

    /* renamed from: c */
    public zzn f56326c;

    /* renamed from: d */
    public zzr f56327d;

    /* renamed from: e */
    public zzl f56328e;

    static {
        zzq zzq = new zzq();
        f56322f = zzq;
        bxvk.m124024a(zzq.class, zzq);
    }

    private zzq() {
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
            return bxvk.m124022a(f56322f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new zzq();
        } else {
            if (i2 == 4) {
                return new bxvd(f56322f);
            }
            if (i2 == 5) {
                return f56322f;
            }
            bxxk bxxk = f56323g;
            if (bxxk == null) {
                synchronized (zzq.class) {
                    bxxk = f56323g;
                    if (bxxk == null) {
                        bxxk = new bxve(f56322f);
                        f56323g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
