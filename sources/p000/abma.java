package p000;

import android.os.RemoteException;
import com.google.android.gms.herrevad.NetworkQualityReport;

/* renamed from: abma */
final /* synthetic */ class abma implements roo {

    /* renamed from: a */
    private final NetworkQualityReport f57692a;

    public abma(NetworkQualityReport networkQualityReport) {
        this.f57692a = networkQualityReport;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        NetworkQualityReport networkQualityReport = this.f57692a;
        abml abml = (abml) obj;
        int i = abmc.f57693a;
        try {
            ((abmk) abml.mo25289B()).mo32214a(networkQualityReport);
            ((aucf) obj2).mo50391a((Object) null);
        } catch (RemoteException e) {
            ((aucf) obj2).mo50392b((Exception) e);
        }
    }
}
