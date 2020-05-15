package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.net.NetworkKey;
import android.net.NetworkScoreManager;
import android.net.RssiCurve;
import android.net.ScoredNetwork;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.netrec.scoring.NetworkScore;
import com.google.android.gms.netrec.scoring.RssiScoreCurve;
import com.google.android.gms.netrec.scoring.WifiNetworkKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: akmg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmg {

    /* renamed from: a */
    static final bnge f72253a = bnge.m109299s();

    /* renamed from: b */
    private final Context f72254b;

    /* renamed from: c */
    private final akmz f72255c;

    public akmg(Context context) {
        akmz akmz = new akmz(context);
        this.f72254b = context;
        this.f72255c = akmz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083 A[LOOP:0: B:2:0x000a->B:22:0x0083, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1 A[SYNTHETIC] */
    /* renamed from: a */
    private final void m60003a(ScoredNetwork[] scoredNetworkArr, PendingIntent pendingIntent) {
        RssiScoreCurve rssiScoreCurve;
        NetworkKey networkKey;
        if (pendingIntent != null) {
            int length = scoredNetworkArr.length;
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (i < length) {
                ScoredNetwork scoredNetwork = scoredNetworkArr[i];
                Bundle bundle = new Bundle();
                int i2 = Build.VERSION.SDK_INT;
                boolean z = scoredNetwork.meteredHint;
                int i3 = Build.VERSION.SDK_INT;
                aknh.m60081a();
                Bundle bundle2 = scoredNetwork.attributes;
                if (bundle2 != null) {
                    if (bundle2.containsKey("android.net.attributes.key.HAS_CAPTIVE_PORTAL")) {
                        bundle.putBoolean("com.google.android.gms.netrec.scoring.HAS_CAPTIVE_PORTAL", bundle2.getBoolean("android.net.attributes.key.HAS_CAPTIVE_PORTAL"));
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    if (bundle2.containsKey("android.net.attributes.key.BADGING_CURVE")) {
                        rssiScoreCurve = akkx.m59943a(bundle2.getParcelable("android.net.attributes.key.BADGING_CURVE"));
                        networkKey = scoredNetwork.networkKey;
                        if (networkKey.type != 1) {
                            arrayList.add(new NetworkScore(new WifiNetworkKey(networkKey.wifiKey.ssid, networkKey.wifiKey.bssid), akkx.m59943a(scoredNetwork.rssiCurve), z, bundle, rssiScoreCurve));
                            i++;
                        } else {
                            int i5 = networkKey.type;
                            StringBuilder sb = new StringBuilder(51);
                            sb.append("Cannot create WifiNetworkKey from type: ");
                            sb.append(i5);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                rssiScoreCurve = null;
                networkKey = scoredNetwork.networkKey;
                if (networkKey.type != 1) {
                }
            }
            Bundle bundle3 = new Bundle();
            sef.m35073a(arrayList, bundle3, "network_scores");
            Intent intent = new Intent();
            intent.putExtras(bundle3);
            new Object[1][0] = Integer.valueOf(arrayList.size());
            int i6 = eoa.f15378a;
            try {
                pendingIntent.send(this.f72254b, 0, intent);
            } catch (PendingIntent.CanceledException e) {
                eoa.m10825a("NetRec", e, "Client pending intent cancelled.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo39557a(NetworkKey[] networkKeyArr) {
        mo39558a(networkKeyArr, (PendingIntent) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39558a(NetworkKey[] networkKeyArr, PendingIntent pendingIntent) {
        int length;
        ScoredNetwork[] scoredNetworkArr;
        List<akna> list;
        ScoredNetwork scoredNetwork;
        boolean z;
        RssiCurve rssiCurve;
        if (networkKeyArr != null && (length = networkKeyArr.length) != 0) {
            akmz akmz = this.f72255c;
            if (!cfpd.m142364d()) {
                int i = eoa.f15378a;
                scoredNetworkArr = new ScoredNetwork[length];
                for (int i2 = 0; i2 < networkKeyArr.length; i2++) {
                    scoredNetworkArr[i2] = new ScoredNetwork(networkKeyArr[i2], (RssiCurve) null);
                }
            } else {
                new Object[1][0] = Integer.valueOf(length);
                int i3 = eoa.f15378a;
                try {
                    list = akmz.f72284a.mo39573a(networkKeyArr);
                    new Object[1][0] = Integer.valueOf(list.size());
                } catch (SQLiteException e) {
                    eoa.m10825a("NetRec", e, "Failed to lookup networks to score.", new Object[0]);
                    list = Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                for (akna akna : list) {
                    hashMap.put(akna.f72285a, akna);
                }
                for (NetworkKey networkKey : networkKeyArr) {
                    akna akna2 = (akna) hashMap.get(networkKey);
                    if (akna2 == null) {
                        scoredNetwork = new ScoredNetwork(networkKey, (RssiCurve) null);
                    } else {
                        int i4 = Build.VERSION.SDK_INT;
                        Integer num = akna2.f72288d;
                        if (num != null) {
                            z = num.intValue() == 2;
                        } else {
                            z = false;
                        }
                        Integer num2 = akna2.f72288d;
                        if (num2 == null || num2.intValue() == 2) {
                            rssiCurve = akna2.f72286b;
                        } else {
                            rssiCurve = null;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        RssiCurve rssiCurve2 = akna2.f72287c;
                        if (rssiCurve2 == null) {
                            scoredNetwork = new ScoredNetwork(networkKey, rssiCurve, z);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("android.net.attributes.key.BADGING_CURVE", rssiCurve2);
                            scoredNetwork = new ScoredNetwork(networkKey, rssiCurve, z, bundle);
                        }
                    }
                    arrayList.add(scoredNetwork);
                }
                scoredNetworkArr = (ScoredNetwork[]) arrayList.toArray(new ScoredNetwork[arrayList.size()]);
            }
            int length2 = scoredNetworkArr.length;
            if (length2 != 0) {
                try {
                    if (akmi.m60010b(this.f72254b)) {
                        new Object[1][0] = Integer.valueOf(length2);
                        ((NetworkScoreManager) this.f72254b.getSystemService("network_score")).updateScores(scoredNetworkArr);
                        aknf.m60076a("ScoresReported", length2);
                    }
                } catch (SecurityException e2) {
                }
                bnge s = bnge.m109299s();
                synchronized (f72253a) {
                    for (ScoredNetwork scoredNetwork2 : scoredNetworkArr) {
                        for (PendingIntent pendingIntent2 : f72253a.mo67127c(scoredNetwork2.networkKey)) {
                            s.mo67268a(pendingIntent2, scoredNetwork2);
                        }
                        f72253a.mo67272e(scoredNetwork2.networkKey);
                    }
                }
                for (PendingIntent pendingIntent3 : s.mo67316o()) {
                    Set a = s.mo67127c(pendingIntent3);
                    m60003a((ScoredNetwork[]) a.toArray(new ScoredNetwork[a.size()]), pendingIntent3);
                }
                m60003a(scoredNetworkArr, pendingIntent);
            }
        }
    }
}
