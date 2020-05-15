package p000;

/* renamed from: cgpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgpf implements cgpe {

    /* renamed from: a */
    public static final bdyx f187447a;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_account_transfer_client_on_source", true);
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_account_transfer_client_on_target", true);
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_accounts_client", true);
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_connectionless_accounts_api_in_auth_account", true);
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_connectionless_nearby_on_source", true);
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_connectionless_people_api", true);
        f187447a = bdyx.m91610a(bdyw, "ConnectionlessMigration__use_cryptauth_async", true);
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_location_client", true);
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_source_client", true);
        bdyx.m91610a(bdyw, "ConnectionlessMigration__use_target_client", true);
    }

    /* renamed from: a */
    public final boolean mo84225a() {
        return ((Boolean) f187447a.mo58455c()).booleanValue();
    }
}
