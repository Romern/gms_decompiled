package p000;

/* renamed from: ceza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceza implements ceyz {
    public static final bdyx nanoappIdList;
    public static final bdyx nanoappLoggingEnabled;

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
        nanoappIdList = bdyx.m91609a(a, "NanoappLogging__nanoapp_id_list", "0x476f6f676c001004");
        nanoappLoggingEnabled = bdyx.m91610a(a, "NanoappLogging__nanoapp_logging_enabled", false);
    }

    public boolean compiled() {
        return true;
    }

    public String nanoappIdList() {
        return (String) nanoappIdList.mo58455c();
    }

    public boolean nanoappLoggingEnabled() {
        return ((Boolean) nanoappLoggingEnabled.mo58455c()).booleanValue();
    }
}
