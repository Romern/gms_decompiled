package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.ReadStatsRequest;
import com.google.android.gms.fitness.result.DataSourceStatsResult;
import com.google.android.gms.fitness.result.DataStatsResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: zmx */
final /* synthetic */ class zmx implements Runnable {

    /* renamed from: a */
    private final zne f55510a;

    /* renamed from: b */
    private final ReadStatsRequest f55511b;

    /* renamed from: c */
    private final zcg f55512c;

    public zmx(zne zne, ReadStatsRequest readStatsRequest, zcg zcg) {
        this.f55510a = zne;
        this.f55511b = readStatsRequest;
        this.f55512c = zcg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public final void run() {
        DataStatsResult dataStatsResult;
        zne zne = this.f55510a;
        ReadStatsRequest readStatsRequest = this.f55511b;
        zcg zcg = this.f55512c;
        znj znj = zne.f55537g;
        Context context = zne.f55428a;
        String str = zne.f55429b;
        try {
            ArrayList<DataSourceStatsResult> arrayList = new ArrayList();
            List list = readStatsRequest.f32272b;
            if (list != null) {
                bnre i = yvx.m44924a(list).listIterator();
                while (i.hasNext()) {
                    caae caae = (caae) i.next();
                    ygw ygw = (ygw) znj.f55555e.f55732a.mo31389i().get(caae);
                    if (ygw != null) {
                        arrayList.add(znj.m45803a(caae, ygw));
                    }
                }
            } else {
                bnrd a = znj.f55555e.mo31335a(true).entrySet().iterator();
                while (a.hasNext()) {
                    Map.Entry entry = (Map.Entry) a.next();
                    caae caae2 = (caae) entry.getKey();
                    ygw ygw2 = (ygw) entry.getValue();
                    long b = ygw2.mo30469b();
                    caaq caaq = caae2.f172331g;
                    if (caaq == null) {
                        caaq = caaq.f172356h;
                    }
                    int i2 = caaq.f172358a & 1;
                    String a2 = yyd.m44986a(caae2);
                    boolean equals = "detected_sports_session".equals(caae2.f172328d);
                    if ((caae2.f172325a & 64) == 0 || "com.google.android.gms".equals(a2) || "com.google.android.apps.fitness".equals(a2)) {
                        if (i2 != 0 && b == 0 && !equals) {
                        }
                    }
                    arrayList.add(znj.m45803a(caae2, ygw2));
                }
            }
            if (readStatsRequest.f32271a >= 4) {
                if (cdyu.f181962a.mo6606a().mo78516t()) {
                    Status status = znj.f55552b;
                    long b2 = zuw.m46536b(context, str);
                    String str2 = zvn.m46574a(context).f172359b;
                    long a3 = zuw.m46534a(context, str);
                    List emptyList = Collections.emptyList();
                    rtu d = rts.m34440d();
                    for (DataSourceStatsResult dataSourceStatsResult : arrayList) {
                        rts.m34439a(d, dataSourceStatsResult);
                    }
                    dataStatsResult = new DataStatsResult(status, emptyList, b2, str2, a3, d.mo25163a(status.f30115i));
                    zcg.mo30930a(dataStatsResult);
                    if (zne.m45787a(zcg.f12819a)) {
                        return;
                    }
                    dataStatsResult.close();
                }
            }
            dataStatsResult = DataStatsResult.m23719a(znj.f55552b, arrayList, zuw.m46536b(context, str), zvn.m46574a(context).f172359b, zuw.m46534a(context, str));
        } catch (IOException e) {
            dataStatsResult = DataStatsResult.m23718a(new Status(5008));
        }
        try {
            zcg.mo30930a(dataStatsResult);
            if (zne.m45787a(zcg.f12819a)) {
            }
        } catch (RemoteException e2) {
            RemoteException remoteException = e2;
            bnsl bnsl = (bnsl) zne.f55533d.mo68387b();
            bnsl.mo68437a(remoteException);
            bnsl.mo68405a("Failed to deliver stats to client");
            if (zne.m45787a(zcg.f12819a)) {
                return;
            }
        } catch (Throwable th) {
            if (!zne.m45787a(zcg.f12819a)) {
                dataStatsResult.close();
            }
            throw th;
        }
        dataStatsResult.close();
    }
}
