package p000;

import com.google.android.gms.tapandpay.firstparty.ValuableInfo;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atnh */
public final /* synthetic */ class atnh implements Runnable {

    /* renamed from: a */
    private final TapUiChimeraActivity f90554a;

    public atnh(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90554a = tapUiChimeraActivity;
    }

    public final void run() {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90554a;
        boolean z = true;
        if (!tapUiChimeraActivity.f108690A && !tapUiChimeraActivity.f108692C) {
            z = false;
        }
        sdo.m34970a(z);
        if (tapUiChimeraActivity.f108690A) {
            tapUiChimeraActivity.f108690A = false;
            tapUiChimeraActivity.f108733z = null;
            tapUiChimeraActivity.f108726s.removeViewAt(tapUiChimeraActivity.f108691B.length);
        }
        if (tapUiChimeraActivity.f108692C) {
            tapUiChimeraActivity.f108726s.removeViews(0, tapUiChimeraActivity.f108691B.length);
            tapUiChimeraActivity.f108691B = new ValuableInfo[0];
            tapUiChimeraActivity.f108692C = false;
        }
        for (int childCount = tapUiChimeraActivity.f108726s.getChildCount() - 1; childCount >= 0; childCount--) {
            tapUiChimeraActivity.f108726s.getChildAt(childCount).setVisibility(0);
        }
        tapUiChimeraActivity.mo59414a(tapUiChimeraActivity.f108698I, 0);
    }
}
