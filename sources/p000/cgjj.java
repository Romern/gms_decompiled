package p000;

/* renamed from: cgjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgjj implements cgji {

    /* renamed from: a */
    public static final bdyx f187068a;

    /* renamed from: b */
    public static final bdyx f187069b;

    /* renamed from: c */
    public static final bdyx f187070c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.romanesco"));
        f187068a = bdyx.m91610a(bdyw, "DeviceContactsConsentFeature__listen_to_both_facs_and_udc_setting_change", true);
        f187069b = bdyx.m91610a(bdyw, "DeviceContactsConsentFeature__listen_to_facs_cache_updated_enabled", false);
        bdyx.m91610a(bdyw, "DeviceContactsConsentFeature__read_consent_bit_from_facs_cache", false);
        f187070c = bdyx.m91610a(bdyw, "DeviceContactsConsentFeature__use_device_contacts_bit", false);
    }

    /* renamed from: a */
    public final boolean mo83899a() {
        return ((Boolean) f187068a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83900b() {
        return ((Boolean) f187069b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83901c() {
        return ((Boolean) f187070c.mo58455c()).booleanValue();
    }
}
