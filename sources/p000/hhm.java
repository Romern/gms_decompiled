package p000;

import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: hhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hhm implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ hhn f19785a;

    public hhm(hhn hhn) {
        this.f19785a = hhn;
    }

    public final void onGlobalLayout() {
        int i;
        this.f19785a.f19788c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        List list = (List) this.f19785a.f19786a.f19764s.mo2448b();
        if (list != null) {
            if (list.size() < 3) {
                i = this.f19785a.f19788c.getBottom();
            } else {
                acm findViewHolderForLayoutPosition = this.f19785a.f19788c.findViewHolderForLayoutPosition(2);
                if (findViewHolderForLayoutPosition != null) {
                    i = this.f19785a.f19788c.getTop() + ((findViewHolderForLayoutPosition.f201a.getBottom() + findViewHolderForLayoutPosition.f201a.getTop()) / 2);
                } else {
                    return;
                }
            }
            this.f19785a.f19787b.mo12444a(i);
        }
    }
}
