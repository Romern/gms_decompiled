package p000;

/* renamed from: bzrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzrf implements bxvp {
    RTC_VERSION_UNSET(1),
    TELEPHONY_TYPE_UNSET(2),
    USING_WIFI_UNSET(3),
    BACKGROUND_DATA_ON_UNSET(4),
    BATTERY_LEVEL_UNSET(5),
    WIFI_SIGNAL_STRENGTH_UNSET(6),
    NETWORK_METERED_UNSET(7),
    ACCESSIBILITY_MODE_UNSET(8),
    NETWORK_VOLTE_ENABLED_UNSET(9),
    PHONE_TYPE_UNSET(10);
    

    /* renamed from: k */
    private final int f171124k;

    private bzrf(int i) {
        this.f171124k = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f171124k;
    }

    public final String toString() {
        return Integer.toString(this.f171124k);
    }
}
