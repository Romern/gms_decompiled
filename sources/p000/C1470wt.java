package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.ActionBarContainer;

/* renamed from: wt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1470wt extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f27540a;

    public C1470wt(ActionBarContainer actionBarContainer) {
        this.f27540a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f27540a;
        if (actionBarContainer.f1118e) {
            Drawable drawable = actionBarContainer.f1117d;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1115b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f27540a;
        if (actionBarContainer2.f1116c != null) {
            boolean z = actionBarContainer2.f1119f;
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f27540a;
        if (actionBarContainer.f1118e) {
            Drawable drawable = actionBarContainer.f1117d;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1115b;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
