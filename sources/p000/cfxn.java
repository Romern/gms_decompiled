package p000;

/* renamed from: cfxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfxn implements cfxm {

    /* renamed from: a */
    public static final bdyx f185931a;

    /* renamed from: b */
    public static final bdyx f185932b;

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
        f185931a = bdyx.m91610a(bdyw, "FsaFirstFullSyncApiFeature__enable_log_of_get_first_full_sync_status", true);
        f185932b = bdyx.m91610a(bdyw, "FsaFirstFullSyncApiFeature__get_first_full_sync_status_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo82908a() {
        return ((Boolean) f185931a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82909b() {
        return ((Boolean) f185932b.mo58455c()).booleanValue();
    }
}
