package p000;

import android.view.ViewTreeObserver;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;

/* renamed from: anza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anza implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ anzc f77903a;

    public anza(anzc anzc) {
        this.f77903a = anzc;
    }

    public final void onGlobalLayout() {
        ScrollViewWithEvents scrollViewWithEvents = this.f77903a.f77906c;
        scrollViewWithEvents.scrollTo(scrollViewWithEvents.getScrollX(), this.f77903a.f77909f);
    }
}
