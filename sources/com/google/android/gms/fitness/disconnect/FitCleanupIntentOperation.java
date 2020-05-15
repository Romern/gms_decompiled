package com.google.android.gms.fitness.disconnect;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitCleanupIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f32190a = zvt.m46581a();

    /* renamed from: b */
    private zrg f32191b;

    /* renamed from: c */
    private yst f32192c;

    /* renamed from: a */
    public static void m23700a(Context context, Intent intent) {
        Intent startIntent = IntentOperation.getStartIntent(context, FitCleanupIntentOperation.class, "com.google.android.gms.fitness.disconnect.CLEANUP");
        if (startIntent == null) {
            bnsl bnsl = (bnsl) f32190a.mo68387b();
            bnsl.mo68432a("com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Couldn't create intent for FitCleanupIntentOperation.");
            return;
        }
        startIntent.putExtra("BROADCAST_INTENT", intent);
        context.startService(startIntent);
    }

    public final void onCreate() {
        yzs a = yzq.m45107a(this);
        zrg e = a.mo30879e();
        yst b = a.mo30874b();
        this.f32191b = e;
        this.f32192c = b;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        char c;
        if (intent.getAction().equals("com.google.android.gms.fitness.disconnect.CLEANUP")) {
            intent = (Intent) intent.getParcelableExtra("BROADCAST_INTENT");
        }
        bnsl bnsl = (bnsl) f32190a.mo68390d();
        bnsl.mo68432a("com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation", "onHandleIntent", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("FitCleanupIntentOperation received Intent %s", intent.getAction());
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -757193177:
                if (action.equals("com.google.android.gms.fitness.app_disconnected")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -177095062:
                if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 172491798:
                if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 267468725:
                if (action.equals("android.intent.action.PACKAGE_DATA_CLEARED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 525384130:
                if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            m23702a(intent.getStringExtra("com.google.android.gms.fitness.disconnected_app"), 0, intent.getStringExtra("com.google.android.gms.fitness.disconnected_account"));
        } else if (c != 1) {
            if (c == 2) {
                String b = yub.m44845b(intent);
                if (!yub.m44843a(this, b) && !cdyu.m135392j()) {
                    m23701a(b, yub.m44846c(intent));
                }
            } else if (c == 3) {
                m23701a(yub.m44845b(intent), yub.m44846c(intent));
            } else if (c == 4) {
                for (Account account : gre.m13768b(intent)) {
                    this.f32191b.mo30877c(account.name).mo31379g();
                    zuw.m46537c(getApplicationContext(), account.name);
                    if (cdyu.m135386d()) {
                        zuq.m46519b(getApplicationContext(), account.name);
                    }
                }
            } else {
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unexpected intent ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (!yub.m44844a(intent)) {
            m23701a(yub.m44845b(intent), yub.m44846c(intent));
        }
    }

    /* renamed from: a */
    private final void m23701a(String str, int i) {
        for (String str2 : this.f32192c.mo30715b()) {
            m23702a(str, i, str2);
        }
    }

    /* renamed from: a */
    private final void m23702a(String str, int i, String str2) {
        bmxy.m108588a(!str.isEmpty());
        bmxy.m108588a(!str2.isEmpty());
        bnsl bnsl = (bnsl) f32190a.mo68390d();
        bnsl.mo68432a("com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Clearing all cached OAuth tokens for: %s", str);
        this.f32192c.mo30741b(str2).mo30719a(str, i);
        bnsl bnsl2 = (bnsl) f32190a.mo68390d();
        bnsl2.mo68432a("com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation", "a", 175, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Removing all subscriptions for: %s", str);
        try {
            this.f32191b.mo30880e(str2).mo31397a(str);
        } catch (IOException e) {
            bnsl bnsl3 = (bnsl) f32190a.mo68387b();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("com.google.android.gms.fitness.disconnect.FitCleanupIntentOperation", "a", 179, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Cannot remove subscriptions");
        }
    }
}
