package p000;

/* renamed from: cduf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cduf implements cdue {

    /* renamed from: a */
    public static final bdyx f181767a;

    /* renamed from: b */
    public static final bdyx f181768b;

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
        f181767a = bdyx.m91610a(a, "AndroidFeedback__check_pii_checkbox_visibility", false);
        f181768b = bdyx.m91610a(a, "AndroidFeedback__clear_screenshot_references", false);
        bdyx.m91610a(a, "AndroidFeedback__fix_feedback_submission_concurrency", false);
    }

    /* renamed from: a */
    public final boolean mo78340a() {
        return ((Boolean) f181767a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78341b() {
        return ((Boolean) f181768b.mo58455c()).booleanValue();
    }
}
