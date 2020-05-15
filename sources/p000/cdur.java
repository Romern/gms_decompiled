package p000;

/* renamed from: cdur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdur implements cduq {

    /* renamed from: a */
    public static final bdyx f181782a;

    /* renamed from: b */
    public static final bdyx f181783b;

    /* renamed from: c */
    public static final bdyx f181784c;

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
        f181782a = bdyx.m91610a(a, "AndroidFeedback__mark_feedback_icons_not_important_for_a11y", false);
        f181783b = bdyx.m91610a(a, "AndroidFeedback__reschedule_before_timeout_in_offline_report_send_task", false);
        f181784c = bdyx.m91610a(a, "AndroidFeedback__update_feedback_hint_text_not_support", false);
    }

    /* renamed from: a */
    public final boolean mo78351a() {
        return ((Boolean) f181782a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78352b() {
        return ((Boolean) f181783b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78353c() {
        return ((Boolean) f181784c.mo58455c()).booleanValue();
    }
}
