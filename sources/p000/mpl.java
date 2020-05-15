package p000;

/* renamed from: mpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum mpl implements bxvp {
    PACKET_TYPE_UNSPECIFIED(0),
    HANDSHAKE(1),
    SMART_DEVICE(2),
    REQUEST_AUTHORIZATION(3),
    AUTHORIZATION_GRANTED(4),
    REQUEST_SUPPORTED_TYPES(6),
    REQUEST_SUMMARY(7),
    REQUEST_FLAVOR_ITEM_LIST(8),
    REQUEST_ITEM(9),
    TRANSFER_COMPLETED(10),
    REQUEST_HEALTH(11),
    HEALTH_REPORT(12),
    ERROR(13),
    PRE_L_DEVICE(14),
    POST_SMARTSETUP_AUTH_INIT(15),
    POST_SMARTSETUP_AUTH_FINISH(16),
    NEARBY_AUTHENTICATION(17),
    NEARBY_AUTHENTICATION_SUCCESS(18);
    

    /* renamed from: s */
    public final int f34177s;

    private mpl(int i) {
        this.f34177s = i;
    }

    /* renamed from: a */
    public static mpl m25483a(int i) {
        switch (i) {
            case 0:
                return PACKET_TYPE_UNSPECIFIED;
            case 1:
                return HANDSHAKE;
            case 2:
                return SMART_DEVICE;
            case 3:
                return REQUEST_AUTHORIZATION;
            case 4:
                return AUTHORIZATION_GRANTED;
            case 5:
            default:
                return null;
            case 6:
                return REQUEST_SUPPORTED_TYPES;
            case 7:
                return REQUEST_SUMMARY;
            case 8:
                return REQUEST_FLAVOR_ITEM_LIST;
            case 9:
                return REQUEST_ITEM;
            case 10:
                return TRANSFER_COMPLETED;
            case 11:
                return REQUEST_HEALTH;
            case 12:
                return HEALTH_REPORT;
            case 13:
                return ERROR;
            case 14:
                return PRE_L_DEVICE;
            case 15:
                return POST_SMARTSETUP_AUTH_INIT;
            case 16:
                return POST_SMARTSETUP_AUTH_FINISH;
            case 17:
                return NEARBY_AUTHENTICATION;
            case 18:
                return NEARBY_AUTHENTICATION_SUCCESS;
        }
    }

    /* renamed from: b */
    public static bxvr m25484b() {
        return mpk.f34157a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f34177s;
    }

    public final String toString() {
        return Integer.toString(this.f34177s);
    }
}
