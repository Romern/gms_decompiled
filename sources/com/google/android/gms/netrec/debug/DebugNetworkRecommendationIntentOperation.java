package com.google.android.gms.netrec.debug;

import android.content.Intent;
import android.net.NetworkKey;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DebugNetworkRecommendationIntentOperation extends IntentOperation {

    /* renamed from: a */
    private akkc f81177a;

    public final void onCreate() {
        this.f81177a = new akkc(getBaseContext());
    }

    public final void onHandleIntent(Intent intent) {
        NetworkKey[] networkKeyArr;
        String stringExtra;
        akkc akkc = this.f81177a;
        if (akkc == null) {
            return;
        }
        if (akkc.f72140c) {
            eoa.m10826b("NetRec", "Got an intent.", new Object[0]);
            if (!akke.m59908a()) {
                eoa.m10828c("NetRec", "Debug unsupported.", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (((action.hashCode() == 1187547615 && action.equals("com.google.android.gms.netrec.debug.REQUEST_SCORES")) ? (char) 0 : 65535) != 0) {
                eoa.m10828c("NetRec", "Unknown action %s, supported actions are %s", intent.getAction(), bmxr.m108544a(",").mo66874a((Iterable) akkc.f72138a));
                return;
            }
            eoa.m10826b("NetRec", "Handling requestScores request.", new Object[0]);
            if (!intent.hasExtra("requestScores")) {
                eoa.m10828c("NetRec", "Could not find %s extra, ignoring", "requestScores");
                return;
            }
            NetworkKey[] parcelableArrayExtra = intent.getParcelableArrayExtra("requestScores");
            if (parcelableArrayExtra != null) {
                networkKeyArr = new NetworkKey[parcelableArrayExtra.length];
                int i = 0;
                while (i < parcelableArrayExtra.length) {
                    NetworkKey networkKey = parcelableArrayExtra[i];
                    if (networkKey instanceof NetworkKey) {
                        networkKeyArr[i] = networkKey;
                        i++;
                    } else {
                        eoa.m10824a("NetRec", "Could not cast unexpected parcelable %d: %s", Integer.valueOf(i), networkKey.getClass());
                        return;
                    }
                }
            } else {
                networkKeyArr = null;
            }
            if (networkKeyArr == null && (stringExtra = intent.getStringExtra("requestScores")) != null) {
                try {
                    networkKeyArr = akkg.m59911a(akkd.f72144b.mo66925c((CharSequence) stringExtra));
                } catch (IllegalArgumentException e) {
                    eoa.m10825a("NetRec", e, "Could not parse extra", new Object[0]);
                }
            }
            if (networkKeyArr != null) {
                eoa.m10826b("NetRec", "Requesting scores for %d networks", Integer.valueOf(networkKeyArr.length));
                akkc.f72139b.onRequestScores(networkKeyArr);
                return;
            }
            eoa.m10828c("NetRec", "No keys provided.", new Object[0]);
            return;
        }
        eoa.m10828c("NetRec", "Debug receiver disabled.", new Object[0]);
    }
}
