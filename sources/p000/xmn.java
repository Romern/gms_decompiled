package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: xmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xmn {

    /* renamed from: a */
    public static final bdyx f52751a;

    /* renamed from: b */
    public static final bdyx f52752b = bdyx.m91610a(f52774x, "strongbox_user_flow_enabled", false);

    /* renamed from: c */
    public static final bdyx f52753c = bdyx.m91610a(f52774x, "pollux_logging_enabled", false);

    /* renamed from: d */
    public static final bdyx f52754d = bdyx.m91610a(f52774x, "fido2_core_api_logging_enabled", true);

    /* renamed from: e */
    public static final bdyx f52755e = bdyx.m91610a(f52774x, "u2f_core_api_logging_enabled", true);

    /* renamed from: f */
    public static final bdyx f52756f = bdyx.m91606a(f52774x, "auth_fido_user_gesture_validity_duration_seconds", 10);

    /* renamed from: g */
    public static final bdyx f52757g = bdyx.m91610a(f52774x, "auth_fido_enrollment_enabled", false);

    /* renamed from: h */
    public static final bdyx f52758h = bdyx.m91610a(f52774x, "auth_fido_keystore_key_enrollment_enabled", true);

    /* renamed from: i */
    public static final bdyx f52759i = bdyx.m91610a(f52774x, "auth_fido_software_key_enrollment_enabled", true);

    /* renamed from: j */
    public static final bdyx f52760j = bdyx.m91610a(f52774x, "auth_fido_strongbox_key_enrollment_enabled", false);

    /* renamed from: k */
    public static final bdyx f52761k = bdyx.m91607a(f52774x, "auth_fido_check_enrollment_delay_millis", TimeUnit.HOURS.toMillis(24));

    /* renamed from: l */
    public static final bdyx f52762l = bdyx.m91610a(f52774x, "auth_fido_key_validity_check_enabled", false);

    /* renamed from: m */
    public static final bdyx f52763m = bdyx.m91607a(f52774x, "auth_fido_check_key_validity_delay_millis", TimeUnit.HOURS.toMillis(24));

    /* renamed from: n */
    public static final bdyx f52764n = bdyx.m91610a(f52774x, "auth_fido_invalidate_custom_keys_enabled", false);

    /* renamed from: o */
    public static final bdyx f52765o = bdyx.m91610a(f52774x, "auth_fido_delete_keys_when_account_removed_enabled", false);

    /* renamed from: p */
    public static final bdyx f52766p = bdyx.m91609a(f52774x, "cable_service_uuid", "0000fde2-0000-1000-8000-00805f9b34fb");

    /* renamed from: q */
    public static final bdyx f52767q = bdyx.m91610a(f52774x, "auth_fido_clear_ndef_tag_enabled", true);

    /* renamed from: r */
    public static final bdyx f52768r = bdyx.m91610a(f52774x, "cable_client_enabled", false);

    /* renamed from: s */
    public static final bdyx f52769s = bdyx.m91610a(f52774x, "scan_cable_on_screen_wake", true);

    /* renamed from: t */
    public static final bdyx f52770t = bdyx.m91610a(f52774x, "is_cable_debug_mode_enabled", false);

    /* renamed from: u */
    public static final bdyx f52771u = bdyx.m91610a(f52774x, "auth_fido_suggest_usb_on_nfc_error", false);

    /* renamed from: v */
    public static final bdyx f52772v = bdyx.m91606a(f52774x, "auth_fido_number_of_allowed_nfc_failures_before_use_usb_dialog", 2);

    /* renamed from: w */
    public static final bdyx f52773w = bdyx.m91610a(f52774x, "auth_fido_registration_ceremony_privacy_enabled", true);

    /* renamed from: x */
    private static final bdyw f52774x;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw b = new bdyw(anef.m64088a("com.google.android.gms.fido")).mo58445a("gms:fido:").mo58451b("Fido__");
        f52774x = b;
        f52751a = bdyx.m91610a(b, "is_pollux_enabled", false);
        bdyx.m91609a(f52774x, "cable_session_data_nonce", "6B26CA174E9D48AC");
        bdyx.m91609a(f52774x, "cable_session_data_client_eid", "6B26CA174E9D48AC6AB1D1F0864D5613");
        bdyx.m91609a(f52774x, "cable_session_data_authenticator_eid", "EE051153B059C3159BC267E4DCF2B357");
        bdyx.m91609a(f52774x, "cable_session_data_pre_session_key", "B477B945B6C66781B1762C26643E6A1F0F6B8B540485053CB94F78476C8E3FC5");
        bdyx.m91609a(f52774x, "cable_session_data_account", "the.rock.tester1@gmail.com");
    }
}
