package com.google.android.gms.ipa.appsindexer;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IpaPackageBroadcastIntentOperation extends IntentOperation {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        String str;
        char c;
        if (ceqm.m137873d()) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("AppsCorpus got package broadcast: ");
            sb.append(valueOf);
            sb.toString();
            String action = intent.getAction();
            if (intent.getData() != null) {
                str = intent.getData().getSchemeSpecificPart();
            } else {
                str = null;
            }
            boolean z = true;
            boolean z2 = false;
            switch (action.hashCode()) {
                case -810471698:
                    if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -19011148:
                    if (action.equals("android.intent.action.LOCALE_CHANGED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 172491798:
                    if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 525384130:
                    if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1544582882:
                    if (action.equals("android.intent.action.PACKAGE_ADDED")) {
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
                z = true ^ intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            } else if (c == 1 || c == 2) {
                z = false;
                z2 = true;
            } else if (c == 3) {
                boolean a = adne.m50849a(getPackageManager(), str);
                z2 = a;
                if (a) {
                    z = false;
                }
            } else if (c != 4) {
                z = false;
            } else {
                adnv.m50879a().mo33695a(new adnj(this));
                z = false;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (z) {
                adnv.m50879a().mo33695a(new adni(this, str));
            } else if (z2) {
                adnv.m50879a().mo33695a(new adnh(this, str));
            }
        }
    }
}
