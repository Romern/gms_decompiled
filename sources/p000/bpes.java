package p000;

/* renamed from: bpes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpes implements bxvp {
    ERROR_UNKNOWN(0),
    ERROR_PEER_DISCONNECTED(1),
    ERROR_IO(2),
    ERROR_SSL(3),
    ERROR_TIMEOUT(4),
    ERROR_RELAY(5),
    ERROR_DEVICE_AUTH(6),
    ERROR_DEVICE_AUTH_ERROR_RECEIVED(7),
    ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_MALFORMED(8),
    ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_NOT_X509(9),
    ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_NOT_TRUSTED(10),
    ERROR_DEVICE_AUTH_SSL_CERT_NOT_TRUSTED(11),
    ERROR_DEVICE_AUTH_RESPONSE_MALFORMED(12),
    ERROR_CANCELED(13),
    ERROR_CAST_NEARBY_INVALID_REQUEST(14),
    ERROR_CANCELLED(15),
    ERROR_CRL_INVALID(16),
    ERROR_CRL_REVOCATION_CHECK_FAILED(17),
    ERROR_DEVICE_AUTH_TIMEOUT(18),
    ERROR_DEVICE_AUTH_PARSE_FAILURE(19),
    ERROR_DEVICE_AUTH_CHALLENGE_RECEIVED(20),
    ERROR_RELAY_CASTING_DISABLED(21),
    ERROR_RELAY_CASTING_NO_ACCOUNT_CONFIGURED(22),
    ERROR_RELAY_CASTING_DEVICE_NOT_FOUND_ON_LOCAL_NETWORK(23),
    ERROR_RELAY_CASTING_GRPC_SERVER_ERROR(24),
    ERROR_RELAY_CASTING_INVALID_SERVER_RESPONSE(25),
    ERROR_RELAY_CASTING_SOCKET_CONNECT_EXCEPTION(26),
    ERROR_RELAY_CASTING_RAT_MISSING(27),
    ERROR_RELAY_CASTING_RAT_INVALID(28),
    ERROR_RELAY_CASTING_SERVER_RESPONSE_HAS_NO_SESSION(29),
    ERROR_RELAY_CASTING_INVALID_SERVER_ADDRESS(30),
    ERROR_RELAY_CASTING_DEVICE_NOT_LINKED_TO_USER(31),
    ERROR_RELAY_CASTING_DEVICE_NOT_SUPPORTED(32),
    ERROR_RELAY_CASTING_DEVICE_CERTIFICATE_ABSENT(33),
    ERROR_RELAY_CASTING_FAILED_TO_COMMUNICATE_DEVICE(34),
    ERROR_RELAY_CASTING_RAT_REJECTED_BY_SERVER(35),
    ERROR_OTHER(99);
    

    /* renamed from: L */
    public final int f137353L;

    private bpes(int i) {
        this.f137353L = i;
    }

    /* renamed from: a */
    public static bpes m111843a(int i) {
        if (i == 99) {
            return ERROR_OTHER;
        }
        switch (i) {
            case 0:
                return ERROR_UNKNOWN;
            case 1:
                return ERROR_PEER_DISCONNECTED;
            case 2:
                return ERROR_IO;
            case 3:
                return ERROR_SSL;
            case 4:
                return ERROR_TIMEOUT;
            case 5:
                return ERROR_RELAY;
            case 6:
                return ERROR_DEVICE_AUTH;
            case 7:
                return ERROR_DEVICE_AUTH_ERROR_RECEIVED;
            case 8:
                return ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_MALFORMED;
            case 9:
                return ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_NOT_X509;
            case 10:
                return ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_NOT_TRUSTED;
            case 11:
                return ERROR_DEVICE_AUTH_SSL_CERT_NOT_TRUSTED;
            case 12:
                return ERROR_DEVICE_AUTH_RESPONSE_MALFORMED;
            case 13:
                return ERROR_CANCELED;
            case 14:
                return ERROR_CAST_NEARBY_INVALID_REQUEST;
            case 15:
                return ERROR_CANCELLED;
            case 16:
                return ERROR_CRL_INVALID;
            case 17:
                return ERROR_CRL_REVOCATION_CHECK_FAILED;
            case 18:
                return ERROR_DEVICE_AUTH_TIMEOUT;
            case 19:
                return ERROR_DEVICE_AUTH_PARSE_FAILURE;
            case 20:
                return ERROR_DEVICE_AUTH_CHALLENGE_RECEIVED;
            case 21:
                return ERROR_RELAY_CASTING_DISABLED;
            case 22:
                return ERROR_RELAY_CASTING_NO_ACCOUNT_CONFIGURED;
            case 23:
                return ERROR_RELAY_CASTING_DEVICE_NOT_FOUND_ON_LOCAL_NETWORK;
            case 24:
                return ERROR_RELAY_CASTING_GRPC_SERVER_ERROR;
            case 25:
                return ERROR_RELAY_CASTING_INVALID_SERVER_RESPONSE;
            case 26:
                return ERROR_RELAY_CASTING_SOCKET_CONNECT_EXCEPTION;
            case 27:
                return ERROR_RELAY_CASTING_RAT_MISSING;
            case 28:
                return ERROR_RELAY_CASTING_RAT_INVALID;
            case 29:
                return ERROR_RELAY_CASTING_SERVER_RESPONSE_HAS_NO_SESSION;
            case 30:
                return ERROR_RELAY_CASTING_INVALID_SERVER_ADDRESS;
            case 31:
                return ERROR_RELAY_CASTING_DEVICE_NOT_LINKED_TO_USER;
            case 32:
                return ERROR_RELAY_CASTING_DEVICE_NOT_SUPPORTED;
            case 33:
                return ERROR_RELAY_CASTING_DEVICE_CERTIFICATE_ABSENT;
            case 34:
                return ERROR_RELAY_CASTING_FAILED_TO_COMMUNICATE_DEVICE;
            case 35:
                return ERROR_RELAY_CASTING_RAT_REJECTED_BY_SERVER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111844b() {
        return bper.f137314a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137353L;
    }

    public final String toString() {
        return Integer.toString(this.f137353L);
    }
}
