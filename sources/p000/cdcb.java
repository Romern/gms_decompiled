package p000;

/* renamed from: cdcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdcb implements cdca {

    /* renamed from: a */
    public static final bdyx f180444a;

    /* renamed from: b */
    public static final bdyx f180445b;

    /* renamed from: c */
    public static final bdyx f180446c;

    /* renamed from: d */
    public static final bdyx f180447d;

    /* renamed from: e */
    public static final bdyx f180448e;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.checkin"));
        f180444a = bdyx.m91610a(bdyw, "enable_clearcut_checkin_event_client_side_policy", false);
        f180445b = bdyx.m91610a(bdyw, "enable_clearcut_checkin_event_logging", false);
        f180446c = bdyx.m91610a(bdyw, "enable_clearcut_checkin_event_logging_debugging", false);
        f180447d = bdyx.m91610a(bdyw, "enable_default_checkin_event_logging", true);
        f180448e = bdyx.m91607a(bdyw, "read_from_dropbox_delay_ms", 0L);
    }

    /* renamed from: a */
    public final boolean mo77214a() {
        return ((Boolean) f180444a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77215b() {
        return ((Boolean) f180445b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77216c() {
        return ((Boolean) f180446c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77217d() {
        return ((Boolean) f180447d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo77218e() {
        return ((Long) f180448e.mo58455c()).longValue();
    }
}
