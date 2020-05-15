package p000;

import android.view.View;
import android.widget.ImageView;

/* renamed from: bheu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bheu implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ bhev f118414a;

    public bheu(bhev bhev) {
        this.f118414a = bhev;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f118414a.f118416a.getVisibility() == 0) {
            bhev bhev = this.f118414a;
            ImageView imageView = bhev.f118416a;
            if (bhev.mo63638c()) {
                bhem bhem = bhev.f118419d;
                bhev.mo63631a(imageView);
                bhen.m100726b(bhem, imageView);
            }
        }
    }
}
