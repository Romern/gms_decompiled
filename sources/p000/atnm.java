package p000;

import android.content.Intent;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atnm */
public final /* synthetic */ class atnm implements Runnable {

    /* renamed from: a */
    private final TapUiChimeraActivity f90560a;

    public atnm(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90560a = tapUiChimeraActivity;
    }

    public final void run() {
        TapUiChimeraActivity tapUiChimeraActivity = this.f90560a;
        Intent intent = new Intent(tapUiChimeraActivity.f108696G.f108444c);
        intent.putExtra("transit_tap_failure_reason_extra", tapUiChimeraActivity.f108695F);
        if (atxn.m76506a(tapUiChimeraActivity, intent)) {
            tapUiChimeraActivity.startActivity(intent);
        }
        tapUiChimeraActivity.finish();
    }
}
