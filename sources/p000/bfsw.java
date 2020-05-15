package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: bfsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfsw extends bfst {

    /* renamed from: a */
    final /* synthetic */ bfta f115166a;

    public bfsw(bfta bfta) {
        this.f115166a = bfta;
    }

    /* renamed from: a */
    public final void mo62219a(ActivityRecognitionResult activityRecognitionResult) {
        bfst bfst;
        int a = activityRecognitionResult.mo43491a().mo43513a();
        if (a == 2 || a == 3) {
            bfta bfta = this.f115166a;
            if (!bfta.f115174f) {
                bfst = bfta.f115169a;
            } else {
                bfst = bfta.f115170b;
            }
            bfta.mo62225a(bfst);
        }
    }

    /* renamed from: a */
    public final void mo62220a(List list) {
        if (this.f115166a.mo62229b(list)) {
            bfta bfta = this.f115166a;
            if (bfta.f115174f) {
                bfta.mo62225a(bfta.f115169a);
            }
        }
    }

    /* renamed from: a */
    public final void mo62221a(boolean z, String str) {
        this.f115166a.mo62228b(z, str);
    }
}
