package p000;

/* renamed from: cdvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdvj implements cdvi {

    /* renamed from: a */
    public static final bdyx f181803a;

    /* renamed from: b */
    public static final bdyx f181804b;

    /* renamed from: c */
    public static final bdyx f181805c;

    /* renamed from: d */
    public static final bdyx f181806d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.fido"));
        f181803a = bdyx.m91607a(bdyw, "CableAuthenticatorScanStrategy__screen_on_scan_mode", 0L);
        f181804b = bdyx.m91607a(bdyw, "CableAuthenticatorScanStrategy__screen_on_scan_timeout_millis", 5000L);
        f181805c = bdyx.m91607a(bdyw, "CableAuthenticatorScanStrategy__server_initiated_scan_mode", 2L);
        f181806d = bdyx.m91607a(bdyw, "CableAuthenticatorScanStrategy__server_initiated_scan_timeout_millis", 20000L);
    }

    /* renamed from: a */
    public final long mo78366a() {
        return ((Long) f181803a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo78367b() {
        return ((Long) f181804b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo78368c() {
        return ((Long) f181805c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo78369d() {
        return ((Long) f181806d.mo58455c()).longValue();
    }
}
