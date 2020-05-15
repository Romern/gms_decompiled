package p000;

import com.google.android.gms.location.reporting.ReportingState;
import java.util.ArrayList;

/* renamed from: avcf */
final /* synthetic */ class avcf implements auca {

    /* renamed from: a */
    static final auca f92957a = new avcf();

    private avcf() {
    }

    /* renamed from: a */
    public final aucb mo13157a(Object obj) {
        boolean z;
        ReportingState reportingState = (ReportingState) obj;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        if (reportingState == null) {
            bxvd da = bxrq.f164586f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxrq bxrq = (bxrq) da.f164949b;
            bxrq.f164590c = 2;
            int i = bxrq.f164588a | 2;
            bxrq.f164588a = i;
            bxrq.f164588a = i | 1;
            bxrq.f164589b = 15;
            arrayList.add((bxrq) da.mo74062i());
            bxvd da2 = bxrq.f164586f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxrq bxrq2 = (bxrq) da2.f164949b;
            bxrq2.f164590c = 2;
            int i2 = bxrq2.f164588a | 2;
            bxrq2.f164588a = i2;
            bxrq2.f164588a = 1 | i2;
            bxrq2.f164589b = 2;
            arrayList.add((bxrq) da2.mo74062i());
        } else {
            if (!reportingState.f79600a || !reportingState.mo43734e()) {
                z = false;
            } else {
                z = true;
            }
            if (!reportingState.mo43732c() && !reportingState.mo43734e()) {
                z2 = false;
            }
            arrayList.add(avch.m78249a(bxsl.LOCATION_REPORTING, aepw.m52375a(reportingState.mo43730a()), z, z2));
            arrayList.add(avch.m78249a(bxsl.LOCATION_HISTORY, aepw.m52375a(reportingState.mo43731b()), z, z2));
        }
        return aucu.m76778a((Object) arrayList);
    }
}
