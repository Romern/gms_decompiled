package p000;

/* renamed from: ccyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccyj implements ccyi {

    /* renamed from: a */
    public static final bdyx f180263a;

    /* renamed from: b */
    public static final bdyx f180264b;

    /* renamed from: c */
    public static final bdyx f180265c;

    /* renamed from: d */
    public static final bdyx f180266d;

    /* renamed from: e */
    public static final bdyx f180267e;

    /* renamed from: f */
    public static final bdyx f180268f;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180263a = bdyx.m91610a(a, "cast_socket:always_close_channel", true);
        f180264b = bdyx.m91610a(a, "cast_socket:disconnect_when_nothing_consumed", true);
        f180265c = bdyx.m91610a(a, "cast_socket:log_error_event_when_fail_to_shutdown_socket", true);
        f180266d = bdyx.m91610a(a, "cast_socket:log_error_event_when_selector_not_blocking_when_not_socket", true);
        f180267e = bdyx.m91610a(a, "cast_socket:multiplexer_thread_null_pointer_exception_fix", true);
        f180268f = bdyx.m91610a(a, "cast_socket:stop_multiplexer_if_no_socket", true);
    }

    /* renamed from: a */
    public final boolean mo77068a() {
        return ((Boolean) f180263a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77069b() {
        return ((Boolean) f180264b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77070c() {
        return ((Boolean) f180265c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77071d() {
        return ((Boolean) f180266d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77072e() {
        return ((Boolean) f180267e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo77073f() {
        return ((Boolean) f180268f.mo58455c()).booleanValue();
    }
}
