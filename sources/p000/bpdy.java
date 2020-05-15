package p000;

/* renamed from: bpdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpdy implements bxvp {
    UNKNOWN(0),
    TOAST(1),
    MEDIA(2),
    IM_NOTIFICATION(3),
    NAV_NOTIFICATION_HERO(4),
    SMS_NOTIFICATION(5),
    CALL(6),
    RECENT_CALL(7),
    GMM_SUGGESTION(8),
    NOW_FREQUENT_PLACE(9),
    NOW_TRAFFIC_INCIDENTS(10),
    NOW_WEATHER(11),
    NOW_WEATHER_LIST(12),
    NOW_REMINDER(13),
    NOW_REMINDER_LIST(14),
    NOW_FLIGHT_STATUS(15),
    NOW_FLIGHT_LIST(16),
    NOW_CONCERT_TICKET(17),
    NOW_SPORT_EVENT_TICKET(18),
    NOW_CAR_RENTAL(19),
    NOW_HOTEL_PLACE(20),
    NOW_RESTAURANT_PLACE(21),
    NOW_CALENDAR_EVENT(22),
    NAV_NOTIFICATION_NORMAL(23),
    SDK_NOTIFICATION(24),
    NAV_SUGGESTION(25),
    BATTERY_LOW(26),
    NOW_ROUTINE(27),
    VISUAL_PREVIEW_DISCOVERY(28),
    DEVELOPER(29),
    OPT_IN_ABOVE_ONGOING(30),
    OPT_IN_BELOW_ONGOING(31),
    VANAGON_DEPRECATION_PHASE_ONE(32),
    VANAGON_DEPRECATION_PHASE_TWO(33);
    

    /* renamed from: I */
    public final int f136457I;

    private bpdy(int i) {
        this.f136457I = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f136457I;
    }

    public final String toString() {
        return Integer.toString(this.f136457I);
    }
}
