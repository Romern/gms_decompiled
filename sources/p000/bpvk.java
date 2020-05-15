package p000;

/* renamed from: bpvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvk extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpvk f139371c;

    /* renamed from: d */
    private static volatile bxxk f139372d;

    /* renamed from: a */
    public int f139373a;

    /* renamed from: b */
    public bpvj f139374b;

    static {
        bpvk bpvk = new bpvk();
        f139371c = bpvk;
        GeneratedMessageLite.m124024a(bpvk.class, bpvk);
    }

    private bpvk() {
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
            return GeneratedMessageLite.m124022a(f139371c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpvk();
        } else {
            if (i2 == 4) {
                return new bxvd(f139371c);
            }
            if (i2 == 5) {
                return f139371c;
            }
            bxxk bxxk = f139372d;
            if (bxxk == null) {
                synchronized (bpvk.class) {
                    bxxk = f139372d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139371c);
                        f139372d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
