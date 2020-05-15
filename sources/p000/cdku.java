package p000;

/* renamed from: cdku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdku implements cdkt {

    /* renamed from: a */
    public static final bdyx f181172a;

    /* renamed from: b */
    public static final bdyx f181173b;

    /* renamed from: c */
    public static final bdyx f181174c;

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
        bdyw bdyw = new bdyw("direct_boot:gms_chimera_phenotype_flags");
        f181172a = bdyx.m91610a(bdyw, "DirectBoot__enable_new_user_unlocked", true);
        f181173b = bdyx.m91610a(bdyw, "DirectBoot__enable_process_restart_on_direct_boot_exit", false);
        f181174c = bdyx.m91610a(bdyw, "DirectBoot__read_device_prefs_first", true);
    }

    /* renamed from: a */
    public final boolean mo77841a() {
        return ((Boolean) f181172a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77842b() {
        return ((Boolean) f181173b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77843c() {
        return ((Boolean) f181174c.mo58455c()).booleanValue();
    }
}
