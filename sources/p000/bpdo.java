package p000;

import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;

/* renamed from: bpdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpdo implements bxvp {
    UNKNOWN_DETAIL(0),
    NO_SENSORS(1),
    SENSORS_FAIL(2),
    NO_ACCESSORY_PERMISSION(3),
    NO_ACCESSORY_FD(4),
    SOCKET_FAIL(5),
    BAD_MIC_AUDIO_CONFIG(6),
    BAD_AUDIO_CONFIG(7),
    MISSING_AUDIO_CONFIG(8),
    NAV_NO_IMAGE_OPTIONS(9),
    NAV_BAD_SIZE(10),
    NAV_BAD_COLOR(11),
    BAD_VIDEO(12),
    MISSING_VIDEO(13),
    DISPLAY_REMOVAL_TIMEOUT(14),
    NO_AUDIO_CAPTURE(15),
    MISSING_LAUNCHER(16),
    NO_VIDEO_CONFIG(17),
    BAD_CODEC_RESOLUTION(18),
    BAD_DISPLAY_RESOLUTION(19),
    BAD_FPS(20),
    NO_DENSITY(21),
    BAD_DENSITY(22),
    NO_SENSORS2(23),
    NO_AUDIO_MIC(24),
    NO_DISPLAY(25),
    NO_INPUT(26),
    COMPOSITION_RENDER_ERROR(27),
    COMPOSITION_IDLE_RENDER_ERROR(28),
    COMPOSITION_SCREENSHOT_ERROR(29),
    COMPOSITION_WINDOW_INIT_ERROR(30),
    COMPOSITION_INIT_FAIL(31),
    VENDOR_START_FAIL(32),
    VIDEO_ENCODING_INIT_FAIL(33),
    BYEBYE_BY_CAR(34),
    BYEBYE_BY_USER(35),
    UNEXPECTED_BYEBYE_RESPONSE(36),
    BYEBYE_TIMEOUT(37),
    INVALID_ACK(38),
    INVALID_ACK_CONFIG(39),
    NO_VIDEO_CONFIGS(40),
    EARLY_VIDEO_FOCUS(41),
    ERROR_STARTING_SERVICES(42),
    AUTH_FAILED(43),
    AUTH_FAILED_BY_CAR(44),
    FRAMING_ERROR(45),
    UNEXPECTED_MESSAGE(46),
    BAD_VERSION(47),
    VIDEO_ACK_TIMEOUT(48),
    AUDIO_ACK_TIMEOUT(49),
    WRITER_IO_ERROR(50),
    WRITER_UNKNOWN_EXCEPTION(51),
    READER_CLOSE(52),
    READER_INIT_FAIL(53),
    READER_IO_ERROR(54),
    AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID(55),
    AUTH_FAILED_BY_CAR_CERT_EXPIRED(56),
    PING_TIMEOUT(57),
    MULTIPLE_DISPLAY_CONFIGS(58),
    WIFI_NETWORK_UNAVAILABLE(59),
    WIFI_NETWORK_DISCONNECTED(60),
    EMPTY_USB_ACCESSORY_LIST(61),
    SPURIOUS_USB_ACCESSORY_EVENT(62),
    INVALID_ACCESSORY(63),
    CONNECTION_TRANSFER_ABORTED(64),
    DISPLAY_ID_INVALID(65),
    BAD_PRIMARY_DISPLAY(66);
    

    /* renamed from: ap */
    public final int f136351ap;

    private bpdo(int i) {
        this.f136351ap = i;
    }

    /* renamed from: a */
    public static bpdo m111808a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DETAIL;
            case 1:
                return NO_SENSORS;
            case 2:
                return SENSORS_FAIL;
            case 3:
                return NO_ACCESSORY_PERMISSION;
            case 4:
                return NO_ACCESSORY_FD;
            case 5:
                return SOCKET_FAIL;
            case 6:
                return BAD_MIC_AUDIO_CONFIG;
            case 7:
                return BAD_AUDIO_CONFIG;
            case 8:
                return MISSING_AUDIO_CONFIG;
            case 9:
                return NAV_NO_IMAGE_OPTIONS;
            case 10:
                return NAV_BAD_SIZE;
            case 11:
                return NAV_BAD_COLOR;
            case 12:
                return BAD_VIDEO;
            case 13:
                return MISSING_VIDEO;
            case 14:
                return DISPLAY_REMOVAL_TIMEOUT;
            case 15:
                return NO_AUDIO_CAPTURE;
            case 16:
                return MISSING_LAUNCHER;
            case 17:
                return NO_VIDEO_CONFIG;
            case 18:
                return BAD_CODEC_RESOLUTION;
            case 19:
                return BAD_DISPLAY_RESOLUTION;
            case 20:
                return BAD_FPS;
            case 21:
                return NO_DENSITY;
            case 22:
                return BAD_DENSITY;
            case 23:
                return NO_SENSORS2;
            case 24:
                return NO_AUDIO_MIC;
            case 25:
                return NO_DISPLAY;
            case 26:
                return NO_INPUT;
            case 27:
                return COMPOSITION_RENDER_ERROR;
            case 28:
                return COMPOSITION_IDLE_RENDER_ERROR;
            case 29:
                return COMPOSITION_SCREENSHOT_ERROR;
            case 30:
                return COMPOSITION_WINDOW_INIT_ERROR;
            case 31:
                return COMPOSITION_INIT_FAIL;
            case 32:
                return VENDOR_START_FAIL;
            case 33:
                return VIDEO_ENCODING_INIT_FAIL;
            case 34:
                return BYEBYE_BY_CAR;
            case 35:
                return BYEBYE_BY_USER;
            case 36:
                return UNEXPECTED_BYEBYE_RESPONSE;
            case FelicaException.TYPE_NOT_CLOSED:
                return BYEBYE_TIMEOUT;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return INVALID_ACK;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return INVALID_ACK_CONFIG;
            case FelicaException.TYPE_PUSH_FAILED:
                return NO_VIDEO_CONFIGS;
            case 41:
                return EARLY_VIDEO_FOCUS;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return ERROR_STARTING_SERVICES;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return AUTH_FAILED;
            case FelicaException.TYPE_RESET_FAILED:
                return AUTH_FAILED_BY_CAR;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return FRAMING_ERROR;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return UNEXPECTED_MESSAGE;
            case 47:
                return BAD_VERSION;
            case 48:
                return VIDEO_ACK_TIMEOUT;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return AUDIO_ACK_TIMEOUT;
            case 50:
                return WRITER_IO_ERROR;
            case 51:
                return WRITER_UNKNOWN_EXCEPTION;
            case 52:
                return READER_CLOSE;
            case 53:
                return READER_INIT_FAIL;
            case 54:
                return READER_IO_ERROR;
            case 55:
                return AUTH_FAILED_BY_CAR_CERT_NOT_YET_VALID;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                return AUTH_FAILED_BY_CAR_CERT_EXPIRED;
            case 57:
                return PING_TIMEOUT;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                return MULTIPLE_DISPLAY_CONFIGS;
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
                return WIFI_NETWORK_UNAVAILABLE;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                return WIFI_NETWORK_DISCONNECTED;
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
                return EMPTY_USB_ACCESSORY_LIST;
            case 62:
                return SPURIOUS_USB_ACCESSORY_EVENT;
            case 63:
                return INVALID_ACCESSORY;
            case 64:
                return CONNECTION_TRANSFER_ABORTED;
            case KeyInformation.AES128_DES56:
                return DISPLAY_ID_INVALID;
            case 66:
                return BAD_PRIMARY_DISPLAY;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f136351ap;
    }

    public final String toString() {
        return Integer.toString(this.f136351ap);
    }
}
