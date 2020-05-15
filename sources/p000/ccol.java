package p000;

/* renamed from: ccol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccol implements ccok {

    /* renamed from: a */
    public static final bdyx f179628a;

    /* renamed from: b */
    public static final bdyx f179629b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        f179628a = bdyx.m91610a(bdyw, "VersioninfoBugfixes__backup_store_versioninfo", true);
        f179629b = bdyx.m91607a(bdyw, "VersioninfoBugfixes__backup_versioninfo_expiration_in_secs", 600L);
    }

    /* renamed from: a */
    public final boolean mo76534a() {
        return ((Boolean) f179628a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo76535b() {
        return ((Long) f179629b.mo58455c()).longValue();
    }
}
