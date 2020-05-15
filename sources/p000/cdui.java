package p000;

/* renamed from: cdui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdui implements cduh {

    /* renamed from: a */
    public static final bdyx f181771a;

    /* renamed from: b */
    public static final bdyx f181772b;

    /* renamed from: c */
    public static final bdyx f181773c;

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
        f181771a = bdyx.m91610a(a, "AndroidFeedback__fix_suggested_article_crash", false);
        f181772b = bdyx.m91610a(a, "AndroidFeedback__select_last_chosen_account_in_email_spinner", false);
        f181773c = bdyx.m91610a(a, "AndroidFeedback__throw_on_set_screenshot_but_no_pii_allowed", true);
        bdyx.m91610a(a, "AndroidFeedback__trim_feedback_submission", false);
    }

    /* renamed from: a */
    public final boolean mo78343a() {
        return ((Boolean) f181771a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78344b() {
        return ((Boolean) f181772b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78345c() {
        return ((Boolean) f181773c.mo58455c()).booleanValue();
    }
}
