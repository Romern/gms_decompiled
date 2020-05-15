package p000;

/* renamed from: cevb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cevb implements ceva {
    public static final bdyx enableDndNotification;
    public static final bdyx enableDrivingDndGms;

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
        enableDndNotification = bdyx.m91610a(a, "enable_dnd_notification", false);
        enableDrivingDndGms = bdyx.m91610a(a, "enable_driving_dnd_gms", true);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableDndNotification() {
        return ((Boolean) enableDndNotification.mo58455c()).booleanValue();
    }

    public boolean enableDrivingDndGms() {
        return ((Boolean) enableDrivingDndGms.mo58455c()).booleanValue();
    }
}
