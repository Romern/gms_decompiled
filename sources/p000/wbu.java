package p000;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: wbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wbu {
    /* renamed from: a */
    private static int m41736a(int i) {
        return i >= 0 ? Math.round(TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics())) : i;
    }

    /* renamed from: a */
    static void m41737a(bycm bycm, bycs bycs, Activity activity) {
        int a = bycq.m124660a(bycs.f165683b);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 1) {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(C0126R.C0129id.bottom_sheet);
            viewGroup.getLayoutTransition().enableTransitionType(4);
            BottomSheetBehavior e = BottomSheetBehavior.m117480e(viewGroup);
            int b = e.mo71032b();
            aip aip = (aip) viewGroup.getLayoutParams();
            aip.height = m41736a(bycm.f165671c);
            aip.width = m41736a(bycm.f165670b);
            if (b != 0) {
                aip.f598c = 81;
            }
            e.mo71025a(m41736a(bycm.f165672d));
            viewGroup.requestLayout();
        } else if (i == 2) {
            ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(C0126R.C0129id.webview);
            viewGroup2.getLayoutTransition().enableTransitionType(4);
            viewGroup2.getLayoutParams().height = m41736a(bycm.f165671c);
            viewGroup2.getLayoutParams().width = m41736a(bycm.f165670b);
            viewGroup2.requestLayout();
        }
    }
}
