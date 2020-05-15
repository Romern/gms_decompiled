package p000;

/* renamed from: cfhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfhj implements cfhh {

    /* renamed from: a */
    public static final bdyx f184090a;

    /* renamed from: b */
    public static final bdyx f184091b;

    /* renamed from: c */
    public static final bdyx f184092c;

    /* renamed from: d */
    public static final bdyx f184093d;

    /* renamed from: e */
    public static final bdyx f184094e;

    /* renamed from: f */
    public static final bdyx f184095f;

    /* renamed from: g */
    public static final bdyx f184096g;

    /* renamed from: h */
    public static final bdyx f184097h;

    /* renamed from: i */
    public static final bdyx f184098i;

    /* renamed from: j */
    public static final bdyx f184099j;

    /* renamed from: k */
    public static final bdyx f184100k;

    /* renamed from: l */
    public static final bdyx f184101l;

    /* renamed from: m */
    public static final bdyx f184102m;

    /* renamed from: n */
    public static final bdyx f184103n;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.mdisync")).mo58443a();
        try {
            f184090a = bdyx.m91608a(a, "ProfileFeature__base_get_people_request", (btcz) GeneratedMessageLite.m124014a(btcz.f148362g, new byte[0]), cfhi.f184089a);
            f184091b = bdyx.m91610a(a, "ProfileFeature__download_photos_when_photo_files_not_openable", true);
            f184092c = bdyx.m91610a(a, "ProfileFeature__enable_per_account_push_handling", false);
            f184093d = bdyx.m91610a(a, "ProfileFeature__enable_push_message_handler", false);
            f184094e = bdyx.m91610a(a, "ProfileFeature__enable_push_payload_validation", false);
            f184095f = bdyx.m91610a(a, "ProfileFeature__enable_requesting_private_long_avatar_url", false);
            f184096g = bdyx.m91610a(a, "ProfileFeature__enable_strong_reads_on_push", false);
            f184097h = bdyx.m91610a(a, "ProfileFeature__include_fingerprint_change", false);
            f184098i = bdyx.m91610a(a, "ProfileFeature__oneoff_syncs_only_dirty_accounts", false);
            f184099j = bdyx.m91610a(a, "ProfileFeature__populate_client_version_in_requests", false);
            f184100k = bdyx.m91609a(a, "ProfileFeature__profile_server_host", "");
            f184101l = bdyx.m91607a(a, "ProfileFeature__profile_server_port", -1L);
            f184102m = bdyx.m91609a(a, "ProfileFeature__push_message_payload_key", "");
            f184103n = bdyx.m91610a(a, "ProfileFeature__store_updated_profile_info_when_photo_downloader_fails", true);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"ProfileFeature__base_get_people_request\"");
        }
    }

    /* renamed from: a */
    public final btcz mo81237a() {
        return (btcz) f184090a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo81238b() {
        return ((Boolean) f184091b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81239c() {
        return ((Boolean) f184092c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo81240d() {
        return ((Boolean) f184093d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo81241e() {
        return ((Boolean) f184094e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo81242f() {
        return ((Boolean) f184095f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo81243g() {
        return ((Boolean) f184096g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo81244h() {
        return ((Boolean) f184097h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo81245i() {
        return ((Boolean) f184098i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo81246j() {
        return ((Boolean) f184099j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final String mo81247k() {
        return (String) f184100k.mo58455c();
    }

    /* renamed from: l */
    public final long mo81248l() {
        return ((Long) f184101l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final String mo81249m() {
        return (String) f184102m.mo58455c();
    }

    /* renamed from: n */
    public final boolean mo81250n() {
        return ((Boolean) f184103n.mo58455c()).booleanValue();
    }
}
