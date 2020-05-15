package p000;

/* renamed from: bpfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpfn implements bxvp {
    TCP_PROBER_UNKNOWN(0),
    TCP_PROBER_DEVICE_EXPIRED(1),
    TCP_PROBER_SUBTYPE_MDNS_MISSING(2),
    TCP_PROBER_BLE(3),
    TCP_PROBER_CLOUD_DISCOVERY(4),
    TCP_PROBER_GAIA_DISCOVERY(5),
    TCP_PROBER_KNOWN_SESSION_ENDPOINT(6),
    TCP_PROBER_APP_HINT(7),
    TCP_PROBER_REFRESH_SESSION_ENDPOINT(8);
    

    /* renamed from: j */
    public final int f137425j;

    private bpfn(int i) {
        this.f137425j = i;
    }

    /* renamed from: a */
    public static bpfn m111876a(int i) {
        switch (i) {
            case 0:
                return TCP_PROBER_UNKNOWN;
            case 1:
                return TCP_PROBER_DEVICE_EXPIRED;
            case 2:
                return TCP_PROBER_SUBTYPE_MDNS_MISSING;
            case 3:
                return TCP_PROBER_BLE;
            case 4:
                return TCP_PROBER_CLOUD_DISCOVERY;
            case 5:
                return TCP_PROBER_GAIA_DISCOVERY;
            case 6:
                return TCP_PROBER_KNOWN_SESSION_ENDPOINT;
            case 7:
                return TCP_PROBER_APP_HINT;
            case 8:
                return TCP_PROBER_REFRESH_SESSION_ENDPOINT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111877b() {
        return bpfm.f137414a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137425j;
    }

    public final String toString() {
        return Integer.toString(this.f137425j);
    }
}
