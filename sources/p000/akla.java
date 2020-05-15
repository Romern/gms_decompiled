package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.net.NetworkKey;
import android.net.WifiKey;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.netrec.scoring.ScoreNetworksRequest;
import com.google.android.gms.netrec.scoring.WifiNetworkKey;
import java.util.List;

/* renamed from: akla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akla extends aaab {

    /* renamed from: a */
    private final rnt f72185a;

    /* renamed from: b */
    private final ScoreNetworksRequest f72186b;

    /* renamed from: c */
    private final PendingIntent f72187c;

    public akla(rnt rnt, ScoreNetworksRequest scoreNetworksRequest, PendingIntent pendingIntent) {
        super(137, "RequestScores");
        this.f72185a = rnt;
        this.f72186b = scoreNetworksRequest;
        this.f72187c = pendingIntent;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        akmh akmh = new akmh(context);
        try {
            ScoreNetworksRequest scoreNetworksRequest = this.f72186b;
            Object[] objArr = {scoreNetworksRequest, this.f72187c};
            int i = eoa.f15378a;
            if (scoreNetworksRequest == null) {
                this.f72185a.mo11797a(new Status(22000));
            } else if (!scoreNetworksRequest.f81194a.isEmpty()) {
                List list = this.f72186b.f81194a;
                NetworkKey[] networkKeyArr = new NetworkKey[list.size()];
                for (int i2 = 0; i2 < list.size(); i2++) {
                    WifiNetworkKey wifiNetworkKey = (WifiNetworkKey) list.get(i2);
                    networkKeyArr[i2] = new NetworkKey(new WifiKey(wifiNetworkKey.f81197a, wifiNetworkKey.f81198b));
                }
                akmh.mo39560a(networkKeyArr, this.f72187c);
                this.f72185a.mo11797a(Status.f30107a);
            } else {
                this.f72185a.mo11797a(new Status(22001));
            }
        } catch (RuntimeException e) {
            eoa.m10825a("NetRec", e, "Error executing requestScoreOperation", new Object[0]);
            throw new aaaj(8, null);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f72185a.mo11797a(status);
    }
}
