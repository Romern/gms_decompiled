package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: bfsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfsy extends bfst {

    /* renamed from: a */
    final /* synthetic */ bfta f115168a;

    public bfsy(bfta bfta) {
        this.f115168a = bfta;
    }

    /* renamed from: a */
    public final void mo62218a() {
        bfta bfta = this.f115168a;
        bfsz bfsz = bfta.f115173e;
        if (bfsz != null) {
            String str = bfta.f115175g;
            bftc bftc = (bftc) bfsz;
            if (!bftc.f115186b && cesn.m138189d()) {
                bftc.f115186b = true;
                bfpj bfpj = bftc.f115185a;
                bfpj.mo26010a(34, bfpj.f114793m.mo62094a(str));
                if (((bfsm) bfsz).mo62065f()) {
                    bftc.mo62230b(false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62220a(List list) {
        if (this.f115168a.mo62229b(list)) {
            bfta bfta = this.f115168a;
            bfta.mo62225a(bfta.f115169a);
        }
    }

    /* renamed from: b */
    public final void mo62222b() {
        bfsz bfsz = this.f115168a.f115173e;
        if (bfsz != null) {
            bftc bftc = (bftc) bfsz;
            if (bftc.f115186b) {
                bftc.f115186b = false;
                bftc.f115185a.mo26009a(35);
                if (((bfsm) bfsz).mo62065f()) {
                    bftc.mo62230b(false);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo62223c() {
        bfta bfta = this.f115168a;
        bfta.f115176h = null;
        bfta.mo62225a(bfta.f115170b);
    }

    /* renamed from: a */
    public final void mo62219a(ActivityRecognitionResult activityRecognitionResult) {
        this.f115168a.mo62227b(activityRecognitionResult);
    }

    /* renamed from: a */
    public final void mo62221a(boolean z, String str) {
        this.f115168a.mo62228b(z, str);
        bfta bfta = this.f115168a;
        bfta.mo62225a(!bfta.f115174f ? bfta.f115169a : bfta.f115170b);
    }
}
