package p000;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: gs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1031gs extends FrameLayout {

    /* renamed from: a */
    public boolean f18920a = true;

    /* renamed from: b */
    private ArrayList f18921b;

    /* renamed from: c */
    private ArrayList f18922c;

    public C1031gs(Context context, AttributeSet attributeSet, C1050hj hjVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0996fq.f17120b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        C1018gh b = hjVar.mo12536b(id);
        if (classAttribute != null && b == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            C1018gh c = hjVar.mo12571p().mo12222c(context.getClassLoader(), classAttribute);
            c.onInflate(context, attributeSet, (Bundle) null);
            C1058hr a = hjVar.mo12516a();
            a.f20285s = true;
            c.f18173J = this;
            a.mo12685a(getId(), c, string);
            a.mo11297i();
        }
    }

    /* renamed from: a */
    private final void m13798a(View view) {
        ArrayList arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f18922c) != null && arrayList.contains(view))) {
            if (this.f18921b == null) {
                this.f18921b = new ArrayList();
            }
            this.f18921b.add(view);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (C1050hj.m14440a(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (C1050hj.m14440a(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f18920a && this.f18921b != null) {
            for (int i = 0; i < this.f18921b.size(); i++) {
                super.drawChild(canvas, (View) this.f18921b.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.f18920a || (arrayList = this.f18921b) == null || arrayList.size() <= 0 || !this.f18921b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        ArrayList arrayList = this.f18922c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f18921b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f18920a = true;
            }
        }
        super.endViewTransition(view);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m13798a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public final void removeDetachedView(View view, boolean z) {
        if (z) {
            m13798a(view);
        }
        super.removeDetachedView(view, z);
    }

    public final void removeView(View view) {
        m13798a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        m13798a(getChildAt(i));
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        m13798a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m13798a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m13798a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        int i = Build.VERSION.SDK_INT;
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f18922c == null) {
                this.f18922c = new ArrayList();
            }
            this.f18922c.add(view);
        }
        super.startViewTransition(view);
    }
}
