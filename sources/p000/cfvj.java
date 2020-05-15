package p000;

/* renamed from: cfvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfvj implements cfvi {

    /* renamed from: a */
    public static final bdyx f185776a;

    /* renamed from: b */
    public static final bdyx f185777b;

    /* renamed from: c */
    public static final bdyx f185778c;

    /* renamed from: d */
    public static final bdyx f185779d;

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
        bdyx.m91607a(bdyw, "DataLayer__debug_icing_results_per_page", 1000L);
        bdyx.m91609a(bdyw, "DataLayer__debug_upload_corpus", "internal.3p:Contact_no_gsa");
        f185776a = bdyx.m91610a(bdyw, "DataLayer__limit_debug_upload_size", true);
        f185777b = bdyx.m91610a(bdyw, "DataLayer__new_style_avatar_reference_enabled", false);
        f185778c = bdyx.m91610a(bdyw, "DataLayer__populate_last_updated_timestamp_for_raw_contacts", false);
        bdyx.m91610a(bdyw, "DataLayer__rethrow_sqlite_exception_when_getting_writable_people_database", false);
        f185779d = bdyx.m91610a(bdyw, "DataLayer__show_debug_upload_in_settings", false);
    }

    /* renamed from: a */
    public final boolean mo82773a() {
        return ((Boolean) f185776a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82774b() {
        return ((Boolean) f185777b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82775c() {
        return ((Boolean) f185778c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo82776d() {
        return ((Boolean) f185779d.mo58455c()).booleanValue();
    }
}
