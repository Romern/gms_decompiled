package p000;

import android.graphics.Rect;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: bhes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhes implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ BottomAppBar$Behavior f118413a;

    public bhes(BottomAppBar$Behavior bottomAppBar$Behavior) {
        this.f118413a = bottomAppBar$Behavior;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((bhet) this.f118413a.f151065c.get()) == null || !(view instanceof FloatingActionButton)) {
            view.removeOnLayoutChangeListener(this);
            return;
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        Rect rect = this.f118413a.f151064b;
        rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
        floatingActionButton.mo71164a(rect);
        this.f118413a.f151064b.height();
        throw null;
    }
}
