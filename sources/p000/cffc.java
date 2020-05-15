package p000;

/* renamed from: cffc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cffc implements cffb {

    /* renamed from: a */
    public static final bdyx f183916a;

    /* renamed from: b */
    public static final bdyx f183917b;

    /* renamed from: c */
    public static final bdyx f183918c;

    /* renamed from: d */
    public static final bdyx f183919d;

    /* renamed from: e */
    public static final bdyx f183920e;

    /* renamed from: f */
    public static final bdyx f183921f;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        f183916a = bdyx.m91610a(a, "ReNotification__allow_bot", false);
        f183917b = bdyx.m91610a(a, "ReNotification__hide_empty_sender", true);
        f183918c = bdyx.m91607a(a, "ReNotification__notification_hour_of_day", 0L);
        bdyx.m91609a(a, "ReNotification__notification_text", "$lastUnreadMessage");
        f183919d = bdyx.m91609a(a, "ReNotification__renotification_enabled_apps", "FB");
        f183920e = bdyx.m91607a(a, "ReNotification__renotification_interval_lb", 27L);
        f183921f = bdyx.m91607a(a, "ReNotification__renotification_interval_ub", 3L);
        bdyx.m91607a(a, "ReNotification__renotification_text_string_id", 0L);
    }

    /* renamed from: a */
    public final boolean mo81103a() {
        return ((Boolean) f183916a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81104b() {
        return ((Boolean) f183917b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo81105c() {
        return ((Long) f183918c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final String mo81106d() {
        return (String) f183919d.mo58455c();
    }

    /* renamed from: e */
    public final long mo81107e() {
        return ((Long) f183920e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo81108f() {
        return ((Long) f183921f.mo58455c()).longValue();
    }
}
