package p000;

/* renamed from: bli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bli extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bli f5101b;

    /* renamed from: c */
    private static volatile bxxk f5102c;

    /* renamed from: a */
    public bxwc f5103a = bxxn.f165040b;

    static {
        bli bli = new bli();
        f5101b = bli;
        GeneratedMessageLite.m124024a(bli.class, bli);
    }

    private bli() {
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
            return GeneratedMessageLite.m124022a(f5101b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", blh.class});
        } else if (i2 == 3) {
            return new bli();
        } else {
            if (i2 == 4) {
                return new bxvd(f5101b);
            }
            if (i2 == 5) {
                return f5101b;
            }
            bxxk bxxk = f5102c;
            if (bxxk == null) {
                synchronized (bli.class) {
                    bxxk = f5102c;
                    if (bxxk == null) {
                        bxxk = new bxve(f5101b);
                        f5102c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo3222a() {
        if (!this.f5103a.mo73666a()) {
            this.f5103a = GeneratedMessageLite.m124021a(this.f5103a);
        }
    }
}
