package p000;

/* renamed from: ceat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceat implements ceas {

    /* renamed from: a */
    public static final bdyx f182183a;

    /* renamed from: b */
    public static final bdyx f182184b;

    /* renamed from: c */
    public static final bdyx f182185c;

    /* renamed from: d */
    public static final bdyx f182186d;

    /* renamed from: e */
    public static final bdyx f182187e;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.games")).mo58445a("games.");
        f182183a = bdyx.m91610a(a, "StubModule__always_wait_before_update_if_pga_installed", true);
        f182184b = bdyx.m91610a(a, "StubModule__disable_upgrade_dialog_for_unicorn", true);
        f182185c = bdyx.m91610a(a, "StubModule__enable_event_log", true);
        f182186d = bdyx.m91607a(a, "StubModule__minimum_required_gmscore_version", 0L);
        f182187e = bdyx.m91607a(a, "StubModule__wait_millis_to_gmscore_update_games_module", 10000L);
    }

    /* renamed from: a */
    public final boolean mo78698a() {
        return ((Boolean) f182183a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78699b() {
        return ((Boolean) f182184b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78700c() {
        return ((Boolean) f182185c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo78701d() {
        return ((Long) f182186d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo78702e() {
        return ((Long) f182187e.mo58455c()).longValue();
    }
}
