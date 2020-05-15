package p000;

import android.view.View;
import android.widget.ImageView;

/* renamed from: atxc */
final /* synthetic */ class atxc implements View.OnLayoutChangeListener {

    /* renamed from: a */
    private final atxg f91070a;

    public atxc(atxg atxg) {
        this.f91070a = atxg;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        atxg atxg = this.f91070a;
        ImageView imageView = atxg.f91074a;
        if (!atxg.f91075b.canScrollVertically(1)) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        imageView.setVisibility(i9);
    }
}
