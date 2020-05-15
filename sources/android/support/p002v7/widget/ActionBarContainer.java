package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: android.support.v7.widget.ActionBarContainer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public View f1114a;

    /* renamed from: b */
    public Drawable f1115b;

    /* renamed from: c */
    public Drawable f1116c;

    /* renamed from: d */
    public Drawable f1117d;

    /* renamed from: e */
    public boolean f1118e;

    /* renamed from: f */
    public boolean f1119f;

    /* renamed from: g */
    private boolean f1120g;

    /* renamed from: h */
    private View f1121h;

    /* renamed from: i */
    private int f1122i;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo1227a(boolean z) {
        this.f1120g = z;
        setDescendantFocusability(!z ? AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE : 393216);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1115b;
        if (drawable != null && drawable.isStateful()) {
            this.f1115b.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1116c;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1116c.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1117d;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1117d.setState(getDrawableState());
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1115b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1116c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1117d;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1114a = findViewById(C0126R.C0129id.action_bar);
        this.f1121h = findViewById(C0126R.C0129id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1120g || super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1118e) {
            Drawable drawable = this.f1117d;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            boolean z2 = true;
            if (this.f1115b == null) {
                z2 = false;
            } else if (this.f1114a.getVisibility() == 0) {
                this.f1115b.setBounds(this.f1114a.getLeft(), this.f1114a.getTop(), this.f1114a.getRight(), this.f1114a.getBottom());
            } else {
                View view = this.f1121h;
                if (view != null && view.getVisibility() == 0) {
                    this.f1115b.setBounds(this.f1121h.getLeft(), this.f1121h.getTop(), this.f1121h.getRight(), this.f1121h.getBottom());
                } else {
                    this.f1115b.setBounds(0, 0, 0, 0);
                }
            }
            this.f1119f = false;
            if (!z2) {
                return;
            }
        }
        invalidate();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f1114a == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f1122i) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1114a != null) {
            View.MeasureSpec.getMode(i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f1115b;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1116c;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1117d;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f1115b || this.f1118e) {
            return (drawable == this.f1117d && this.f1118e) || super.verifyDrawable(drawable);
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1280ps.m19890a(this, new C1470wt(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1390tu.f27192a);
        boolean z = false;
        this.f1115b = obtainStyledAttributes.getDrawable(0);
        this.f1116c = obtainStyledAttributes.getDrawable(2);
        this.f1122i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == C0126R.C0129id.split_action_bar) {
            this.f1118e = true;
            this.f1117d = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (this.f1118e) {
            if (this.f1117d == null) {
                z = true;
            }
        } else if (this.f1115b == null && this.f1116c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
