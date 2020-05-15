package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: afw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afw extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ afx f481a;

    public afw(afx afx) {
        this.f481a = afx;
    }

    public final void getOutline(View view, Outline outline) {
        afx afx = this.f481a;
        int i = afx.f482f;
        int i2 = afx.f487d;
        outline.setOval(0, 0, i2, i2);
    }
}
