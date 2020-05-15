package p000;

import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atoh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TapUiChimeraActivity f90588a;

    public atoh(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90588a = tapUiChimeraActivity;
    }

    public final void run() {
        rjx b = rjx.m33697b((Activity) this.f90588a);
        long j = TapUiChimeraActivity.f108688e;
        rkb rkb = b.f43165D;
        rkb.mo24787a((rle) new asxc(rkb, j));
        TapUiChimeraActivity tapUiChimeraActivity = this.f90588a;
        tapUiChimeraActivity.f108693D.postDelayed(tapUiChimeraActivity.f108715g, TapUiChimeraActivity.f108687d);
    }
}
