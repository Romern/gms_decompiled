package p000;

import android.widget.RatingBar;

/* renamed from: aauo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aauo implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ aauq f56614a;

    public aauo(aauq aauq) {
        this.f56614a = aauq;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        aave aave = this.f56614a.f56617b;
        if (aave != null) {
            aave.mo31824a();
        }
        this.f56614a.mo31809a((int) f);
    }
}
