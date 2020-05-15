package p000;

/* renamed from: cgwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgwy implements cgwx {

    /* renamed from: a */
    public static final bdyx f187946a;

    /* renamed from: b */
    public static final bdyx f187947b;

    /* renamed from: c */
    public static final bdyx f187948c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        f187946a = bdyx.m91609a(bdyw, "antenna_location", "");
        f187947b = bdyx.m91609a(bdyw, "attestation_failure_help_url", "https://support.google.com/pay/?p=pay-device_cant_pay_instore");
        f187948c = bdyx.m91607a(bdyw, "tap_ui_card_chooser_max_cards", 5L);
    }

    /* renamed from: a */
    public final String mo84655a() {
        return (String) f187946a.mo58455c();
    }

    /* renamed from: b */
    public final String mo84656b() {
        return (String) f187947b.mo58455c();
    }

    /* renamed from: c */
    public final long mo84657c() {
        return ((Long) f187948c.mo58455c()).longValue();
    }
}
