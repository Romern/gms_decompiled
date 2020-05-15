package com.google.android.chimera.container;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfigurationManager$IntentHandler extends IntentOperation {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dfy.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      dfy.a(djz, djz):java.util.Map
      dfy.a(djz, int):void
      dez.a(java.io.File, java.lang.String):java.io.File
      dfy.a(boolean, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105  */
    public final void onHandleIntent(Intent intent, boolean z) {
        char c;
        PendingIntent a;
        dfy a2 = dfy.m8329a(this);
        String action = intent.getAction();
        bmzs.m108696a(action);
        switch (action.hashCode()) {
            case -1709763626:
                if (action.equals("com.google.android.chimera.container.CHECK_MODULES_INIT")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -110071292:
                if (action.equals("com.google.android.chimera.container.NEW_MODULE_TIMEOUT")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 798292259:
                if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2069809336:
                if (action.equals(IntentOperation.ACTION_NEW_MODULE)) {
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
            diz b = dfy.m8333b(this);
            if (b != null) {
                Log.i("ChimeraCfgMgr", "Auto-enable components using current configuration.");
                try {
                    b.mo9109a(a2.mo8898f());
                } catch (InvalidConfigException e) {
                    Log.e("ChimeraCfgMgr", "Cannot get current Chimera configuration, so skip auto-enabling components.", e);
                    return;
                }
            }
            aytw.m84814b();
            a2.mo8891a(false, true);
        } else if (c == 1) {
            synchronized (a2.f13033e) {
                bxvd n = a2.mo8906n();
                int intExtra = intent.getIntExtra("chimera_complete", -1);
                boolean booleanExtra = intent.getBooleanExtra("chimera_full_reinit", false);
                dip dip = (dip) n.f164949b;
                int i = dip.f13258c;
                int i2 = dip.f13259d;
                StringBuilder sb = new StringBuilder(106);
                sb.append("Received com.google.android.chimera.IntentOperation.NEW_MODULE(");
                sb.append(i);
                sb.append("/");
                sb.append(i2);
                sb.append("): ");
                sb.append(intExtra);
                sb.append(",");
                sb.append(booleanExtra);
                Log.i("ChimeraCfgMgr", sb.toString());
                if (intExtra >= 0) {
                    dip dip2 = (dip) n.f164949b;
                    if (intExtra <= dip2.f13258c) {
                        int i3 = dip2.f13259d;
                        if (intExtra > i3) {
                            if (intExtra != i3 + 1) {
                                if (!booleanExtra) {
                                    Log.w("ChimeraCfgMgr", "Ignoring out-of-order com.google.android.chimera.IntentOperation.NEW_MODULE");
                                    if (intExtra == ((dip) n.f164949b).f13258c) {
                                        dfq.m8314a();
                                        if (cdjh.f180979a.mo6606a().mo77754s() && (a = a2.mo8881a(0)) != null) {
                                            Log.i("ChimeraCfgMgr", "Triggering early com.google.android.chimera.container.NEW_MODULE_TIMEOUT");
                                            try {
                                                a.send();
                                            } catch (PendingIntent.CanceledException e2) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (n.f164950c) {
                                n.mo74035c();
                                n.f164950c = false;
                            }
                            dip dip3 = (dip) n.f164949b;
                            dip dip4 = dip.f13254e;
                            dip3.f13256a |= 4;
                            dip3.f13259d = intExtra;
                            if (dip3.f13258c != intExtra) {
                                a2.mo8892a(n);
                            } else {
                                a2.mo8903k();
                            }
                        }
                    }
                }
                Log.w("ChimeraCfgMgr", "Ignoring unexpected com.google.android.chimera.IntentOperation.NEW_MODULE");
                if (intExtra == ((dip) n.f164949b).f13258c) {
                }
            }
        } else if (c != 2) {
            if (c == 3) {
                a2.mo8891a(false, true);
            }
        } else if (!z) {
            int intExtra2 = intent.getIntExtra("chimera_retries", 3) - 1;
            if (intExtra2 <= 0) {
                a2.mo8901i();
                dgd.m8382a(this, 40);
                return;
            }
            a2.mo8881a(intExtra2);
            a2.mo8891a(true, false);
        }
    }
}
