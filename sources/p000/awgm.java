package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.wallet.common.p079ui.BottomSheetView;

/* renamed from: awgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgm extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ int f94308a;

    /* renamed from: b */
    final /* synthetic */ BottomSheetView f94309b;

    public awgm(BottomSheetView bottomSheetView, int i) {
        this.f94309b = bottomSheetView;
        this.f94308a = i;
    }

    public final void getOutline(View view, Outline outline) {
        int top = this.f94309b.f110051g.getTop();
        int width = view.getWidth();
        int height = view.getHeight();
        int i = this.f94308a;
        outline.setRoundRect(0, top, width, height + i + 1, (float) i);
    }
}
