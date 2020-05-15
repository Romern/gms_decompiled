package p000;

import android.graphics.Canvas;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import java.util.Calendar;

/* renamed from: bhgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhgv extends abr {

    /* renamed from: a */
    final /* synthetic */ bhhb f118627a;

    /* renamed from: b */
    private final Calendar f118628b = bhhv.m100907c();

    /* renamed from: c */
    private final Calendar f118629c = bhhv.m100907c();

    public bhgv(bhhb bhhb) {
        this.f118627a = bhhb;
    }

    /* renamed from: a */
    public final void mo210a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        if ((recyclerView.getAdapter() instanceof bhhy) && (recyclerView.getLayoutManager() instanceof aab)) {
            bhhy bhhy = (bhhy) recyclerView.getAdapter();
            aab aab = (aab) recyclerView.getLayoutManager();
            for (C1240of ofVar : this.f118627a.f118641a.mo71134d()) {
                Object obj = ofVar.f26798a;
                if (!(obj == null || ofVar.f26799b == null)) {
                    this.f118628b.setTimeInMillis(((Long) obj).longValue());
                    this.f118629c.setTimeInMillis(((Long) ofVar.f26799b).longValue());
                    int f = bhhy.mo63776f(this.f118628b.get(1));
                    int f2 = bhhy.mo63776f(this.f118629c.get(1));
                    View c = aab.mo66c(f);
                    View c2 = aab.mo66c(f2);
                    int i2 = aab.f4b;
                    int i3 = f / i2;
                    int i4 = f2 / i2;
                    int i5 = i3;
                    while (i5 <= i4) {
                        View c3 = aab.mo66c(aab.f4b * i5);
                        if (c3 != null) {
                            int top = c3.getTop() + this.f118627a.f118639Y.f118614d.mo63738a();
                            int bottom = c3.getBottom() - this.f118627a.f118639Y.f118614d.mo63740b();
                            if (i5 == i3) {
                                i = c.getLeft() + (c.getWidth() / 2);
                            } else {
                                i = 0;
                            }
                            canvas.drawRect((float) i, (float) top, (float) (i5 == i4 ? c2.getLeft() + (c2.getWidth() / 2) : recyclerView.getWidth()), (float) bottom, this.f118627a.f118639Y.f118618h);
                        }
                        i5++;
                    }
                }
            }
        }
    }
}
