package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: brej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum brej implements bxvp {
    UNKNOWN_UNMET_PRECONDITION(0),
    TOO_YOUNG(1),
    LACKS_BIRTHDAY(2),
    IS_CHILD(3),
    IS_DASHER(4),
    NO_FAMILY(5),
    TOO_MANY_MEMBERS(6),
    TOO_MANY_PARENTS(7),
    NOT_ALLOWED(8),
    NO_PARENTAL_CONSENT(9),
    FAMILY_EXISTS(10),
    HOH_OF_ANOTHER_FAMILY(16),
    FAMILY_ACCESS_SECRET_NOT_FOUND(11),
    FAMILY_ACCESS_SECRET_EXPIRED(12),
    FAMILY_INACTIVE(13),
    TOO_MANY_FAMILY_SWITCHES(14),
    PLAY_COUNTRY_MISMATCH(17),
    CVN_CHALLENGE_REQUIRED(15),
    IS_MADISON(18),
    NOT_WHITELISTED(19),
    HOH_IP_COUNTRY_MISMATCH(20),
    IS_YOUNG_TEEN(21),
    IS_SUPERVISED_ACCOUNT(22),
    YOUNG_TEEN_PARENT_COUNTRY_MISMATCH(23),
    INVALID_GAIA_ID(24),
    TOO_OLD(25),
    IS_PARENT(26),
    TOS_COUNTRY_INELIGIBLE(27),
    EMAIL_ADDRESS_WITHOUT_GAIA_ID(28),
    INVALID_NOMINATION_TOKEN(29),
    TARGET_ACCOUNT_DELETED(30),
    IS_NOT_HOH(31),
    TOO_MANY_FAMILY_SWITCHES_CANDIDATE(32),
    MISSING_CONSENT_JOIN_FAMILY(33),
    HAS_MADISON_ACCOUNT(34),
    FAMILY_IS_BLOCKED(35),
    HOH_IS_BLOCKED(36),
    USER_IS_BLOCKED(37),
    IS_GRIFFIN(38),
    EXCEEDS_FAMILY_TOTAL_QUOTA(39),
    EXCEEDS_FAMILY_USER_QUOTA(40),
    HAS_ACTIVE_FAMILY_SUBSCRIPTION(41),
    HAS_PCID_SET_UP(42),
    HAS_FORMER_MEMBERS(43),
    CANT_SUPERVISE_SELF(44),
    FAMILY_EXISTS_UNCONFIRMED(45);
    

    /* renamed from: U */
    public final int f142664U;

    private brej(int i) {
        this.f142664U = i;
    }

    /* renamed from: a */
    public static brej m113930a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_UNMET_PRECONDITION;
            case 1:
                return TOO_YOUNG;
            case 2:
                return LACKS_BIRTHDAY;
            case 3:
                return IS_CHILD;
            case 4:
                return IS_DASHER;
            case 5:
                return NO_FAMILY;
            case 6:
                return TOO_MANY_MEMBERS;
            case 7:
                return TOO_MANY_PARENTS;
            case 8:
                return NOT_ALLOWED;
            case 9:
                return NO_PARENTAL_CONSENT;
            case 10:
                return FAMILY_EXISTS;
            case 11:
                return FAMILY_ACCESS_SECRET_NOT_FOUND;
            case 12:
                return FAMILY_ACCESS_SECRET_EXPIRED;
            case 13:
                return FAMILY_INACTIVE;
            case 14:
                return TOO_MANY_FAMILY_SWITCHES;
            case 15:
                return CVN_CHALLENGE_REQUIRED;
            case 16:
                return HOH_OF_ANOTHER_FAMILY;
            case 17:
                return PLAY_COUNTRY_MISMATCH;
            case 18:
                return IS_MADISON;
            case 19:
                return NOT_WHITELISTED;
            case 20:
                return HOH_IP_COUNTRY_MISMATCH;
            case 21:
                return IS_YOUNG_TEEN;
            case 22:
                return IS_SUPERVISED_ACCOUNT;
            case 23:
                return YOUNG_TEEN_PARENT_COUNTRY_MISMATCH;
            case 24:
                return INVALID_GAIA_ID;
            case 25:
                return TOO_OLD;
            case 26:
                return IS_PARENT;
            case 27:
                return TOS_COUNTRY_INELIGIBLE;
            case 28:
                return EMAIL_ADDRESS_WITHOUT_GAIA_ID;
            case 29:
                return INVALID_NOMINATION_TOKEN;
            case 30:
                return TARGET_ACCOUNT_DELETED;
            case 31:
                return IS_NOT_HOH;
            case 32:
                return TOO_MANY_FAMILY_SWITCHES_CANDIDATE;
            case 33:
                return MISSING_CONSENT_JOIN_FAMILY;
            case 34:
                return HAS_MADISON_ACCOUNT;
            case 35:
                return FAMILY_IS_BLOCKED;
            case 36:
                return HOH_IS_BLOCKED;
            case FelicaException.TYPE_NOT_CLOSED:
                return USER_IS_BLOCKED;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return IS_GRIFFIN;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return EXCEEDS_FAMILY_TOTAL_QUOTA;
            case FelicaException.TYPE_PUSH_FAILED:
                return EXCEEDS_FAMILY_USER_QUOTA;
            case 41:
                return HAS_ACTIVE_FAMILY_SUBSCRIPTION;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return HAS_PCID_SET_UP;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return HAS_FORMER_MEMBERS;
            case FelicaException.TYPE_RESET_FAILED:
                return CANT_SUPERVISE_SELF;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return FAMILY_EXISTS_UNCONFIRMED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m113931b() {
        return brei.f142616a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f142664U;
    }

    public final String toString() {
        return Integer.toString(this.f142664U);
    }
}
