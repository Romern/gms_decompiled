package p000;

/* renamed from: boox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum boox implements bxvp {
    UNKNOWN(0),
    RECEIVED_BY_GCM(1),
    GCM_MESSAGE_PARSE_ERROR(2),
    BLOCKED_BY_USER(3),
    BLOCKED_BY_GMSCORE(4),
    BLOCKED_BY_PHENOTYPE(5),
    REENABLED_BY_USER(6),
    REENABLED_BY_GMSCORE(7),
    POP_UP(8),
    DISMISSED_BY_UESR(9),
    CLEARED_ALL_BY_USER(10),
    JUMP_TO_UI(11),
    BLOCKED_BY_MDP(12),
    BLOCKED_BY_TIMEOUT(13),
    GCM_MESSAGE_ERROR_RECV_EMPTY(14),
    GCM_MESSAGE_EMPTY_BODY(15),
    GCM_MESSAGE_NO_INFO(16),
    GCM_MESSAGE_NO_CARRIER_ID(17),
    GCM_MESSAGE_ERROR_UNMATCHED_CARRIER(18),
    BLOCKED_EXTRA_WELCOME_NOTIFICATION(19),
    GCM_MESSAGE_NOT_CONSENTED(20),
    GCM_MESSAGE_HIDDEN(21),
    GCM_MESSAGE_ERROR_INVALID_CHANNEL(22),
    NOTIFICATION_ACTION_TAKEN(23),
    JUMP_TO_SETTINGS(24),
    GCM_MESSAGE_WARN_UNMATCHED_SIM_ID(25),
    GCM_MESSAGE_WARN_NO_SIM_ID(26),
    GCM_MESSAGE_BLOCKED_NO_SUPPORTED_SIM(27),
    GCM_MESSAGE_BLOCKED_UNMATCHED_SIM_ID(28),
    GCM_MESSAGE_HIDDEN_NOTIFICATION_HANDLED_SUCCESSFULLY(29),
    GCM_MESSAGE_ERROR_HANDLING_HIDDEN_NOTIFICATION(30),
    GCM_MESSAGE_ERROR_NO_HANDLER_FOR_HIDDEN_NOTIFICATION(31),
    UNRECOGNIZED(-1);
    

    /* renamed from: H */
    private final int f134071H;

    private boox(int i) {
        this.f134071H = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f134071H;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
