package p000;

/* renamed from: cckj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cckj implements ccki {

    /* renamed from: a */
    public static final bdyx f179232a;

    /* renamed from: b */
    public static final bdyx f179233b;

    /* renamed from: c */
    public static final bdyx f179234c;

    /* renamed from: d */
    public static final bdyx f179235d;

    /* renamed from: e */
    public static final bdyx f179236e;

    /* renamed from: f */
    public static final bdyx f179237f;

    /* renamed from: g */
    public static final bdyx f179238g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.autofill"));
        f179232a = bdyx.m91610a(bdyw, "SmsOtpCodeAutofill__inline_presentation_support_enabled", false);
        f179233b = bdyx.m91610a(bdyw, "SmsOtpCodeAutofill__is_enabled", true);
        f179234c = bdyx.m91610a(bdyw, "SmsOtpCodeAutofill__is_greedy_field_mapping_enabled", false);
        f179235d = bdyx.m91610a(bdyw, "SmsOtpCodeAutofill__is_prefetch_enabled", true);
        f179236e = bdyx.m91607a(bdyw, "SmsOtpCodeAutofill__overlay_timeout_minutes", 4L);
        f179237f = bdyx.m91607a(bdyw, "SmsOtpCodeAutofill__prefetch_timeout_millis", 300L);
        f179238g = bdyx.m91610a(bdyw, "SmsOtpCodeAutofill__use_transparent_autofill_activity", false);
    }

    /* renamed from: a */
    public final boolean mo76176a() {
        return ((Boolean) f179232a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76177b() {
        return ((Boolean) f179233b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76178c() {
        return ((Boolean) f179234c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76179d() {
        return ((Boolean) f179235d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo76180e() {
        return ((Long) f179236e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo76181f() {
        return ((Long) f179237f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo76182g() {
        return ((Boolean) f179238g.mo58455c()).booleanValue();
    }
}
