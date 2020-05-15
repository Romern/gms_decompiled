package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InstantAppAddRemoveStatusIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final adfs f79224a = new adfs("AppAddRemoveStatusOp");

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void onHandleIntent(Intent intent) {
        char c;
        if (ceoz.f183170a.mo6606a().mo79506a()) {
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode != -1551420805) {
                if (hashCode == 1686683586 && action.equals("com.google.android.gms.instantapps.INSTANT_APP_UNINSTALLED")) {
                    c = 1;
                    if (c == 0 && c != 1) {
                        f79224a.mo33426b("Unexpected intent action=%s", intent.getAction());
                        return;
                    }
                    return;
                }
            } else if (action.equals("com.google.android.gms.instantapps.INSTANT_APP_INSTALLED")) {
                c = 0;
                if (c == 0) {
                    return;
                }
                return;
            }
            c = 65535;
            if (c == 0) {
            }
        }
    }
}
