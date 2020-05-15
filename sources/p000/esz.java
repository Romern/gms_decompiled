package p000;

import android.os.Looper;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* renamed from: esz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class esz implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ HorizontalScrollView f15660a;

    /* renamed from: b */
    final /* synthetic */ LinearLayout f15661b;

    /* renamed from: c */
    final /* synthetic */ eta f15662c;

    public esz(eta eta, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.f15662c = eta;
        this.f15660a = horizontalScrollView;
        this.f15661b = linearLayout;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f15660a.removeOnLayoutChangeListener(this);
        new adzt(Looper.getMainLooper()).post(new esy(this, this.f15660a, this.f15661b));
    }
}
