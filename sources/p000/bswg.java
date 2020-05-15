package p000;

/* renamed from: bswg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bswg implements bxvp {
    ICON_UNSPECIFIED(0),
    PRIVACY_CHECKUP_GOOD_ICON(1),
    PRIVACY_CHECKUP_NEUTRAL_ICON(2),
    SECURITY_CHECKUP_GOOD_ICON(4),
    SECURITY_CHECKUP_NEUTRAL_ICON(5),
    SECURITY_CHECKUP_WARNING_ICON(6),
    CHEVRON_LEFT_ICON(17),
    CHEVRON_RIGHT_ICON(10),
    CHEVRON_FORWARD_ICON(21),
    EDIT_ICON(11),
    OPEN_IN_NEW_ICON(20),
    PHONE_ANDROID_ICON(26),
    IMAGE_PLACEHOLDER_ICON(12),
    ACCOUNT_ICON(13),
    SEARCH_ICON(14),
    SUPPORT_ICON(15),
    MENU_ICON(16),
    ACCOUNT_ICON_SELECTED(22),
    SEARCH_ICON_SELECTED(23),
    SUPPORT_ICON_SELECTED(24),
    MENU_ICON_SELECTED(25),
    PERSONAL_INFO_ICON(34),
    TOGGLE_ON_ICON(35),
    PAYMENT_ICON(27),
    PEOPLE_OUTLINE_ICON(36),
    LOCK_ICON(28),
    CLOUD_OFF_ICON(18),
    GENERIC_ERROR_ICON(19),
    GOOGLE_G_COLORED_ICON(29),
    PERM_DEVICE_INFO_ICON(30),
    LOCAL_HOSPITAL_ICON(31),
    GROUP_ICON(32),
    GOOGLE_G_ICON(33);
    

    /* renamed from: H */
    public final int f147429H;

    private bswg(int i) {
        this.f147429H = i;
    }

    /* renamed from: a */
    public static bswg m116252a(int i) {
        if (i == 0) {
            return ICON_UNSPECIFIED;
        }
        if (i == 1) {
            return PRIVACY_CHECKUP_GOOD_ICON;
        }
        if (i == 2) {
            return PRIVACY_CHECKUP_NEUTRAL_ICON;
        }
        if (i == 4) {
            return SECURITY_CHECKUP_GOOD_ICON;
        }
        if (i == 5) {
            return SECURITY_CHECKUP_NEUTRAL_ICON;
        }
        if (i == 6) {
            return SECURITY_CHECKUP_WARNING_ICON;
        }
        switch (i) {
            case 10:
                return CHEVRON_RIGHT_ICON;
            case 11:
                return EDIT_ICON;
            case 12:
                return IMAGE_PLACEHOLDER_ICON;
            case 13:
                return ACCOUNT_ICON;
            case 14:
                return SEARCH_ICON;
            case 15:
                return SUPPORT_ICON;
            case 16:
                return MENU_ICON;
            case 17:
                return CHEVRON_LEFT_ICON;
            case 18:
                return CLOUD_OFF_ICON;
            case 19:
                return GENERIC_ERROR_ICON;
            case 20:
                return OPEN_IN_NEW_ICON;
            case 21:
                return CHEVRON_FORWARD_ICON;
            case 22:
                return ACCOUNT_ICON_SELECTED;
            case 23:
                return SEARCH_ICON_SELECTED;
            case 24:
                return SUPPORT_ICON_SELECTED;
            case 25:
                return MENU_ICON_SELECTED;
            case 26:
                return PHONE_ANDROID_ICON;
            case 27:
                return PAYMENT_ICON;
            case 28:
                return LOCK_ICON;
            case 29:
                return GOOGLE_G_COLORED_ICON;
            case 30:
                return PERM_DEVICE_INFO_ICON;
            case 31:
                return LOCAL_HOSPITAL_ICON;
            case 32:
                return GROUP_ICON;
            case 33:
                return GOOGLE_G_ICON;
            case 34:
                return PERSONAL_INFO_ICON;
            case 35:
                return TOGGLE_ON_ICON;
            case 36:
                return PEOPLE_OUTLINE_ICON;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f147429H;
    }

    public final String toString() {
        return Integer.toString(this.f147429H);
    }
}
