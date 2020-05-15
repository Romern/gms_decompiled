package p000;

/* renamed from: cdac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdac implements cdab {

    /* renamed from: a */
    public static final bdyx f180364a;

    /* renamed from: b */
    public static final bdyx f180365b;

    /* renamed from: c */
    public static final bdyx f180366c;

    /* renamed from: d */
    public static final bdyx f180367d;

    /* renamed from: e */
    public static final bdyx f180368e;

    /* renamed from: f */
    public static final bdyx f180369f;

    /* renamed from: g */
    public static final bdyx f180370g;

    /* renamed from: h */
    public static final bdyx f180371h;

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
        f180364a = bdyx.m91609a(a, "media:chromecast_audio_model_name", "Chromecast Audio");
        f180365b = bdyx.m91609a(a, "media:generic_player_app_id", "CC1AD845");
        f180366c = bdyx.m91607a(a, "media:max_volume", 20L);
        f180367d = bdyx.m91607a(a, "media:max_volume_audio_out_only", 50L);
        f180368e = bdyx.m91610a(a, "media:publish_multizone_group_with_members", true);
        f180369f = bdyx.m91607a(a, "media:stats_flags", 0L);
        f180370g = bdyx.m91607a(a, "media:media_update_current_volume_delay_ms", 500L);
        f180371h = bdyx.m91610a(a, "media:use_tdls", true);
    }

    /* renamed from: a */
    public final String mo77152a() {
        return (String) f180364a.mo58455c();
    }

    /* renamed from: b */
    public final String mo77153b() {
        return (String) f180365b.mo58455c();
    }

    /* renamed from: c */
    public final long mo77154c() {
        return ((Long) f180366c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo77155d() {
        return ((Long) f180367d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo77156e() {
        return ((Boolean) f180368e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo77157f() {
        return ((Long) f180369f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final long mo77158g() {
        return ((Long) f180370g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final boolean mo77159h() {
        return ((Boolean) f180371h.mo58455c()).booleanValue();
    }
}
