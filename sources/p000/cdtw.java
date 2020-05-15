package p000;

/* renamed from: cdtw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdtw implements cdtv {

    /* renamed from: a */
    public static final bdyx f181753a;

    /* renamed from: b */
    public static final bdyx f181754b;

    /* renamed from: c */
    public static final bdyx f181755c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.feedback")).mo58443a();
        bdyx.m91610a(a, "AndroidFeedback__enable_feedback_submission_cronet", true);
        bdyx.m91610a(a, "AndroidFeedback__enable_suggestion_help_cronet", true);
        f181753a = bdyx.m91609a(a, "AndroidFeedback__feedback_submission_priority_cronet", "medium");
        f181754b = bdyx.m91609a(a, "AndroidFeedback__suggestion_help_priority_cronet", "medium");
        f181755c = bdyx.m91609a(a, "AndroidFeedback__unified_rendering_api_suggestion_priority_cronet", "medium");
    }

    /* renamed from: a */
    public final String mo78329a() {
        return (String) f181753a.mo58455c();
    }

    /* renamed from: b */
    public final String mo78330b() {
        return (String) f181754b.mo58455c();
    }

    /* renamed from: c */
    public final String mo78331c() {
        return (String) f181755c.mo58455c();
    }
}
