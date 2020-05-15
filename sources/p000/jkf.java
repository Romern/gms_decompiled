package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.BleCentralChimeraService;
import com.google.android.gms.auth.proximity.BlePeripheralChimeraService;
import com.google.android.gms.auth.proximity.GcmRegistrationIntentOperation;
import com.google.android.gms.auth.proximity.Role;

/* renamed from: jkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jkf {

    /* renamed from: a */
    public static final sek f22700a = jsy.m17256a("ChannelServices");

    /* renamed from: b */
    private static final String[] f22701b = {"com.google.android.gms.auth.proximity.BleCentralService", "com.google.android.gms.auth.proximity.BlePeripheralService"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: a */
    public static void m16838a(Context context, jnj jnj) {
        for (String str : f22701b) {
            spn.m35856a(context, str, true);
        }
        int c = jnj.mo13909c();
        Intent a = BlePeripheralChimeraService.m6753a(context);
        if (Role.m6772b(c)) {
            f22700a.mo25414c("Starting BlePeripheralService...", new Object[0]);
            context.startService(a);
        } else {
            context.stopService(a);
        }
        Intent a2 = BleCentralChimeraService.m6742a(context);
        if (Role.m6775e(c)) {
            f22700a.mo25414c("Starting BleCentralService...", new Object[0]);
            context.startService(a2);
        } else {
            context.stopService(a2);
        }
        if (Role.m6776f(c)) {
            f22700a.mo25414c("Subscribing to GCM bootstrap topics...", new Object[0]);
            context.startService(GcmRegistrationIntentOperation.m6764a(context, true));
        }
        if (Role.m6777g(c)) {
            f22700a.mo25414c("Subscribing to GCM bootstrap topics...", new Object[0]);
            context.startService(GcmRegistrationIntentOperation.m6764a(context, false));
        }
    }
}
