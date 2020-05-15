package p000;

/* renamed from: ccmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccmv implements ccmu {

    /* renamed from: a */
    public static final bdyx f179474a;

    /* renamed from: b */
    public static final bdyx f179475b;

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
        f179474a = bdyx.m91610a(bdyw, "RequirePrimaryUnlockBackupNowFeature__backup_require_primary_unlock_backup_now", false);
        f179475b = bdyx.m91607a(bdyw, "RequirePrimaryUnlockBackupNowFeature__backup_timeout_for_key_sync_ms", 45000L);
    }

    /* renamed from: a */
    public final boolean mo76394a() {
        return ((Boolean) f179474a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo76395b() {
        return ((Long) f179475b.mo58455c()).longValue();
    }
}
