package p000;

/* renamed from: cetx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cetx implements cetw {
    public static final bdyx cellFingerprintConfig;
    public static final bdyx cellFingerprintHoldback;
    public static final bdyx cellFingerprintHoldbackConfig;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        cellFingerprintConfig = bdyx.m91607a(a, "cell_fingerprint_config", 1L);
        cellFingerprintHoldback = bdyx.m91607a(a, "cell_fingerprint_holdback", 0L);
        cellFingerprintHoldbackConfig = bdyx.m91607a(a, "cell_fingerprint_holdback_config", 0L);
    }

    public long cellFingerprintConfig() {
        return ((Long) cellFingerprintConfig.mo58455c()).longValue();
    }

    public long cellFingerprintHoldback() {
        return ((Long) cellFingerprintHoldback.mo58455c()).longValue();
    }

    public long cellFingerprintHoldbackConfig() {
        return ((Long) cellFingerprintHoldbackConfig.mo58455c()).longValue();
    }

    public boolean compiled() {
        return true;
    }
}
