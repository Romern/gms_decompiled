package p000;

import android.app.PendingIntent;
import com.google.android.gms.netrec.scoring.ConnectivityReport;
import com.google.android.gms.netrec.scoring.ScoreNetworksRequest;
import com.google.android.gms.netrec.scoring.client.NetworkScorerApiChimeraService;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkw extends akkh implements aaai {

    /* renamed from: a */
    private final NetworkScorerApiChimeraService f72178a;

    /* renamed from: b */
    private final aaag f72179b;

    /* renamed from: c */
    private final Map f72180c;

    public akkw(NetworkScorerApiChimeraService networkScorerApiChimeraService, aaag aaag) {
        this.f72178a = networkScorerApiChimeraService;
        this.f72179b = aaag;
        HashMap hashMap = new HashMap();
        this.f72180c = hashMap;
        hashMap.put("com.google.android.apps.gcs", caex.GCS);
    }

    /* renamed from: a */
    public final void mo39512a(rnt rnt) {
        int i = eoa.f15378a;
        this.f72179b.mo16659a(this.f72178a, new akky(rnt, this.f72180c));
    }

    /* renamed from: b */
    public final void mo39515b(rnt rnt) {
        int i = eoa.f15378a;
        this.f72179b.mo16659a(this.f72178a, new aklb(rnt, this.f72180c));
    }

    /* renamed from: a */
    public final void mo39513a(rnt rnt, ConnectivityReport connectivityReport) {
        new Object[1][0] = connectivityReport;
        int i = eoa.f15378a;
        this.f72179b.mo16659a(this.f72178a, new akkz(rnt, connectivityReport));
    }

    /* renamed from: a */
    public final void mo39514a(rnt rnt, ScoreNetworksRequest scoreNetworksRequest, PendingIntent pendingIntent) {
        new Object[1][0] = scoreNetworksRequest;
        int i = eoa.f15378a;
        this.f72179b.mo16659a(this.f72178a, new akla(rnt, scoreNetworksRequest, pendingIntent));
    }
}
