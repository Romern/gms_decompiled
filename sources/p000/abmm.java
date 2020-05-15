package p000;

import android.content.SharedPreferences;

/* renamed from: abmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmm {

    /* renamed from: a */
    public static final eoh f57697a = new eoh("herrevad", 4);

    /* renamed from: a */
    public static final int m47908a() {
        return m47916b("observationLimiterGlobalObservationCount", 0);
    }

    /* renamed from: b */
    public static final int m47915b() {
        return m47916b("activeDataSubscriptionId", -1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoh.a(java.lang.String, java.lang.Long):eog
     arg types: [java.lang.String, long]
     candidates:
      eoh.a(java.lang.String, java.lang.Boolean):eog
      eoh.a(java.lang.String, java.lang.Integer):eog
      eoh.a(java.lang.String, java.lang.String):eog
      eoh.a(java.lang.String, java.lang.Long):eog */
    /* renamed from: c */
    public static final long m47919c(String str) {
        return ((Long) f57697a.mo10357a(str, (Long) 0L).mo10351a()).longValue();
    }

    /* renamed from: a */
    public static final void m47909a(int i) {
        m47911a("observationLimiterGlobalObservationCount", i);
    }

    /* renamed from: b */
    private static final int m47916b(String str, int i) {
        return ((Integer) f57697a.mo10356a(str, Integer.valueOf(i)).mo10351a()).intValue();
    }

    /* renamed from: c */
    public static final String m47920c() {
        return (String) f57697a.mo10358a("lastActiveApSsidBssidHash", "").mo10351a();
    }

    /* renamed from: a */
    public static final void m47910a(String str) {
        f57697a.mo10358a("lastActiveApSsidBssidHash", "").mo10352a(str);
    }

    /* renamed from: b */
    public static final void m47917b(boolean z) {
        m47913a("lastApIsCaptivePortal", z);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoh.a(java.lang.String, java.lang.Boolean):eog
     arg types: [java.lang.String, int]
     candidates:
      eoh.a(java.lang.String, java.lang.Integer):eog
      eoh.a(java.lang.String, java.lang.Long):eog
      eoh.a(java.lang.String, java.lang.String):eog
      eoh.a(java.lang.String, java.lang.Boolean):eog */
    /* renamed from: b */
    public static final boolean m47918b(String str) {
        return ((Boolean) f57697a.mo10355a(str, (Boolean) false).mo10351a()).booleanValue();
    }

    /* renamed from: c */
    public static void m47921c(boolean z) {
        SharedPreferences.Editor edit = f57697a.mo10354a().edit();
        edit.putLong("gcsStateServiceAvailabilityLastUpdatedMillis", System.currentTimeMillis());
        edit.putBoolean("gcsStateServiceAvailability", z);
        eoh.m10843a(edit);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoh.a(java.lang.String, java.lang.Integer):eog
     arg types: [java.lang.String, int]
     candidates:
      eoh.a(java.lang.String, java.lang.Boolean):eog
      eoh.a(java.lang.String, java.lang.Long):eog
      eoh.a(java.lang.String, java.lang.String):eog
      eoh.a(java.lang.String, java.lang.Integer):eog */
    /* renamed from: a */
    public static void m47911a(String str, int i) {
        f57697a.mo10356a(str, (Integer) 0).mo10352a(Integer.valueOf(i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoh.a(java.lang.String, java.lang.Long):eog
     arg types: [java.lang.String, long]
     candidates:
      eoh.a(java.lang.String, java.lang.Boolean):eog
      eoh.a(java.lang.String, java.lang.Integer):eog
      eoh.a(java.lang.String, java.lang.String):eog
      eoh.a(java.lang.String, java.lang.Long):eog */
    /* renamed from: a */
    public static void m47912a(String str, long j) {
        f57697a.mo10357a(str, (Long) 0L).mo10352a(Long.valueOf(j));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoh.a(java.lang.String, java.lang.Boolean):eog
     arg types: [java.lang.String, int]
     candidates:
      eoh.a(java.lang.String, java.lang.Integer):eog
      eoh.a(java.lang.String, java.lang.Long):eog
      eoh.a(java.lang.String, java.lang.String):eog
      eoh.a(java.lang.String, java.lang.Boolean):eog */
    /* renamed from: a */
    private static void m47913a(String str, boolean z) {
        f57697a.mo10355a(str, (Boolean) false).mo10352a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static final void m47914a(boolean z) {
        m47913a("hasValidCaptivePortalData", z);
    }
}
