package p000;

/* renamed from: byrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byrf {
    /* renamed from: a */
    public static /* synthetic */ String m125195a(int i) {
        switch (i) {
            case 1:
                return "INITIATOR_START";
            case 2:
                return "INITIATOR_WAITING_FOR_RESPONDER_COMMITMENT";
            case 3:
                return "INITIATOR_AFTER_RESPONDER_COMMITMENT";
            case 4:
                return "INITIATOR_WAITING_FOR_RESPONDER_HASH";
            case 5:
                return "RESPONDER_START";
            case 6:
                return "RESPONDER_AFTER_INITIATOR_COMMITMENT";
            case 7:
                return "RESPONDER_WAITING_FOR_INITIATOR_HASH";
            case 8:
                return "RESPONDER_AFTER_INITIATOR_HASH";
            case 9:
                return "HANDSHAKE_FINISHED";
            case 10:
                return "HANDSHAKE_ALREADY_USED";
            default:
                return "null";
        }
    }
}
