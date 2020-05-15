package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: bfsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfsx extends bfst {

    /* renamed from: a */
    final /* synthetic */ bfta f115167a;

    public bfsx(bfta bfta) {
        this.f115167a = bfta;
    }

    /* renamed from: a */
    public final void mo62219a(ActivityRecognitionResult activityRecognitionResult) {
        this.f115167a.mo62227b(activityRecognitionResult);
    }

    /* renamed from: a */
    public final void mo62220a(List list) {
        bfta bfta;
        bfst bfst;
        if (this.f115167a.mo62229b(list)) {
            bfta = this.f115167a;
            bfst = bfta.f115169a;
        } else {
            bfta = this.f115167a;
            if (bfta.f115176h != null) {
                bfst = bfta.f115171c;
            } else {
                return;
            }
        }
        bfta.mo62225a(bfst);
    }

    /* renamed from: a */
    public final void mo62221a(boolean z, String str) {
        this.f115167a.mo62228b(z, str);
        bfta bfta = this.f115167a;
        if (!bfta.f115174f) {
            bfta.mo62225a(bfta.f115169a);
        }
    }
}
