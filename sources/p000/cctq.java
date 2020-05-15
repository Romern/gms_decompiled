package p000;

/* renamed from: cctq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cctq implements cctp {

    /* renamed from: a */
    public static final bdyx f179905a;

    /* renamed from: b */
    public static final bdyx f179906b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        bdyx.m91607a(bdyw, "GacMigrationFeature__connectionless_retry_count", 3L);
        bdyx.m91607a(bdyw, "GacMigrationFeature__connectionless_timeout_ms", 500L);
        bdyx.m91610a(bdyw, "GacMigrationFeature__do_not_block_on_void_calls", false);
        f179905a = bdyx.m91610a(bdyw, "GacMigrationFeature__use_connectionless_instead_of_binder", false);
        f179906b = bdyx.m91610a(bdyw, "GacMigrationFeature__use_non_static_mapper", false);
    }

    /* renamed from: a */
    public final boolean mo76764a() {
        return ((Boolean) f179905a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76765b() {
        return ((Boolean) f179906b.mo58455c()).booleanValue();
    }
}
