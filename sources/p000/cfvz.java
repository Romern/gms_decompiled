package p000;

/* renamed from: cfvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfvz implements cfvy {

    /* renamed from: a */
    public static final bdyx f185818a;

    /* renamed from: b */
    public static final bdyx f185819b;

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
        f185818a = bdyx.m91610a(bdyw, "FsaBugFixesY2019w21__clean_up_preferences_on_account_remove_enabled", true);
        f185819b = bdyx.m91610a(bdyw, "FsaBugFixesY2019w21__skip_prepare_sync_when_account_removal", true);
    }

    /* renamed from: a */
    public final boolean mo82809a() {
        return ((Boolean) f185818a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82810b() {
        return ((Boolean) f185819b.mo58455c()).booleanValue();
    }
}
