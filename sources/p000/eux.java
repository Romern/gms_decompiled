package p000;

import android.os.Looper;
import android.view.View;

/* renamed from: eux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eux implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ euy f15793a;

    public eux(euy euy) {
        this.f15793a = euy;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f15793a.f15797s.removeOnLayoutChangeListener(this);
        int max = Math.max(i3 - i, i - i3);
        euy euy = this.f15793a;
        if (max > euy.f15799u) {
            euy.f15798t.setClipChildren(true);
            new adzt(Looper.getMainLooper()).post(new euw(this, max));
        }
    }
}
