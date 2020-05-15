package p000;

/* renamed from: cfts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfts implements cftr {

    /* renamed from: a */
    public static final bdyx f185695a;

    /* renamed from: b */
    public static final bdyx f185696b;

    /* renamed from: c */
    public static final bdyx f185697c;

    /* renamed from: d */
    public static final bdyx f185698d;

    /* renamed from: e */
    public static final bdyx f185699e;

    /* renamed from: f */
    public static final bdyx f185700f;

    /* renamed from: g */
    public static final bdyx f185701g;

    /* renamed from: h */
    public static final bdyx f185702h;

    /* renamed from: i */
    public static final bdyx f185703i;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.update")).mo58450b();
        f185695a = bdyx.m91610a(b, "update_experiment_enable", false);
        f185696b = bdyx.m91610a(b, "update_experiment_enable_heart_beat_event_logging_post_update", false);
        f185697c = bdyx.m91610a(b, "update_experiment_enable_system_update_event_logging_post_update", false);
        f185698d = bdyx.m91607a(b, "update_experiment_heart_beat_log_max_delay_sec", 432000L);
        f185699e = bdyx.m91607a(b, "update_experiment_heart_beat_log_min_delay_sec", 259200L);
        f185700f = bdyx.m91609a(b, "update_experiment_id", "");
        f185701g = bdyx.m91609a(b, "update_experiment_keep_exp_id_magic_word", "KEEP");
        f185702h = bdyx.m91609a(b, "update_experiment_log_source", "ANDROID_OTA");
        f185703i = bdyx.m91609a(b, "update_experiment_name_space", "");
    }

    /* renamed from: a */
    public final boolean mo82709a() {
        return ((Boolean) f185695a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo82710b() {
        return ((Boolean) f185696b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82711c() {
        return ((Boolean) f185697c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo82712d() {
        return ((Long) f185698d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo82713e() {
        return ((Long) f185699e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final String mo82714f() {
        return (String) f185700f.mo58455c();
    }

    /* renamed from: g */
    public final String mo82715g() {
        return (String) f185701g.mo58455c();
    }

    /* renamed from: h */
    public final String mo82716h() {
        return (String) f185702h.mo58455c();
    }

    /* renamed from: i */
    public final String mo82717i() {
        return (String) f185703i.mo58455c();
    }
}
