package p000;

/* renamed from: cdba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdba implements cdaz {

    /* renamed from: a */
    public static final bdyx f180400a;

    /* renamed from: b */
    public static final bdyx f180401b;

    /* renamed from: c */
    public static final bdyx f180402c;

    /* renamed from: d */
    public static final bdyx f180403d;

    /* renamed from: e */
    public static final bdyx f180404e;

    /* renamed from: f */
    public static final bdyx f180405f;

    /* renamed from: g */
    public static final bdyx f180406g;

    /* renamed from: h */
    public static final bdyx f180407h;

    /* renamed from: i */
    public static final bdyx f180408i;

    /* renamed from: j */
    public static final bdyx f180409j;

    /* renamed from: k */
    public static final bdyx f180410k;

    /* renamed from: l */
    public static final bdyx f180411l;

    /* renamed from: m */
    public static final bdyx f180412m;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.cast")).mo58445a("gms:cast:");
        f180400a = bdyx.m91609a(a, "remote_control_notification:app_id_blacklist", "97216CB6,89EA58C1,BDC14BAC,AndroidNativeApp,");
        f180401b = bdyx.m91609a(a, "remote_control_notification:app_id_onprimary_device_blacklist", "233637DE,CA5E8412,CC32E753");
        f180402c = bdyx.m91607a(a, "remote_control_notification:click_through_deep_links_time_to_live_ms", 86400000L);
        f180403d = bdyx.m91610a(a, "remote_control_notification:click_through_enabled", true);
        f180404e = bdyx.m91610a(a, "remote_control_notification:click_through_open_play_store_if_app_not_installed", false);
        f180405f = bdyx.m91607a(a, "remote_control_notification:default_value_of_rcn_eanbled_status", 1L);
        bdyx.m91610a(a, "remote_control_notification:enable_ipv6", false);
        f180406g = bdyx.m91609a(a, "remote_control_notification:get_deep_links_request_url", "https://clients3.google.com/cast/discover/remote_control/intent_to_join");
        f180407h = bdyx.m91610a(a, "remote_control_notification:is_enabled", true);
        f180408i = bdyx.m91610a(a, "remote_control_notification:is_enabled_on_primary_device", true);
        f180409j = bdyx.m91607a(a, "remote_control_notification:remove_notification_delay_ms_when_idle", 2000L);
        f180410k = bdyx.m91610a(a, "remote_control_notification:show_link_to_home_app_in_cast_settings", true);
        f180411l = bdyx.m91610a(a, "RcnConfigs__should_set_group_key", true);
        bdyx.m91610a(a, "RcnConfigs__should_use_cxless", false);
        f180412m = bdyx.m91610a(a, "RcnConfigs__should_use_media_session", false);
    }

    /* renamed from: a */
    public final String mo77179a() {
        return (String) f180400a.mo58455c();
    }

    /* renamed from: b */
    public final String mo77180b() {
        return (String) f180401b.mo58455c();
    }

    /* renamed from: c */
    public final long mo77181c() {
        return ((Long) f180402c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo77182d() {
        return ((Boolean) f180403d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77183e() {
        return ((Boolean) f180404e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo77184f() {
        return ((Long) f180405f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final String mo77185g() {
        return (String) f180406g.mo58455c();
    }

    /* renamed from: h */
    public final boolean mo77186h() {
        return ((Boolean) f180407h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo77187i() {
        return ((Boolean) f180408i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final long mo77188j() {
        return ((Long) f180409j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final boolean mo77189k() {
        return ((Boolean) f180410k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo77190l() {
        return ((Boolean) f180411l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo77191m() {
        return ((Boolean) f180412m.mo58455c()).booleanValue();
    }
}
