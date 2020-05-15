package p000;

import android.os.Looper;
import android.view.View;

/* renamed from: eut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eut implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ euu f15783a;

    public eut(euu euu) {
        this.f15783a = euu;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f15783a.f15784s.removeOnLayoutChangeListener(this);
        new adzt(Looper.getMainLooper()).post(new eus(this, Math.abs(i3 - i)));
    }
}
