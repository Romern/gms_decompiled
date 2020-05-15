package p000;

/* renamed from: cfyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfyd implements cfyc {

    /* renamed from: a */
    public static final bdyx f186093a;

    /* renamed from: b */
    public static final bdyx f186094b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186093a = bdyx.m91610a(bdyw, "FsaOutOfSyncContactsFix__log_mismatch_after_sync_only_for_full_sync_enabled", true);
        f186094b = bdyx.m91610a(bdyw, "FsaOutOfSyncContactsFix__mark_data_version_mismatched_contacts_as_dirty_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo83064a() {
        return ((Boolean) f186093a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83065b() {
        return ((Boolean) f186094b.mo58455c()).booleanValue();
    }
}
