package p000;

/* renamed from: ccdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccdx implements ccdw {

    /* renamed from: a */
    public static final bdyx f178809a;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_api_phone")).mo58443a();
        f178809a = bdyx.m91607a(a, "RetrieveSmsWithAppCodeFeature__default_timeout_millis", 300000L);
        bdyx.m91609a(a, "RetrieveSmsWithAppCodeFeature__sms_message_prefix_list", "[#],<#>,​​,[Web발신]\n<#>,[국외발신]\n<#>,[Web발신]\r\n<#>,[국외발신]\r\n<#>");
    }

    /* renamed from: a */
    public final long mo75811a() {
        return ((Long) f178809a.mo58455c()).longValue();
    }
}
