package p000;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: tup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tup implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f46688a;

    /* renamed from: b */
    final /* synthetic */ PopupWindow f46689b;

    /* renamed from: c */
    final /* synthetic */ boolean f46690c;

    /* renamed from: d */
    final /* synthetic */ View f46691d;

    public tup(View view, PopupWindow popupWindow, boolean z, View view2) {
        this.f46688a = view;
        this.f46689b = popupWindow;
        this.f46690c = z;
        this.f46691d = view2;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        this.f46688a.removeOnLayoutChangeListener(this);
        this.f46689b.dismiss();
        this.f46688a.setVisibility(0);
        int i10 = -this.f46688a.getWidth();
        if (this.f46690c) {
            i10 = this.f46691d.getWidth();
            i9 = 8388613;
        } else {
            i9 = 8388611;
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f46689b.showAsDropDown(this.f46691d, i10, 0, i9 | 80);
    }
}
