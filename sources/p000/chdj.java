package p000;

/* renamed from: chdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chdj implements chdi {

    /* renamed from: a */
    public static final bdyx f188487a;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.usagereporting")).mo58445a("gms:usagereporting:");
        bdyx.m91610a(a, "disable_handset_checkbox_settings_injection", true);
        f188487a = bdyx.m91610a(a, "ignore_headless_auto_checkbox", true);
    }

    /* renamed from: a */
    public final boolean mo85138a() {
        return ((Boolean) f188487a.mo58455c()).booleanValue();
    }
}
