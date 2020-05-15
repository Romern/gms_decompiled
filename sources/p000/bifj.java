package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bifj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifj implements bieq {

    /* renamed from: a */
    private final PlaceReport f120448a;

    /* renamed from: b */
    private final aenr f120449b;

    public bifj(PlaceReport placeReport, aenr aenr) {
        sdo.m34959a(placeReport);
        sdo.m34959a(aenr);
        this.f120448a = placeReport;
        this.f120449b = aenr;
    }

    /* renamed from: a */
    private final void m102247a(int i, String str) {
        bioc.m102645a(i, str, this.f120449b);
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo64573b() {
        return 1;
    }

    /* renamed from: c */
    public final String mo64574c() {
        return "";
    }

    /* renamed from: d */
    public final boolean mo64575d() {
        return false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        char c;
        PlaceReport placeReport = this.f120448a;
        bpqk c2 = bhqq.m101365c(3, placesParams);
        bxvd bxvd = (bxvd) c2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) c2);
        bxvd da = bppr.f138652d.mo74144da();
        String str = placeReport.f79488c;
        int i = 2;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppr bppr = (bppr) da.f164949b;
            str.getClass();
            bppr.f138654a |= 2;
            bppr.f138655b = str;
        }
        String str2 = placeReport.f79489d;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1436706272:
                    if (str2.equals("inferredGeofencing")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1194968642:
                    if (str2.equals("userReported")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -262743844:
                    if (str2.equals("inferredReverseGeocoding")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1287171955:
                    if (str2.equals("inferredRadioSignals")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                i = c != 1 ? c != 2 ? c != 3 ? 1 : 36 : 35 : 34;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppr bppr2 = (bppr) da.f164949b;
            bppr2.f138656c = i - 1;
            bppr2.f138654a |= 4;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bppr bppr3 = (bppr) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bppr3.getClass();
        bpqk.f138743j = bppr3;
        bpqk.f138734a |= 128;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        m102247a(0, aemj.m52156a(0));
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102247a(status.f30115i, status.f30116j);
    }
}
