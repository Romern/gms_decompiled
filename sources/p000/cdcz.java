package p000;

/* renamed from: cdcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdcz implements cdcy {

    /* renamed from: a */
    public static final bdyx f180512a;

    /* renamed from: b */
    public static final bdyx f180513b;

    /* renamed from: c */
    public static final bdyx f180514c;

    /* renamed from: d */
    public static final bdyx f180515d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.chromesync")).mo58443a();
        f180512a = bdyx.m91610a(a, "GsyncFandangoMigration__disable_gsync_registration", false);
        f180513b = bdyx.m91610a(a, "GsyncFandangoMigration__enable_fandango", false);
        f180514c = bdyx.m91610a(a, "GsyncFandangoMigration__handle_instance_id_rotation", false);
        f180515d = bdyx.m91610a(a, "GsyncFandangoMigration__handle_phenotype_flag_change", false);
    }

    /* renamed from: a */
    public final boolean mo77274a() {
        return ((Boolean) f180512a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77275b() {
        return ((Boolean) f180513b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77276c() {
        return ((Boolean) f180514c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77277d() {
        return ((Boolean) f180515d.mo58455c()).booleanValue();
    }
}
