package p000;

/* renamed from: ceve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceve implements cevd {
    public static final bdyx enableDndExitOnfoot;
    public static final bdyx enableDndNotificationBluetoothOnly;

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
        enableDndExitOnfoot = bdyx.m91610a(a, "enable_dnd_exit_onfoot", true);
        enableDndNotificationBluetoothOnly = bdyx.m91610a(a, "enable_dnd_notification_bluetooth_only", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableDndExitOnfoot() {
        return ((Boolean) enableDndExitOnfoot.mo58455c()).booleanValue();
    }

    public boolean enableDndNotificationBluetoothOnly() {
        return ((Boolean) enableDndNotificationBluetoothOnly.mo58455c()).booleanValue();
    }
}
