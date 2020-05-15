package p000;

/* renamed from: cesa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cesa implements cerz {
    public static final bdyx arRoadAndRailTransitionEnabled;
    public static final bdyx arRoadRailVehicleEnabled;

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
        arRoadAndRailTransitionEnabled = bdyx.m91610a(a, "ar_road_and_rail_transition_enabled", false);
        arRoadRailVehicleEnabled = bdyx.m91610a(a, "ar_road_rail_vehicle_enabled", true);
    }

    public boolean arRoadAndRailTransitionEnabled() {
        return ((Boolean) arRoadAndRailTransitionEnabled.mo58455c()).booleanValue();
    }

    public boolean arRoadRailVehicleEnabled() {
        return ((Boolean) arRoadRailVehicleEnabled.mo58455c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
