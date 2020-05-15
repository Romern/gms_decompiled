package p000;

/* renamed from: cdkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdkx implements cdkw {

    /* renamed from: a */
    public static final bdyx f181177a;

    /* renamed from: b */
    public static final bdyx f181178b;

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
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:common:");
        f181177a = bdyx.m91610a(a, "FilePermission__reset_non_whitelisted_global_dirs_permission", false);
        f181178b = bdyx.m91609a(a, "FilePermission__whitelisted_global_dirs", "shared_prefs");
    }

    /* renamed from: a */
    public final boolean mo77845a() {
        return ((Boolean) f181177a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo77846b() {
        return (String) f181178b.mo58455c();
    }
}
