package p000;

/* renamed from: buyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum buyz implements bxvp {
    BLE_BACKGROUND_SCAN_STRATEGY_UNKNOWN(0),
    BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS(1),
    BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON(2);
    

    /* renamed from: d */
    public final int f155363d;

    private buyz(int i) {
        this.f155363d = i;
    }

    /* renamed from: a */
    public static buyz m120794a(int i) {
        if (i == 0) {
            return BLE_BACKGROUND_SCAN_STRATEGY_UNKNOWN;
        }
        if (i == 1) {
            return BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS;
        }
        if (i != 2) {
            return null;
        }
        return BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON;
    }

    /* renamed from: b */
    public static bxvr m120795b() {
        return buyy.f155358a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f155363d;
    }

    public final String toString() {
        return Integer.toString(this.f155363d);
    }
}
