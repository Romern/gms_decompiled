package p000;

/* renamed from: cdwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdwq implements cdwp {

    /* renamed from: a */
    public static final bdyx f181845a;

    /* renamed from: b */
    public static final bdyx f181846b;

    /* renamed from: c */
    public static final bdyx f181847c;

    /* renamed from: d */
    public static final bdyx f181848d;

    /* renamed from: e */
    public static final bdyx f181849e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.fido"));
        f181845a = bdyx.m91610a(bdyw, "Guards__paask_enable_additional_bluetooth_state_logging", true);
        f181846b = bdyx.m91610a(bdyw, "Guards__paask_fix_notification_security_issue", true);
        f181847c = bdyx.m91610a(bdyw, "Guards__prevent_u2f_logger_npe", true);
        f181848d = bdyx.m91610a(bdyw, "Guards__support_strong_auth_keys", false);
        f181849e = bdyx.m91610a(bdyw, "Guards__use_only_required_permission_groups", true);
    }

    /* renamed from: a */
    public final boolean mo78397a() {
        return ((Boolean) f181845a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78398b() {
        return ((Boolean) f181846b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78399c() {
        return ((Boolean) f181847c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo78400d() {
        return ((Boolean) f181848d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo78401e() {
        return ((Boolean) f181849e.mo58455c()).booleanValue();
    }
}
