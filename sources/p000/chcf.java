package p000;

/* renamed from: chcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chcf implements chce {

    /* renamed from: a */
    public static final bdyx f188321a;

    /* renamed from: b */
    public static final bdyx f188322b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.ulr"));
        f188321a = bdyx.m91610a(bdyw, "Ulr__enable_clearcut_device_settings_logging", false);
        f188322b = bdyx.m91610a(bdyw, "Ulr__enable_private_mode_toggle_logging", false);
        bdyx.m91610a(bdyw, "Ulr__enable_storage_logging", false);
    }

    /* renamed from: a */
    public final boolean mo84982a() {
        return ((Boolean) f188321a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84983b() {
        return ((Boolean) f188322b.mo58455c()).booleanValue();
    }
}
