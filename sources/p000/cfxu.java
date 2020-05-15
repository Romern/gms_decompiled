package p000;

/* renamed from: cfxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfxu implements cfxt {

    /* renamed from: a */
    public static final bdyx f186077a;

    /* renamed from: b */
    public static final bdyx f186078b;

    /* renamed from: c */
    public static final bdyx f186079c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186077a = bdyx.m91610a(bdyw, "FsaGuardianFeature__group_syncer_guardian_enabled", false);
        f186078b = bdyx.m91607a(bdyw, "FsaGuardianFeature__max_group_title_length", 1024L);
        f186079c = bdyx.m91610a(bdyw, "FsaGuardianFeature__retry_throttling_for_groups_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo83051a() {
        return ((Boolean) f186077a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo83052b() {
        return ((Long) f186078b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo83053c() {
        return ((Boolean) f186079c.mo58455c()).booleanValue();
    }
}
