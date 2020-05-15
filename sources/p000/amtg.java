package p000;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: amtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amtg implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ amti f75895a;

    public amtg(amti amti) {
        this.f75895a = amti;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.LayoutParams layoutParams = this.f75895a.f75900d.getLayoutParams();
        layoutParams.height = this.f75895a.f75900d.getHeight();
        layoutParams.width = this.f75895a.f75900d.getWidth();
        this.f75895a.f75900d.setLayoutParams(layoutParams);
        this.f75895a.f75900d.removeOnLayoutChangeListener(this);
    }
}
