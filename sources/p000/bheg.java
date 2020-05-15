package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* renamed from: bheg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bheg extends bhei {

    /* renamed from: a */
    public final Rect f118372a = new Rect();

    /* renamed from: b */
    final Rect f118373b = new Rect();

    /* renamed from: c */
    public int f118374c = 0;

    /* renamed from: d */
    public int f118375d;

    public bheg() {
    }

    /* renamed from: a */
    public abstract View mo63596a(List list);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo60440b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo63597c(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo63596a(coordinatorLayout.mo1875b(view));
        if (a != null) {
            aip aip = (aip) view.getLayoutParams();
            Rect rect = this.f118372a;
            rect.set(coordinatorLayout.getPaddingLeft() + aip.leftMargin, a.getBottom() + aip.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - aip.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - aip.bottomMargin);
            C1296qh qhVar = coordinatorLayout.f1487g;
            if (qhVar != null && C1280ps.m19938t(coordinatorLayout) && !C1280ps.m19938t(view)) {
                rect.left += qhVar.mo15731a();
                rect.right -= qhVar.mo15735c();
            }
            Rect rect2 = this.f118373b;
            int i2 = aip.f598c;
            C1256ov.m19816a(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int f = mo63600f(a);
            view.layout(rect2.left, rect2.top - f, rect2.right, rect2.bottom - f);
            this.f118374c = rect2.top - a.getBottom();
            return;
        }
        coordinatorLayout.mo1876b(view, i);
        this.f118374c = 0;
    }

    /* renamed from: d */
    public float mo63598d(View view) {
        throw null;
    }

    /* renamed from: e */
    public int mo63599e(View view) {
        throw null;
    }

    /* renamed from: f */
    public final int mo63600f(View view) {
        if (this.f118375d == 0) {
            return 0;
        }
        float d = mo63598d(view);
        int i = this.f118375d;
        return C1183mc.m19626a((int) (d * ((float) i)), 0, i);
    }

    public bheg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
