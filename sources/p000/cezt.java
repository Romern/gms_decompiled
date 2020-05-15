package p000;

/* renamed from: cezt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cezt implements cezs {
    public static final bdyx enablePlatformUpgradeDetection;
    public static final bdyx locationHistoryNotificationForQ;
    public static final bdyx locationHistoryNotificationForQAlternativeTitle;
    public static final bdyx savePlatformVersionO;

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
        enablePlatformUpgradeDetection = bdyx.m91610a(a, "PlatformUpgradeHandlers__enable_platform_upgrade_detection", false);
        locationHistoryNotificationForQ = bdyx.m91610a(a, "PlatformUpgradeHandlers__location_history_notification_for_q", true);
        locationHistoryNotificationForQAlternativeTitle = bdyx.m91610a(a, "PlatformUpgradeHandlers__location_history_notification_for_q_alternative_title", false);
        savePlatformVersionO = bdyx.m91610a(a, "save_platform_version_o", true);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enablePlatformUpgradeDetection() {
        return ((Boolean) enablePlatformUpgradeDetection.mo58455c()).booleanValue();
    }

    public boolean locationHistoryNotificationForQ() {
        return ((Boolean) locationHistoryNotificationForQ.mo58455c()).booleanValue();
    }

    public boolean locationHistoryNotificationForQAlternativeTitle() {
        return ((Boolean) locationHistoryNotificationForQAlternativeTitle.mo58455c()).booleanValue();
    }

    public boolean savePlatformVersionO() {
        return ((Boolean) savePlatformVersionO.mo58455c()).booleanValue();
    }
}
