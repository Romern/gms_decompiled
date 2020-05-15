package p000;

/* renamed from: cckp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cckp implements ccko {

    /* renamed from: a */
    public static final bdyx f179244a;

    /* renamed from: b */
    public static final bdyx f179245b;

    /* renamed from: c */
    public static final bdyx f179246c;

    /* renamed from: d */
    public static final bdyx f179247d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        f179244a = bdyx.m91610a(bdyw, "backup_allow_set_account_notification", true);
        bdyx.m91610a(bdyw, "backup_audit_set_backup_account", true);
        f179245b = bdyx.m91610a(bdyw, "backup_enable_non_dismissible_set_backup_account_notification", false);
        f179246c = bdyx.m91610a(bdyw, "backup_enable_showing_account_notification_after_it_was_dismissed", true);
        f179247d = bdyx.m91610a(bdyw, "backup_gms_transport_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo76186a() {
        return ((Boolean) f179244a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76187b() {
        return ((Boolean) f179245b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76188c() {
        return ((Boolean) f179246c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76189d() {
        return ((Boolean) f179247d.mo58455c()).booleanValue();
    }
}
