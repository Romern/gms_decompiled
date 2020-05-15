package p000;

import android.content.Context;
import android.graphics.PointF;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* renamed from: bjbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbz extends aci {

    /* renamed from: m */
    final /* synthetic */ SpannedGridLayoutManager f122496m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bjbz(SpannedGridLayoutManager spannedGridLayoutManager, Context context) {
        super(context);
        this.f122496m = spannedGridLayoutManager;
    }

    /* renamed from: a */
    public final PointF mo299a(int i) {
        return new PointF(0.0f, (float) (this.f122496m.f151569a.mo64990b(i) - this.f122496m.f151574f));
    }
}
