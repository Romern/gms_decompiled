package p000;

/* renamed from: cetr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cetr implements cetq {
    public static final bdyx chreCcClearcutAccountEnabled;
    public static final bdyx chreCcClearcutLoggingEnabled;
    public static final bdyx chreCcFalseNotificationConfidenceThreshold;
    public static final bdyx chreCcFalseNotificationEnabled;
    public static final bdyx chreCcFalseNotificationText;
    public static final bdyx chreCcFalseNotificationTitle;
    public static final bdyx chreCcFalseNotificationUri;
    public static final bdyx chreCcHealthNotificationEnabled;
    public static final bdyx chreCcHealthNotificationText;
    public static final bdyx chreCcHealthNotificationTitle;
    public static final bdyx chreCcNotificationConfidenceThreshold;
    public static final bdyx chreCcNotificationEnabled;
    public static final bdyx chreCcNotificationText;
    public static final bdyx chreCcNotificationTitle;
    public static final bdyx chreCcNotificationUri;
    public static final bdyx chreCcTestModelEnabled;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        chreCcClearcutAccountEnabled = bdyx.m91610a(a, "chre_cc_clearcut_account_enabled", false);
        chreCcClearcutLoggingEnabled = bdyx.m91610a(a, "chre_cc_clearcut_logging_enabled", false);
        chreCcFalseNotificationConfidenceThreshold = bdyx.m91605a(a, "chre_cc_false_notification_confidence_threshold", 0.0d);
        chreCcFalseNotificationEnabled = bdyx.m91610a(a, "chre_cc_false_notification_enabled", false);
        chreCcFalseNotificationText = bdyx.m91609a(a, "chre_cc_false_notification_text", "");
        chreCcFalseNotificationTitle = bdyx.m91609a(a, "chre_cc_false_notification_title", "");
        chreCcFalseNotificationUri = bdyx.m91609a(a, "chre_cc_false_notification_uri", "");
        chreCcHealthNotificationEnabled = bdyx.m91610a(a, "chre_cc_health_notification_enabled", false);
        chreCcHealthNotificationText = bdyx.m91609a(a, "chre_cc_health_notification_text", "");
        chreCcHealthNotificationTitle = bdyx.m91609a(a, "chre_cc_health_notification_title", "");
        chreCcNotificationConfidenceThreshold = bdyx.m91605a(a, "chre_cc_notification_confidence_threshold", 0.5d);
        chreCcNotificationEnabled = bdyx.m91610a(a, "chre_cc_notification_enabled", false);
        chreCcNotificationText = bdyx.m91609a(a, "chre_cc_notification_text", "");
        chreCcNotificationTitle = bdyx.m91609a(a, "chre_cc_notification_title", "");
        chreCcNotificationUri = bdyx.m91609a(a, "chre_cc_notification_uri", "");
        chreCcTestModelEnabled = bdyx.m91610a(a, "chre_cc_detection_enabled", false);
    }

    public boolean chreCcClearcutAccountEnabled() {
        return ((Boolean) chreCcClearcutAccountEnabled.mo58455c()).booleanValue();
    }

    public boolean chreCcClearcutLoggingEnabled() {
        return ((Boolean) chreCcClearcutLoggingEnabled.mo58455c()).booleanValue();
    }

    public double chreCcFalseNotificationConfidenceThreshold() {
        return ((Double) chreCcFalseNotificationConfidenceThreshold.mo58455c()).doubleValue();
    }

    public boolean chreCcFalseNotificationEnabled() {
        return ((Boolean) chreCcFalseNotificationEnabled.mo58455c()).booleanValue();
    }

    public String chreCcFalseNotificationText() {
        return (String) chreCcFalseNotificationText.mo58455c();
    }

    public String chreCcFalseNotificationTitle() {
        return (String) chreCcFalseNotificationTitle.mo58455c();
    }

    public String chreCcFalseNotificationUri() {
        return (String) chreCcFalseNotificationUri.mo58455c();
    }

    public boolean chreCcHealthNotificationEnabled() {
        return ((Boolean) chreCcHealthNotificationEnabled.mo58455c()).booleanValue();
    }

    public String chreCcHealthNotificationText() {
        return (String) chreCcHealthNotificationText.mo58455c();
    }

    public String chreCcHealthNotificationTitle() {
        return (String) chreCcHealthNotificationTitle.mo58455c();
    }

    public double chreCcNotificationConfidenceThreshold() {
        return ((Double) chreCcNotificationConfidenceThreshold.mo58455c()).doubleValue();
    }

    public boolean chreCcNotificationEnabled() {
        return ((Boolean) chreCcNotificationEnabled.mo58455c()).booleanValue();
    }

    public String chreCcNotificationText() {
        return (String) chreCcNotificationText.mo58455c();
    }

    public String chreCcNotificationTitle() {
        return (String) chreCcNotificationTitle.mo58455c();
    }

    public String chreCcNotificationUri() {
        return (String) chreCcNotificationUri.mo58455c();
    }

    public boolean chreCcTestModelEnabled() {
        return ((Boolean) chreCcTestModelEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
