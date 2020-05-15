package p000;

/* renamed from: xmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum xmq {
    KEYSTORE(1),
    SOFTWARE(2),
    STRONGBOX(3);
    

    /* renamed from: d */
    public final int f52779d;

    private xmq(int i) {
        this.f52779d = i;
    }

    /* renamed from: a */
    public static xmq m43182a(int i) {
        xmq xmq = KEYSTORE;
        if (i != xmq.f52779d) {
            xmq = SOFTWARE;
            if (i != xmq.f52779d) {
                xmq xmq2 = STRONGBOX;
                if (i == xmq2.f52779d) {
                    return xmq2;
                }
                throw new IllegalArgumentException("Value is not a known key type");
            }
        }
        return xmq;
    }
}
