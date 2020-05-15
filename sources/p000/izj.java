package p000;

/* renamed from: izj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum izj {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    AUTH_SECURITY_ERROR("AuthSecurityError");
    

    /* renamed from: ac */
    public final String f22000ac;

    private izj(String str) {
        this.f22000ac = str;
    }

    /* renamed from: b */
    public static boolean m16368b(izj izj) {
        return NETWORK_ERROR.equals(izj) || SERVICE_UNAVAILABLE.equals(izj) || INTNERNAL_ERROR.equals(izj) || AUTH_SECURITY_ERROR.equals(izj);
    }

    /* renamed from: c */
    public static final izj m16369c(String str) {
        izj izj = UNKNOWN;
        izj[] values = values();
        for (izj izj2 : values) {
            if (izj2.f22000ac.equals(str)) {
                izj = izj2;
            }
        }
        return izj;
    }

    /* renamed from: a */
    public static boolean m16367a(izj izj) {
        return BAD_AUTHENTICATION.equals(izj) || CAPTCHA.equals(izj) || NEED_PERMISSION.equals(izj) || NEED_REMOTE_CONSENT.equals(izj) || NEEDS_BROWSER.equals(izj) || USER_CANCEL.equals(izj) || DEVICE_MANAGEMENT_REQUIRED.equals(izj) || DM_INTERNAL_ERROR.equals(izj) || DM_SYNC_DISABLED.equals(izj) || DM_ADMIN_BLOCKED.equals(izj) || DM_ADMIN_PENDING_APPROVAL.equals(izj) || DM_STALE_SYNC_REQUIRED.equals(izj) || DM_DEACTIVATED.equals(izj) || DM_REQUIRED.equals(izj) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(izj) || DM_SCREENLOCK_REQUIRED.equals(izj);
    }

    /* renamed from: b */
    public final boolean mo13527b(String str) {
        return this.f22000ac.equals(str);
    }
}
