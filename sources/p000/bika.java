package p000;

import android.graphics.Point;
import android.widget.FrameLayout;

/* renamed from: bika */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bika implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bikf f120764a;

    public bika(bikf bikf) {
        this.f120764a = bikf;
    }

    public final void run() {
        biht biht = this.f120764a.f120771c;
        int width = biht.getView().getWidth();
        int height = this.f120764a.f120771c.getView().getHeight();
        if (!biht.f120635w) {
            biht.f120635w = true;
            biht.f120626n = width;
            biht.f120627o = height;
            biht.f120617e.mo43844a(new bihn(biht));
            ((FrameLayout.LayoutParams) biht.f120619g.getLayoutParams()).setMargins(0, 0, 0, biix.m102462a(18.0f, biht.getActivity()));
            ((FrameLayout.LayoutParams) biht.f120620h.getLayoutParams()).setMargins(0, 0, 0, 0);
            ((FrameLayout.LayoutParams) biht.f120621i.getLayoutParams()).setMargins(0, 0, 0, 0);
            if (biht.f120622j != null) {
                biht.mo64625h();
            }
            biht.f120625m = new Point(biht.f120626n / 2, biht.f120627o / 2);
            biht.mo64626i();
        }
    }
}
