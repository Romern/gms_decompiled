package p000;

import android.graphics.drawable.Drawable;
import com.google.android.gms.wallet.p088ui.common.ProgressSpinnerView;

/* renamed from: awzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzl extends auh {

    /* renamed from: b */
    final /* synthetic */ ProgressSpinnerView f95428b;

    public awzl(ProgressSpinnerView progressSpinnerView) {
        this.f95428b = progressSpinnerView;
    }

    /* renamed from: a */
    public final void mo2525a(Drawable drawable) {
        ProgressSpinnerView progressSpinnerView = this.f95428b;
        progressSpinnerView.f110476g.post(new awzm(progressSpinnerView));
    }
}
