package p000;

import android.graphics.drawable.Drawable;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;

/* renamed from: awzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzo extends auh {

    /* renamed from: b */
    final /* synthetic */ ProgressSpinnerView f95431b;

    public awzo(ProgressSpinnerView progressSpinnerView) {
        this.f95431b = progressSpinnerView;
    }

    /* renamed from: a */
    public final void mo2525a(Drawable drawable) {
        ProgressSpinnerView progressSpinnerView = this.f95431b;
        progressSpinnerView.f110476g.post(new awzn(progressSpinnerView));
    }
}
