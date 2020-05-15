package com.google.android.gms.netrec.scoring.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkKey;
import android.os.Parcelable;
import com.google.android.chimera.BroadcastReceiver;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ScoreNetworksChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int length;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Received intent: ");
        sb.append(valueOf);
        eoa.m10826b("NetRec", sb.toString(), new Object[0]);
        if (!"android.net.scoring.SCORER_CHANGED".equals(intent.getAction())) {
            if ("android.net.scoring.SCORE_NETWORKS".equals(intent.getAction())) {
                akmg akmg = new akmg(context);
                akma akma = new akma(context);
                aknf.m60079b(25);
                Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("networksToScore");
                if (parcelableArrayExtra != null && (length = parcelableArrayExtra.length) > 0) {
                    new Object[1][0] = Integer.valueOf(length);
                    NetworkKey[] networkKeyArr = (NetworkKey[]) Arrays.copyOf(parcelableArrayExtra, length, NetworkKey[].class);
                    akmg.mo39557a(networkKeyArr);
                    akma.mo39551a(networkKeyArr, null);
                    return;
                }
                eoa.m10829d("NetRec", "Received request from the platform with no networks to score", new Object[0]);
                return;
            }
            eoa.m10824a("NetRec", "Received unhandled intent: %s", intent);
        } else if (context.getPackageName().equals(intent.getStringExtra("newScorer"))) {
            akmi.m60008a();
            aknf.m60079b(23);
        } else {
            akmi.m60009a(context);
            aknf.m60079b(24);
        }
    }
}
