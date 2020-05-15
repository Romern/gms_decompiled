package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: bqbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqbf implements bxvp {
    UNKNOWN(0),
    CONFIG_OVERRIDE(1),
    ALARM(2),
    CONVERSATION(3),
    DIGITAL_DOCUMENT(4),
    DIGITAL_DOCUMENT_PERMISSION(5),
    EMAIL_MESSAGE(6),
    EVENT(7),
    GEO_SHAPE(8),
    LOCAL_BUSINESS(9),
    MESSAGE(10),
    MUSIC_ALBUM(11),
    MUSIC_GROUP(12),
    MUSIC_PLAYLIST(13),
    MUSIC_RECORDING(14),
    NOTE_DIGITAL_DOCUMENT(15),
    PERSON(16),
    PHOTOGRAPH(17),
    PLACE(18),
    PRESENTATION_DIGITAL_DOCUMENT(19),
    RESERVATION(20),
    RESTAURANT(21),
    SPREADSHEET_DIGITAL_DOCUMENT(22),
    STICKER(23),
    STICKER_PACK(24),
    STOPWATCH(25),
    TEXT_DIGITAL_DOCUMENT(26),
    THING(27),
    TIMER(28),
    VIDEO_OBJECT(29),
    AGGREGATE_RATING(30),
    ALARM_INSTANCE(31),
    ATTENDEE(32),
    STOPWATCH_LAP(33),
    POSTAL_ADDRESS(34),
    CONTACT(35),
    CONTEXTUAL_EVENT(36),
    MOBILE_APPLICATION(37),
    BOOK(38),
    AUDIOBOOK(39),
    MOVIE(40),
    TV_SERIES(41),
    WEB_PAGE(42),
    GMM_VOICE_MODEL(43),
    ACTION(44),
    EXTRACTED_ENTITY(45),
    DATE(46),
    DATE_TIME(47),
    FLIGHT(48),
    EXTRACTED_ENTITY_METADATA(49),
    CONTACT_POINT(50),
    STASH_RECORD(51),
    UNRECOGNIZED(-1);
    

    /* renamed from: ab */
    private final int f140358ab;

    private bqbf(int i) {
        this.f140358ab = i;
    }

    /* renamed from: a */
    public static bqbf m112504a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONFIG_OVERRIDE;
            case 2:
                return ALARM;
            case 3:
                return CONVERSATION;
            case 4:
                return DIGITAL_DOCUMENT;
            case 5:
                return DIGITAL_DOCUMENT_PERMISSION;
            case 6:
                return EMAIL_MESSAGE;
            case 7:
                return EVENT;
            case 8:
                return GEO_SHAPE;
            case 9:
                return LOCAL_BUSINESS;
            case 10:
                return MESSAGE;
            case 11:
                return MUSIC_ALBUM;
            case 12:
                return MUSIC_GROUP;
            case 13:
                return MUSIC_PLAYLIST;
            case 14:
                return MUSIC_RECORDING;
            case 15:
                return NOTE_DIGITAL_DOCUMENT;
            case 16:
                return PERSON;
            case 17:
                return PHOTOGRAPH;
            case 18:
                return PLACE;
            case 19:
                return PRESENTATION_DIGITAL_DOCUMENT;
            case 20:
                return RESERVATION;
            case 21:
                return RESTAURANT;
            case 22:
                return SPREADSHEET_DIGITAL_DOCUMENT;
            case 23:
                return STICKER;
            case 24:
                return STICKER_PACK;
            case 25:
                return STOPWATCH;
            case 26:
                return TEXT_DIGITAL_DOCUMENT;
            case 27:
                return THING;
            case 28:
                return TIMER;
            case 29:
                return VIDEO_OBJECT;
            case 30:
                return AGGREGATE_RATING;
            case 31:
                return ALARM_INSTANCE;
            case 32:
                return ATTENDEE;
            case 33:
                return STOPWATCH_LAP;
            case 34:
                return POSTAL_ADDRESS;
            case 35:
                return CONTACT;
            case 36:
                return CONTEXTUAL_EVENT;
            case FelicaException.TYPE_NOT_CLOSED:
                return MOBILE_APPLICATION;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return BOOK;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return AUDIOBOOK;
            case FelicaException.TYPE_PUSH_FAILED:
                return MOVIE;
            case 41:
                return TV_SERIES;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return WEB_PAGE;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return GMM_VOICE_MODEL;
            case FelicaException.TYPE_RESET_FAILED:
                return ACTION;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return EXTRACTED_ENTITY;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                return DATE;
            case 47:
                return DATE_TIME;
            case 48:
                return FLIGHT;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                return EXTRACTED_ENTITY_METADATA;
            case 50:
                return CONTACT_POINT;
            case 51:
                return STASH_RECORD;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112505b() {
        return bqbe.f140303a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f140358ab;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
