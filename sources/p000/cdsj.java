package p000;

/* renamed from: cdsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdsj implements cdsi {

    /* renamed from: a */
    public static final bdyx f181646a;

    /* renamed from: b */
    public static final bdyx f181647b;

    /* renamed from: c */
    public static final bdyx f181648c;

    /* renamed from: d */
    public static final bdyx f181649d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.family"));
        bdyx.m91610a(bdyw, "BugFix__contact_method_switch_when_full", false);
        f181646a = bdyx.m91610a(bdyw, "BugFix__disable_griffin_member_removal", false);
        bdyx.m91610a(bdyw, "BugFix__disable_screen_rotation_send_invitations", false);
        f181647b = bdyx.m91610a(bdyw, "BugFix__enable_manage_supervised_member_intent", false);
        f181648c = bdyx.m91610a(bdyw, "BugFix__fix_deprecated_context_client_constructor", false);
        f181649d = bdyx.m91610a(bdyw, "BugFix__pass_client_type_and_version_in_get_people_request", true);
    }

    /* renamed from: a */
    public final boolean mo78244a() {
        return ((Boolean) f181646a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78245b() {
        return ((Boolean) f181647b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78246c() {
        return ((Boolean) f181648c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78247d() {
        return ((Boolean) f181649d.mo58455c()).booleanValue();
    }
}
