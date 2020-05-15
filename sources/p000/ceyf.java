package p000;

/* renamed from: ceyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceyf implements ceye {
    public static final bdyx showOnOffStatusForLocationAccuracy;
    public static final bdyx showOnOffStatusForLocationSharing;
    public static final bdyx showSummaryForLocationAccuracy;
    public static final bdyx showSummaryForLocationHistory;
    public static final bdyx showSummaryForLocationSharing;

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
        showOnOffStatusForLocationAccuracy = bdyx.m91610a(a, "InjectedServices__show_on_off_status_for_location_accuracy", true);
        showOnOffStatusForLocationSharing = bdyx.m91610a(a, "InjectedServices__show_on_off_status_for_location_sharing", true);
        showSummaryForLocationAccuracy = bdyx.m91610a(a, "InjectedServices__show_summary_for_location_accuracy", false);
        showSummaryForLocationHistory = bdyx.m91610a(a, "InjectedServices__show_summary_for_location_history", false);
        showSummaryForLocationSharing = bdyx.m91610a(a, "InjectedServices__show_summary_for_location_sharing", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean showOnOffStatusForLocationAccuracy() {
        return ((Boolean) showOnOffStatusForLocationAccuracy.mo58455c()).booleanValue();
    }

    public boolean showOnOffStatusForLocationSharing() {
        return ((Boolean) showOnOffStatusForLocationSharing.mo58455c()).booleanValue();
    }

    public boolean showSummaryForLocationAccuracy() {
        return ((Boolean) showSummaryForLocationAccuracy.mo58455c()).booleanValue();
    }

    public boolean showSummaryForLocationHistory() {
        return ((Boolean) showSummaryForLocationHistory.mo58455c()).booleanValue();
    }

    public boolean showSummaryForLocationSharing() {
        return ((Boolean) showSummaryForLocationSharing.mo58455c()).booleanValue();
    }
}
