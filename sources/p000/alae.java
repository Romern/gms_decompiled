package p000;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: alae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alae implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f73203a;

    /* renamed from: b */
    final /* synthetic */ PopupWindow f73204b;

    /* renamed from: c */
    final /* synthetic */ boolean f73205c;

    /* renamed from: d */
    final /* synthetic */ View f73206d;

    public alae(View view, PopupWindow popupWindow, boolean z, View view2) {
        this.f73203a = view;
        this.f73204b = popupWindow;
        this.f73205c = z;
        this.f73206d = view2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        this.f73203a.removeOnLayoutChangeListener(this);
        this.f73204b.dismiss();
        this.f73203a.setVisibility(0);
        int i10 = -this.f73203a.getWidth();
        if (this.f73205c) {
            i10 = this.f73206d.getWidth();
            i9 = 8388613;
        } else {
            i9 = 8388611;
        }
        this.f73204b.showAsDropDown(this.f73206d, i10, 0, i9 | 80);
    }
}
