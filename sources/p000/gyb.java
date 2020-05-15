package p000;

import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: gyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gyb implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ gyc f19209a;

    public gyb(gyc gyc) {
        this.f19209a = gyc;
    }

    public final void onGlobalLayout() {
        int i;
        this.f19209a.f19213d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        List list = (List) this.f19209a.f19211b.f19332u.mo2448b();
        if (list != null) {
            if (list.size() < 3) {
                i = this.f19209a.f19213d.getBottom();
            } else {
                acm findViewHolderForLayoutPosition = this.f19209a.f19213d.findViewHolderForLayoutPosition(2);
                if (findViewHolderForLayoutPosition != null) {
                    i = this.f19209a.f19213d.getTop() + ((findViewHolderForLayoutPosition.f201a.getBottom() + findViewHolderForLayoutPosition.f201a.getTop()) / 2);
                } else {
                    return;
                }
            }
            this.f19209a.f19210a.mo12444a(i);
        }
    }
}
