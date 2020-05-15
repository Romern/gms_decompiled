package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.places.p095ui.placepicker.views.expandingscrollview.ExpandingScrollView;

/* renamed from: binm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class binm {

    /* renamed from: a */
    public final int f121000a;

    /* renamed from: b */
    public final int f121001b;

    /* renamed from: c */
    public final ExpandingScrollView f121002c;

    /* renamed from: d */
    public final bini f121003d;

    /* renamed from: e */
    public final bini f121004e;

    /* renamed from: f */
    public float f121005f;

    /* renamed from: g */
    public float f121006g;

    /* renamed from: h */
    public float f121007h;

    /* renamed from: i */
    public float f121008i;

    /* renamed from: j */
    public float f121009j = -1.0f;

    /* renamed from: k */
    public boolean f121010k;

    /* renamed from: l */
    public int f121011l = 1;

    public binm(ExpandingScrollView expandingScrollView, binp binp, binp binp2) {
        new Rect();
        this.f121002c = expandingScrollView;
        this.f121003d = new bini(binp);
        this.f121004e = new bini(binp2);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(expandingScrollView.getContext());
        this.f121000a = viewConfiguration.getScaledTouchSlop();
        this.f121001b = viewConfiguration.getScaledPagingTouchSlop();
    }

    /* renamed from: a */
    public static boolean m102611a(View view, int i, int i2) {
        int i3;
        if (view.getVisibility() == 8) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && (i3 = i2 + scrollY) >= childAt.getTop() && i3 < childAt.getBottom() && m102611a(childAt, i4 - childAt.getLeft(), i3 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return C1280ps.m19901a(view, -1);
    }
}
