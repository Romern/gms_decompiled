package p000;

/* renamed from: ccwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccwx implements ccww {

    /* renamed from: a */
    public static final bdyx f180130a;

    /* renamed from: b */
    public static final bdyx f180131b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f180130a = bdyx.m91610a(bdyw, "WirelessProjectionInGearhead__enabled", false);
        f180131b = bdyx.m91609a(bdyw, "WirelessProjectionInGearhead__enabled_countries", "USA,CAN,MEX,BRA,ARG,COL,PER,VEN,CHL,GTM,ECU,BOL,DOM,PRY,CRI,PAN,PRI,URY,NZL,PHL,SGP,TWN,ZAF,KOR,AUS,IND");
        bdyx.m91610a(bdyw, "WirelessProjectionInGearhead__use_gms_flags", false);
    }

    /* renamed from: a */
    public final boolean mo76960a() {
        return ((Boolean) f180130a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo76961b() {
        return (String) f180131b.mo58455c();
    }
}
