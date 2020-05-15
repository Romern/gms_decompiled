package p000;

/* renamed from: cepq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cepq implements cepp {

    /* renamed from: a */
    public static final bdyx f183228a;

    /* renamed from: b */
    public static final bdyx f183229b;

    /* renamed from: c */
    public static final bdyx f183230c;

    /* renamed from: d */
    public static final bdyx f183231d;

    /* renamed from: e */
    public static final bdyx f183232e;

    /* renamed from: f */
    public static final bdyx f183233f;

    /* renamed from: g */
    public static final bdyx f183234g;

    /* renamed from: h */
    public static final bdyx f183235h;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.instantapps")).mo58443a();
        f183228a = bdyx.m91610a(a, "LevelDbFlags__handle_data_corruption_on_delete", false);
        f183229b = bdyx.m91610a(a, "LevelDbFlags__handle_data_corruption_on_get", false);
        f183230c = bdyx.m91610a(a, "LevelDbFlags__handle_data_corruption_on_put", false);
        f183231d = bdyx.m91610a(a, "LevelDbFlags__handle_data_corruption_on_wipe_all", false);
        f183232e = bdyx.m91610a(a, "LevelDbFlags__handle_data_corruption_on_write_batch", false);
        f183233f = bdyx.m91607a(a, "LevelDbFlags__time_between_reinitialization_ms", -1L);
        f183234g = bdyx.m91610a(a, "LevelDbFlags__verify_domain_filter_added_package_after_full_sync", false);
        f183235h = bdyx.m91610a(a, "LevelDbFlags__verify_domain_filter_added_package_after_trim_sync", false);
    }

    /* renamed from: a */
    public final boolean mo79557a() {
        return ((Boolean) f183228a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79558b() {
        return ((Boolean) f183229b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79559c() {
        return ((Boolean) f183230c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79560d() {
        return ((Boolean) f183231d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo79561e() {
        return ((Boolean) f183232e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo79562f() {
        return ((Long) f183233f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo79563g() {
        return ((Boolean) f183234g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo79564h() {
        return ((Boolean) f183235h.mo58455c()).booleanValue();
    }
}
