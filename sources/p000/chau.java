package p000;

/* renamed from: chau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chau implements C1709chat {

    /* renamed from: a */
    public static final bdyx f188210a;

    /* renamed from: b */
    public static final bdyx f188211b;

    /* renamed from: c */
    public static final bdyx f188212c;

    /* renamed from: d */
    public static final bdyx f188213d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.trustlet_voiceunlock"));
        f188210a = bdyx.m91610a(bdyw, "auth_coffee_enable_connectionless_voiceunlock", false);
        f188211b = bdyx.m91610a(bdyw, "is_voice_unlock_trustlet_enabled", false);
        f188212c = bdyx.m91610a(bdyw, "trustlet_voiceunlock_module_enabled", true);
        f188213d = bdyx.m91607a(bdyw, "voice_unlock_minimum_gsa_version", 300402000L);
    }

    /* renamed from: a */
    public final boolean mo84884a() {
        return ((Boolean) f188210a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84885b() {
        return ((Boolean) f188211b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo84886c() {
        return ((Boolean) f188212c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo84887d() {
        return ((Long) f188213d.mo58455c()).longValue();
    }
}
