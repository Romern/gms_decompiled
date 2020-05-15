package p000;

/* renamed from: cdau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdau implements cdat {

    /* renamed from: a */
    public static final bdyx f180391a;

    /* renamed from: b */
    public static final bdyx f180392b;

    /* renamed from: c */
    public static final bdyx f180393c;

    /* renamed from: d */
    public static final bdyx f180394d;

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
        f180391a = bdyx.m91610a(a, "NewTcpProber__dont_probe_group_device", true);
        f180392b = bdyx.m91610a(a, "new_tcp_prober_enabled", true);
        f180393c = bdyx.m91610a(a, "NewTcpProber__should_probe_with_null_bssid", false);
        f180394d = bdyx.m91610a(a, "NewTcpProber__should_stop_tcp_probing_when_discovery_stop", true);
    }

    /* renamed from: a */
    public final boolean mo77173a() {
        return ((Boolean) f180391a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77174b() {
        return ((Boolean) f180393c.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77175c() {
        return ((Boolean) f180394d.mo58455c()).booleanValue();
    }
}
