package p000;

import android.os.Looper;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* renamed from: etz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class etz implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ HorizontalScrollView f15697a;

    /* renamed from: b */
    final /* synthetic */ LinearLayout f15698b;

    /* renamed from: c */
    final /* synthetic */ eua f15699c;

    public etz(eua eua, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.f15699c = eua;
        this.f15697a = horizontalScrollView;
        this.f15698b = linearLayout;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f15697a.removeOnLayoutChangeListener(this);
        new adzt(Looper.getMainLooper()).post(new ety(this, this.f15697a, this.f15698b));
    }
}
