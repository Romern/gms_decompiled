package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.CheckInReport;
import java.util.concurrent.Callable;

/* renamed from: bidu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidu implements Callable {

    /* renamed from: a */
    final /* synthetic */ bidv f120323a;

    /* renamed from: b */
    private final PlacesParams f120324b;

    /* renamed from: c */
    private final CheckInReport f120325c;

    public bidu(bidv bidv, CheckInReport checkInReport, PlacesParams placesParams) {
        this.f120323a = bidv;
        this.f120324b = placesParams;
        this.f120325c = checkInReport;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bhqy bhqy = this.f120323a.f120336k;
        String str = this.f120324b.f79574d;
        CheckInReport checkInReport = this.f120325c;
        long j = checkInReport.f109553a;
        String str2 = checkInReport.f109554b;
        bhub a = bjdk.m103238a(checkInReport.f109555c);
        if (str != null) {
            bhro bhro = (bhro) ((bhsi) bhqy).f119448c.get(str);
            if (bhro == null) {
                bhuj.m101555a();
            } else {
                bhro.mo64191a(j, str2, a);
            }
        } else {
            bhuj.m101555a().mo64361c("Tried to report check-in with null accountName.");
        }
        return Status.f30107a;
    }
}
