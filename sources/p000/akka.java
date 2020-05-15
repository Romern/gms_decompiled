package p000;

import android.os.SystemClock;
import java.security.SecureRandom;

/* renamed from: akka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akka {

    /* renamed from: a */
    public static final eog f72126a;

    /* renamed from: b */
    public static final eog f72127b = f72137l.mo10357a("nextRapidRefreshAllowedMillis", (Long) 0L);

    /* renamed from: c */
    public static final eog f72128c = f72137l.mo10358a("encrypterHMACKey", (String) null);

    /* renamed from: d */
    public static final eog f72129d = f72137l.mo10358a("encrypterAESKey", (String) null);

    /* renamed from: e */
    public static final eog f72130e = f72137l.mo10358a("encrypterId", (String) null);

    /* renamed from: f */
    public static final eog f72131f = f72137l.mo10356a("nextNetworkRequestDelayMs", (Integer) 0);

    /* renamed from: g */
    public static final eog f72132g = f72137l.mo10358a("lastSsidHash", "");

    /* renamed from: h */
    public static final eog f72133h = f72137l.mo10358a("authenticationApp", "");

    /* renamed from: i */
    public static final eog f72134i = f72137l.mo10357a("bootSessionId", (Long) 0L);

    /* renamed from: j */
    public static final eog f72135j = f72137l.mo10356a("netrecEventOrderNumber", (Integer) -1);

    /* renamed from: k */
    public static final eog f72136k = f72137l.mo10357a("initOrLogTime", (Long) Long.MAX_VALUE);

    /* renamed from: l */
    private static final eoh f72137l;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoh.a(java.lang.String, java.lang.Boolean):eog
     arg types: [java.lang.String, int]
     candidates:
      eoh.a(java.lang.String, java.lang.Integer):eog
      eoh.a(java.lang.String, java.lang.Long):eog
      eoh.a(java.lang.String, java.lang.String):eog
      eoh.a(java.lang.String, java.lang.Boolean):eog */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoh.a(java.lang.String, java.lang.Long):eog
     arg types: [java.lang.String, long]
     candidates:
      eoh.a(java.lang.String, java.lang.Boolean):eog
      eoh.a(java.lang.String, java.lang.Integer):eog
      eoh.a(java.lang.String, java.lang.String):eog
      eoh.a(java.lang.String, java.lang.Long):eog */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: eoh.a(java.lang.String, java.lang.Integer):eog
     arg types: [java.lang.String, int]
     candidates:
      eoh.a(java.lang.String, java.lang.Boolean):eog
      eoh.a(java.lang.String, java.lang.Long):eog
      eoh.a(java.lang.String, java.lang.String):eog
      eoh.a(java.lang.String, java.lang.Integer):eog */
    static {
        eoh eoh = new eoh("com.google.android.gms.netrec");
        f72137l = eoh;
        f72126a = eoh.mo10355a("justEnabled", (Boolean) false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (spn.m35873c() && elapsedRealtime < ((Long) f72136k.mo10351a()).longValue()) {
            f72134i.mo10352a(Long.valueOf(new SecureRandom().nextLong()));
            f72135j.mo10352a((Object) 0);
            f72127b.mo10352a((Object) 0L);
            f72136k.mo10352a(Long.valueOf(elapsedRealtime));
        }
    }
}
