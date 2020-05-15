package p000;

import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

/* renamed from: azxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azxq {
    /* renamed from: a */
    public static ActionMenuView m86336a(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ImageButton m86337b(Toolbar toolbar) {
        if (toolbar.getChildCount() <= 0) {
            return null;
        }
        View childAt = toolbar.getChildAt(0);
        if (childAt instanceof ImageButton) {
            return (ImageButton) childAt;
        }
        return null;
    }
}
