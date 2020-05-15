package p000;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;

/* renamed from: bhkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhkn {
    /* renamed from: a */
    public static float m101061a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static PorterDuff.Mode m101062a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static void m101063a(View view, bhkl bhkl) {
        C1280ps.m19895a(view, new bhkj(bhkl, new bhkm(C1280ps.m19925i(view), view.getPaddingTop(), C1280ps.m19927j(view), view.getPaddingBottom())));
        if (C1280ps.m19871F(view)) {
            C1280ps.m19937s(view);
        } else {
            view.addOnAttachStateChangeListener(new bhkk());
        }
    }
}
