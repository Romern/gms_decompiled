package p000;

/* renamed from: cetu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cetu implements cett {
    public static final bdyx chreCcTransitionDetectionEnabled;
    public static final bdyx chreCcTransitionHealthEventEnabled;

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
        chreCcTransitionDetectionEnabled = bdyx.m91610a(a, "chre_cc_transition_detection_enabled", false);
        chreCcTransitionHealthEventEnabled = bdyx.m91610a(a, "chre_cc_transition_health_event_enabled", false);
    }

    public boolean chreCcTransitionDetectionEnabled() {
        return ((Boolean) chreCcTransitionDetectionEnabled.mo58455c()).booleanValue();
    }

    public boolean chreCcTransitionHealthEventEnabled() {
        return ((Boolean) chreCcTransitionHealthEventEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
