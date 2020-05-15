package p000;

import android.view.View;

/* renamed from: bjam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjam implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View.OnClickListener f122431a;

    /* renamed from: b */
    final /* synthetic */ bjas f122432b;

    public bjam(bjas bjas, View.OnClickListener onClickListener) {
        this.f122432b = bjas;
        this.f122431a = onClickListener;
    }

    public void onClick(View view) {
        bjas bjas = this.f122432b;
        if (!bjas.f122439a) {
            View.OnClickListener onClickListener = this.f122431a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        bjas.f122440b.mo64944b();
    }
}
