package p000;

/* renamed from: ceaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceaz implements ceay {

    /* renamed from: a */
    public static final bdyx f182193a;

    /* renamed from: b */
    public static final bdyx f182194b;

    /* renamed from: c */
    public static final bdyx f182195c;

    /* renamed from: d */
    public static final bdyx f182196d;

    /* renamed from: e */
    public static final bdyx f182197e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gass"));
        bdyx.m91610a(bdyw, "Gass__enable_ad_attestation_signal", true);
        f182193a = bdyx.m91607a(bdyw, "gass:get_ad_attestation_signal_flex_secs", 86400L);
        f182194b = bdyx.m91607a(bdyw, "gass:get_ad_attestation_signal_period_secs", 86400L);
        f182195c = bdyx.m91610a(bdyw, "gass:get_ad_attestation_signal_require_charging", false);
        f182196d = bdyx.m91609a(bdyw, "gass:ad_attest_signal_uri", "https://www.googleapis.com/androidcheck/v1/attestations/adAttest?key=AIzaSyDaepk5bynjTA7ZhzF_0fzIHIXAkZlz3dA");
        f182197e = bdyx.m91607a(bdyw, "gass:get_ad_attestation_signal_valid_period_secs", 172800L);
    }

    /* renamed from: a */
    public final long mo78706a() {
        return ((Long) f182193a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo78707b() {
        return ((Long) f182194b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo78708c() {
        return ((Boolean) f182195c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo78709d() {
        return (String) f182196d.mo58455c();
    }

    /* renamed from: e */
    public final long mo78710e() {
        return ((Long) f182197e.mo58455c()).longValue();
    }
}
