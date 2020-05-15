package p000;

/* renamed from: cfya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfya implements cfxz {

    /* renamed from: a */
    public static final bdyx f186085a;

    /* renamed from: b */
    public static final bdyx f186086b;

    /* renamed from: c */
    public static final bdyx f186087c;

    /* renamed from: d */
    public static final bdyx f186088d;

    /* renamed from: e */
    public static final bdyx f186089e;

    /* renamed from: f */
    public static final bdyx f186090f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186085a = bdyx.m91610a(bdyw, "FsaNewTickleSyncFeature__add_chime_tickle_sync_mode", true);
        f186086b = bdyx.m91610a(bdyw, "FsaNewTickleSyncFeature__enable_new_tickle_sync", false);
        f186087c = bdyx.m91607a(bdyw, "FsaNewTickleSyncFeature__maximum_time_to_fetch_account_obfuscatedgaia_id_in_tickle_sync", 3000L);
        f186088d = bdyx.m91610a(bdyw, "FsaNewTickleSyncFeature__remove_gsync_subscription_in_tickle_sync", true);
        f186089e = bdyx.m91607a(bdyw, "FsaNewTickleSyncFeature__seconds_to_invalidate_account_gaia_cache", Long.MAX_VALUE);
        f186090f = bdyx.m91610a(bdyw, "FsaNewTickleSyncFeature__sync_all_accounts_when_no_account_name_present_in_tickle_sync", false);
    }

    /* renamed from: a */
    public final boolean mo83057a() {
        return ((Boolean) f186085a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83058b() {
        return ((Boolean) f186086b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo83059c() {
        return ((Long) f186087c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo83060d() {
        return ((Boolean) f186088d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo83061e() {
        return ((Long) f186089e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo83062f() {
        return ((Boolean) f186090f.mo58455c()).booleanValue();
    }
}
