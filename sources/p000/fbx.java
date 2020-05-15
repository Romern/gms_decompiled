package p000;

import android.view.View;

/* renamed from: fbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fbx implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f16239a;

    /* renamed from: b */
    final /* synthetic */ fby f16240b;

    public fbx(fby fby, View view) {
        this.f16240b = fby;
        this.f16239a = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 != i4 && i3 != i) {
            this.f16239a.removeOnLayoutChangeListener(this);
            if (this.f16240b.isResumed()) {
                this.f16239a.postDelayed(new fbw(this), 0);
            }
        }
    }
}
