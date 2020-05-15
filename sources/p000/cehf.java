package p000;

/* renamed from: cehf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cehf implements cehe {

    /* renamed from: a */
    public static final bdyx f182666a;

    /* renamed from: b */
    public static final bdyx f182667b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.googlehelp")).mo58443a();
        bdyx.m91610a(a, "AndroidGoogleHelp__v26_enable_case_insensitive_content_type", true);
        f182666a = bdyx.m91610a(a, "AndroidGoogleHelp__v26_enable_report_batched_metrics_cronet", false);
        f182667b = bdyx.m91609a(a, "AndroidGoogleHelp__v26_report_batched_metrics_priority_cronet", "medium");
    }

    /* renamed from: a */
    public final boolean mo79125a() {
        return ((Boolean) f182666a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo79126b() {
        return (String) f182667b.mo58455c();
    }
}
