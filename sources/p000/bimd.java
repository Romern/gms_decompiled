package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import com.google.android.places.p095ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: bimd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimd extends aco {

    /* renamed from: d */
    final /* synthetic */ bime f120883d;

    /* renamed from: e */
    private final RecyclerView f120884e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bimd(bime bime, RecyclerView recyclerView) {
        super(recyclerView);
        this.f120883d = bime;
        this.f120884e = recyclerView;
    }

    /* renamed from: a */
    public final boolean mo346a(View view, int i, Bundle bundle) {
        ExpandingScrollView expandingScrollView = this.f120883d.f120887c;
        int b = expandingScrollView.mo71328b(expandingScrollView.f151442c);
        if (this.f120883d.f120887c.f151442c == binq.f121029d) {
            b -= this.f120883d.f120889e.getHeight();
        }
        if (i == 4096) {
            if (C1280ps.m19901a(view, 1)) {
                this.f120884e.scrollBy(0, b);
            }
            return true;
        } else if (i != 8192) {
            return super.mo346a(view, i, bundle);
        } else {
            if (C1280ps.m19901a(view, -1)) {
                this.f120884e.scrollBy(0, -b);
            }
            return true;
        }
    }
}
