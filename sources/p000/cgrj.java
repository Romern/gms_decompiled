package p000;

/* renamed from: cgrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgrj implements cgri {

    /* renamed from: a */
    public static final bdyx f187594a;

    /* renamed from: b */
    public static final bdyx f187595b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187594a = bdyx.m91607a(bdyw, "UiLogging__flush_clearcut_timeout_millis", 5000L);
        f187595b = bdyx.m91610a(bdyw, "UiLogging__select_account_logging_fix", true);
    }

    /* renamed from: a */
    public final long mo84352a() {
        return ((Long) f187594a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo84353b() {
        return ((Boolean) f187595b.mo58455c()).booleanValue();
    }
}
