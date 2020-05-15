package p000;

/* renamed from: cfrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfrq implements cfrp {

    /* renamed from: a */
    public static final bdyx f185521a;

    /* renamed from: b */
    public static final bdyx f185522b;

    /* renamed from: c */
    public static final bdyx f185523c;

    /* renamed from: d */
    public static final bdyx f185524d;

    /* renamed from: e */
    public static final bdyx f185525e;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.update")).mo58450b();
        f185521a = bdyx.m91609a(b, "overdue_dialog_escalation_phases", "");
        f185522b = bdyx.m91609a(b, "overdue_dialog_retry_delay_period_phases", "");
        f185523c = bdyx.m91609a(b, "device_update_detail_url", "");
        f185524d = bdyx.m91609a(b, "display_dialog_window_period", "");
        f185525e = bdyx.m91610a(b, "enable_aggressive_reminder_on_power_connected", false);
    }

    /* renamed from: a */
    public final String mo82574a() {
        return (String) f185521a.mo58455c();
    }

    /* renamed from: b */
    public final String mo82575b() {
        return (String) f185522b.mo58455c();
    }

    /* renamed from: c */
    public final String mo82576c() {
        return (String) f185523c.mo58455c();
    }

    /* renamed from: d */
    public final String mo82577d() {
        return (String) f185524d.mo58455c();
    }

    /* renamed from: e */
    public final boolean mo82578e() {
        return ((Boolean) f185525e.mo58455c()).booleanValue();
    }
}
