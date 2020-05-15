package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.NetworkQualityReport;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmp extends afzb implements aaai {

    /* renamed from: a */
    private abmc f57705a;

    /* renamed from: b */
    private final Context f57706b;

    public abmp(Context context) {
        this.f57705a = ablz.m47892a(context);
        this.f57706b = context;
    }

    /* renamed from: a */
    public final void mo32215a(abmf abmf) {
        abnd.m47943a("NQLOOKUP_LAMEDUCK_GET_ACTIVE_NETWORK_QUALITY");
        Status status = Status.f30107a;
        Parcel bj = abmf.mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, (Parcelable) null);
        abmf.mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo32216a(abmg abmg) {
        abnd.m47943a("NQLOOKUP_LAMEDUCK_GET_CONNECTED_NETWORKS_QUALITY");
        Status status = Status.f30107a;
        Parcel bj = abmg.mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(null);
        abmg.mo8530c(2, bj);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo32217a(String str, Bundle bundle, Bundle bundle2) {
        abne a = abne.m47947a("CLASSIC_SERVICE_LATENCY");
        try {
            if (abme.m47898a()) {
                eoa.m10826b("Herrevad", "Shim enabled. Forwarding request to Lightweight Service", new Object[0]);
                NetworkQualityReport networkQualityReport = new NetworkQualityReport();
                if (bundle2 != null) {
                    networkQualityReport.f79054f = bundle2;
                }
                if (bundle.containsKey("latency_micros")) {
                    networkQualityReport.f79049a = bundle.getInt("latency_micros");
                }
                if (bundle.containsKey("latency_bps")) {
                    networkQualityReport.f79054f.putLong("latency_bps", bundle.getLong("latency_bps"));
                }
                networkQualityReport.mo43386a("overriding_package", str);
                networkQualityReport.mo43386a("lightweight_shim", "");
                if (this.f57705a == null) {
                    this.f57705a = ablz.m47892a(this.f57706b);
                }
                aucb a2 = this.f57705a.mo32210a(networkQualityReport);
                if (cekz.m137121d() > 0) {
                    aucu.m76783a(a2, cekz.m137121d(), TimeUnit.MILLISECONDS);
                }
                abnd.m47943a("CLASSIC_API_LIGHTWEIGHT_SHIM");
            } else {
                int i = eoa.f15378a;
                abnd.m47943a("DISABLED_CLASSIC_SKIPPED");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            eoa.m10825a("Herrevad", e, "Could not shim classic API", new Object[0]);
            abnd.m47943a("CLASSIC_API_LIGHTWEIGHT_SHIM_TIMEOUT");
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
        a.close();
    }
}
