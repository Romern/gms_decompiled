package p000;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.NetworkQualityReport;

/* renamed from: abmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmn extends abmj implements aaai {

    /* renamed from: a */
    private final String f57698a;

    /* renamed from: b */
    private final aaag f57699b;

    public abmn(String str, aaag aaag) {
        this.f57698a = str;
        this.f57699b = aaag;
    }

    /* renamed from: a */
    public final void mo32213a(abmh abmh) {
        if (Binder.getCallingUid() == Process.myUid()) {
            Status status = Status.f30109c;
            Parcel bj = abmh.mo8529bj();
            dcl.m8165a(bj, status);
            dcl.m8165a(bj, (Parcelable) null);
            abmh.mo8530c(2, bj);
            return;
        }
        throw new SecurityException("Access denied");
    }

    /* renamed from: a */
    public final void mo32214a(NetworkQualityReport networkQualityReport) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!abme.m47898a()) {
            int i = eoa.f15378a;
            abnd.m47943a("DISABLED_LIGHTWEIGHT_SKIPPED");
            return;
        }
        long j = networkQualityReport.f79054f.getLong("report_realtime_ts_millis");
        if (j > 0) {
            networkQualityReport.f79054f.remove("report_realtime_ts_millis");
            long j2 = elapsedRealtime - j;
            aylp a = abnd.m47941a();
            ((beoj) a.f97902d.mo6606a()).mo60852a((double) j2, this.f57698a);
            long j3 = networkQualityReport.f79054f.getLong("report_uptime_ts_millis");
            if (j3 > 0) {
                networkQualityReport.f79054f.remove("report_uptime_ts_millis");
                ((beoj) a.f97903e.mo6606a()).mo60852a((double) (j2 - (uptimeMillis - j3)), this.f57698a);
            }
        }
        Object[] objArr = {this.f57698a, networkQualityReport.toString()};
        int i2 = eoa.f15378a;
        abne a2 = abne.m47947a("LIGHTWEIGHT_SERVICE_DISPATCH_LATENCY");
        try {
            this.f57699b.mo16658a(new abmo(this.f57698a, networkQualityReport));
            a2.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
