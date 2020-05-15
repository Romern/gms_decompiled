package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.libraries.matchstick.net.MessagingService;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;
import java.net.URISyntaxException;

/* renamed from: afiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afiw {

    /* renamed from: a */
    public static final String f64259a = ssv.m36267a("com.google.android.gms.matchstick");

    /* renamed from: a */
    public static void m53134a(Context context) {
        azdl a = azdl.m85412a(context);
        if (!a.f99088a.getBoolean("duo_install_intent_triggered", false) && azpi.m86078b(context, cfeo.m138886q())) {
            context.sendBroadcast(new Intent(cfeo.f183719a.mo6606a().mo80928O()).setFlags(32).setPackage(cfeo.m138886q()));
            SharedPreferences.Editor edit = a.f99088a.edit();
            edit.putBoolean("duo_install_intent_triggered", true);
            edit.apply();
        }
    }

    /* renamed from: b */
    static boolean m53139b(Context context) {
        int a;
        if (!azpi.m86078b(context, cfeo.m138863T())) {
            return false;
        }
        if (TextUtils.isEmpty(cfeo.m138871b())) {
            return true;
        }
        try {
            Intent parseUri = Intent.parseUri(cfeo.m138871b(), 0);
            if (parseUri == null || (a = azoi.m85917a(context, parseUri, 4, true)) == 0 || a == 1 || a == 2) {
                return true;
            }
            return false;
        } catch (URISyntaxException e) {
            azoj.m85933c("IntentHandler", "Invalid allo chat intent uri", new Object[0]);
            return true;
        }
    }

    /* renamed from: d */
    public static void m53141d(Context context) {
        Intent intent = new Intent(context, SilentRegisterIntentOperation.class);
        intent.setAction("com.google.android.gms.matchstick.downgrade_lighter_registration_action");
        SilentRegisterIntentOperation.m94594b(intent, context);
    }

    /* renamed from: e */
    public static void m53142e(Context context) {
        boolean z = true;
        if (!cfeo.m138887r() || !cfeo.m138874e() || (cfdt.f183669a.mo6606a().mo80869a() && m53139b(context))) {
            z = false;
        }
        m53136a(context, "com.google.android.gms.matchstick.ui.EntryActivity", z);
    }

    /* renamed from: f */
    public static void m53143f(Context context) {
        boolean z = false;
        if (cfeo.m138889t()) {
            if (cfeo.f183719a.mo6606a().mo80922I()) {
                String[] split = cfdq.m138746b().split(",");
                String[] split2 = cfdq.f183665a.mo6606a().mo80866a().split(",");
                if (split == null) {
                    z = true;
                } else if (split2 != null && split.length == split2.length) {
                    int i = 0;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        try {
                            if (azpi.m86070a(context, split[i], Long.valueOf(Long.parseLong(split2[i])))) {
                                break;
                            }
                            i++;
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }
            z = true;
        }
        m53136a(context, "com.google.android.gms.matchstick.ui.LighterMessageIntentActivity", z);
    }

    /* renamed from: c */
    public static void m53140c(Context context) {
        if (System.currentTimeMillis() - azdl.m85412a(context).f99088a.getLong("last_check_regsitration_with_lighter_timestamp_ms_key", 0) > cfeo.f183719a.mo6606a().mo81035bp()) {
            Intent intent = new Intent(context, SilentRegisterIntentOperation.class);
            intent.setAction("com.google.android.gms.matchstick.check_registration_with_lighter_action");
            SilentRegisterIntentOperation.m94594b(intent, context);
        }
    }

    /* renamed from: g */
    public static void m53144g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (azdl.m85412a(context).mo54770e()) {
            azqf.m86130a(context);
            if (azqf.m86149c()) {
                MessagingService.m94558c(new Intent("com.google.android.apps.libraries.matchstick.action.POST_ALL_LIGHTER_CONVERSATION_NOTIFICATIONS"), context);
                azph.m85998a(context).mo55125a(1440);
                return;
            }
            MessagingService.m94558c(new Intent("com.google.android.apps.libraries.matchstick.action.FIRE_ALL_CONVERSATION_NOTIFICATIONS"), context);
        }
    }

    /* renamed from: a */
    public static void m53135a(Context context, long j, int i) {
        int i2 = Build.VERSION.SDK_INT;
        azfo a = azfo.m85593a(context);
        Intent intent = new Intent();
        double nextDouble = azfo.m85595b().nextDouble();
        double d = (double) j;
        Double.isNaN(d);
        long round = Math.round(nextDouble * d);
        Intent a2 = SilentRegisterIntentOperation.m94569a(a.f99237a, (String) null);
        a2.putExtras(intent);
        a.mo54877b(i, a2, round);
    }

    /* renamed from: a */
    public static void m53136a(Context context, String str, boolean z) {
        try {
            spn.m35856a(context, str, z);
        } catch (IllegalArgumentException e) {
            azoj.m85931a("IntentHandler", e, "Component invalid", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m53137a(Context context, boolean z) {
        azdl a = azdl.m85412a(context);
        if (a.mo54770e()) {
            SilentRegisterIntentOperation.m94574a(context, a, z);
            SilentRegisterIntentOperation.m94591b(context, a, z);
        }
        if (cfde.m138718b()) {
            SilentRegisterIntentOperation.m94598c(context, a, z);
        }
    }

    /* renamed from: a */
    public static void m53138a(String str, Context context) {
        if (!azdl.m85412a(context).mo54778g() && cfec.m138765b()) {
            new Object[1][0] = str;
            SilentRegisterIntentOperation.m94594b(new Intent("com.google.android.gms.matchstick.register_intent_action"), context.getApplicationContext());
        }
    }
}
