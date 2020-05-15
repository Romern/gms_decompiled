package p000;

import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;

/* renamed from: avcg */
final /* synthetic */ class avcg implements auca {

    /* renamed from: a */
    private final avch f92958a;

    /* renamed from: b */
    private final String f92959b;

    public avcg(avch avch, String str) {
        this.f92958a = avch;
        this.f92959b = str;
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        OptInRequest optInRequest;
        avch avch = this.f92958a;
        String str = this.f92959b;
        ReportingState reportingState = (ReportingState) obj;
        if (reportingState == null) {
            return aucu.m76777a((Exception) new IllegalStateException("Reporting API returned no state"));
        }
        if (aepw.m52375a(reportingState.mo43731b()) && aepw.m52375a(reportingState.mo43730a())) {
            return aucu.m76778a((Object) null);
        }
        if (!reportingState.f79600a || !reportingState.mo43734e()) {
            return aucu.m76777a((Exception) new IllegalStateException("The user is not eligible for enabling LH / LR"));
        }
        if (chbl.f188299a.mo6606a().mo84968a()) {
            aept a = OptInRequest.m66974a(avch.f92961a);
            a.f63615c = str;
            optInRequest = a.mo34445a();
        } else {
            optInRequest = OptInRequest.m66974a(avch.f92961a).mo34445a();
        }
        return avch.f92962b.mo24686a(optInRequest);
    }
}
