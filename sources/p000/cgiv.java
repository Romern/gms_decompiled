package p000;

/* renamed from: cgiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgiv implements cgiu {

    /* renamed from: a */
    public static final bdyx f187006a;

    /* renamed from: b */
    public static final bdyx f187007b;

    /* renamed from: c */
    public static final bdyx f187008c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.romanesco"));
        f187006a = bdyx.m91610a(bdyw, "ContactsLoggerBugFixesY2019w49__log_data_set_enabled", true);
        f187007b = bdyx.m91610a(bdyw, "ContactsLoggerBugFixesY2019w49__log_raw_contact_dirty_field_enabled", true);
        f187008c = bdyx.m91610a(bdyw, "ContactsLoggerBugFixesY2019w49__log_sync_info_for_google_account", true);
    }

    /* renamed from: a */
    public final boolean mo83843a() {
        return ((Boolean) f187006a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83844b() {
        return ((Boolean) f187007b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83845c() {
        return ((Boolean) f187008c.mo58455c()).booleanValue();
    }
}
