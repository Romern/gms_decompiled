package p000;

/* renamed from: cevs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cevs implements cevr {
    public static final bdyx flpUseGpsWifiFusion;
    public static final bdyx flpUsePdrWithGpsPosition;

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
        flpUseGpsWifiFusion = bdyx.m91610a(a, "flp_use_gps_wifi_fusion", true);
        flpUsePdrWithGpsPosition = bdyx.m91610a(a, "flp_use_pdr_with_gps_position", true);
    }

    public boolean compiled() {
        return true;
    }

    public boolean flpUseGpsWifiFusion() {
        return ((Boolean) flpUseGpsWifiFusion.mo58455c()).booleanValue();
    }

    public boolean flpUsePdrWithGpsPosition() {
        return ((Boolean) flpUsePdrWithGpsPosition.mo58455c()).booleanValue();
    }
}
