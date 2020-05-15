package p000;

/* renamed from: buzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buzh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buzh f155378c;

    /* renamed from: d */
    private static volatile bxxk f155379d;

    /* renamed from: a */
    public int f155380a;

    /* renamed from: b */
    public buzi f155381b;

    static {
        buzh buzh = new buzh();
        f155378c = buzh;
        bxvk.m124024a(buzh.class, buzh);
    }

    private buzh() {
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
            return bxvk.m124022a(f155378c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buzh();
        } else {
            if (i2 == 4) {
                return new bxvd(f155378c);
            }
            if (i2 == 5) {
                return f155378c;
            }
            bxxk bxxk = f155379d;
            if (bxxk == null) {
                synchronized (buzh.class) {
                    bxxk = f155379d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155378c);
                        f155379d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
