package p000;

/* renamed from: cfub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfub implements cfua {

    /* renamed from: a */
    public static final bdyx f185712a;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.pay")).mo58443a();
        bdyx.m91610a(a, "BugFix__enable_fop_details_fetch_pm_remote", true);
        bdyx.m91610a(a, "BugFix__enable_nfc_icon_clickable_when_nfc_state_off_in_fop_detail", true);
        bdyx.m91610a(a, "BugFix__enable_nfc_icon_clickable_when_nfc_state_off_in_homescreen", true);
        bdyx.m91610a(a, "BugFix__onboarding_payment_methods_remote_fetch", true);
        bdyx.m91610a(a, "BugFix__override_preferred_hce_payment_service", true);
        f185712a = bdyx.m91610a(a, "BugFix__pay_update_intent_operation", true);
        bdyx.m91610a(a, "BugFix__set_task_switcher_icon_at_runtime", true);
        bdyx.m91610a(a, "BugFix__update_fab_on_transit_migration", true);
        bdyx.m91610a(a, "BugFix__use_compacted_proto_safe_parcelables", true);
        bdyx.m91610a(a, "BugFix__use_crossed_out_icon_for_nfc_state_off_in_fop_detail", true);
        bdyx.m91610a(a, "BugFix__use_crossed_out_icon_for_nfc_state_off_in_homescreen", true);
    }

    /* renamed from: a */
    public final boolean mo82723a() {
        return ((Boolean) f185712a.mo58455c()).booleanValue();
    }
}
