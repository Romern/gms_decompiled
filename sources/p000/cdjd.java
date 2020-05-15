package p000;

/* renamed from: cdjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdjd implements cdjc {

    /* renamed from: a */
    public static final bdyx f180969a;

    /* renamed from: b */
    public static final bdyx f180970b;

    /* renamed from: c */
    public static final bdyx f180971c;

    /* renamed from: d */
    public static final bdyx f180972d;

    /* renamed from: e */
    public static final bdyx f180973e;

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
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58443a();
        f180969a = bdyx.m91610a(a, "BackgroundBroadcastReceiverSupport__rate_limit_dropbox", true);
        f180970b = bdyx.m91607a(a, "BackgroundBroadcastReceiverSupport__rate_limit_dropbox_bank_size", 100L);
        f180971c = bdyx.m91610a(a, "BackgroundBroadcastReceiverSupport__rate_limit_dropbox_crashes", false);
        f180972d = bdyx.m91607a(a, "BackgroundBroadcastReceiverSupport__rate_limit_dropbox_refresh_interval_seconds", 1L);
        f180973e = bdyx.m91610a(a, "BackgroundBroadcastReceiverSupport__use_main_thread", true);
    }

    /* renamed from: a */
    public final boolean mo77661a() {
        return ((Boolean) f180969a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo77662b() {
        return ((Long) f180970b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo77663c() {
        return ((Boolean) f180971c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo77664d() {
        return ((Long) f180972d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo77665e() {
        return ((Boolean) f180973e.mo58455c()).booleanValue();
    }
}
