package p000;

/* renamed from: cgjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgjo implements cgjl {

    /* renamed from: a */
    public static final bdyx f187075a;

    /* renamed from: b */
    public static final bdyx f187076b;

    /* renamed from: c */
    public static final bdyx f187077c;

    /* renamed from: d */
    public static final bdyx f187078d;

    /* renamed from: e */
    public static final bdyx f187079e;

    /* renamed from: f */
    public static final bdyx f187080f;

    /* renamed from: g */
    public static final bdyx f187081g;

    /* renamed from: h */
    public static final bdyx f187082h;

    /* renamed from: i */
    public static final bdyx f187083i;

    /* renamed from: j */
    public static final bdyx f187084j;

    /* renamed from: k */
    public static final bdyx f187085k;

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
        f187075a = bdyx.m91610a(bdyw, "GrpcContactsUploader__enable_batch_upload", true);
        f187076b = bdyx.m91610a(bdyw, "GrpcContactsUploader__enable_grpc_timestamps", true);
        f187077c = bdyx.m91610a(bdyw, "GrpcContactsUploader__enable_incremental_upload", true);
        f187078d = bdyx.m91610a(bdyw, "GrpcContactsUploader__enable_sync_policy_engine", false);
        f187079e = bdyx.m91610a(bdyw, "GrpcContactsUploader__run_contacts_logger_via_proxy_executor", true);
        f187080f = bdyx.m91610a(bdyw, "GrpcContactsUploader__run_contacts_logger_via_spe", true);
        f187081g = bdyx.m91610a(bdyw, "GrpcContactsUploader__schedule_periodic_sync_on_init", true);
        f187082h = bdyx.m91610a(bdyw, "GrpcContactsUploader__schedule_periodic_sync_on_settings_changed", true);
        f187083i = bdyx.m91610a(bdyw, "GrpcContactsUploader__spe_change_oneoff_batch_sync_to_incremental", false);
        try {
            f187084j = bdyx.m91608a(bdyw, "GrpcContactsUploader__upload_contacts_batch_sync_policy", (bylh) bxvk.m124014a(bylh.f166832d, new byte[]{10, 81, 10, 79, 10, 66, 8, 1, 16, 1, 40, 2, 48, 1, 66, 56, 10, 6, 8, 2, 18, 2, 8, 3, 10, 6, 8, 3, 18, 2, 8, 3, 10, 6, 8, 4, 18, 2, 8, 3, 10, 6, 8, 5, 18, 2, 8, 3, 10, 6, 8, 6, 18, 2, 8, 3, 10, 6, 8, 10, 18, 2, 8, 3, 10, 6, 8, 9, 18, 2, 8, 3, 18, 9, 10, 2, 8, 60, 18, 3, 8, -40, 4}), cgjm.f187073a);
            try {
                f187085k = bdyx.m91608a(bdyw, "GrpcContactsUploader__upload_contacts_incremental_sync_policy", (bylh) bxvk.m124014a(bylh.f166832d, new byte[]{10, 81, 10, 79, 10, 66, 8, 1, 16, 1, 40, 2, 48, 1, 66, 56, 10, 6, 8, 2, 18, 2, 8, 3, 10, 6, 8, 3, 18, 2, 8, 3, 10, 6, 8, 4, 18, 2, 8, 3, 10, 6, 8, 5, 18, 2, 8, 3, 10, 6, 8, 6, 18, 2, 8, 3, 10, 6, 8, 10, 18, 2, 8, 3, 10, 6, 8, 9, 18, 2, 8, 3, 18, 9, 10, 2, 8, 60, 18, 3, 8, -40, 4}), cgjn.f187074a);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"GrpcContactsUploader__upload_contacts_incremental_sync_policy\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"GrpcContactsUploader__upload_contacts_batch_sync_policy\"");
        }
    }

    /* renamed from: a */
    public final boolean mo83903a() {
        return ((Boolean) f187075a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83904b() {
        return ((Boolean) f187076b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83905c() {
        return ((Boolean) f187077c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo83906d() {
        return ((Boolean) f187078d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83907e() {
        return ((Boolean) f187079e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo83908f() {
        return ((Boolean) f187080f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo83909g() {
        return ((Boolean) f187081g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo83910h() {
        return ((Boolean) f187082h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo83911i() {
        return ((Boolean) f187083i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final bylh mo83912j() {
        return (bylh) f187084j.mo58455c();
    }

    /* renamed from: k */
    public final bylh mo83913k() {
        return (bylh) f187085k.mo58455c();
    }
}
