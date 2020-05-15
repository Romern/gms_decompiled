package p000;

import android.view.View;
import com.google.android.gms.wallet.common.p079ui.BottomSheetView;

/* renamed from: awgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgn extends bhfj {

    /* renamed from: a */
    final /* synthetic */ BottomSheetView f94310a;

    public awgn(BottomSheetView bottomSheetView) {
        this.f94310a = bottomSheetView;
    }

    /* renamed from: a */
    public final void mo12434a(int i) {
        awgr awgr;
        if (i == 3) {
            this.f94310a.mo59840b();
        } else if (i == 5 && (awgr = this.f94310a.f110055k) != null) {
            awgr.mo52134t();
        }
    }

    /* renamed from: a */
    public final void mo12435a(View view, float f) {
        BottomSheetView bottomSheetView = this.f94310a;
        if (!bottomSheetView.f110048d) {
            if (f >= 0.8f) {
                bottomSheetView.mo59838a();
            } else if (f <= -0.9f) {
                bottomSheetView.f110053i.mo71037c(5);
            }
            this.f94310a.mo59842c();
        }
    }
}
