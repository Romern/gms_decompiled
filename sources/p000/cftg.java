package p000;

/* renamed from: cftg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cftg implements cftf {

    /* renamed from: a */
    public static final bdyx f185680a;

    /* renamed from: b */
    public static final bdyx f185681b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.update"));
        f185680a = bdyx.m91610a(bdyw, "enable_settings_suggestion", false);
        f185681b = bdyx.m91609a(bdyw, "settings_suggestion_escalation_phases", "");
    }

    /* renamed from: a */
    public final boolean mo82698a() {
        return ((Boolean) f185680a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo82699b() {
        return (String) f185681b.mo58455c();
    }
}
