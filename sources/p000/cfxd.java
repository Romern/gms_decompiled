package p000;

/* renamed from: cfxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfxd implements cfxc {

    /* renamed from: a */
    public static final bdyx f185871a;

    /* renamed from: b */
    public static final bdyx f185872b;

    /* renamed from: c */
    public static final bdyx f185873c;

    /* renamed from: d */
    public static final bdyx f185874d;

    /* renamed from: e */
    public static final bdyx f185875e;

    /* renamed from: f */
    public static final bdyx f185876f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f185871a = bdyx.m91610a(bdyw, "FsaBugFixesY2020w06__catch_contacts_counter_security_exception_enabled", true);
        f185872b = bdyx.m91610a(bdyw, "FsaBugFixesY2020w06__not_retry_for_security_exception_auth_error_enabled", false);
        f185873c = bdyx.m91610a(bdyw, "FsaBugFixesY2020w06__request_expedite_sync_after_initialization_disabled", false);
        f185874d = bdyx.m91610a(bdyw, "FsaBugFixesY2020w06__retry_with_sync_coordinator_for_security_exception_auth_error_enabled", true);
        f185875e = bdyx.m91609a(bdyw, "FsaBugFixesY2020w06__security_exception_stack_trace_substring", "tying to get authenticator types for");
        f185876f = bdyx.m91610a(bdyw, "FsaBugFixesY2020w06__use_actual_moved_contact_count", true);
    }

    /* renamed from: a */
    public final boolean mo82852a() {
        return ((Boolean) f185871a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82853b() {
        return ((Boolean) f185872b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82854c() {
        return ((Boolean) f185873c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo82855d() {
        return ((Boolean) f185874d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final String mo82856e() {
        return (String) f185875e.mo58455c();
    }

    /* renamed from: f */
    public final boolean mo82857f() {
        return ((Boolean) f185876f.mo58455c()).booleanValue();
    }
}
