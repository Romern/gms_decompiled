package p000;

/* renamed from: btct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btct implements bxvp {
    EXTENSION_UNSPECIFIED(0),
    CREATE_PERSON(1),
    FILTER_BY_NAME(2),
    MODIFY_NAMES(3),
    HANGOUTS_PHONE_DATA(4),
    INCLUDE_DOMAIN_INFO(5),
    HANGOUTS_ADDITIONAL_DATA(6),
    HANGOUTS_SUGGESTED_PEOPLE(7),
    GDATA_COMPATIBILITY(8),
    HANGOUTS_OFF_NETWORK_GAIA_GET(9),
    ABOUT_ME_ADDITIONAL_DATA(10),
    HANGOUTS_OFF_NETWORK_GAIA_LOOKUP(12),
    SANITIZE_ABOUT_HTML(13),
    FILTER_URL_IANTS(16),
    TLS_ADD_PLACEHOLDER_PEOPLE(14),
    TLS_FILL_FIELD(15),
    DYNAMITE_ADDITIONAL_DATA(17),
    DYNAMITE_ORGANIZATION_INFO(27),
    GPLUS_ADDITIONAL_DATA(20),
    CALLER_ID_LOOKUPS(21),
    POMEROY_TRUSTED_CONTACTS_EXTENSION(22),
    FILTER_UNVERIFIED_PROFILE_FIELDS(23),
    FILTER_OBSOLETE_CONTACT_EMAILS(35),
    REMOVE_NON_DOMAIN_EMAILS(24),
    TEAMS_ADDITIONAL_DATA(25),
    GPLUS_PROFILE_FILTER(26),
    PHOTOS_COMPARE_DATA(28),
    APPS_WALDO_AVAILABILITY_DATA(29),
    SIGN_PHOTOS_IANTS(30),
    FILTER_TO_PRIMARY(31),
    DESK_LOCATION_ADDITIONAL_DATA(32),
    FILTER_UNUSED_FIELDS(33),
    GMAIL_SECURITY_DATA(34),
    INCLUDE_EMAIL_LOOKUP_KEY(36),
    DEPRECATED_ADD_HANGOUTS_RELEVANT_PEOPLE(11),
    DEPRECATED_DYNAMITE_DM_BOTS(18),
    DEPRECATED_DYNAMITE_ROOM_BOTS(19),
    UNRECOGNIZED(-1);
    

    /* renamed from: M */
    private final int f148352M;

    private btct(int i) {
        this.f148352M = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148352M;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
