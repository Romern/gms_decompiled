package p000;

/* renamed from: cgpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgpi implements cgph {

    /* renamed from: a */
    public static final bdyx f187450a;

    /* renamed from: b */
    public static final bdyx f187451b;

    /* renamed from: c */
    public static final bdyx f187452c;

    /* renamed from: d */
    public static final bdyx f187453d;

    /* renamed from: e */
    public static final bdyx f187454e;

    /* renamed from: f */
    public static final bdyx f187455f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187450a = bdyx.m91610a(bdyw, "Deeplink__deeplink_timeout_bug_fix", true);
        f187451b = bdyx.m91610a(bdyw, "Deeplink__is_connect2_enabled", false);
        f187452c = bdyx.m91610a(bdyw, "Deeplink__is_enabled", false);
        f187453d = bdyx.m91610a(bdyw, "Deeplink__remove_device_from_bootstrap", false);
        f187454e = bdyx.m91609a(bdyw, "Deeplink__shortlink_url", "g.co/pair");
        f187455f = bdyx.m91607a(bdyw, "timeout_for_discovery", 20000L);
    }

    /* renamed from: a */
    public final boolean mo84227a() {
        return ((Boolean) f187450a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84228b() {
        return ((Boolean) f187451b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo84229c() {
        return ((Boolean) f187452c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo84230d() {
        return ((Boolean) f187453d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final String mo84231e() {
        return (String) f187454e.mo58455c();
    }

    /* renamed from: f */
    public final long mo84232f() {
        return ((Long) f187455f.mo58455c()).longValue();
    }
}
