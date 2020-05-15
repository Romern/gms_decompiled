package p000;

/* renamed from: chda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chda implements chcz {

    /* renamed from: a */
    public static final bdyx f188473a;

    /* renamed from: b */
    public static final bdyx f188474b;

    /* renamed from: c */
    public static final bdyx f188475c;

    /* renamed from: d */
    public static final bdyx f188476d;

    /* renamed from: e */
    public static final bdyx f188477e;

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
        f188473a = bdyx.m91610a(bdyw, "Ulr__enable_clearcut_lr_autoenabling_logging", true);
        f188474b = bdyx.m91610a(bdyw, "Ulr__enable_clearcut_lr_autoenabling_logging_storage_path", true);
        f188475c = bdyx.m91610a(bdyw, "Ulr__enable_clearcut_response_error_logging", false);
        bdyx.m91610a(bdyw, "Ulr__never_init_ble", true);
        f188476d = bdyx.m91610a(bdyw, "Ulr__stop_place_detection_with_connectionless", true);
        f188477e = bdyx.m91610a(bdyw, "Ulr__use_public_flp_api", false);
    }

    /* renamed from: a */
    public final boolean mo85127a() {
        return ((Boolean) f188473a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo85128b() {
        return ((Boolean) f188474b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo85129c() {
        return ((Boolean) f188475c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo85130d() {
        return ((Boolean) f188476d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo85131e() {
        return ((Boolean) f188477e.mo58455c()).booleanValue();
    }
}
