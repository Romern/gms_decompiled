package p000;

/* renamed from: cfwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfwr implements cfwq {

    /* renamed from: a */
    public static final bdyx f185850a;

    /* renamed from: b */
    public static final bdyx f185851b;

    /* renamed from: c */
    public static final bdyx f185852c;

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
        f185850a = bdyx.m91610a(bdyw, "FsaBugFixesY2019w42__keep_sync_proxy_alive_when_bulk_insert_contacts", true);
        f185851b = bdyx.m91610a(bdyw, "FsaBugFixesY2019w42__log_contact_count_between_sync_down_and_up", true);
        f185852c = bdyx.m91610a(bdyw, "FsaBugFixesY2019w42__set_email_display_name_field", false);
    }

    /* renamed from: a */
    public final boolean mo82835a() {
        return ((Boolean) f185850a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82836b() {
        return ((Boolean) f185851b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82837c() {
        return ((Boolean) f185852c.mo58455c()).booleanValue();
    }
}
