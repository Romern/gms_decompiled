package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: pp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1277pp implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final WeakHashMap f26839a = new WeakHashMap();

    public final void onGlobalLayout() {
        boolean z;
        for (Map.Entry entry : this.f26839a.entrySet()) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            if (view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (booleanValue != z) {
                if (z) {
                    C1280ps.m19926i(view, 16);
                }
                this.f26839a.put(view, Boolean.valueOf(z));
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
