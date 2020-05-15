package p000;

/* renamed from: ceto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceto implements cetn {
    public static final bdyx chreCcPingIntervalMillis;
    public static final bdyx chreCcSupported;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        chreCcPingIntervalMillis = bdyx.m91607a(a, "chre_cc_ping_interval_millis", 900000L);
        chreCcSupported = bdyx.m91610a(a, "chre_cc_supported", false);
    }

    public long chreCcPingIntervalMillis() {
        return ((Long) chreCcPingIntervalMillis.mo58455c()).longValue();
    }

    public boolean chreCcSupported() {
        return ((Boolean) chreCcSupported.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
