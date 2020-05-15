package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InitConfigOperation extends IntentOperation {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.a(android.content.Intent, android.content.Intent, boolean):void
     arg types: [android.content.Intent, android.content.Intent, int]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.a(android.content.Intent, android.content.Intent, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    public final void onHandleIntent(Intent intent) {
        char c;
        qoa qoa;
        bngx bngx;
        String action = intent.getAction();
        bmzs.m108696a(action);
        switch (action.hashCode()) {
            case -1482987174:
                if (action.equals("com.google.android.chimera.container.REQUESTED_FEATURES_CHANGED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -500294787:
                if (action.equals("com.google.android.gms.chimera.container.ACTION_FORCE_CONFIG_RECHECK")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -444354185:
                if (action.equals("com.google.android.gms.chimera.container.ACTION_START_PERIODIC_CHECKIN")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 438946629:
                if (action.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1360632797:
                if (action.equals("com.google.android.gms.chimera.container.ACTION_SECONDARY_USER_RECHECK")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            ConfigChimeraService.m22385b();
            qlo.m32391c(this);
            return;
        }
        if (c != 2) {
            if (!(c == 3 || c == 4)) {
                return;
            }
        } else if (!cdjh.m133558h()) {
            return;
        }
        if (!cdji.m133565f()) {
            int i = 0;
            while (((long) i) <= cdji.m133562c() && ((byte[]) qlk.f41648d.mo58455c()) == qlk.f41645a) {
                try {
                    Thread.sleep(5000);
                    i++;
                } catch (InterruptedException e) {
                    Thread.interrupted();
                    return;
                }
            }
        }
        String stringExtra = intent.getStringExtra("chimera.CLIENT_SESSION_ID");
        djk a = dkz.m8772a(intent, "progressListener");
        if (a != null) {
            qoa = new qoa(a);
        } else {
            qoa = null;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("chimera.URGENTLY_REQUESTED_FEATURES");
        if (byteArrayExtra != null) {
            try {
                bngx = bngx.m109368a((Collection) ((dje) GeneratedMessageLite.m124016a(dje.f13319b, byteArrayExtra, bxus.m123743b())).f13321a);
            } catch (bxwf e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Ignoring corrupt urgent features list: ");
                sb.append(valueOf);
                Log.w("FeatureMgr", sb.toString());
            }
            qln.m32379a(this).mo24085a(5, qoa, stringExtra, bngx);
            if (qoa == null) {
                Intent startIntent = IntentOperation.getStartIntent(this, WaitUpdateCompleteOperation.class, "com.google.android.gms.chimera.action.WAIT_UPDATE_COMPLETE");
                bmzs.m108696a(startIntent);
                dkz.m8774a(startIntent, "liveListener", qoa);
                WaitUpdateCompleteOperation.m22413a(intent, startIntent, false);
                startService(startIntent);
                return;
            }
            return;
        }
        bngx = bngx.m109376e();
        qln.m32379a(this).mo24085a(5, qoa, stringExtra, bngx);
        if (qoa == null) {
        }
    }
}
