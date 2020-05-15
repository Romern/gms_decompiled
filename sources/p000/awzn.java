package p000;

import android.os.Build;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;

/* renamed from: awzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awzn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ProgressSpinnerView f95430a;

    public awzn(ProgressSpinnerView progressSpinnerView) {
        this.f95430a = progressSpinnerView;
    }

    public final void run() {
        int i = Build.VERSION.SDK_INT;
        this.f95430a.f110477h.start();
    }
}
