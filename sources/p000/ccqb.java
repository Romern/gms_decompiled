package p000;

/* renamed from: ccqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccqb implements ccqa {

    /* renamed from: a */
    public static final bdyx f179740a;

    /* renamed from: b */
    public static final bdyx f179741b;

    /* renamed from: c */
    public static final bdyx f179742c;

    /* renamed from: d */
    public static final bdyx f179743d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179740a = bdyx.m91610a(bdyw, "CarDbMigrationFeature__cleanup_migration", false);
        f179741b = bdyx.m91607a(bdyw, "CarDbMigrationFeature__database_migration_iteration", 0L);
        f179742c = bdyx.m91610a(bdyw, "CarDbMigrationFeature__should_migrate", false);
        f179743d = bdyx.m91610a(bdyw, "CarDbMigrationFeature__use_module_class_loader_for_car_info", true);
    }

    /* renamed from: a */
    public final boolean mo76630a() {
        return ((Boolean) f179740a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo76631b() {
        return ((Long) f179741b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo76632c() {
        return ((Boolean) f179742c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76633d() {
        return ((Boolean) f179743d.mo58455c()).booleanValue();
    }
}
