package p000;

/* renamed from: cfnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfnl implements cfnk {

    /* renamed from: a */
    public static final bdyx f184569a;

    /* renamed from: b */
    public static final bdyx f184570b;

    /* renamed from: c */
    public static final bdyx f184571c;

    /* renamed from: d */
    public static final bdyx f184572d;

    /* renamed from: e */
    public static final bdyx f184573e;

    /* renamed from: f */
    public static final bdyx f184574f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.mobile_data_plan"));
        f184569a = bdyx.m91610a(bdyw, "ServiceConfigFlags__check_auth_status_enabled", false);
        f184570b = bdyx.m91610a(bdyw, "ServiceConfigFlags__get_esim_config_enabled", false);
        f184571c = bdyx.m91610a(bdyw, "ServiceConfigFlags__get_phone_numbers_enabled", false);
        f184572d = bdyx.m91609a(bdyw, "ServiceConfigFlags__mi_service_host", "mobiledataplan-pa.googleapis.com");
        f184573e = bdyx.m91607a(bdyw, "ServiceConfigFlags__mi_service_port", 443L);
        f184574f = bdyx.m91607a(bdyw, "ServiceConfigFlags__mi_service_timeout", 10000L);
    }

    /* renamed from: a */
    public final boolean mo81661a() {
        return ((Boolean) f184569a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81662b() {
        return ((Boolean) f184570b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81663c() {
        return ((Boolean) f184571c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo81664d() {
        return (String) f184572d.mo58455c();
    }

    /* renamed from: e */
    public final long mo81665e() {
        return ((Long) f184573e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo81666f() {
        return ((Long) f184574f.mo58455c()).longValue();
    }
}
