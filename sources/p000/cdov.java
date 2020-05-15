package p000;

/* renamed from: cdov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdov implements cdou {

    /* renamed from: a */
    public static final bdyx f181449a;

    /* renamed from: b */
    public static final bdyx f181450b;

    /* renamed from: c */
    public static final bdyx f181451c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58445a("gms:chimera:");
        f181449a = bdyx.m91610a(a, "SyncUpdateService__enable_sync_update_service", false);
        f181450b = bdyx.m91610a(a, "SyncUpdateService__force_update_now_on_download_failure", true);
        bdyx.m91607a(a, "SyncUpdateService__test_notify_pending_update_delay", 0L);
        bdyx.m91607a(a, "SyncUpdateService__test_notify_pending_update_status", 0L);
        f181451c = bdyx.m91607a(a, "SyncUpdateService__wait_for_phenotype_commit_timeout_seconds", 10L);
    }

    /* renamed from: a */
    public final boolean mo78082a() {
        return ((Boolean) f181449a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78083b() {
        return ((Boolean) f181450b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo78084c() {
        return ((Long) f181451c.mo58455c()).longValue();
    }
}
