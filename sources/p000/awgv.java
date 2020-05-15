package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.wallet.common.p079ui.PopoverView;

/* renamed from: awgv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgv extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ PopoverView f94318a;

    public awgv(PopoverView popoverView) {
        this.f94318a = popoverView;
    }

    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        float f = this.f94318a.f110111q;
        outline.setRoundRect(0, 0, width, height + ((int) f) + 1, f);
    }
}
