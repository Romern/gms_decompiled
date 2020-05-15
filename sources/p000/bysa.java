package p000;

/* renamed from: bysa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bysa {
    ENROLLMENT(1),
    TICKLE(2),
    TX_REQUEST(3),
    TX_REPLY(4),
    TX_SYNC_REQUEST(5),
    TX_SYNC_RESPONSE(6),
    TX_PING(7),
    DEVICE_INFO_UPDATE(8),
    TX_CANCEL_REQUEST(9),
    LOGIN_NOTIFICATION(102),
    PROXIMITYAUTH_PAIRING(11),
    GCMV1_IDENTITY_ASSERTION(12),
    DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD(13),
    DEVICE_TO_DEVICE_MESSAGE(14),
    DEVICE_PROXIMITY_CALLBACK(15),
    UNLOCK_KEY_SIGNED_CHALLENGE(16);
    

    /* renamed from: q */
    public final int f167549q;

    private bysa(int i) {
        this.f167549q = i;
    }

    /* renamed from: a */
    public static bysa m125237a(int i) {
        bysa[] values = values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            bysa bysa = values[i2];
            int i3 = bysa.f167549q;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            } else if (i4 == i) {
                return bysa;
            } else {
                i2++;
            }
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unsupported payload type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static bysa m125238b(int i) {
        return m125237a(i - 1);
    }
}
