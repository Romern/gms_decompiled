package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.wallet.common.p079ui.PopoverView;

/* renamed from: awgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgu extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ PopoverView f94317a;

    public awgu(PopoverView popoverView) {
        this.f94317a = popoverView;
    }

    public final void getOutline(View view, Outline outline) {
        int top = this.f94317a.f110096b.getTop();
        int width = view.getWidth();
        int height = view.getHeight();
        float f = this.f94317a.f110111q;
        outline.setRoundRect(0, top, width, height + ((int) f) + 1, f);
    }
}
