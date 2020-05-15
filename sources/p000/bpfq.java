package p000;

/* renamed from: bpfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpfq implements bxvp {
    TCP_PROBER_IP_SOURCE_UNKNOWN(0),
    TCP_PROBER_IP_SOURCE_CACHED(1),
    TCP_PROBER_IP_SOURCE_BLE(2),
    TCP_PROBER_IP_SOURCE_GAIA(3);
    

    /* renamed from: e */
    public final int f137433e;

    private bpfq(int i) {
        this.f137433e = i;
    }

    /* renamed from: a */
    public static bpfq m111881a(int i) {
        if (i == 0) {
            return TCP_PROBER_IP_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return TCP_PROBER_IP_SOURCE_CACHED;
        }
        if (i == 2) {
            return TCP_PROBER_IP_SOURCE_BLE;
        }
        if (i != 3) {
            return null;
        }
        return TCP_PROBER_IP_SOURCE_GAIA;
    }

    /* renamed from: b */
    public static bxvr m111882b() {
        return bpfp.f137427a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137433e;
    }

    public final String toString() {
        return Integer.toString(this.f137433e);
    }
}
